Feature: [US_063] Kayıtlı bir kullanici (provider) olarak kuponlarimi görüp yönetebilecegim bir alan olmasini istiyorum
  Background:
    Given Kullanici "masterUrl" anasayfasini ziyaret edeRr

    Scenario: [TC_01->US_063] Provider Dashboard sidebarda Coupons linki erişilebilir olmalıdır.

    Then Anasayfayi goruntulerR
    Then Anasayfa sag ust kisimda Login butonuna tiklanirRr
    Then Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanirRr
    Then Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanirRr
    Then Provider header bölümünü kontrol ederRr
    Then
    And 3 saniye bekler
    And Sayfayı kapatir








