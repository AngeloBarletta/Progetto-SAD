import os

REPO_DIR = "./repository"
CLASS_DIR = "./classes"

for class_file in os.listdir(CLASS_DIR):
    path = os.path.join(CLASS_DIR, class_file)
    class_name = class_file.split(".java")[0]
    class_dir = os.path.join(REPO_DIR, class_name)
    os.mkdir(class_dir)