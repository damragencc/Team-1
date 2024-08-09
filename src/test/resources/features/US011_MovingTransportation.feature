@Mehmet
Feature: As a user, I would like to have a page where I can follow the companies and services related to Moving and Transportation.

  Background:
    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir

  Scenario: TC01 The 'Moving & Transportation' link under the Categories dropdown menu in the homepage header section must be visible.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linki gorunur olmalidir.
    * Sayfa kapanir

  Scenario: TC02 The 'Shops' and 'Service' buttons on the Moving & Transportation link must be visible and active.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Moving & Transportation linkinde bulunan Shops ve Service butonlari gorunur ve aktif olmalidir.
    * Shops butonuna tiklandiginda Shops Found yazisi gorunur olmalidir.
    * Service butonuna tiklandiginda Services Found yazisi gorunur olmalidir.
    * Sayfa kapanir

  Scenario: TC03 The Visit Store icon is visible on the Shops card and must be active. When visiting any company, company information, (Shop Details and Services) fields and the 'Shop Availability' card must be accessible.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Shops kartinda Visit Store ikonu gorunur ve aktif olmalidir.
    * Horizon Movers sirketine Visit Store linkine tiklanarak sirket ayrintilarina ulasilmalidir.
    * Acilan sirket sayfasinda Shop Details ve Services alanlarina ve Shop Availability card'ina erisilebilmelidir.
    * Sayfa kapanir

  Scenario: TC04 When the Service button is clicked, the services should be displayed. The service card should display the company, amount and location information of that service.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Acilan sayfada Service butonuna tiklanabilmelidir.
    * Hizmet kartinda o hizmetin ait oldugu sirket, amount bilgisi ve location bilgisi goruntulenmelidir.
    * Sayfa kapanir

  Scenario: TC05 When you click on any service, you should be taken to that service page and you should be able to access amount information, (Service Provider, Service Availability) cards and (Service Details, Additional Services, Reviews and Related Services) fields.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Acilan sayfada Service butonuna tiklanabilmelidir.
    * Local Moving hizmetine tiklanildiginda o hizmet sayfasina gidilmeli ve amount bilgisine, Service Provider, Service Availability card'larina ve Service Details, Additional Services, Reviews ve Related Services alanlarina erisilebilmelidir.
    * Sayfa kapanir

  Scenario: TC06 The filter icon on the pages opened by clicking the Shops and Service buttons is visible and must be active.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Shops butonuna tiklanilip acilan sayfada bulunan filter iconu gorunur ve aktif olmalidir.
    * Acilan filter kisminda Search butonunun gorundugu dogrulanmalidir.
    * Service butonuna tiklanilip acilan sayfada bulunan filter iconu gorunur ve aktif olmalidir.
    * Sayfa kapanir

  Scenario: TC07  In the Search form on the pages opened by clicking the Shops and Service buttons, the fields should be Location, Sort By, Keyword, Categories, Sub Category and Price Range slider.
    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Shops butonuna tiklanilip acilan sayfada bulunan Search form'da Location, Sort By, Keyword, Categories, Sub Category ve Price Range slider'i olmalidir.
    * Service butonuna tiklanilip acilan sayfada bulunan Search form'da Location, Sort By, Keyword, Categories, Sub Category ve Price Range slider'i olmalidir.
    * Sayfa kapanir

  Scenario: TC08 The 'Search' button appears in the Search form on the pages opened by clicking the Shops and Service buttons and must be active.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Shops butonuna tiklanilip acilan sayfada bulunan Search form'da Search butonu gorunur ve aktif olmalidir.
    * Service butonuna tiklanilip acilan sayfada bulunan Search form'da Search butonu gorunur ve aktif olmalidir.
    * Sayfa kapanir

  Scenario: TC09 Filtering should be done using the Search form on the pages that open by clicking the Shops and Service buttons.

    * Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.
    * Shops butonuna tiklanilip acilan sayfada bulunan Search formuna Keyword olarak Horizon yazilarak cikan sonuc Horizon Movers sirketi oldugu teyit edilir.
    * Service butonuna tiklanilip acilan sayfada bulunan Search formuna Keyword olarak Local yazilarak cikan sonuc Local Moving sirketi oldugu teyit edilir.
    * Sayfa kapanir


















