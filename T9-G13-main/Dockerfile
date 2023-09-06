FROM ubuntu

# Install base pkgs
RUN apt update \
    && echo "y" | apt install default-jdk wget\
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Install Maven
ARG MAVEN_VERSION=3.9.2
ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/${MAVEN_VERSION}/binaries

RUN wget ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xvf apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && mv apache-maven-${MAVEN_VERSION} /opt/ \
 && rm -f apache-maven-${MAVEN_VERSION}.tar.gz

ENV MAVEN_HOME /opt/apache-maven-${MAVEN_VERSION}
ENV PATH="$MAVEN_HOME/bin:$PATH"
 

WORKDIR .

ADD ./RandoopManager ./RandoopManager
ADD ./T9_repo_test ./T9_repo_test
ADD ./esempio	./esempio
ADD ./randoop-all-4.3.2.jar .
ADD generateRandoopProjects.sh .
RUN chmod -+x /generateRandoopProjects.sh

ADD install.sh .
RUN chmod -+x /install.sh
RUN ./install.sh



