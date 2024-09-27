package com.example.devopsrender;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaController {
    @GetMapping("/ola")
    public ResponseEntity<String> ola() {
        return ResponseEntity.ok("Davi brito");
    }
}
