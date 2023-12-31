# Docker
Dockerizar Applicacion


# staring DB services and Rabbit manually or run docker-compose-dev.yml

    docker run -d --name mysql --network host -p 3306:3306 -e MYSQL_HOST=mysql -e MYSQL_DATABASE=eoloplantsDB -e MYSQL_USER=root -e MYSQL_ROOT_PASSWORD=password --restart=on-failure mysql:8.0.22

    docker run -d --name mongo --network host -p 27017:27017 -e MONGO_PORT=27017 -e MONGO_HOST=mongo -e MONGO_INITDB_DATABASE=topo --restart=on-failure mongo:jammy

    docker run -d --name rabbitmq --network host -p 5672:5672 -p 15672:15672 -e RABBIT_PORT=5672 -e RABBIT_USER=root -e RABBIT_PASS=password --restart=on-failure rabbitmq:3.11.10

or 

docker-compose -f docker-compose-dev.yml up -d

# Server 
    1- Añadir dependencias pom.xml
    2- Levantar servicios mysql y rabbit
    3-  ./mvnw clean package -Dquarkus.container-image.build=true
    4-  docker images
    5-  docker tag juanangel/server-quarkus:1.0.0-SNAPSHOT garrijuan/server-quarkus:v0.1
        docker push garrijuan/server-quarkus:v0.1

docker run -it -d --name server_quarkus --network host -e WEATHER_PORT=9090 -p 9090:9090 --restart=always garrijuan/server-quarkus:v0.1


# Planner

    1-meter dependencia en pom.xml
    2-   copiar (si no esta), de otro project:
            .mvn folder
            mvnw
            mvnw.cmd
        ./mvnw wrapper:wrapper
    3- ./mvnw compile jib:build -DskipTests -Dimage=garrijuan/planner:v1.2
    
    docker run -it -d --name planner --network host -e WEATHER_PORT=9090 -e RABBIT_PORT=5672 -p 8080:8080 garrijuan/planner:v1.2


# Toposervice
    -meter dependencias de GraalVM en po.xml y configurar GraalVM en tu maquina
    mvn -Pnative spring-boot:build-image -Dspring-boot.build-image.imageName=garrijuan/toposervice:V1.1

    docker push garrijuan/toposervice:V1.1

    docker run -it -d --name toposervice --network host -e TOPO_PORT=8181 -e TOPO_HOST=toposervice -e MONGO_PORT=27017 -e MONGO_HOST=localhost -e MONGO_INITDB_DATABASE=topo -d -p 8181:8181 garrijuan/toposervice:V1.1

# Weatherservice
    1- crear Dockerfile
    2- desde /makeImage
    3- docker build -t garrijuan/weatherservice:v1.2 .
    4- docker push garrijuan/weatherservice:v1.2

docker run -it -d --name weatherservice --network host -e WEATHER_PORT=9090 -p 9090:9090 garrijuan/weatherservice:v1.2

# script para levantar crear todas las imagenes docker
ejecutar script desde /Docker
./build_and_publish.sh

nota: cambiar la version dentro del script para crear una images nuevas

# run containers
docker stop $(docker ps -q)
docker rm $(docker ps -aq)
docker-compose -f docker-compose-prod.yml up -d
