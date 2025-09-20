package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SController {

    @GetMapping("/rocks")
    public String cse() {
        return " JENKINS WORLD";
    }
}
