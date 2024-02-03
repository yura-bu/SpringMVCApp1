package ru.bulanov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHallo(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname,
                           Model model){
        model.addAttribute("fullName", "Hello " + name + " " + surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String sayGoodbye(){
        return "first/goodbye";
    }
    @GetMapping("/finish")
    public String sayStop(){
        return "first/finish";
    }
}
