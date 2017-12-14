package com.example.springbthyme.controller;

import com.example.springbthyme.entity.DBConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${com.config.welcome}")
    public String welcome;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    @Autowired
    public DBConfigBean configBean;

    @RequestMapping("/config")
    public String getConfigProperties(){
        return this.getWelcome() + ", " + configBean.getDriver() +"\r\n"
                + configBean.getUsername() + ":" +configBean.getPassword()
                + "@" + configBean.getUrl();
    }
}
