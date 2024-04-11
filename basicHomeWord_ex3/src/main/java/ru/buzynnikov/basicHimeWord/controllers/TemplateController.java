package ru.buzynnikov.basicHimeWord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.buzynnikov.basicHimeWord.models.User;

@Controller
public class TemplateController {
    @GetMapping("/form")
    public String getForm(){
        return "form";
    }
    @PostMapping("/form")
    public String registry(Model model, User user){
        model.addAttribute("user",user);
        System.out.println("Пользователь " + user + " вошёл в систему!");
        return "redirect:/form";
    }
}
