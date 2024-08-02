Feature: Bir kullanici olarak site ana sayfasina erisim saglayabilmek istiyorum
  @Damra
  Scenario: TC01 Kullanıcı ana sayfaya erişebilmeli ve bilgileri görebilmelidir


    Given Kullanici "masterUrl" gider
    Then Anasayfayi goruntuler
    Then Sitenin tittleri "OnlineMasterMarket" oldugunu dogrular
    And  Sayfayi kapatir