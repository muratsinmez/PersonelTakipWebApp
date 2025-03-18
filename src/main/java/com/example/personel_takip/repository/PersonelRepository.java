package com.example.personel_takip.repository;

import com.example.personel_takip.model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {



}