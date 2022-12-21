package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/edge")
public class EdgeController {

    @GetMapping("/info")
    public String info() {
        return "Hii! I am Edge Service";
    }
}
