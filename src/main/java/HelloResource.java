package com.example.Firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping (path = "/api/hello")
    public String hello() {
        return "hello world from serwer";
    }
}
