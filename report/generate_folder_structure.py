import os
import shutil

REPO_DIR = "..\\repository"
CLASS_DIR = ".\\classes"

def generate_folder_structure():
    for class_file in os.listdir(CLASS_DIR):
        path = os.path.join(CLASS_DIR, class_file)
        class_name = class_file.split(".java")[0]

        class_dir = os.path.join(REPO_DIR, class_name)
        os.mkdir(class_dir)
        os.mkdir(os.path.join(class_dir, class_name+"SourceCode"))
        shutil.copyfile(path, os.path.join(class_dir, class_name+"SourceCode", class_file))

        test_path = os.path.join(class_dir, "RobotTest")
        os.mkdir(test_path)
        # os.mkdir(os.path.join(test_path, "EvoSuiteTest"))
        # os.mkdir(os.path.join(test_path, "RandoopTest"))

if __name__ == "__main__":
    generate_folder_structure()