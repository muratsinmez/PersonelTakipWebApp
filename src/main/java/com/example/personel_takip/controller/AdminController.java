package com.example.personel_takip.controller;

import com.example.personel_takip.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PersonelService personelService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("personeller", personelService.getAllPersonel());
        return "admin-dashboard";
    }
}
