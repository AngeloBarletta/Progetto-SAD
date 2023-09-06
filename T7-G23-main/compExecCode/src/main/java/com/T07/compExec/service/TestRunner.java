package com.T07.compExec.service;

import com.T07.compExec.api.model.CompExecResults;

import java.io.IOException;

public class TestRunner {

    public void RunTests(String path, CompExecResults results) {

        try {
            // Command to execute
            String command = "cd " + path + ";mvn test --log-file logexe.txt";

            // Create the process builder
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("bash", "-c", command);

            // Start the process
            Process process = processBuilder.start();

            // Wait for the process to complete
            int exitCode = process.waitFor();

            ProcessE procE = new ProcessE();
            procE.Process(path+"logexe.txt", results, exitCode);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

