Feature: As a user, I would like to have a page where I can follow the companies and services related to Moving and Transportation.
  @Mehmet
  Scenario: TC01 The 'Moving & Transportation' link under the Categories dropdown menu in the homepage header section must be visible.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linki gorunur olmalidir.
    * Sayfa kapanir

  Scenario: TC02 The 'Shops' and 'Service' buttons on the Moving & Transportation link must be visible and active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Moving & Transportation linkinde bulunan Shops ve Service butonlari gorunur ve aktif olmalidir.
    * Shops butonuna tiklandiginda Shops Found yazisi gorunur olmalidir.
    * Service butonuna tiklandiginda Services Found yazisi gorunur olmalidir.
    * Sayfa kapanir

  Scenario: TC03 The Visit Store icon is visible on the Shops card and must be active. When visiting any company, company information, (Shop Details and Services) fields and the 'Shop Availability' card must be accessible.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Moving & Transportation linkinde bulunan Shops ve Service butonlari gorunur ve aktif olmalidir.
    * Shops butonuna tiklandiginda Shops Found yazisi gorunur olmalidir.
    * Service butonuna tiklandiginda Services Found yazisi gorunur olmalidir.
    * Sayfa kapanir
























