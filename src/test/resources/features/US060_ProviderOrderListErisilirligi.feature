Feature: [US_060] Kayıtlı bir kullanici (provider) olarak siparislerimi görüp yönetebilecegim bir alan olmasini istiyorum
  Background: Given Kullanıcı "masterUrl" anasayfasını ziyaret eder.

    Then Anasayfayi goruntuleniR
    Then Anasayfa sag ust kisimda Login butonuna tiklaniR
    Then Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklaniR
    Then Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklaniR
    Then Kullanıcı header bölümünü kontrol eder.








