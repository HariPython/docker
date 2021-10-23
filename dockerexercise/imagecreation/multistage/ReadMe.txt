.dockerignore 

1) docker build -f Dockerfile -t react-b:latest .

2) Run container 

docker run \                                  
    -it \
    --rm \
    -v ${PWD}:/app \
    -v /app/node_modules \
    -p 3001:3000 \
    react-b:latest

3) 

Article to refer 
----------------
https://www.padok.fr/en/blog/docker-image-multi-staging
