import os
import csv

REPO_PATH = ".\\repository"

classes = [f for f in os.listdir(REPO_PATH) if not f.endswith(".txt")]

N_LEVELS = 3    # max 9

def is_ascending(arr):
    n = len(arr)
    for i in range(n - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True

for class_name in classes:
    ## EVOSUITE
    csv_paths = [os.path.join(REPO_PATH, class_name, "RobotTest", "EvoSuiteTest", f"0{level}Level", "TestReport", "statistics.csv") for level in range(1,N_LEVELS+1)]

    weak_mutations = []
    cbranches = []
    try:
        for csv_path in csv_paths:
            with open(csv_path, "r") as csv_file:
                csv_reader = csv.DictReader(csv_file)
                for row in csv_reader:
                    if (row['criterion'] == "WEAKMUTATION"):
                        weak_mutations.append(float(row['Coverage']))
                    elif (row['criterion'] == "CBRANCH"):
                        cbranches.append(float(row['Coverage'])) 
        
        if is_ascending(weak_mutations) and is_ascending(cbranches):
            print(f"{class_name}: TEST PASSED")
        else:
            print(f"{class_name}: TEST FAILED")
        print("Weak mutations:", weak_mutations)
        print("Cbranches:", cbranches, "\n\n")
    except FileNotFoundError:
        print(f"{class_name}: TEST FAILED, file not found\n\n")
            