package com.example.springbthyme.controller;

import com.example.springbthyme.entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${com.config.welcome}")
    public String welcome;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    @Autowired
    //@Qualifier("ConfigBean")
    public ConfigBean configBean;

    @RequestMapping("/config")
    public String getConfigProperties(){
        return this.getWelcome() + ", "
                + configBean.getUsername() +  ", "
                + configBean.getPassword() + ", "
                + configBean.getUrlscheme();
    }
}
