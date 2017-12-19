package com.example.springbthyme.controller;

import com.example.springbthyme.util.MessagesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Locale;

@Controller
public class HelloController {

    @Autowired
    public MessagesUtils msgUtil;

    @Autowired
    public MessageSource messageSource;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model, @RequestParam(value = "lang", required = false) String lang){
        Locale locale = LocaleContextHolder.getLocale();
        String msg = msgUtil.getMessage("welcome",null , locale);
        String country = locale.getCountry();
        String displayLanguage = locale.getDisplayLanguage();
        String language = locale.getLanguage();
        model.addAttribute("lang", lang);
        model.addAttribute("msg", msg);
        model.addAttribute("displayLanguage", displayLanguage);
        model.addAttribute("country", country);
        model.addAttribute("language", language);
        return "hello";
    }
}
