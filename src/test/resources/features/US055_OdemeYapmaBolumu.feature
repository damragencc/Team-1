Feature:US055 Odeme Yapma Bolumu Test

  Background:Kullanicin sayfaya girmesi icin gerekli adimlar
    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulendigini dogrular.
    * Kullaci bilgilerini girer.

  Scenario: TC01 Randevu olusturmalidir

    * Linklere  tıklanıldığında ilgili şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Profil ikonuna tıklandıgında Book Service ikonu görünür ve aktif olmalıdır.
    * Book Service ikonuna tıklanıldığında şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Hizmetler sayfasında herhangi bir hizmete tıklanıldığında o hizmete ait Book Service butonu gorunur ve aktif olmalıdır.
    * Book Service butonuna tıklanıldığında Appointment sayfasına yonlendirilmelidir
    * Appointment sayfasında ki Book Service alanında Confirm Booking ve Cancel Booking butonları gorunur ve aktif olmalidir
    * Book Service alanında ki alanlar doldurularak rezervasyon doğrulanmalidir
    * Appointment sayfasında ki Guests alanında Proceed To Payment ve Cancel Booking butonları gorunur ve aktif olmalı.
    * Daha fazla hizmet eklemek için Guests alanında ki service card'ında bulunan checkbox seçilebilmeli.
    * Daha fazla hizmet eklemek için Guests alanında ki service card'ında bulunan checkbox seçildikten sonra alanlar doldurularak daha fazla hizmet eklenir.
    * Guests alanında ki Add More linki gorunur ve aktif olmalı.
    * Add More linkine tıklanıldığında yeni bir Service card'ı açılmalı. Yeni açılan Service card'ında Remove Services linki gorunur ve aktif olmalı. Tıklanıldığında hizmet kaldırılmalı.
    * Guests alanında ki Proceed To Payment butonuna tıklanıldığında Ödemeye devam edilmeli.
    * Sayfayi kapatir
