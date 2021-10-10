# docker
This repo will have docker materials 

Instructions to run the springboot application as docker container 

Step 1 :
    Do Maven build \
	mvn clean install 
	
	
Step 2 :
    Read Dockerfile and do docker build .\
	Create account with dockerhub .\
	gaje85 is my account login name please replace with yours \
	```
	  docker build -t gaje85/hellodockerzulu .
	```  
	```  
	  docker images 
	```     
	 will show the newly created image 
	  
Step 3 :
  Start the container and call the rest api 
  ```
  docker run -p 8080:8080 gaje85/hellodockerzulu (replace your image name)
  ``` 
  Go to browser and type http://localhost:8080/hello 
  
Step 4 :
  Upload it to dockerhub .\
  Make sure you login to the docker hub \
    Use docker login command to login to dockerhub and then try below \
	```
    docker push gaje85/hellodockerzulu
	``` \
	Now we can pull this image any where and start the container 
	
	
 