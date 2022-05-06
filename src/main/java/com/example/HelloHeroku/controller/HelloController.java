package com.example.HelloHeroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    @ResponseStatus(value = HttpStatus.OK)
    public String hello() {
        return "Hello heroku!";
    }
}
