# Docker
Dockerizar Applicacion


# staring DB services and Rabbit manually

 docker run -d --name mysql --network host -p 3306:3306 -e MYSQL_HOST=mysql -e MYSQL_DATABASE=eoloplantsDB -e MYSQL_USER=root -e MYSQL_ROOT_PASSWORD=password --restart=on-failure mysql:8.0.22

docker run -d --name mongo --network host -p 27017:27017 -e MONGO_PORT=27017 -e MONGO_HOST=mongo -e MONGO_INITDB_DATABASE=topo --restart=on-failure mongo:jammy

docker run -d --name rabbitmq --network host -p 5672:5672 -p 15672:15672 -e RABBIT_PORT=5672 -e RABBIT_USER=root -e RABBIT_PASS=password --restart=on-failure rabbitmq:3.11.10

# Server 
    1- Añadir dependencias pom.xml
    2- Levantar servicios mysql y rabbit
    3-  ./mvnw clean package -Dquarkus.container-image.build=true
    4-  docker images
    5-  docker tag juanangel/server-quarkus:1.0.0-SNAPSHOT garrijuan/server-quarkus:v0.1
        docker push garrijuan/server-quarkus:v0.1



