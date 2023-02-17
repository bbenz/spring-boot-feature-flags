package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final MessageProperties properties;

    public HelloWorldController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Message: " + properties.getMessage();
    }

    @GetMapping("/hello")
    public String sayHey() {
        return "Hey.";
    }

}
