package ru.buzynnikov.basicHimeWord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
    @GetMapping("/greeting")
    public String getGreeting(){
        return "greeting.html";
    }
}
