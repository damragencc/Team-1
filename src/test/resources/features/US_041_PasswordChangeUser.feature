
Feature: US_041 Kayitli bir kullanici (User) olarak Dashboard panelimde
          sifre degistirme islemlerimi yapabilmek istiyorum.

  Background: Kayitli kullanici login olarak Dashboard dropdown'a gelir

    * Kayitli kullanici "masterUrl" ile ana sayfaya gider.
    * Kayitli kullanici Login butonuna tiklar.
    * Acilan Login menusunde "gecerliUserEmail" girer ve Login butonuna tiklar.
    * Acilan Password menusunde "gecerliUserPassword" girer ve Enter butonuna tiklar.
    * Acilan sayfada Profil ikonuna tiklar

  Scenario: TC_01 Profil ikonuna tıklandıgında Change Password ikonu görünür ve aktif olmalıdır.

    * Acilan menude Change Password ikonunun gorunur ve aktif oldugu dogrulanir.

  Scenario: TC_02 Change Password ikonuna tıklanıldığında ilgili sayfaya yonlendirilmeli.

    * Acilan menude Change Password ikonuna tiklar.
    * Change Password sayfasina yonlendirildigi dogrulanir.

  Scenario: TC_03 Change Password sayfasında Current Password, New Password,
            Confirm Password text boxları gorunur ve aktif olmalidir.

    * Acilan menude Change Password ikonuna tiklar.
    * Acilan sayfada Current Password, New Password, Confirm Password text boxlarinin gorunur ve aktif oldugu dogrulanir.

  Scenario: TC_04 Change butonu gorunur ve aktif olmalı, Password kriterlerine uygun yeni password girildiginde basarılı sekilde degisiklik yapılmalıdır.

    * Acilan menude Change Password ikonuna tiklar.
    * Current Password textbox'ina "gecerliUserPassword" girer.
    * New Password textbox'ina "gecerliUserNewPassword" girer.
    * Confirm Password textbox'ina "gecerliUserNewPassword" tekrar girer.
    * Change butonunu gorunur ve aktif oldugu dogrulanir.
    * Change Butonuna tiklar.
    * Basarili bir sekilde sifrenin degistirildigi dogrulanir.
