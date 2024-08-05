Feature: Kayitli bir kullanici olarak (User) Dashboard panelimde profil ayarlarımı düzenleyebilmek istiyorum.

Scenario: TC01 Kullanıcı siteye Doğru , Kullanıcı maili ve parola ile giriş yapabilmeli

  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr
  Then email login butonuna tiklar.
  And password olarak "userPassword1" bilgilerini girerr
  Then enter butonuna tiklarr.
  And basarili giris yapilabildiğini test ederr
  And 3 saniye beklerr
  And sayfayi kapatirr

Scenario: TC02 Dashboard'dan profil ikonuna gidilebilmeli

  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr
  Then email login butonuna tiklar.
  And password olarak "userPassword1" bilgilerini girerr
  Then enter butonuna tiklarr.
  Then profil ikonuna gider
  And 3 saniye beklerr
  And sayfayi kapatirr



  Scenario:TC03 Profil Setting ikonuna ulaşılabilmeli

    Given Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And email olarak "EmailDashboard" bilgilerini girerr
    Then email login butonuna tiklar.
    And password olarak "userPassword1" bilgilerini girerr
    Then enter butonuna tiklarr.
    Then profil ikonuna gider
    Then Profil settings menüsüne tıklar
    And 3 saniye beklerr
    And sayfayi kapatirr

    Scenario: TC04 Profil Settings sayfasında name ve e-mail text boxlar ulaşabilmeli  ve değişiklik yapılabilmeli
      Given Kullanici "masterUrl" giderr
      Then login butonuna tiklar.
      And email olarak "EmailDashboard" bilgilerini girerr
      Then email login butonuna tiklar.
      And password olarak "userPassword1" bilgilerini girerr
      Then enter butonuna tiklarr.
      Then profil ikonuna gider
      Then Profil settings menüsüne tıklar
      Then Profil setting sayfasında name Textboxa "yeniIsim" yazar
      And 3 saniye beklerr
      Then Profil Settings sayfasında e-mail Textboxa "yeniEmail" yazar
      And 3 saniye beklerr
      And sayfayi kapatirr


      Scenario: TC05 Profil Setting sayfasındaki alanlar (Name, Email, Mobile Number, Date of birth, Gender, Address, Country, State, City, Postal Code) görünür olmalı

        Given Kullanici "masterUrl" giderr
        Then login butonuna tiklar.
        And email olarak "EmailDashboard" bilgilerini girerr
        Then email login butonuna tiklar.
        And password olarak "userPassword1" bilgilerini girerr
        Then enter butonuna tiklarr.
        Then profil ikonuna gider
        Then Profil settings menüsüne tıklar
        Then Profil Settings sayfasında e-mail Textboxa görür
        Then Profil Setting sayfasında name Textbaxı görür
        Then sayfada mobile number görür
        Then sayfada Date of birth görür
        Then Sayfada Genderı görür
        Then sayfada Address görür
        Then sayfada Conturyi görür
        Then sayafada State görür
        Then sayfada City i görür
        Then sayfada Postal code görür
        And 3 saniye beklerr
        And sayfayi kapatirr



        Scenario: TC06 Profil Settings e yeni bilgiler girildiğinde update edilebilmeli

          Given Kullanici "masterUrl" giderr
          Then login butonuna tiklar.
          And email olarak "EmailDashboard" bilgilerini girerr
          Then email login butonuna tiklar.
          And password olarak "userPassword1" bilgilerini girerr
          Then enter butonuna tiklarr.
          Then profil ikonuna gider
          Then Profil settings menüsüne tıklar
          And Mobile Number "yeniNumber" girer
          And Date of Birth "dogumtarihi" girer
          And Adress bilgileri "adressyeni" girer
          And Country "yeniCountry" girer
          And State "Stateyeni" girer
          And City "Cityyeni" girer
          And Postal Code "postaKodu" girer
          Then Uptade butonuna tıklar
          And 3 saniye beklerr
          And sayfayi kapatirr


   Scenario: TC07 Profil Setting sayfasından "Home" sayfasına geçiş yapılabilmeli

     Given Kullanici "masterUrl" giderr
     Then login butonuna tiklar.
     And email olarak "EmailDashboard" bilgilerini girerr
     Then email login butonuna tiklar.
     And password olarak "userPassword1" bilgilerini girerr
     Then enter butonuna tiklarr.
     Then profil ikonuna gider
     Then Profil settings menüsüne tıklar
     Then Profil Seting sayfasında olduğunu doğrular
     Then home butonuna tıklar
     Then ansayfaya gittiğini doğrular
     And 3 saniye beklerr
     And sayfayi kapatirr


