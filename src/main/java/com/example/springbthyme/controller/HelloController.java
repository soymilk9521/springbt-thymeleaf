package com.example.springbthyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/hello")
    public String hello(Model model){
        Locale locale = LocaleContextHolder.getLocale();
        String msg = messageSource.getMessage("welcome",null,locale);
        String country = locale.getCountry();
        String displayLanguage = locale.getDisplayLanguage();
        String language = locale.getLanguage();
        model.addAttribute("msg", msg);
        model.addAttribute("displayLanguage", displayLanguage);
        model.addAttribute("country", country);
        model.addAttribute("language", language);
        return "hello";
    }
}
