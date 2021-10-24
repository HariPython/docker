# docker-environment-read
This is an example for the demonstration of ENV and ARG directives in the Dockerfile

1) docker build -t nodejs-sever
2) docker images 
3)docker run --name node-server -p 3080:3080 nodejs-server
4) docker kill <containerid>
5) // with slim tag
docker build -t nodejs-server -f Dockerfile.arg --build-arg TAG=slim .
6) // with latest tag
docker build -t nodejs-server -f Dockerfile.arg --build-arg TAG=latest .
7) 

  An ARG declared before the FROM instruction can’t be used after the FROM. If you want to use it you need to declare it without the value as below.
   ARG VERSION=latest
FROM busybox:$VERSION
ARG VERSION
RUN echo $VERSION > image_version

8) docker build -t <image-name>:<tag> --build-arg <key1>=<value1> --build-arg <key2>=<value2> .

ENV
---

1) docker build -t nodejs-server-env -f Dockerfile.env .
// run the container
docker run -d --name node-server-env -p 3000:3000 nodejs-server-env


2) passing in command line 
 docker run -d --name node-server-env1 --env PORT=3070 -p 3070:3070 nodejs-server-env
 
 
 
 Article to refer 
 https://blog.bitsrc.io/how-to-pass-environment-info-during-docker-builds-1f7c5566dd0e
 
 
 
 

 
  