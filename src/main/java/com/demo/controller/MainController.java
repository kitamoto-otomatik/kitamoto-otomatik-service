package com.demo.controller;

import com.demo.model.Greetings;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping
    public Greetings main() {
        return new Greetings("Hello, World");
    }
}
