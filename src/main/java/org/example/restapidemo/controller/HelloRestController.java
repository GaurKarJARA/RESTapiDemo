package org.example.restapidemo.controller;

import org.example.restapidemo.model.User;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

    @RestController
    public class HelloRestController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }
    }


