package com.example.springbthyme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("/")
    public String index() {
        System.out.println("index() is running!");
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println("home() is running!");
        return "home";
    }
}