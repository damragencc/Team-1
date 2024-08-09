Feature: I want to be able to register on the site as a user (Provider)

  Background:
    Given Go to "masterUrl" url

    @e2e1
  Scenario: Verify that with valid inputs i can be able to register
    Then  Anasayfa header bolumunde bulunan Become A Professional linkine tiklayin
    And   Acilan Join As A Professional formunda yer alan bolumlere gecerli verileri girerek kayıt olun
        |Recep Alici|recepAlicit136@gmail.com|Javacandir.135|55510101045|
    Then  Basarili bir sekilde kayit olunabildigini dogrulayin
    And   Sayfayi kapatin