package com.example.springbthyme.task;

import com.example.springbthyme.database.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskConntroller {

    @Autowired
    DBConnector connector;

    @RequestMapping(value = {"/",""})
    public String hellTask(){
        return "The running environment is " + connector.configure();
    }
}
