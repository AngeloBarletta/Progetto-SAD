package com.T07.compExec.service;

import com.T07.compExec.api.model.CompExecResults;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessE {

    public void Process(String path_to_res, CompExecResults results, int error) {

        try {
            String content = new String(Files.readAllBytes(Paths.get(path_to_res)));
            results.setResMessage(content);

            if (error == 0) {
                results.setIdResult(0);
            } else {
                results.setIdResult(2);
            }

        } catch (IOException e) {
            System.err.println("errore nell'apertura del file");
        }

    }
}
