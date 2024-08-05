Feature: Kayıtlı bir kullanıcı (User) olarak sayfadan güvenli bir sekilde cıkabilmeliyim

  Background:Kullanicin sayfaya girmesi icin gerekli adimlar
    Given Kullanici "masterUrl" gider.
    When Anasayfayi goruntulendigini dogrular.

  Scenario: TC01 Kullanici bilgileriyle sayfaya Login olabilmelidir.
    When Kullaci bilgilerini girer.
    And Header bolumundeki profil ikonunun goruntulendigi dogrulanir.
    And sayfayi kapatir



