Feature: Kayitli bir kullanici olarak (User) Dashboard panelimde profil ayarlarımı düzenleyebilmek istiyorum.

Scenario: TC01 Kullanıcı siteye Doğru , Kullanıcı maili ve parola ile giriş yapabilmeli

  *  Kullanici "masterUrl" giderr
  * login butonuna tiklar.
  * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  * basarili giris yapilabildiğini test ederr
  * 3 saniye beklerr
  * sayfayi kapatirr

Scenario: TC02 Dashboard'dan profil ikonuna gidilebilmeli

  *  Kullanici "masterUrl" giderr
  * login butonuna tiklar.
  * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  * basarili giris yapilabildiğini test ederr
  * profil ikonuna gider
  * 3 saniye beklerr
  * sayfayi kapatirr



  Scenario:TC03 Profil Setting ikonuna ulaşılabilmeli

    *  Kullanici "masterUrl" giderr
    * login butonuna tiklar.
    * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
    * basarili giris yapilabildiğini test ederr
    * profil ikonuna gider
    * Profil settings menüsüne tıklar
    * 3 saniye beklerr
    * sayfayi kapatirr

    Scenario: TC04 Profil Settings sayfasında name ve e-mail text boxlar ulaşabilmeli  ve değişiklik yapılabilmeli
      #site de bug var
      *  Kullanici "masterUrl" giderr
      * login butonuna tiklar.
      * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
      * basarili giris yapilabildiğini test ederr
      * profil ikonuna gider
      * Profil settings menüsüne tıklar
      * Profil setting sayfasında name Textboxa "yeniIsim" yazar
      * Profil Settings sayfasında e-mail Textboxa "yeniEmail" yazar
      * 3 saniye beklerr
      * sayfayi kapatirr

      Scenario: TC05 Profil Setting sayfasındaki alanlar (Name, Email, Mobile Number, Date of birth, Gender, Address, Country, State, City, Postal Code) görünür olmalı

        *  Kullanici "masterUrl" giderr
        * login butonuna tiklar.
        * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
        * basarili giris yapilabildiğini test ederr
        * profil ikonuna gider
        * Profil settings menüsüne tıklar
        * Profil Setting sayfasındaki alanlar (Name, Email, Mobile Number, Date of birth, Gender, Address, Country, State, City, Postal Code) görür
        * 3 saniye beklerr
        * sayfayi kapatirr



        Scenario: TC06 Profil Settings e yeni bilgiler girildiğinde update edilebilmeli

          *  Kullanici "masterUrl" giderr
          * login butonuna tiklar.
          * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
          * basarili giris yapilabildiğini test ederr
          * profil ikonuna gider
          * Profil settings menüsüne tıklar
          * Date of Birth dogumtarihi girer
          * Mobile Number yeniNumber girer
          * Gender bilgilerini girer
          * Adress bilgileri adressyeni girer
          * Country yeniCountry girer
          * State Stateyeni girer
          * City Cityyeni girer
          * Postal Code postaKodu girer
          * Uptade butonuna tıklar
          * 3 saniye beklerr
          * sayfayi kapatirr


   Scenario: TC07 Profil Setting sayfasından "Home" sayfasına geçiş yapılabilmeli

     *  Kullanici "masterUrl" giderr
     * login butonuna tiklar.
     * email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
     * basarili giris yapilabildiğini test ederr
     * profil ikonuna gider
     * Profil settings menüsüne tıklar
     * home butonuna tıklar
     * ansayfaya gittiğini doğrular
     * 3 saniye beklerr
     * sayfayi kapatirr


