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
    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) String a, @RequestParam(value = "b", required = false) String b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model){
        if(a == null || b == null || action == null){
            model.addAttribute("result", "no parameters");
        }else {
            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);

            switch (action) {
                case "multiplication" -> {
                    int res = first * second;

                    model.addAttribute("result", a + " * " + b + " = " + res);
                }
                case "addition" -> {
                    int res = first + second;
                    model.addAttribute("result", a + " + " + b + " = " + res);
                }
                case "subtraction" -> {
                    int res = first - second;
                    model.addAttribute("result", a + " - " + b + " = " + res);
                }
                case "division" -> {
                    double res = first / (double)second;
                    model.addAttribute("result", a + " / " + b + " = " + res);
                }
                default -> model.addAttribute("result", "Exception: there is no such action");
            }
        }


        return "first/calculate";
    }
}
