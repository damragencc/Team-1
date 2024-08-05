
Feature: Kayıtlı bir kullanıcı (Provider) olarak sayfadan güvenli bir sekilde cıkabilmeliyim
  Background:
    * Kullanıcı ilgili urle gider
    * "providerEmail" ve "providerPassword" ile giris yapar
    * Header bolumundeki profil simgesine tiklar
  Scenario:TC_001-Logout linkinin gorunur ve tiklanabilir oldugunu dogrulama

  * Logout linkinin gorunur ve tiklanabilir oldugunu dogrular
  * sayfayi kapatir

    Scenario: TC_002-Logout linkine tiklandiginda basari ile cikis yapildigini dogrulama
    * 2 saniye bekle
    * Logout linkine tiklar
    * 2 saniye bekle
    * Basari ile cikis yapildigini dogrular
    * sayfayi kapatir

  Scenario: TC_003-cikis yapildiktan sonra geri tusuna basildiginda cikis durumunu koruma
    * 2 saniye bekle
    * Logout linkine tiklar
    * 2 saniye bekle
    * Basari ile cikis yapildigini dogrular
    * Geri tuşu ile onceki sayfaya giderek logout durumunda olundugunu dogrular
    * sayfayi kapatir