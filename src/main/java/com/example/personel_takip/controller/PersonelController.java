package com.example.personel_takip.controller;


import com.example.personel_takip.model.Personel;
import com.example.personel_takip.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/personel")
public class PersonelController {

    @Autowired
    private PersonelService personelService;

    // Yeni personel ekleme
    @PostMapping("/ekle")
    public Personel createPersonel(@RequestBody Personel personel) {
        return personelService.savePersonel(personel);
    }

    // Tüm personelleri listeleme
    @GetMapping("/liste")
    public List<Personel> getAllPersoneller() {
        return personelService.getAllPersoneller();
    }

    // ID'ye göre personel bulma
    @GetMapping("/{id}")
    public Optional<Personel> getPersonelById(@PathVariable Long id) {
        return personelService.getPersonelById(id);
    }

    // Personel silme
    @DeleteMapping("/sil/{id}")
    public String deletePersonel(@PathVariable Long id) {
        personelService.deletePersonel(id);
        return "Personel silindi! ID: " + id;
    }

    // Personel bilgilerini güncelleme(ID)
    @PutMapping("/guncelle/{id}")
    public Personel updatePersonel(@PathVariable Long id, @RequestBody Personel personelGuncel) {
        return personelService.updatePersonel(id, personelGuncel);
    }
}