# FROM ubuntu:20.04

# RUN apt-get update && apt-get install -y openjdk-17-jdk openjdk-17-jre maven

# EXPOSE 1234

# COPY RemoteCCC /app

# WORKDIR /app

# CMD ["java", "-jar", "./target/RemoteCCC-0.0.1.jar"]

# FROM maven:3.8.5-openjdk-17

# EXPOSE 1234

# COPY RemoteCCC /app

# WORKDIR /app

# RUN mvn clean compile package

# CMD ["java", "-jar", "./target/RemoteCCC-0.0.1.jar"]

FROM maven:latest as build

ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD pom.xml $HOME
RUN mvn verify --fail-never
ADD . $HOME
RUN mvn package

FROM maven:3.8.5-openjdk-17

WORKDIR /app

COPY --from=build /usr/app/target/RemoteCCC-0.0.1.jar remoteccc.jar

COPY ClientProject ClientProject

ENTRYPOINT java -jar remoteccc.jar