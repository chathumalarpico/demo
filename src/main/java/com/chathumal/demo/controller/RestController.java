package com.chathumal.demo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping
    public String test(){
        return "Hello AWS";
    }

}
