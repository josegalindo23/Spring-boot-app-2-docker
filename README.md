# Spring-boot-app-2-docker
Example project showing how to dockerize a Spring Boot application for deployment 

## Features

- Developed with **Spring Boot** and **JDK 22**.
- Containerized with **Docker** for easy deployment and management.
- Includes three RESTful endpoints to demonstrate the basic functionality of the application.
## Endpoints

The application exposes the following RESTful endpoints:

- `GET /api/welcome`: Returns a welcome message.
- `GET /api/greet`: Returns a greeting.
- `GET /api/bye`: Returns a farewell message.

## Dockerfile

The `Dockerfile` is used to build the Docker image of the application. Below are the main instructions in the Dockerfile:

- Uses the `openjdk:22-jdk` base image as the Java runtime environment.
- Sets the working directory in the container to `/app`.
- Copies the Spring Boot JAR file into the container.
- Exposes port `8080` so that the application is accessible from outside the container.
- Sets the application entry point as the command `java -jar app.jar`.

## Build and Run the Application

To build and run the application in Docker, follow these steps:
1. Clone this repository to your local machine: https://github.com/josegalindo23/Spring-boot-app-2-docker.git
2. Open a terminal in the project directory. `cd Spring-boot-app-2-docker`
3. Run the following command to build the Docker image: `docker build -t app-dockerized .`
4. Run the following command to start the container and access the application: `docker run -d -p 8080:8080 --name app-container app-dockerized`
5. Access the application in your browser or API tool (like Postman) and access the following endpoints to test the application's functionality:
   - http://localhost:8080/api/welcome to see the welcome message
   - http://localhost:8080/api/greet to see the greeting
   - http://localhost:8080/api/bye to see the goodbye message
   
That's it! You have successfully built and run the Dockerized application.

## Notes
* Make sure you have Docker installed on your local machine to build and run the application.
* I hope you find this project useful! If you have any questions or need further assistance, feel free to reach out to me.

## Contact
* `Wpp`: +57 321-2927-430
* `email`: juniorgala23@gmail.com