1) Go to docker hub and search for registry 

https://hub.docker.com/_/registry

2) start registry 
   docker run -d -p 5000:5000 --restart always --name registry registry:2
   
3) docker ps 

4) pull  helloworld image 
    docker pull hello-world
	
5) upload it to local registry 
 
  docker tag hello-world localhost:5000/hello-world
  docker push localhost:5000/hello-world
  
6) go into the registry container 
    docker exec -it registry /bin/sh
	go to /var/lib/registry/docker folder 
	https://docs.docker.com/registry/deploying/

7) 	remove hello-world images and pull it again from local registry and see

8)  deploy front end to registry 

   sudo docker run -d -e ENV_DOCKER_REGISTRY_HOST=registry -e ENV_DOCKER_REGISTRY_PORT=5000 -p 8080:80 --link registry:registry konradkleine/docker-registry-frontend:v2
  
  
  Open localhost 8080