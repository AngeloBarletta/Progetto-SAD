from flask import Flask, request, jsonify
from dataclasses import dataclass
import os
import subprocess

app = Flask(__name__)

TEST_PATH = "."
CLASS_PATH = "."
SCRIPT_PATH = "./scriptscemo.sh"

@dataclass
class Request:
    testingClassName: str
    testingClassCode: str
    underTestClassName: str
    underTestClassCode: str

@dataclass
class Response:
    error: bool
    csv: str


@app.route("/")
def hello():
    return "It's working"

@app.route('/evosuite_coverage', methods=["POST"])
def evosuite():
    
    if not request.is_json:
        return 'bad request!', 400
    
    data = request.get_json()

    try:
        req = Request(**data)
    except:
        return 'bad request!', 400
    
    # print(req.testingClassName)
    # print(req.testingClassCode)
    # print(req.underTestClassName)
    # print(req.underTestClassCode)
    with open(os.path.join(TEST_PATH, req.testingClassName+".java"), "w") as f:
        f.write(req.testingClassCode)
    with open(os.path.join(CLASS_PATH, req.underTestClassName+".java"), "w") as f:
        f.write(req.underTestClassCode)

    try:
        process = subprocess.Popen(["bash", SCRIPT_PATH, CLASS_PATH, req.underTestClassName, TEST_PATH, req.testingClassName, "."], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()

        return_code = process.returncode

        

        if return_code == 0:
            # Capture the standard output in a string variable
            output_str = stdout.decode('utf-8')
            print(output_str)
        else:
            return 'error', 500
    except Exception as e:
        print(f"An error occurred: {str(e)}")
        return 'error', 500


    return 'OK', 200

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000, debug=True)