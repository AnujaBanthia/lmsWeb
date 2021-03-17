package com.lmsWeb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String showPage(){
        System.out.println("In show Page of Home Controller");
        return "main-menu";
    }
}
