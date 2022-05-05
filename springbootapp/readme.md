## Docker commands
### Build image 
* docker build -t pramodbharade/spring-boot:1.0 .
### run Image to docker container
* docker run -p 8080:8080 pramodbharade/spring-boot:1.0
### Push image to docker hub
* docker login
* docker image push pramodbharade/spring-boot:1.0