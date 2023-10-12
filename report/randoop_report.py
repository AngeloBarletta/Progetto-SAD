import os
import xml.etree.ElementTree as ET

REPO_PATH = "..\\repository"

classes = [f for f in os.listdir(REPO_PATH) if not f.endswith(".txt")]

def is_ascending(arr):
    n = len(arr)
    for i in range(n - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True

for class_name in classes:
    ## RANDOOP
    levels = os.listdir(os.path.join(REPO_PATH, class_name, "RobotTest", "RandoopTest"))
    xml_paths = [os.path.join(REPO_PATH, class_name, "RobotTest", "RandoopTest", level, "coveragetot.xml") for level in levels]

    lines = []
    blocks = []
    try:
        for xml_path in xml_paths:
            xml_tree = ET.parse(xml_path)
            root = xml_tree.getroot()
            

            classes = root.find("data").find("all").find("package").find("srcfile").findall("class")
            my_class = None
            for class_temp in classes:
                if class_temp.get("name") == class_name:
                    my_class = class_temp
                    break
            coverages = my_class.findall("coverage")
            lines.append(int(str(coverages[3].get("value").split("%")[0])))
            blocks.append(int(str(coverages[2].get("value").split("%")[0])))

        if is_ascending(lines) and is_ascending(blocks):
            print(f"{class_name}: TEST PASSED")
        else:
            print(f"{class_name}: TEST FAILED")
        print("Lines:", lines)
        print("Blocks:", blocks, "\n\n")
    except FileNotFoundError:
        print(f"{class_name}: TEST FAILED, file not found\n\n")
            