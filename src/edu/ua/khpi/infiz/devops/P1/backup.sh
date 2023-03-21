#!/bin/bash

BACKUP="/home/backups/"

tar -zcf $BACKUP$(date +%Y-%m-%d_%H-%M-%S).tar.gz /home/