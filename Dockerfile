FROM  docker.io/maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM registry.access.redhat.com/openjdk/openjdk-11-rhel7:latest
ENV JAVA_APP_DIR=/deployments
COPY --from=build /home/app/target/api-1.0.0.jar /deployments/api-1.0.0.jar





