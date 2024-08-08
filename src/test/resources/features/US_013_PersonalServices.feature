Feature: US_013 Bir kullanici olarak Kişisel hizmetler'e ait şirketler ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Background: Kullanici Personel Services sayfasina gelir
    * Kullanici "masterUrl" ile anasayfaya gider.
    * Anasayfadaki header bolumunde "Categories" sekmesine gelir.

  Scenario:  TC_01 Anasayfa header bölümünde Categories altinda ki 'Personal Services' linki gorunur olmali.

    * Acilan menuden "Personel Services" linkinin gorunur oldugu dogrulanir
    * Sayfayi kapatir

  Scenario: TC_02 Personal Services linkinde bulunan 'Shops' ve 'Service' butonları gorunur ve aktif olmali.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Personal Services sayfasindaki "Shops" ve "Service" butonlarinin gorunur  ve aktif oldugu dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_03 Shops butonuna tıklandıgında ilgili şirketler görüntülenmeli.

    *  Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * "Vital Balance" ve "Elegant Touch" sirketlerinin goruntulendigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_04  Şirket kartında Visit Store ikonu gorunur ve aktif olmalidir.
  Herhangi bir şirket ziyaret edildiğinde şirket bilgilerine,
  (Shop Details ve Services) alanlarına ve 'Shop Availability' card'ina erişilebilmelidir.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * Sirket kartindaki "Visit Store" ikonunun gorunur ve aktif oldugu dogrulanır.
    * Sirket kartindaki "Visit Store" ikonunu tiklar.
    * "Sirket bilgileri" ve "Shop Details" ve "Services" alanlarina ve "Shop Availabilitiy" card'ina erisilebildigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_05 Service butonuna tıklanıldığında hizmetler görüntülenmeli
            ve ilerleyen sayfalara gecilebilmelidir. Hizmet kartında o hizmetin
            ait olduğu şirket, amount bilgisi ve location bilgisi goruntulenmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Service kartinda o hizmetin ait oldugu "sirket", "amount bilgisi" ve "location" bilgisinin goruntulendigi dogrulanir.
    * Sayfayi kapatir
  @wip
  Scenario: TC_06 Herhangi bir hizmete tıklanıldığında o hizmet sayfasina gidilmeli
            ve "amount bilgisine", "Service Provider", "Service Availability" card'larina ve
            "Service Details", "Additional Services", "Reviews" ve "Related Services"
              alanlarina erişilebilmelidir.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Herhangi bir hizmete tiklar
    * "Amount" bilgisine, "Service Provider", "Service Availability" card'larina ve "Service Details", "Additional Services", "Reviews" ve "Related Services" alanlarina erişilebildigi dogrulanir.
    * Sayfayi kapatir


  Scenario: TC_07 Herhangi bir hizmete tiklanip o hizmete gidildikten sonra geri don butonuna basildiginda onceki sayfaya donulmeli

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Herhangi bir hizmete tiklar
    * Onceki sayfaya geri donmek icin "Geri Don" butonuna tiklar.
    * Onceki sayfa geri dondugu dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_08 Shops butonuna tıklanılıp açılan sayfada bulunan filter iconu gorunur ve aktif olmali.
            Search form'da (Location, Sort By, Keyword, Categories, Sub Category) alanlari ve
            'Price Range' slider'i ve "Search" botunu gorunur olmali.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * "Filter Iconu" nun gorunur ve aktif oldugu dogrulanir.
    * Filter ikonuna tiklar
    * Acilan Search Form'da "Location", "Sort By", "Keyword", "Categories", "Sub Category" alanlarinin oldugu ve "Price Range sliderin" ve "Search Butonu" nun gorunur oldugu dogrulanir
    * Sayfayi kapatir

  Scenario: TC_09 Service  butonuna tıklanılıp açılan sayfada bulunan filter iconu gorunur
            ve aktif olmali.  Search form'da (Location, Sort By, Keyword, Categories, Sub Category)
            alanlari ve 'Price Range' slider'i ve "Search" botunu gorunur olmali.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * "Filter Iconu" nun gorunur ve aktif oldugu dogrulanir.
    * Filter ikonuna tiklar
    * Acilan Search Form'da "Location", "Sort By", "Keyword", "Categories", "Sub Category" alanlarinin oldugu ve "Price Range sliderin" ve "Search Butonu" nun gorunur oldugu dogrulanir
    * Sayfayi kapatir

  Scenario: TC_10 Shops butonuna tıklanılıp açılan sayfada bulunan Search formunda
            "Location" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * Filter ikonuna tiklar
    * Location alanina "Boston" girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Elegant Touch" sirketinin goruntulendigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_11 Shops butonuna tıklanılıp açılan sayfada bulunan Search formunda
          "Keyword" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * Filter ikonuna tiklar
    * Keyword alanina "Elegant" girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Elegant Touch" sirketinin goruntulendigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_12 Shops butonuna tıklanılıp açılan sayfada bulunan Search formunda
  "Sub Category" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Shops" butonununa tiklar.
    * Filter ikonuna tiklar
    #* Sub Category alanina "Beauty" girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Elegant Touch" sirketinin goruntulendigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_13 Service butonuna tıklanılıp açılan sayfada bulunan Search formunda
  "Location" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Filter ikonuna tiklar
    * Location alanina deger girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Elegant Touch" sirketinin goruntulendigi dogrulanir.
    * Sayfayi kapatir


  Scenario: TC_14 Service butonuna tıklanılıp açılan sayfada bulunan Search formunda
  "Keyword" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Filter ikonuna tiklar
    * Keyword alanina deger girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Elegant Touch" sirketinin goruntulendigi dogrulanir.
    * Sayfayi kapatir


  Scenario: TC_15 Service butonuna tıklanılıp açılan sayfada bulunan Search formunda
  "Sub Category" alanina deger girerek filtreleme yapılabilmeli.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Filter ikonuna tiklar
    * Sub Category alanina deger girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Haircut" servisinin goruntulendigi dogrulanir.
    * Sayfayi kapatir
  @wip
  Scenario: TC_16  Service butonuna tıklanılıp açılan sayfalarda
            bulunan Search formunu kullanarak filtreleme yapılmalı.

    * Acilan dropdown menuden "Personel Services" linkine tiklar.
    * Kullanici "Service" butonunu tiklar.
    * Filter ikonuna tiklar
    * "Location" "Sort By" "Keyword" "Sub Category" textboxlarina filtreleme icin degerler girer.
    * Search Butonuna tiklar.
    * Arama sonucunda "Haircut" servisinin goruntulendigi dogrulanir.
    * Sayfayi kapatir




