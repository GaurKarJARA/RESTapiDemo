package org.example.restapidemo.controller;
import org.example.restapidemo.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
        @RequestMapping("/hello/path/{name}")
        public String helloPath(@PathVariable String name) {
            return "Hello, " + name + "!";
        }
        @RequestMapping("/hello/post")
        public String helloPost(@RequestBody User user) {
            return "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
        }
}


