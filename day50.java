package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greet() {
        return "Hello, World!";
    }

    @GetMapping("/greeting/{name}")
    public String greetWithName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/greeting")
    public String greetWithPost(@RequestBody String name) {
        return "Hello, " + name + "!";
    }
}