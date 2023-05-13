#!/bin/bash

LOG_FILE=/var/log/webserver_check.log
SERVER_URL=http://localhost:80

while true
do
    status_code=$(curl -s -o /dev/null -w "%{http_code}" $SERVER_URL)

    if [[ ! $status_code =~ ^(2|3)[0-9]{2}$ ]]; then
        echo "$(date) - Server returned status code $status_code" >> $LOG_FILE
    fi

    sleep 30
done