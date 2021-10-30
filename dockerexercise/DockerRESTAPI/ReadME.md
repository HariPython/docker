1) Edit 
 sudo vi /lib/systemd/system/docker.service
  add -H=tcp://0.0.0.0:5555 in the below line 

  ExecStart=/usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock -H=tcp://0.0.0.0:5555
  
  
2)   sudo systemctl daemon-reload

     sudo service docker restart
 
3)  from local machine 
 
  curl http://18.118.159.63:5555/images/json

  curl http://18.118.159.63:5555/containers/json

   curl --data "t=5" http://18.118.159.63:5555/containers/containername/stop
   
   curl --data "t=5" http://18.118.159.63:5555/containers/containername/start
   
   
   
   
  
  
