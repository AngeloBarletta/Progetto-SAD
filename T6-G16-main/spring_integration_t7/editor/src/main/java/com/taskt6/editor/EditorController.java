package com.taskt6.editor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditorController {
    
    @GetMapping("/")
    public String getHomePage() {
        return "code-editor.html"; // Nome del file HTML da restituire
    }
}
