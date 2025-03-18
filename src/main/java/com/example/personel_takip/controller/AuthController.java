package com.example.personel_takip.controller;

import com.example.personel_takip.model.User;
import com.example.personel_takip.security.JwtUtil;
import com.example.personel_takip.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    // Kullanıcı giriş yapacak ve JWT token alacak
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        // Kullanıcıyı doğrula
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );

        // Kullanıcı detaylarını al
        UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());

        // JWT token oluştur
        String token = jwtUtil.generateToken(userDetails.getUsername());

        // Token'ı döndür
        return Map.of("token", token);
    }

    // Token doğrulama endpointi (opsiyonel)
    @PostMapping("/validate")
    public Map<String, Boolean> validateToken(@RequestHeader("Authorization") String token) {
        String jwt = token.substring(7);  // Bearer prefix'ini çıkarıyoruz
        boolean isValid = jwtUtil.validateToken(jwt, "user_name");  // Burada username'i gerçek username ile karşılaştırabilirsiniz
        return Map.of("isValid", isValid);
    }
}
