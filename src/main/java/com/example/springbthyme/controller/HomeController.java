package com.example.springbthyme.controller;

import org.springframework.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home/index")
    public String index(ModelMap map) {
        List<String> strList = new ArrayList<String>();
        strList.add("Java");
        strList.add("Sping Boot");
        strList.add("Scala");
        map.addAttribute("name", strList);
        return "index";
    }

    @RequestMapping(value={"/home", "/home/{name}"}, method = RequestMethod.GET)
    public String home(Model model, @PathVariable(value="name", required = false) String name) {
        if (!StringUtils.isEmpty(name)){
            model.addAttribute("name", name);
        }
        return "home";
    }
}
