#!/bin/sh
PERCORSO="$(cd "$(dirname "$0")" && pwd)"

NOME_PACKAGE="mypackage"
# PERCORSO_CLASSE=$1  # ./prova/ClassUnderTest.java
NOME_CLASSE=$1      # ClassUnderTest
# PERCORSO_TEST=$3    # ./prova/AppTest.java
NOME_TEST=$2        # AppTest
PERCORSO_CSV="results"     # ./provacsv

# java org.junit.runner.JUnitCore $NOME_PACKAGE.${NOME_TEST}


sleep 2

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=LINE

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=BRANCH

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=EXCEPTION

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=WEAKMUTATION

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=OUTPUT

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=METHOD

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=METHODNOEXCEPTION

$EVOSUITE -measureCoverage -class $NOME_PACKAGE.$NOME_CLASSE -Djunit=$NOME_PACKAGE.${NOME_TEST} -projectCP $PERCORSO/target/classes/:test/java  -Dcriterion=CBRANCH

cd $PERCORSO

mv -f evosuite-report/statistics.csv $PERCORSO_CSV

# wget http://localhost:3001/api/

rm -r $PERCORSO/test/java/*
rm -r $PERCORSO/src/main/java/*
rm -r $PERCORSO/target
rm -r $PERCORSO/evosuite-report
rm $PERCORSO/pom.xml
# rm $PERCORSO/index.html