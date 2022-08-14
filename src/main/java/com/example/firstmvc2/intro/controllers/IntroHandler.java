package com.example.firstmvc2.intro.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/intro")
public class IntroHandler {


    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String index(){
         return "index";
    }

    @RequestMapping (value = "/about", method = RequestMethod.GET)
    public String about(){
        return "about";
    }

    @RequestMapping (value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String users(){
        return "users";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String userById(@PathVariable ("id") String id){
        return "user = " + id;
    }
}
