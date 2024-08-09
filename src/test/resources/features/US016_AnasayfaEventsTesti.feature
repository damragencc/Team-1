Feature: Bir kullanici olarak sitede Organizasyon hizmeti talep edebileceğim bir sayfa olmasını istiyorum.

  Scenario:TC01 Ziyartetçi Siteye ulaşabilmeli
    Given Ziyaretçi "masterUrl" sayfasına gider
    And 3 saniye beklerr
    And sayfayi kapatirr


Scenario: TC02 Anasayfada slider'a ulaşabilmeli "Events" başlığını görebilmeli ve ulaşabilmeli
  Given Ziyaretçi "masterUrl" sayfasına gider
 Then Ansayfada silder'a ulasır
  Then Events başlığına ulaşır ve tıklar
  And 3 saniye beklerr
  And sayfayi kapatirr

Scenario: TC03 "Events" sayfasında "Shops" ve "Service" butonlarına ulaşabilmeli
  Given Ziyaretçi "masterUrl" sayfasına gider
  Then Ansayfada silder'a ulasır
  Then Events başlığına ulaşır ve tıklar
  Then Shops butonunu görür
  Then Service butonunu görür
  And 3 saniye beklerr
  And sayfayi kapatirr

  Scenario: TC04 "Events" sayfasında filtreleme ikonuna görüntüleyebilmeli ve ulaşabilmeli
    Given Ziyaretçi "masterUrl" sayfasına gider
    Then Ansayfada silder'a ulasır
    Then Events başlığına ulaşır ve tıklar
    When Filtreleme ikonuna tıklarr
    And 3 saniye beklerr
    When Location alanına "location" yazar
    When Sort By alanına sortBy seçer
    When Keyword alanına "keyword" yazar
    When Catagories alınını catagories alanını seçer
    When SubCatagories subcatagories alanını seçer
    Then Search butonuna tıklarr
    And 3 saniye beklerr
    And sayfayi kapatirr

    Scenario: TC05 "Events" sayfasında "Service" görüntüleyebilmeli ve servislere ulaşabilmeli

      Given Ziyaretçi "masterUrl" sayfasına gider
      Then Ansayfada silder'a ulasır
      Then Events başlığına ulaşır ve tıklar
      Then Service butonuna tıklarr
      Then Servis listesinin sayfada görüntüler
      Then istediği servis ürününe tıklar
      Then ürünün ürün bilgilerini görür
      And 3 saniye beklerr
      And sayfayi kapatirr

  Scenario: TC06 "Events" sayfasında "Shops" ikonunda ilgili servisleri görüntüleyebilmeli , Servis kartında " Visit Store" ikonuna ulaşabilmeli
    Given Ziyaretçi "masterUrl" sayfasına gider
    Then Ansayfada silder'a ulasır
    Then Events başlığına ulaşır ve tıklar
    Then Shops butonuna tıklarr
    And 3 saniye beklerr
    Then Shops syafasında servisleri görüntüler
    Then Herhangi bir Servis ürünün üzerindeki Visit Store tıklar
    Then ürün bilgilerine ulaşır
    And 3 saniye beklerr
    And sayfayi kapatirr

Scenario: TC07 Events "Shops" sayfasında istenilen servis seçilebilmeli , (Shop Detail,Shop Availability,Services) servis adedi ve genel bilgilere ulaşabilmeli
  Given Ziyaretçi "masterUrl" sayfasına gider
  Then Ansayfada silder'a ulasır
  Then Events başlığına ulaşır ve tıklar
  Then Shops butonuna tıklarr
  And 3 saniye beklerr
  Then Shops syafasında servisleri görüntüler
  Then herhangi bir Shops servis ürününe tıklar
  Then ürünün Shop Detail,Shop Availability,Services , servis adedi ve genel bilgilere ulaşır
  And 3 saniye beklerr
  And sayfayi kapatirr
