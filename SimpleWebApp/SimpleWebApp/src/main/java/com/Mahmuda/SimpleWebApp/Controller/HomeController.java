package com.Mahmuda.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        //System.out.println("Welcome to Simple Web App");
        return "Welcome to Simple Web App";
    }

    @RequestMapping("/about")
    public String about(){
        return "Let's go to the about page";
    }
}
