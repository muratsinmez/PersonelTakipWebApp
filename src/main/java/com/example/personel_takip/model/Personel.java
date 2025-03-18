package com.example.personel_takip.model;


import jakarta.persistence.*;

@Entity
@Table(name = "personeller")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ad;

    @Column(nullable = false)
    private String soyad;

    @Column(nullable = false, unique = true, length = 11)
    private String tcKimlikNo;

    @Column(nullable = false)
    private String dogumTarihi;

    @Column(nullable = false)
    private String isYeriNo;

    @Column
    private int izinGunSayisi;

    // GETTER ve SETTER
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getIsYeriNo() {
        return isYeriNo;
    }

    public void setIsYeriNo(String isYeriNo) {
        this.isYeriNo = isYeriNo;
    }

    public int getIzinGunSayisi() {
        return izinGunSayisi;
    }

    public void setIzinGunSayisi(int izinGunSayisi) {
        this.izinGunSayisi = izinGunSayisi;
    }
}