Feature: Bir kullanici olarak anasayfa da site içi hizmetlere kolayca erişebilmek istiyorum

  Scenario: TC01 Ziyaretçi Siteye başarılı bir şekilde ulaşabilmeli
    Given Ziyaretçi "masterUrl" sayfasına gider
    And 3 saniye beklerr
    And sayfayi kapatirr

   Scenario: TC02 Onlinemaster sitesine ulaşabilmeli, Anasayfayı ve arama motorunu görebilmeli
     Given Ziyaretçi "masterUrl" sayfasına gider
     Then Online Master Market simgesine tıklar Anasayfaya ulaşır
     Then Anasayfada Arama matorunu görür
     And 3 saniye beklerr
     And sayfayi kapatirr

  Scenario: TC03   Anasayfada Search butonunun görebilmeli  ve aktif olabilmeli
    Given Ziyaretçi "masterUrl" sayfasına gider
    Then Online Master Market simgesine tıklar Anasayfaya ulaşır
    Then Arama matoruna "keyword" yazar
    Then Anasayfa Serach butonuna tıklarr
    When başarılı bir şekilde sayfaya ulaştığını kontorl eder
    And 3 saniye beklerr
    And sayfayi kapatirr


  Scenario: TC04   Anasayfada hızlı servis linkleri (Full House Cleaning, Carpet Cleaning (per square foot),Long Distance Moving ) görebilmeli ve aktif olabilmeli

    Given Ziyaretçi "masterUrl" sayfasına gider
    Then Online Master Market simgesine tıklar Anasayfaya ulaşır
    Then Search butonun altında hızlı servis linklerini görür
    Then Full-Service Catering ( per person) hızlı linke tıklar
    And 3 saniye beklerr
    Then Online Master Market simgesine tıklar Anasayfaya ulaşır
    Then Full House Cleaning hzılı linke tıklar
    And 3 saniye beklerr
    Then Online Master Market simgesine tıklar Anasayfaya ulaşır
    Then Leak Detection hızlı linkine tıklar
    And 3 saniye beklerr
    And sayfayi kapatirr



