@wip
Feature: Kayıtlı bir kullanıcı (Provider) olarak sayfadan güvenli bir sekilde cıkabilmeliyim
  Scenario:Logout linkinin gorunur ve tiklanabilir oldugunu dogrulama

  * Kullanıcı ilgili urle gider
  * Login butonuna tiklar
  * 2 saniye bekle
  * Gecerli  "providerEmail" adresini girer
    * 2 saniye bekle
  * Loginform butonuna tiklar
    * 2 saniye bekle
  * Gecerli "providerPassword" girer
    * 2 saniye bekle
  * Enter butonuna tiklar
    * 2 saniye bekle
  * Header bolumundeki profil simgesine tiklar
  * Logout linkinin gorunur ve tiklanabilir oldugunu dogrular
  * sayfayi kapatir
