Feature: [US_065] Kayıtlı bir kullanici (provider) olarak hizmet puanlarimi görüp yönetebilecegim bir alan olmasini istiyorum
  Background:
    Given Kullanıcı "masterUrl" anasayfasını ziyaret eder.

    Scenario: [TC_01->US_065] Provider Dashboard sidebarda Reviews linki görünür ve tıklanabilir olmalıdır.

      Then Anasayfayi goruntulenirR
      Then Anasayfa sag ust kisimda Login butonuna tiklanirR
      Then Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanirR
      Then Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanirR
      Then Kullanıcı header bölümünü kontrol eder.
      Given Provider header bolumundeki profil simgesine tiklarr
      Then Provider dashboard linkinin gorunur oldugunu dogrularr
      Then Provider dashboard linkine tiklarr
      Then Provider Reviews linkinin gorunur oldugunu dogrular
      Then Provider Reviews linkine tiklar
      And 3 saniye bekleR
      And Sayfayi kapatiR

      Scenario: [TC_02->US_065] Reviews sayfasında ürünü değerlendiren müşteri listesi görünür olmalıdır.

        Given Provider Reviews sayfasindaki urun degerlendiren musteri listesini kontrol eder



