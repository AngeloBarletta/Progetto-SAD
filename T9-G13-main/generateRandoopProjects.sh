#!/bin/bash

echo "Configurazione iniziale automatica del servizio Randoop"

echo "------------------------------------------------"

mkdir $HOME/.T9_projects_test &&
cp -a ./randoop-all-4.3.2.jar $HOME/.T9_projects_test
cd $HOME/.T9_projects_test &&
echo "Creazione e copia della cartella di test"
echo "------------------------------------------------"

echo "Creazione dei progetti maven"
echo "------------------------------------------------"


for i in $(seq $1)
do
    #contiene già Junit ma con una versione errata
    mvn archetype:generate \
    -DgroupId=org.example \
    -DartifactId=project_$i \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=randoop \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false

echo "Progetto creato correttamente!"

# Aggiunta delle dipendenze e del plugin nel file pom.xml
pom_file="project_$i/pom.xml"

if [[ -f $pom_file ]]; then

    sed -i -e '/<\dependencies>/i\
        <properties>\
            <maven.compiler.source>11</maven.compiler.source>\
            <maven.compiler.target>11</maven.compiler.target>\
        </properties>' $pom_file

    #cambio versione di junit
    sed -i -e 's/3.8.1/4.13.2/g' $pom_file

    echo "Aggiunto JUnit correttamente."

    sed -i -e '/<\/project>/i\
        <build>\
            <!-- Configurazione del build -->\
        <\/build>' $pom_file
    echo "sezione build aggiunta correttamente."

    sed -i -e '/<build>/a \
    <plugins>\
        <plugin>\
            <groupId>org.jacoco<\/groupId>\
            <artifactId>jacoco-maven-plugin<\/artifactId>\
            <version>0.8.8<\/version>\
            <executions>\
                <execution>\
                    <id>prepare-agent<\/id>\
                    <goals>\
                        <goal>prepare-agent<\/goal>\
                    <\/goals>\
                <\/execution>\
                <execution>\
                    <id>report<\/id>\
                    <phase>prepare-package<\/phase>\
                    <goals>\
                        <goal>report<\/goal>\
                    <\/goals>\
                <\/execution>\
                <execution>\
                    <id>post-unit-test<\/id>\
                    <phase>test<\/phase>\
                    <goals>\
                        <goal>report<\/goal>\
                    <\/goals>\
                    <configuration>\
                        <dataFile>target/jacoco.exec<\/dataFile>\
                        <outputDirectory>target/my-reports<\/outputDirectory>\
                    <\/configuration>\
                <\/execution>\
            <\/executions>\
        <\/plugin>\
        <\/plugins>\
    ' $pom_file &&

    rm -rf project_$i/pom.xml-e

    echo "plugin di jacoco aggiunto correttamente."
else
    echo "Errore: Il file pom.xml non è stato trovato."
fi

echo "------------------------------------------------"

done

cd ..