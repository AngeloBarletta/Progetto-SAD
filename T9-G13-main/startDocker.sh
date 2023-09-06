#!/bin/sh
sudo chmod 666 /var/run/docker.sock &&
docker build --no-cache -t randoop-container . &&
docker run -t -i -v $1/:/root/repo --dns 8.8.8.8 --name T9 randoop-container

#docker exec -t T9 sh -c "./Randoop/install.sh"
#docker pause T9
