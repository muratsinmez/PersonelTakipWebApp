package com.example.personel_takip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";  // src/main/resources/templates/login.html dosyasını döndürür.
    }
}
