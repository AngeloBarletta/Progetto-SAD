"""
Le cartelle dei test dei randoop contengono file del tipo:
RegressionTest0_it0_livello1_it1_livello2.java
RegressionTest0_it1_livello2.java
RegressionTest1_it1_livello2.java
RegressionTest_it0_livello1_it1_livello2.java
RegressionTest_it1_livello2.java

Alcuni di questi sono TEST SUITE, che raccolgono gli altri.
È possibile distinguere le test suite dal fatto che non hanno una cifra dopo la parola "Test".
In questo caso, RegressionTest_it0_livello1_it1_livello2 e RegressionTest_it1_livello2 sono test suite.
Ad ogni test suite corrisponde una serie di test, che è possibile riconoscere aggiungendo cifre dopo "Test" nel nome della test suite.
Per esempio, RegressionTest_it0_livello1_it1_livello2 usa come test RegressionTest0_it0_livello1_it1_livello2 e nient'altro.
Mentre RegressionTest_it1_livello2 usa come test RegressionTest0_it1_livello2 e RegressionTest1_it1_livello2.

Il compito dello script è:
1) Correggere ogni public class <nome> {} all'interno dei test con il nome corretto del file
2) All'interno di ogni test suite, importare correttamente i test (i nomi di default sono errati).
3) Creare un file test suite che racchiude tutte le test suite
4) Compilare e misurare la coverage della test suite completa.
"""

import os
import re
import shutil
import subprocess

REPO_PATH = "/repository"
TMP_PATH = "./tmp"
TEST_PATH = "./test/java/mypackage"
CLASS_PATH = "./src/main/java/mypackage"
CSV_PATH = "./results/statistics.csv"
SCRIPT_COMPILE_PATH = "./compilazione_test.sh"
SCRIPT_MEASURE_PATH = "./robot_misurazione_utente.sh"

classes = [f for f in os.listdir(REPO_PATH) if not f.endswith(".txt")]

SUITE_REGEX = re.compile(r"Test\_")     # se il file contiene "Test_" nel nome e non "Test0_", "Test1_", allora e' una test suite
CLASS_REGEX = re.compile(r"public class \w+")   # serve per sostituire i nomi delle classi con quelli corretti
TEST_REGEX = re.compile(r"(\w+Test(\d))\.class")    # serve per sostituire i nomi dei test delle suite con quelli corretti

# serve per creare una test suite che contiene tutte le altre test suite
TEST_SUITE_TEMPLATE = """package mypackage;
import mypackage.{};
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({{
{}
}})
public class RegressionTest{{ }}
"""

def replace_classnames(paths):
    # sostituisci tutti i nomi delle classi con i nomi dei file e aggiungi package
    for path in paths:
        class_name = str(os.path.basename(path)).split(".java")[0]
        with open(path, "r") as f:
            content = f.read()

        new_content = CLASS_REGEX.sub(f"public class {class_name}", content)
        new_content = f"package mypackage;\n"+new_content

        with open(path, "w") as f:
            f.write(new_content)

def replace_test_names_in_testsuites(suite_paths):
    # sostituisci tutte le classi di test nelle test suite coi nomi corretti
    for suite_path in suite_paths:
        class_name = str(os.path.basename(suite_path)).split(".java")[0]
        
        with open(suite_path, "r") as f:
            content = f.read()

        test_classes = TEST_REGEX.findall(content)
        test_numbers = [res[1] for res in test_classes]
        wrong_test_names = [res[0] for res in test_classes]
        
        template = class_name.replace("Test_", "Test{}_")
        test_names = [template.format(test_number) for test_number in test_numbers]
        
        for i in range(len(test_names)):
            content = content.replace(wrong_test_names[i], test_names[i])
        
        with open(suite_path, "w") as f:
            f.write(content)

def cleanup():
    # cleanup delle cartelle in caso di errori
    try:
        files = os.listdir(CLASS_PATH)
        for file in files:
            file_path = os.path.join(CLASS_PATH, file)
            os.remove(file_path)
        files = os.listdir(TEST_PATH)
        for file in files:
            file_path = os.path.join(CLASS_PATH, file)
            os.remove(file_path)

        shutil.rmtree("./target/classes")
    except:
        pass

def compile_and_measure(class_name, csv_path):
    # compila e misura, copia il csv risultante nella repository
    try:
        print("Compiling...")
        process = subprocess.Popen(["bash", SCRIPT_COMPILE_PATH, class_name, "RegressionTest"], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()

        return_code = process.returncode
        
        print("Measuring...")
        process = subprocess.Popen(["bash", SCRIPT_MEASURE_PATH, class_name, "RegressionTest"], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()

        return_code = process.returncode
        
        # copia il csv nella repo
        shutil.copy(CSV_PATH, csv_path)
        os.remove(CSV_PATH)
    except Exception as e:
        print(f"An error occurred: {str(e)}")
    
    cleanup()

def main():
    for class_name in classes:
        print("Checking", class_name)

        levels = os.listdir(os.path.join(REPO_PATH, class_name, "RobotTest", "RandoopTest"))
        test_paths = [os.path.join(REPO_PATH, class_name, "RobotTest", "RandoopTest", level) for level in levels]

        for test_path in test_paths:
            
            csv_path = os.path.join(test_path, "statistics.csv")
            if os.path.isfile(csv_path):
                # il csv già esiste, skip
                print("CSV found at", os.path.join(test_path, "statistics.csv"), ", skipping.")
                continue

            tests = [file for file in os.listdir(test_path) if file.endswith(".java")]

            # copia tutti i test del livello nella cartella temporanea
            for test in tests:
                shutil.copy(os.path.join(test_path, test), TMP_PATH)

            replace_classnames([os.path.join(TMP_PATH, test) for test in tests])

            # trova tutte le test suite gia' presenti
            suite_filenames = [file for file in tests if SUITE_REGEX.search(file)]

            replace_test_names_in_testsuites([os.path.join(TMP_PATH, suite_filename) for suite_filename in suite_filenames])

            # crea la test suite esterna che contiene tutte le test suite
            suite_classes = [name.split(".java")[0] + ".class" for name in suite_filenames]
            total_test_suite = TEST_SUITE_TEMPLATE.format(class_name, ",\n".join(suite_classes))
            with open(os.path.join(TMP_PATH, "RegressionTest.java"), "w") as f:
                f.write(total_test_suite)

            # copia tutti i test nella cartella test
            for file in os.listdir(TMP_PATH):
                shutil.copy(os.path.join(TMP_PATH, file), TEST_PATH)

            # copia la classe under test nella cartella dei sorgenti e aggiungi package
            with open(os.path.join(REPO_PATH, class_name, f"{class_name}SourceCode", f"{class_name}.java"), "r") as f:
                class_content = f.read()
            with open(os.path.join(CLASS_PATH, f"{class_name}.java"), "w") as f:
                f.write("package mypackage;\n"+class_content)

            compile_and_measure(class_name, csv_path)

            for file in os.listdir(TMP_PATH):
                os.remove(os.path.join(TMP_PATH, file))

        print(class_name, "DONE\n\n")


if __name__ == "__main__":
    main()            