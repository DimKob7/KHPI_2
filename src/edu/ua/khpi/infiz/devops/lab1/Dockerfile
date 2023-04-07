FROM ubuntu:latest

RUN apt-get update && \
    apt-get install -y curl && \
    rm -rf /var/lib/apt/lists/*

COPY webserver_check.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/webserver_check.sh

CMD ["webserver_check.sh"]