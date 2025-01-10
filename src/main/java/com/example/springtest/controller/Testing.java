package com.example.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Testing {
    @GetMapping("/")
    public String homePage(Model model) {
        return "layout";
    }
    @GetMapping("/page1")
    public String page1(Model model) {
        return "bruhlmao";
    }
}
