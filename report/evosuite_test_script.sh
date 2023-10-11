#!/bin/bash

# To be executed inside the container in the directory of robot_generazione.sh
N_LEVELS=3

for CLASS_NAME in /repository/*;
    if [ "$CLASS_NAME" == "ClassUnderTest" ] || [ "$CLASS_NAME" == "Calcolatrice" ] || [ "$CLASS_NAME" == "FolderTree_v1.txt" ]; then
        continue
    fi
    ./robot_generazione.sh $CLASS_NAME ${CLASS_NAME}SourceCode /repository/${CLASS_NAME}/${CLASS_NAME}SourceCode ${N_LEVELS}
done