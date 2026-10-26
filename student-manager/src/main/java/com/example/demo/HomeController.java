package com.example.demo; // or your package name

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // This tells Spring Boot to render 'students.html' from src/main/resources/templates/
        return "students"; 
    }
}