package ru.buzynnikov.basicHimeWord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TemplateController {

    @GetMapping("/greet/{name}")
    public String getGreeting(Model model,@PathVariable("name") String name){
        model.addAttribute("name",name);
        return "index";
    }
}
