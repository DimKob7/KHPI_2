#!/bin/bash
sudo apt-get update
sudo apt-get install -y docker.io
sudo docker run -d -p 9090:9090 --name prometheus prom/prometheus:latest
sudo docker run -d -p 9100:9100 --name node-exporter prom/node-exporter:latest
sudo docker run -d -p 8080:8080 --name cadvisor-exporter google/cadvisor:latest