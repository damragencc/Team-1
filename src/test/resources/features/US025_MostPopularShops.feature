@Mehmet
Feature: As a user, I want there to be an area on the home page where I can review the most popular companies and make an appointment.

  Scenario: TC01 The Most Popular Shops title should be visible in the homepage body section.


    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa body bolumunde Most Popular Shops basligi gorunur olmalidir
    * Sayfa kapatilir

  Scenario: TC02 Company name and location information should be visible in the slider under the Most Popular Shops heading on the home page.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa body bolumunde Most Popular Shops basligi gorunur olmalidir
    * Anasayfa body bolumunde Most Popular Shops basligi altinda yer alan Gourmet Affairs Catering firmasinin isminin gorundugu ve konumunun Houston, Texas oldugu teyit edilir
    * Sayfa kapatilir

  Scenario: TC03 The Visit store icon should be visible and active on the company card in the slider under the Most Popular Shops heading on the home page, and should direct you to the relevant page when clicked.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa body bolumunde Most Popular Shops basligi altinda yer alan Gourmet Affairs Catering firmasi kartinda Visit store ikonu gorunur ve aktif olmalidir
    * Acilan sayfada Shop Details yazisinin gorunur oldugu teyit edilmelidir.
    * Sayfa kapatilir

  Scenario: TC04 The View All icon under the Most Popular Shops heading on the home page must be visible and active, and when clicked, it should direct you to the relevant page.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Ana sayfada Most Popular Shops basligi altinda bulunan View All ikonu gorunur ve aktif olmalidir.
    * View All ikonuna tiklandiginda ilgili sayfaya yonlendirmelidir.
    * Acilan sayfada Shops Found yazisinin gorundugu teyit edilmelidir.
    * Sayfa kapatilir

