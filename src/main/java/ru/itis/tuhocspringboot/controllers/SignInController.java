package ru.itis.tuhocspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignInPage() {
        return "signIn_page";
    }

//    @PostMapping("/signIn")
//    public
}
