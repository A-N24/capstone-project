package com.example.task_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("unused")
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}