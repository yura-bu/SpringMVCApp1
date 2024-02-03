package ru.bulanov.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/second")
    public String getSecond(){
        return "second/second";
    }
}
