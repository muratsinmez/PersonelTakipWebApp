package com.example.personel_takip.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secretKey = "123456";  // Secret Key'inizi application.properties ya da application.yml'den alın

    // Token oluşturma metodu
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)  // Kullanıcı adı bilgisi
                .setIssuedAt(new Date())  // Token oluşturulma zamanı
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))  // Token geçerlilik süresi (10 saat)
                .signWith(SignatureAlgorithm.HS256, secretKey)  // HMAC SHA-256 ile imzalama
                .compact();
    }

    // Token'dan kullanıcı adını alma
    public String extractUsername(String token) {
        return extractClaims(token).getSubject();  // Token'dan kullanıcı adını çıkartır
    }

    // Token'dan Claim (data) bilgisi almak
    private Claims extractClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey)  // Secret Key ile doğrulama yap
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // Token'ın geçerliliğini kontrol etme
    public boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    // Token doğrulaması
    public boolean validateToken(String token, String username) {
        return (username.equals(extractUsername(token)) && !isTokenExpired(token));
    }
}
