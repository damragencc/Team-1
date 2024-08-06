Feature: US014 Bir kullanici olarak Ev Hizmetler'ine ait şirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Background:
         Given Kullanici "masterUrl" gider.
         When "Categories" bolumune tıklar
         When "Home Services" bolumune tiklar
         When "Shops" butonuna tıklar


  Scenario:TC01 Verifying that the Home Service section can be viewed and clicked in the categories section in the user header section
         Given Kullanici "masterUrl" gider.
         Then Anasayfayi goruntuler
         Then Anasayfa header bölümünde bulunan "Categories" bolumunu görüntüler
         When "Categories" bolumune tıklar
         Then Acılan dropdown menude "Home Services" bolumunu goruntuler
         When "Home Services" bolumune tiklar
         And Sayfayi kapatir



  Scenario: TC02 Shops and Service sections can be viewed and activated, companies can be viewed and information can be verified when the Shops button is clicked.

         Then "Shops ve Service" butonları goruntulenir ve aktif oldugunu dogrular
         When  "Shops" butonuna tıklar
         Then "AquaShield Plumbing","VoltMasterSolutions","Sun Painting", "Serene Home Cleaning" sirketlerini goruntuler
         Then Sirket kartlarında bulunan "Visit Store" ikonunu görüntüleyebilmeli ve aktif oldugunu dogrulayabilmeli.
         And Sayfayi kapatir



  Scenario: TC03 Accessing shop details, services, shop availability information of AquaShield Plumbing company, viewing the
            services and viewing the amount and location information of the services when the service button is clicked.

         When "AquaShield Plumbing" şirketine tiklar
         Then Acilen sayfa’da "Shop Details", "Services ve Shop", "Availability" card’ini goruntuler
         When Sag ust kosede bulunan "Services" butonuna tiklar
         Then "Leak Detection", "Pipe Repair", "Drain Cleaning" servislerini goruntuler
         Then Hizmet kartlarında bulunan "Amount" bilgisi ve "Location" bilgisini görüntüler
         When "Leak Detection" hizmetine tıklar
         Then Acılan sayfa’da hizmete ait "Amount","Service Provider","Service Availability","Service Details","Additional Services","Reviews" ve "Related Services" alanlarini goruntuler
         When "Shops" butonuna tıklarr
         When Acilan dropdown menude  "Shops Services" tiklar
         And Sayfayi kapatir


  Scenario: TC04 By clicking on the filter icon and selecting the store section, the requested information must be entered in the sections in the search form on the page that opens.

          Then "Filter" iconunu goruntuler ve aktif oldugunu dogrular
          When "Filter" iconuna tıklar
          When "Shops" butonuna tıklar
          Then Acilan sayfa’a bulunan search formundaki alanlar("Location","Sort By","Keyword","Categories","Sub Category","Price Range") ve "Search" butonu görüntüler
          Then "Search" butonunun aktif olugunu dogrular
          When "Form"'da "Location","Sort By","Keyword","Categories","Sub Category","Price Range" bilgilerini girer
          And sayfayi kapatir


    #When Search butonuna tıklar












    #Scenario: TC02 Shops and Service sections can be viewed and activated, companies can be viewed and information can be verified when the Shops button is clicked.
      #* Shops ve Service butonlarini goruntuler ve aktif oldugunu dogrular
     # * Shops butonuna tiklar





