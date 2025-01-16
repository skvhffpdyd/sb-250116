package com.example.demo.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private int age = 0;
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

    @GetMapping("/introduce")
    @ResponseBody
    public String introduce() {
        return "introduce";
    }

    @GetMapping("/ageUp")
    @ResponseBody
    public int ageUp() {
        age++;
        return age;
    }
}

