package com.jenkins.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Jenkins CI/CD App!";
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println(">>> /hello endpoint was hit!");
        return "This is the /hello endpoint!";
    }

}
