from flask import Flask, request, jsonify
from dataclasses import dataclass
import os
import subprocess
import shutil

app = Flask(__name__)

TEST_PATH = "./test/java/mypackage"
CLASS_PATH = "./src/main/java/mypackage"
CSV_PATH = "./results/statistics.csv"
SCRIPT_COMPILE_PATH = "./compilazione_test.sh"
SCRIPT_MEASURE_PATH = "./robot_misurazione_utente.sh"

@dataclass
class Request:
    testingClassName: str
    testingClassCode: str
    underTestClassName: str
    underTestClassCode: str

@dataclass
class Response:
    error: bool
    outCompile: str
    coverage: str

def cleanup():
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
    
    with open(os.path.join(TEST_PATH, req.testingClassName+".java"), "w") as f:
        f.write(req.testingClassCode)
    with open(os.path.join(CLASS_PATH, req.underTestClassName+".java"), "w") as f:
        f.write(req.underTestClassCode)

    try:
        process = subprocess.Popen(["bash", SCRIPT_COMPILE_PATH, req.underTestClassName, req.testingClassName], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()

        return_code = process.returncode

        if return_code == 0:
            # Capture the standard output in a string variable
            output_str = stdout.decode('utf-8')
            error_str = stderr.decode('utf-8')
            lines = output_str.splitlines()
            lines = [line for line in lines if line.startswith("[")]
            out_compile = "\n".join(lines)
            print(out_compile)
            if "[ERROR]" in out_compile:
                response = Response(True, output_str+error_str, "")
                cleanup()
                return jsonify(response.__dict__), 200
        else:
            error_str = stderr.decode("utf-8")
            response = Response(True, error_str, "")
            cleanup()
            return jsonify(response.__dict__), 200
        
        process = subprocess.Popen(["bash", SCRIPT_MEASURE_PATH, req.underTestClassName, req.testingClassName], stdout=subprocess.PIPE, stderr=subprocess.PIPE)
        stdout, stderr = process.communicate()

        return_code = process.returncode

        response = Response(False, out_compile, "")

        if return_code == 0:
            # Capture the standard output in a string variable
            output_str = stdout.decode('utf-8')
            print(output_str)
        else:
            output_str = stdout.decode('utf-8')
            error_str = stderr.decode('utf-8')
            print(output_str, error_str)
            cleanup()
            return jsonify(response.__dict__), 500
        
        try:
            with open(CSV_PATH, "r") as f:
                csv = f.read()
            os.remove(CSV_PATH)
        except:
            print("Error in csv")
            cleanup()
            return jsonify(response.__dict__), 500

        response.coverage = csv

        return jsonify(response.__dict__), 200
    except Exception as e:
        print(f"An error occurred: {str(e)}")
        return 'error', 500

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000, debug=True)