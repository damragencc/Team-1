Feature: [US_008] Bir kullanici olarak Kategoriler basligi altinda sitede bulunan tum şirket ve hizmetlerini kategoriler halinde gorebilmek istiyorum.
  Background:
    Given Kullanıcı "masterUrl" anasayfasını ziyaret eder.

  Scenario: [TC_01->US_08] Categories linkine tıklandığında kullanıcı kategoriler sayfasına yönlendirilmelidir.


    Then Anasayfayi goruntuleniR
    Then Anasayfa sag ust kisimda Login butonuna tiklaniR
    Then Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklaniR
    Then Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklaniR
    Then Kullanıcı header bölümünü kontrol eder.
    Then Kullanıcı Categories linkini kontrol eder.
    Then Kullanıcı header bölümünde bulunan Categories linkine tıklar.
    And Kullanıcı Categories linkine tıkladığında Categories sayfasına yönlendirilir.
    And 3 saniye bekleR.
    And Sayfayı kapatıR.

    Scenario: [TC_02->US_08] Categories sayfasında alt kategoriler (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) linkleri görünür olmalıdır.

      Given Kullanıcı headerdaki Categories linkinin altındaki Business Services linkini kontrol eder.
      Then Kullanıcı headerdaki Categories linkinin altındaki Repairs & Maintenance linkini kontrol eder.
      Then Kullanıcı headerdaki Categories linkinin altındaki Moving & Transportation linkini kontrol eder.
      Then Kullanıcı headerdaki Categories linkinin altındaki Events linkini kontrol eder.
      Then Kullanıcı headerdaki Categories linkinin altındaki Personal Services linkini kontrol eder.
      Then Kullanıcı headerdaki Categories linkinin altındaki Home Services linkini kontrol eder.
      And 3 saniye bekleR.
      And Sayfayı kapatıR.

      Scenario: [TC_03->US_08] Categories sayfasında her bir kategori (Home Services, Personal Services, Events, Business Services, Repairs & Maintenance, Moving & Transportation) kartı görünür ve aktif olmalıdır.

        Given Kullanıcı headerdaki Categories linkinin altındaki Business Services linkine tıklar.
        Given Kullanıcı anasayfaya döner.
        Then Kullanıcı headerdaki Categories linkinin altındaki Repairs & Maintenance linkine tıklar.
        Given Kullanıcı anasayfaya döner.
        Then Kullanıcı headerdaki Categories linkinin altındaki Moving & Transportation linkine tıklar.
        Given Kullanıcı anasayfaya döner.
        Then Kullanıcı headerdaki Categories linkinin altındaki Events linkine tıklar.
        Given Kullanıcı anasayfaya döner.
        Then Kullanıcı headerdaki Categories linkinin altındaki Personal Services linkine tıklar.
        Given Kullanıcı anasayfaya döner.
        Then Kullanıcı headerdaki Categories linkinin altındaki Home Services linkine tıklar.
        And 3 saniye bekleR.
        And Sayfayı kapatıR.

        Scenario: [TC_04->US_08] Categories sayfası açıkken 'Home' linkine tıklandığında, kullanıcı Anasayfa (home) sayfasına yönlendirilmelidir.

          Given Kullanıcı 'Home' linkine tıklar.
          And 3 saniye bekleR.
          And Sayfayı kapatıR.







