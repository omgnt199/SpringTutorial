package com.demo.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/all")
    public String homepage(){
        return "index";
    }
    
}
