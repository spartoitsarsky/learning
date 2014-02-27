#!/bin/sh

cd /tmp
MYNOW=$(date +"%F-%H.%M.%S")
mkdir backup-idoneweb-$MYNOW
cd backup-idoneweb-$MYNOW

cp -r /home/mike/Dev/AptanaWorkspace/idone-bootstrap/ .

cd /tmp
tar cvf backup-idoneweb-$MYNOW.tar /tmp/backup-idoneweb-$MYNOW/*
gzip backup-idoneweb-$MYNOW.tar
cp backup*.gz ~/Dropbox/backups/
