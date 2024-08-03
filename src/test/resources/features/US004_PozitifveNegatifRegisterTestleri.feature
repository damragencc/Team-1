
Feature:US01 Bir kullanici olarak sitenin fonksiyonlarindan faydalanabilmek icin siteye user olarak kayit olabilmek istiyorum

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


  Scenario Outline: TC03 Kullanici formu doldurur ve register butonuna basıp basarılı bir sekilde anasayfaya gecis yapabilmeli.

    When "<Name>" "<Mail>" "<Password>" bilgilerini girer
    And 1 saniye bekle
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
    And 2 saniye bekle
    When "userMail" "userPassword" bilgilerini girer
    Then checkboxa tıklar
    And 3 saniye bekle
    When  "userUlke" secer ve "userMobileNumber" girer
    And 2 saniye bekle
    Then cinsiyet olarak erkek butouna ve onay butunona tıklar
    When register butonuna tıklar
    Then kayit olamadigini test eder
    And  sayfayi kapatir

    Examples:
      |Name|
      |gecersizName|























