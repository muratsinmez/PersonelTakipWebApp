package com.example.personel_takip;

import com.example.personel_takip.model.User;
import com.example.personel_takip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // Admin kullanıcı ekleme
        /*User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(new BCryptPasswordEncoder().encode("admin123"));
        admin.setRoles(Set.of("ROLE_ADMIN"));
        userRepository.save(admin);

        // Personel kullanıcı ekleme
        User personel = new User();
        personel.setUsername("personel");
        personel.setPassword(new BCryptPasswordEncoder().encode("personel123"));
        personel.setRoles(Set.of("ROLE_PERSONEL"));
        userRepository.save(personel);*/
    }
}
