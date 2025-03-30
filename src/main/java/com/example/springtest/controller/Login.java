package com.example.springtest.controller;

import com.example.springtest.model.LoginRequest;
import com.example.springtest.service.Auth;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {
    @GetMapping("/page2")
    public String page2(Model model) {
        model.addAttribute("message", "");
        return "LoginUI";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute LoginRequest loginRequest, Model model) {
        if (Auth.login(loginRequest)) {
            model.addAttribute("message", "You have successfully logged in!");
        } else {
            model.addAttribute("message", "You have failed!");
        }
        return "main";
    }

}
