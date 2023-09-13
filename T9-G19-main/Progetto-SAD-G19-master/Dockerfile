FROM maven:latest as build

ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD pom.xml $HOME
ADD assembly.xml $HOME
RUN mvn verify --fail-never
ADD . $HOME
RUN mvn package

FROM openjdk:8-alpine as java8

FROM openjdk:17-alpine
COPY --from=java8 /usr/lib/jvm/java-1.8-openjdk /usr/lib/jvm/java-1.8-openjdk

RUN apk update && apk add bash
RUN apk add --no-cache openssl ncurses-libs libstdc++


WORKDIR /app

COPY --from=build /usr/app/target/Task9-G19-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar

# COPY classes classes
# COPY emma-2.0.5312 emma-2.0.5312
# COPY robot.sh robot.sh

COPY . .

# ENTRYPOINT [ "bash", "./docker-entrypoint.sh" ]
# ENTRYPOINT ["tail", "-f", "/dev/null"]
ENTRYPOINT /usr/lib/jvm/java-1.8-openjdk/bin/java -jar app.jar
# ENTRYPOINT [ "bash", "robot.sh", "Lola", "5", "12312", "-1" ]