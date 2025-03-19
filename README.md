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
Veritabanı Ayarlarını Yapın: src/main/resources/application.properties dosyasında veritabanı bağlantı ayarlarını düzenleyin:

spring.datasource.url=jdbc:mysql://localhost:3306/personel_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

Bağımlılıkları Yükleyin:
mvn clean install

Uygulamayı Başlatın:
mvn spring-boot:run

Test Edin: Tarayıcınızda http://localhost:8080/login adresine giderek giriş ekranını test edin.

API Endpointleri
HTTP Yöntemi	Endpoint	Açıklama
GET	/api/personel	Tüm personel verilerini getirir
GET	/api/personel/{id}	Belirli bir personeli getirir
POST	/api/personel	Yeni personel ekler
PUT	/api/personel/{id}	Mevcut personeli günceller
DELETE	/api/personel/{id}	Personeli siler

Lisans
Bu proje MIT Lisansı altında lisanslanmıştır.
