#################################################
# First step: Build the application
#################################################
# Base image to use, this must be set as the first line
FROM maven:3.9.0-eclipse-temurin-17 as builder

# The working directory inside the image to run commands
WORKDIR /project/

# Copy the pom.xml and install dependencies
COPY pom.xml /project

# Install dependencies
RUN mvn -B clean verify --fail-never

# Copy the source code
COPY /src /project/src

# Build the application
RUN mvn -B package -DskipTests

#################################################
# Second step: Run the application
#################################################
FROM eclipse-temurin:17-jdk

# Working directory with jar file
WORKDIR /usr/src/app/

# Copy the jar file from the first stage
COPY --from=builder /project/target/*.jar /usr/src/app/

# Expose the port
EXPOSE 9090

# Run the application
CMD ["java", "-jar", "/usr/src/app/weatherservice-v1.2.jar"]