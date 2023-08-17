#!/usr/bin/env bash
printf "\n STARTING...\n" 

DOCKERHUB_NAME=garrijuan
IMAGE_VERSION=v1.5

# Compile and publish Server
SERVER_IMAGE_NAME="${DOCKERHUB_NAME}/server:${IMAGE_VERSION}"

printf "\n==> Compile and publish Server image named '%s'\n" ${SERVER_IMAGE_NAME}
cd server
./mvnw clean package -Dquarkus.container-image.build=true
docker tag juanangel/server-quarkus:1.0.0-SNAPSHOT ${SERVER_IMAGE_NAME}
docker push ${SERVER_IMAGE_NAME}
cd ..

# Compile and publish WeatherService
WEATHERSERVICE_IMAGE_NAME="${DOCKERHUB_NAME}/weatherservice:${IMAGE_VERSION}"

printf "\n==> Compile and publish WeatherService image named '%s'\n" ${WEATHERSERVICE_IMAGE_NAME}
cd weatherservice/makeImage
docker build -t ${WEATHERSERVICE_IMAGE_NAME} .
docker push ${WEATHERSERVICE_IMAGE_NAME}
cd ..
cd ..
# Compile and publish Planner
PLANNER_IMAGE_NAME="${DOCKERHUB_NAME}/planner:${IMAGE_VERSION}"

printf "\n==> Compile and publish Planner image named '%s'\n" ${PLANNER_IMAGE_NAME}
cd planner
./mvnw compile jib:build -DskipTests -Dimage=${PLANNER_IMAGE_NAME}
cd ..

# Compile and publish TopoService
TOPSERVICE_IMAGE_NAME="${DOCKERHUB_NAME}/toposervice:${IMAGE_VERSION}"

printf "\n==> Compile and publish TopoService image named '%s' \n" ${TOPSERVICE_IMAGE_NAME}
cd toposervice
mvn -Pnative spring-boot:build-image -Dspring-boot.build-image.imageName=${TOPSERVICE_IMAGE_NAME}
docker push ${TOPSERVICE_IMAGE_NAME}
cd ..

printf "\n END.\n" 

exit 0