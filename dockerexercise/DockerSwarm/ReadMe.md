To start master 
---------------

docker swarm init 
docker swarm init --advertise-addr ipadress

docker node ls 

Docker worker 
-------------

use the token command and join 
docker node ls 

To leave cluster 
----------------

docker swarm leave 

To remove from the list 
------------------------

docker node rm <name>

To add manager to the swarm 
---------------------------
docker swarm join-token manager 
docker node ls 

To get command to add worker 
---------------------------
docker swarm join-token worker

To promote worker to manager 
-----------------------------
docker node promote <name>

docker ls


Docker service -> to deploy applications in swarm cluster 
---------------------------------------------------------
docker service create nginx

docker service ls 

docker service ps <serviceid>

To do port binding 
------------------
docker service update 0v --publish-add 5000:80

docker service create --replicas 2 --name nginx nginx 


Docker stack 
 -> create docker compose file and deploy it in docker swarm 
 
 

















