package com.example.personel_takip.controller;

import com.example.personel_takip.model.Personel;
import com.example.personel_takip.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PersonelService personelService;


    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<Personel> personellerList = personelService.getAllPersonel();
        model.addAttribute("personeller", personellerList);
        return "admin-dashboard";
    }

    /**
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Personel> personelList = personelService.getAllPersonel();
        model.addAttribute("personeller", personelService.getAllPersonel());
        return "admin-dashboard";
    }*/
}
