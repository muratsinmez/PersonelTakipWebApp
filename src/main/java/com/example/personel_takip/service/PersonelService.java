package com.example.personel_takip.service;

import com.example.personel_takip.model.Personel;
import com.example.personel_takip.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonelService {

    @Autowired
    private PersonelRepository personelRepository;

    public List<Personel> getAllPersonel() {
        return personelRepository.findAll();
    }
    // Yeni personel ekleme
    public Personel savePersonel(Personel personel) {
        return personelRepository.save(personel);
    }

    // Tüm personelleri listeleme
    public List<Personel> getAllPersoneller() {
        return personelRepository.findAll();
    }

    // ID'ye göre tek bir personeli bulma
    public Optional<Personel> getPersonelById(Long id) {
        return personelRepository.findById(id);
    }

    // Personeli silme
    public void deletePersonel(Long id) {
        personelRepository.deleteById(id);
    }

    // Personel bilgileri güncelleme (ID)
    public Personel updatePersonel(Long id, Personel personelGuncel) {
        Optional<Personel> personelVarMi = personelRepository.findById(id);
        if (personelVarMi.isPresent()) {
            Personel personel = personelVarMi.get();
            personel.setAd(personelGuncel.getAd());
            personel.setSoyad(personelGuncel.getSoyad());
            personel.setTcKimlikNo(personelGuncel.getTcKimlikNo());
            personel.setDogumTarihi(personelGuncel.getDogumTarihi());
            personel.setIsYeriNo(personelGuncel.getIsYeriNo());
            personel.setIzinGunSayisi(personelGuncel.getIzinGunSayisi());
            return personelRepository.save(personel);
        } else {
            throw new RuntimeException("Personel bulunamadı! ID: " + id);
        }
    }
}
