# Use a base image with Java Run Environment (JRE)
FROM openjdk:22-jdk

# Set the working directory in the container
WORKDIR /app

#ARG JAR_FILE=target/*.jar

#COPY ${JAR_FILE} app.jar

# Copy the Spring Boot JAR file into the container at /app
COPY target/app-basic-2-docker-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your application runs on
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

