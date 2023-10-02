#!/bin/sh
PERCORSO="$(cd "$(dirname "$0")" && pwd)"
# PERCORSO_PACKAGE=$1
# NOME_PACKAGE=$2
# NOME_CLASSE=$3
# NOME_TEST=$4
# PERCORSO_TEST=$5
# PERCORSO_CSV=$6
NOME_PACKAGE="mypackage"
PERCORSO_CLASSE=$1  # ./prova/ClassUnderTest.java
NOME_CLASSE=$2      # ClassUnderTest
PERCORSO_TEST=$3    # ./prova/AppTest.java
NOME_TEST=$4        # AppTest
PERCORSO_CSV=$5     # ./provacsv

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
rm $PERCORSO/index.html