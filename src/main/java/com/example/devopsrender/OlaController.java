package com.example.devopsrender;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaController {
    @GetMapping("/ola")
    public String ola() {
        return "index"; // o Spring irá procurar o arquivo src/main/resources/templates/index.html
    }
}
