# Personel Takip Projesi

## Proje Hakkında
Bu proje, kurum içerisindeki personel bilgilerini yönetmek amacıyla geliştirilmiş kapsamlı bir web uygulamasıdır. Kullanıcılar güvenli bir giriş ekranı üzerinden sisteme erişip, personel ekleyebilir, güncelleyebilir ve silebilirler. Ayrıca, RESTful API endpoint’leri sayesinde veritabanındaki personel verilerine erişim sağlanmaktadır.

## Kullanılan Teknolojiler
- **Java 17**
- **Spring Boot 3.x** (Web, Data JPA, Security)
- **Spring Data JPA**
- **Thymeleaf** (View Layer)
- **MySQL** (Veritabanı)
- **Maven** (Bağımlılık Yönetimi)

## Proje Özellikleri
- **Güvenli Giriş:** Kullanıcılar, özel bir giriş ekranı üzerinden kimlik doğrulaması yaparak sisteme erişir.
- **Admin Dashboard:** Admin kullanıcı, giriş sonrası personel listesini görüntüleyip, yeni personel ekleyebilir, mevcut personel bilgilerini güncelleyebilir ya da silebilir.
- **RESTful API:** Personel verilerine erişim sağlayan API endpoint’leri mevcuttur.
- **Güvenlik:** Spring Security kullanılarak, giriş ve yetkilendirme işlemleri güvence altına alınmıştır.

## Kurulum ve Çalıştırma
### Gerekli Ön Koşullar
- Java 17 veya üstü
- MySQL veritabanı
- Maven

### Kurulum Adımları
1. **Projeyi Klonlayın:**
   ```bash
   git clone https://github.com/muratsinmez/personel_takip.git
   cd personel_takip
