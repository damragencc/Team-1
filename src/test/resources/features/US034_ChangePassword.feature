Feature: Kayitli bir kullanici (Provider) olarak Dashboard panelimde sifre degistirme islemlerimi yapabilmek istiyorum.

  Scenario: TC01 Kayıtlı Provder Kullanıcı siteye doğru giriş yapabilmeli
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    And 3 saniye beklerr
    And sayfayi kapatirr

    Scenario: TC02 Dashbord'dan profil paneline ulaşabilmeli
      Given  Kullanici "masterUrl" giderr
      Then login butonuna tiklar.
      And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
      And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
      Then profil ikonuna gider
      And 3 saniye beklerr
      And sayfayi kapatirr

  Scenario: TC03   Kayıtlı Kullanıcı Profil panelinden Change Password paneline ulaşabilmeli

    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    Then profil ikonuna gider
    Then Kullanıcı Dashboard profil panelinden Change Password menüsüne tıklar
    And 3 saniye beklerr
    And sayfayi kapatirr

Scenario: TC04 Change Password sayfasında,  Current Password,New Password,Confirm Password text boxları görebilemli

  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
  And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
  Then profil ikonuna gider
  Then Kullanıcı Dashboard profil panelinden Change Password menüsüne tıklar
  Then Change Password sayfasında Current Password,New Password,Confirm Password text boxları görür
  And 3 saniye beklerr
  And sayfayi kapatirr

Scenario: TC05  Kullanıcı Şidre değiştirme için ilgili alanları doldurabilmeli
  # BUG VARRRRRRR RAPOR EDİLECEK
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
  And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
  Then profil ikonuna gider
  Then Kullanıcı Dashboard profil panelinden Change Password menüsüne tıklar
  Then Şifre değiştirmek için Current Password alanı doldurur
  Then New Password doldurur
  Then Confirm Password alanları doldurur
  Then Kayıt etmek için Change butonuna tıklar
  And 3 saniye beklerr
  And sayfayi kapatirr

  Scenario: TC06 Uygun olmayan,gecersiz şifre kullanmalı
    ### BUGGG VARRR RAPORRR EDİLECEKKKK
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    Then profil ikonuna gider
    Then Kullanıcı Dashboard profil panelinden Change Password menüsüne tıklar
    Then Şifre değiştirmek için Current Password alanı doldurur
    Then New Password e uygun olmayan karakterler yazar
    Then Confirm Password alanla uygun olmayan karakterler yazar
    Then Kayıt etmek için Change butonuna tıklar
    And 3 saniye beklerr
    And sayfayi kapatirr

    Scenario: TC07  giriste hata mesajı goruntulenmelidir.
      Given  Kullanici "masterUrl" giderr
      Then login butonuna tiklar.
      And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
      And Provder passworde hatalı şifre yaz
      And Check Your Credentials hata mesajını görüntüler
      And 3 saniye beklerr
      And sayfayi kapatirr



