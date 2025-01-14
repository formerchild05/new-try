package com.example.springtest.service;

import com.example.springtest.model.LoginRequest;

public class Auth {
    public static boolean login(LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        if (username.equals("admin") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
