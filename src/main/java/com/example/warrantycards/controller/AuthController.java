package com.example.warrantycards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout";
    }

    @GetMapping("/registration")
    public String registration() {
        return "auth/registration";
    }

}
