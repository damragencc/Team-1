Feature:Kayıtlı bir kullanıcı olarak istediğim hizmete ait rezervasyonumu doğrulayacağım bir
  Randevu sayfasi olmasini istiyorum.

  Background:Kullanicin sayfaya girmesi icin gerekli adimlar
    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulendigini dogrular.
    * Kullaci bilgilerini girer.

  Scenario: TC01
    * Linklere  tıklanıldığında ilgili şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Profil ikonuna tıklandıgında Book Service ikonu görünür ve aktif olmalıdır.
    * Book Service ikonuna tıklanıldığında şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Hizmetler sayfasında herhangi bir hizmete tıklanıldığında o hizmete ait Book Service butonu gorunur ve aktif olmalıdır.
    * Book Service butonuna tıklanıldığında Appointment sayfasına yonlendirilmelidir
    * Appointment sayfasında ki Book Service alanında Confirm Booking ve Cancel Booking butonları gorunur ve aktif olmalidir
    * Book Service alanında ki alanlar doldurularak rezervasyon doğrulanmalidir
    * Sayfayi kapatir