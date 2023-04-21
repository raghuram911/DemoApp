FROM openjdk:20-ea-19-slim-buster
WORKDIR /app
COPY target/DemoApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]