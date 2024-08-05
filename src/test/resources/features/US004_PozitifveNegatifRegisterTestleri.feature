
Feature:US05 Bir kullanici olarak sitenin fonksiyonlarindan faydalanabilmek icin siteye user olarak kayit olabilmek istiyorum

  Background:Kullanicin Become a User adresine gitmelerin icin gereken adımlar
    Given Kullanici "masterUrl" gider
    When Become a User butonuna tiklar




  Scenario: TC01 Kullanıcının ana sayfaya erisebilmeli ve  Become a User bağlantısını tıklayabilmesi gerekir.

    Then Header bolumunde bulunan Become a User butonunu goruntuler
    And sayfayi kapatir


  Scenario: TC02  Kullanıcının Join as a User sayfasına erisebilmeli ve kayıt formunu doldurması gerekir.

    Then Join as a User texti dogrular
    Then "Name" "Email" "Password" "MobileNumber" texti dogrulanir
    And sayfayi kapatir

@Damra
  Scenario Outline: TC03 Kullanici formu doldurur ve register butonuna basıp basarılı bir sekilde anasayfaya gecis yapabilmeli.

    When "<Name>" "<Mail>" "<Password>" bilgilerini girer
    And 2 saniye bekle
    Then Checkboxa tıklar
    And  3 saniye bekle
    When "<ulke>" ve "<MobileNumber>" bilgilerini girer
    And 2 saniye bekle
    When cinsiyet olarak erkek butonuna tıklar
    When onay butonuna tıklar
    When Register butonuna tıklar
    And 1 saniye bekle
    Then Anasayfayi goruntuler
    And 2 saniye bekle
    And sayfayi kapatir

    Examples:
      |Name |Mail|Password|MobileNumber|ulke|
      |userName |userMail|userPassword|userMobileNumber|userUlke|






  Scenario Outline: TC04 gecersiz name ile kayıt olamamali

    Given "<Name>" girer
    And 1 saniye bekle
    When "gecerliEmail" bilgisini girer
    When  "gecerliPassword" girer.
    Then checkboxa tıklar
    And 3 saniye bekle
    When  "userUlke" secer ve "userMobileNumber" girer
    And 2 saniye bekle
    Then cinsiyet olarak erkek butonuna ve onay butonuna tıklar
    Then kayit olamadigini test eder
    And  sayfayi kapatir

    Examples:
      |Name|
      |       |


    Scenario Outline: TC05 gecersiz mail ile register olmamali
      When "gecerliName" verisini girer
      When "<gecersizEmail>" adresi girer
      When  "gecerliPassword" girer.
      When checkboxa tıklar
      When "userUlke" ve "userMobileNumber" verilerini girer
      Then cinsiyet olarak erkek butonuna ve onay butonuna tıklar
      And 2 saniye bekle
      Then kayit olamadigini test eder
      And sayfayi kapatir

      Examples:
        |gecersizEmail|
        |damragenc@gmailcom|
        |damragencgmailcom|
        |damragenc@namecom|
        |damragenc@gmail.|



    Scenario Outline: TC06 gecersiz password ile register olmamali

    When "gecerliName" verisini girer
    When "gecerliEmail" bilgisini girer
    When  "<gecersizPassword>" girmeli
    When checkboxa tıklar
    When "userUlke" ve "userMobileNumber" verilerini girer
    Then cinsiyet olarak erkek butonuna ve onay butonuna tıklar
    And 2 saniye bekle
      Then kayit olamadigini test eder
    And sayfayi kapatir

    Examples:
      |gecersizPassword|
      |                     |





      Scenario Outline: TC07 gecersiz phoneNumber ile register olmamali

        When "gecerliName" verisini girer
        When "gecerliEmail" bilgisini girer
        When  "gecerliPassword" girer.
        And 2 saniye bekle
        When  "userUlke" secer
        When "<gecersizPhoneNumber>" bilgisini yanlıs girer
        Then cinsiyet olarak erkek butonuna ve onay butonuna tıklar
        And 2 saniye bekle
        Then kayit olamadigini test eder
        And sayfayi kapatir



        Examples:
          |gecersizPhoneNumber|
          |!+'!+!'+!'+!|
          |1231312312412412412|
          |                    |













































