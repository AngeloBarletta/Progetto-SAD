FROM ubuntu:latest

RUN apt-get update -y
RUN apt install software-properties-common -y
RUN apt-add-repository universe -y
RUN apt-get update -y
RUN apt install maven openjdk-8-jdk git unzip wget -y

WORKDIR /app

COPY ./opt_livelli/Prototipo2.0/installazione.sh ./installazione.sh

RUN ./installazione.sh

RUN rm -rf installazione.sh

COPY ./opt_livelli .

ENTRYPOINT ["tail", "-f", "/dev/null"]