package com.example.springbthyme.controller;

import com.example.springbthyme.domain.LearnResourceDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/learn")
public class LearnResourceController {

    @RequestMapping(value = {"", "/"}, method=RequestMethod.GET)
    public String index(Model model) {
        List<LearnResourceDto> learnList = new ArrayList<LearnResourceDto>();
        learnList.add(new LearnResourceDto("java","karl", 20.0,"aaa"));
        learnList.add(new LearnResourceDto("python","karl", 21.1,"bbb"));
        learnList.add(new LearnResourceDto("nodejs","karl", 22.2,"ccc"));
        model.addAttribute("list",learnList);
       return "learn";
    }

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public String add(Model model, @RequestParam("learnDto")  LearnResourceDto learn) {
        System.out.println(learn.getName());
        return "learn";
    }
}
