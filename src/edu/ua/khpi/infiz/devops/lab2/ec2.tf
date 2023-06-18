module "ec2" {
  source             = "./ec2"
  basename           = "cluster-one"
  environment        = "demo"
  ami                = data.aws_ami.ubuntu-linux.id
  vpc_id             = aws_vpc.vpc.id
  security_group_ids = [aws_security_group.main_sg.id]
  subnet_id          = aws_subnet.subnet-private.id
  ssh_key_name       = aws_key_pair.key_pair.key_name
  instance_type      = "t2.micro"
  instance_count     = (["1"])
  user_data = <<-EOF
      #!/bin/bash
      sudo apt-get update
      sudo apt-get install -y docker.io
      sudo docker run -d -p 9090:9090 --name prometheus prom/prometheus:latest
      sudo docker run -d -p 3000:3000 --name grafana grafana/grafana:latest
      sudo docker run -d -p 9100:9100 --name node-exporter prom/node-exporter:latest
      sudo docker run -d -p 8080:8080 --name cadvisor-exporter google/cadvisor:latest
      EOF
}

module "ec2_public" {
  source                      = "./ec2"
  basename                    = "cluster-two"
  environment                 = "demo"
  ami                         = data.aws_ami.ubuntu-linux.id
  vpc_id                      = aws_vpc.vpc.id
  security_group_ids          = [aws_security_group.main_sg.id]
  subnet_id                   = aws_subnet.subnet-public.id
  ssh_key_name                = aws_key_pair.key_pair.key_name
  instance_type               = "t2.micro"
  associate_public_ip_address = true
  instance_count              = (["1"])
  user_data = <<-EOF
        #!/bin/bash
        sudo apt-get update
        sudo apt-get install -y docker.io
        sudo docker run -d -p 9100:9100 --name node-exporter prom/node-exporter:latest
        sudo docker run -d -p 8080:8080 --name cadvisor-exporter google/cadvisor:latest
        EOF
}