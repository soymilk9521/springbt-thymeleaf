package com.example.springbthyme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
    private static final Logger logger = LoggerFactory.getLogger(ParamController.class);

    @RequestMapping("/str")
    public String getParamFromUrl(@RequestParam("str") String str, Model model) {
        System.out.println("param str is :" + str);
        logger.info("str:",str);
        model.addAttribute("str", str);
        return "demo/param_output";
    }
}