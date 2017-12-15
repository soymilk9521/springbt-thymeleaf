package com.example.springbthyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @RequestMapping("/")
    public String index() {
       return "index";
    }
}
