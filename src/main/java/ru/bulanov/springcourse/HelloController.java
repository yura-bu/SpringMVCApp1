package ru.bulanov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHallo(){
        return "hello_world";
    }
}
