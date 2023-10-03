FROM maven:3.8-openjdk-8

# RUN apt-get update -y
# RUN apt install software-properties-common -y
# RUN apt-add-repository universe -y
# RUN apt install maven openjdk-8-jdk git unzip wget -y

RUN apt-get update 
RUN apt-get install git unzip wget -y

WORKDIR /app

# COPY ./opt_livelli/Prototipo2.0/installazione.sh ./installazione.sh
# COPY ./opt_livelli/Prototipo2.0/evosuite-1.0.6.jar ./evosuite-1.0.6.jar
# COPY ./opt_livelli/Prototipo2.0/evosuite-standalone-runtime-1.0.6.jar ./evosuite-standalone-runtime-1.0.6.jar

COPY ./robot ./robot

COPY ./utente ./utente

ENV EVOSUITE="java -jar /app/robot/evosuite-1.0.6.jar"

ENTRYPOINT ["tail", "-f", "/dev/null"]