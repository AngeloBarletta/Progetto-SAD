FROM maven:3.8-openjdk-8

RUN apt-get update -y && apt-get install git unzip wget python3.10 python3-pip -y

WORKDIR /app

COPY ./robot ./robot

COPY ./utente ./utente

ENV EVOSUITE="java -jar /app/robot/evosuite-1.0.6.jar -Dsandbox=false"

WORKDIR /app/utente

RUN python3 -m pip install -r requirements.txt
ENV PYTHONUNBUFFERED 1


# ENTRYPOINT ["tail", "-f", "/dev/null"]
ENTRYPOINT ["./gunicorn.sh"]