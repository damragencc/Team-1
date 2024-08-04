Feature: Kayıtlı bir kullanıcı (User) olarak sayfadan güvenli bir sekilde cıkabilmeliyim

  Background:Kullanicin sayfaya girmesi icin gerekli adimlar
    Given Kullanici "masterUrl" gider.
    When Anasayfayi goruntulendigini dogrular.

  Scenario: TC01 Kullanici bilgileriyle sayfaya Login olabilmelidir.
    When Login butonuna tiklar.
    When Email ID bolumune "userMail1" bilgileri giris yapar
    When Login butonuna tiklar.
    When Password bolumune "userPassword1" bilgileri giris yapar.
    Then Enter butonuna tiklar.
    And Header bolumundeki profil ikonunun goruntulendigi dogrulanir.
    And sayfayi kapatir



