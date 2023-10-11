#!/bin/bash

N_LEVELS=3

for FILE in /repository/*; do
    CLASS_NAME=$(basename "$FILE")
    if [ "$CLASS_NAME" == "ClassUnderTest" ] || [ "$CLASS_NAME" == "Calcolatrice" ] || [ "$CLASS_NAME" == "FolderTree_v1.txt" ]; then
        continue
    fi

    STATISTICS_FILE="/repository/${CLASS_NAME}/RobotTest/EvoSuiteTest/01Level/TestReport/statistics.csv"
    if [ -f "/repository/${CLASS_NAME}/RobotTest/EvoSuiteTest/01Level/TestReport/statistics.csv" ]; then
        echo "Statistics file already exists for $CLASS_NAME, skipping..."
    else
        ./robot_generazione.sh "$CLASS_NAME" "${CLASS_NAME}SourceCode" "/repository/${CLASS_NAME}/${CLASS_NAME}SourceCode" "$N_LEVELS"
    fi
done