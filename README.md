# Kitamoto Otomatik Service

#### Build the JAR using Maven
``
mvn clean install
``

#### Build the Docker Image using the Dockerfile
``
docker build --tag nikkinicholasromero/kitamoto-otomatik-service-image:latest .
``

#### Push the Docker Image to Docker Hub
``
docker push nikkinicholasromero/kitamoto-otomatik-service-image:latest
``

#### Start a Docker Container using the Docker Image
``
docker run -d -t -p 127.0.0.1:8080:8080 --name kitamoto-otomatik-service kitamoto-otomatik-service-image:latest
``
