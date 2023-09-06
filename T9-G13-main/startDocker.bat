docker build --no-cache -t randoop-container .\ &
docker run -t -i -v %1/:/root/repo --dns 8.8.8.8 --name T9 randoop-container