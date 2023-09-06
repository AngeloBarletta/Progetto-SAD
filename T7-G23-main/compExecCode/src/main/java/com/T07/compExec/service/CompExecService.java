package com.T07.compExec.service;

import com.T07.compExec.api.model.CompExecResults;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CompExecService {

    //private CompExecResults res;

    public CompExecResults getCompExecResults(String className, String studentLogin, String gameId) {
        Manager m = new Manager();

        float ex_time = m.CompileRun(className, studentLogin, gameId);
        System.out.println("tempo di esecuzione: " + ex_time);
        return m.getRes();

    }
/*
    public CompExecResults getCompExecResultsPath(String Class, String TestClass) {
        Manager m = new Manager();

        float ex_time = m.CompileRun(Class, TestClass);
        System.out.println("tempo di esecuzione: " + ex_time);
        return m.getRes();

    }
*/
    public CompExecResults getCompExecResultsUrl(String urlClass, String urlTestClass, String className, String studentLogin, String gameId) {
        Manager m = new Manager();

        float ex_time = m.CompileRun(className, studentLogin, gameId, urlClass, urlTestClass);
        System.out.println("tempo di esecuzione: " + ex_time);
        return m.getRes();

    }

}
