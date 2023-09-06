package com.T07.compExec.api.controller;

import com.T07.compExec.api.model.CompExecResults;
import com.T07.compExec.api.model.UrlClassToTest;
import com.T07.compExec.service.CompExecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompExecController {

    private CompExecService compExecService;

    @Autowired
    public CompExecController (CompExecService compExecService) {
        this.compExecService = compExecService;
    }

    @GetMapping("/compexec")
    public CompExecResults getCompExec(@RequestParam String ClassName, @RequestParam String StudentLogin, @RequestParam String GameId) {
        return compExecService.getCompExecResults(ClassName, StudentLogin, GameId);
    }
/*
    @GetMapping("/compexecpath")
    public CompExecResults getCompExec(@RequestParam String Class, @RequestParam String TestClass) {
        return compExecService.getCompExecResultsPath(Class, TestClass);
    }
*/
    @PostMapping("/compexecurl")
    public CompExecResults getCompExecUrl(@RequestBody UrlClassToTest urls, @RequestParam String ClassName, @RequestParam String StudentLogin, @RequestParam String GameId) {
        return compExecService.getCompExecResultsUrl(urls.getUrlClass(), urls.getUrlTestClass(), ClassName, StudentLogin, GameId);
    }

}
