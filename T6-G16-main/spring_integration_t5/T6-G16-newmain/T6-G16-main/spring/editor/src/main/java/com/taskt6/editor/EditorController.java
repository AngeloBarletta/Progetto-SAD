package com.taskt6.editor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/myapp")
public class EditorController {

    @GetMapping
    public String getHomePage(@RequestParam(name="myParam") String myParam) {
        System.out.println("Parameter value: " + myParam);
        return "code-editor.html";
    }
}
