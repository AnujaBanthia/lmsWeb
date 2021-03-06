package com.lmsWeb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String showPage(){
        System.out.println("In show Page of Home Controller");
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

// need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

// read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

// convert the data to all caps
        theName = theName.toUpperCase();

// create the message
        String result = "Yo! " + theName;

// add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDude(@RequestParam ("studentName") String theName, Model model) {



// convert the data to all caps
        theName = theName.toUpperCase();

// create the message
        String result = "Yo! " + theName;

// add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
