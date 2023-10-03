# # Usa un'immagine di base di Java versione 17
# FROM openjdk:17

# # Impostiamo la directory di lavoro
# WORKDIR /app

# # Copiamo il file JAR dell'applicazione nella directory di lavoro
# COPY target/EditorApp-0.0.1-SNAPSHOT.jar app.jar

# # Definiamo le variabili d'ambiente
# ARG COVERAGE_SERVER_URL=http://coverage-server:3001/
# ENV COVERAGE_SERVER_URL=$COVERAGE_SERVER_URL
# ARG CLASS_SERVER_URL==http://class-server:3002/
# ENV CLASS_SERVER_URL=$CLASS_SERVER_URL
# ARG TEST_SERVER_URL=http://tests-server:3003/
# ENV TEST_SERVER_URL=$TEST_SERVER_URL

# # Esponiamo la porta 8080
# EXPOSE 8080

# # Avviamo l'applicazione
# CMD ["java", "-jar", "app.jar"]




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

COPY --from=build /usr/app/target/EditorApp-0.0.1-SNAPSHOT.jar app.jar

# Definiamo le variabili d'ambiente
ARG JACOCO_COVERAGE_SERVER_URL=http://coverage-server:1234/compile-and-codecoverage
ENV JACOCO_COVERAGE_SERVER_URL=$JACOCO_COVERAGE_SERVER_URL
ARG EVOSUITE_COVERAGE_SERVER_URL=http://evosuite-server:5000/evosuite_coverage
ENV EVOSUITE_COVERAGE_SERVER_URL=$EVOSUITE_COVERAGE_SERVER_URL
ARG CLASS_SERVER_URL==http://class-server:3002/
ENV CLASS_SERVER_URL=$CLASS_SERVER_URL
ARG TEST_SERVER_URL=http://tests-server:3003/
ENV TEST_SERVER_URL=$TEST_SERVER_URL

# Esponiamo la porta 8080
EXPOSE 8080

ENTRYPOINT java -jar app.jar