package com.elan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping()
    public String syshello() {

        return "Hello!";
    }
}
