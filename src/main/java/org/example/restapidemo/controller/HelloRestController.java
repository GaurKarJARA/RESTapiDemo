package org.example.restapidemo.controller;
import org.example.restapidemo.model.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

    @RestController
    public class HelloRestController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello, World!";
        }

    @RequestMapping("/hello/query")
    public String helloQuery(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}


