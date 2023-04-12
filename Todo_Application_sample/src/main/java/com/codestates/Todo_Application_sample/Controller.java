package com.codestates.Todo_Application_sample;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application!";
    }
}
