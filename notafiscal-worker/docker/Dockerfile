FROM amazoncorretto:21
LABEL author="moraesleonardo"
WORKDIR /app
COPY notafiscal-worker-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT  ["java", "-jar", "app.jar"]