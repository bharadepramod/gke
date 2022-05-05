## Docker commands
### Build image 
* docker build -t pramodbharade/spring-boot:1.0 .
### run Image to docker container
* docker run -p 8080:8080 pramodbharade/spring-boot:1.0
### Push image to docker hub
* docker login
* docker image push pramodbharade/spring-boot:1.0

## Google cloud commands
### set account and project
* gcloud auth list
* gcloud config list project
* gcloud config set project [project_name]
* export my_zone=us-central1-a
  export my_cluster=standard-cluster-1
 * source <(kubectl completion bash)
 * gcloud container clusters get-credentials $my_cluster --zone $my_zone
 
 ## Clone Git HUB repo
 * git clone https://github.com/bharadepramod/gke.git
 * cd gke/springbootapp
 
 ## Deploy to GKE
 * kubectl apply -f ./spring-boot-deployment.yaml
 * kubectl apply -f ./spring-boot-service.yaml