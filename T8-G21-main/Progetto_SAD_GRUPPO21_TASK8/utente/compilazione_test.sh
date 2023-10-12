#!/bin/sh
PERCORSO="$(cd "$(dirname "$0")" && pwd)"
# PERCORSO_PACKAGE=$1
# NOME_PACKAGE=$2
# NOME_CLASSE=$3
# NOME_TEST=$4
# PERCORSO_TEST=$5
# PERCORSO_CSV=$6
NOME_PACKAGE="mypackage"
# PERCORSO_CLASSE=$1  # ./prova/ClassUnderTest.java
NOME_CLASSE=$1      # ClassUnderTest
# PERCORSO_TEST=$3    # ./prova/AppTest.java
NOME_TEST=$2        # AppTest
PERCORSO_CSV="results"     # ./provacsv


# echo "percorso package :$PERCORSO_PACKAGE \n"
# echo "nome package :$NOME_PACKAGE \n"
# echo "nome classe :$NOME_CLASSE \n"
# echo "percorso test :$PERCORSO_TEST \n"
# echo "percorso csv :$PERCORSO_CSV\n"
# echo "PERCORSO  :$PERCORSO\n"

# cp $PERCORSO_CLASSE $PERCORSO/src/main/java/$NOME_PACKAGE
# cp $PERCORSO_TEST $PERCORSO/test/java/$NOME_PACKAGE

# cp -n -r $PERCORSO_PACKAGE $PERCORSO/src/main/java
# cd $PERCORSO/test
# mkdir -p $NOME_PACKAGE
# cd $PERCORSO
# mkdir -p $PERCORSO/test/java/$NOME_PACKAGE
# cp -n -r $PERCORSO_TEST $PERCORSO/test/java/$NOME_PACKAGE

# cd $PERCORSO

# cd ..

# cp -n evosuite-1.2.0.jar Prototipo2.0

# cp -n evosuite-standalone-runtime-1.2.0.jar Prototipo2.0

# cd $PERCORSO

# java -jar evosuite-1.2.0.jar

cat  > pom.xml << EOF
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>$NOME_PACKAGE</groupId>
  <artifactId>$NOME_CLASSE</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>
  <name>$NOME_CLASSE</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.3.1</version>
        <scope>test</scope>  
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.3.1</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.platform</groupId>
        <artifactId>junit-platform-runner</artifactId>
        <version>1.2.0</version>
        <scope>test</scope>
    </dependency>

  </dependencies>
</project>


EOF

export EVOSUITE="java -jar $(pwd)/evosuite-1.0.6.jar -Dsandbox=false"

mvn compile package

# echo "facciamo partire i test"

mvn dependency:copy-dependencies

export CLASSPATH=target/classes:evosuite-standalone-runtime-1.0.6.jar:test:target/dependency/junit-4.13.2.jar:target/dependency/hamcrest-core-1.3.jar
# export CLASSPATH=target/classes:evosuite-standalone-runtime-1.2.0.jar:test/java:src/main/java:target/dependency/junit-4.13.2.jar:target/dependency/hamcrest-core-1.3.jar:target/dependency/junit-jupiter-api-5.3.1.jar:target/dependency/apiguardian-api-1.0.0.jar:target/dependency/junit-jupiter-engine-5.3.1.jar:target/dependency/junit-jupiter-engine-5.3.1.jar:target/dependency/junit-platform-commons-1.3.1.jar:target/dependency/junit-platform-engine-1.3.1.jar:target/dependency/opentest4j-1.1.1.jar:target/dependency/junit-platform-launcher-1.2.0.jar:target/dependency/junit-platform-runner-1.2.0.jar:target/dependency/junit-platform-suite-api-1.2.0.jar
javac test/java/mypackage/*.java