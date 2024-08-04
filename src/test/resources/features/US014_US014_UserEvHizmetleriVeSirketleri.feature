Feature: US014 Bir kullanici olarak Ev Hizmetler'ine ait şirketleri ve hizmetlerini takip edebilecegim bir sayfanin olmasini istiyorum.

  Background:
         * Kullanici "masterUrl" gider.
         * "Categories" bolumune tıklar
         * "Home Services" bolumune tiklar
         *  "Shops" butonuna tıklar


  Scenario:TC01 Verifying that the Home Service section can be viewed and clicked in the categories section in the user header section
         * Kullanici "masterUrl" gider.
         * Anasayfayi goruntuler
         * Anasayfa header bölümünde bulunan "Categories" bolumunu görüntüler
         * "Categories" bolumune tıklar
         * Acılan dropdown menude "Home Services" bolumunu goruntuler
         * "Home Services" bolumune tiklar
         * sayfayi kapatir



  Scenario: TC02 Shops and Service sections can be viewed and activated, companies can be viewed and information can be verified when the Shops button is clicked.

         * "Shops ve Service" butonları goruntulenir ve aktif oldugunu dogrular
         *  "Shops" butonuna tıklar
         * "AquaShield Plumbing","VoltMasterSolutions","Sun Painting", "Serene Home Cleaning" sirketlerini goruntuler
         * Sirket kartlarında bulunan "Visit Store" ikonunu görüntüleyebilmeli ve aktif oldugunu dogrulayabilmeli.
         * Sayfayi kapatir



  Scenario: TC03 Accessing shop details, services, shop availability information of AquaShield Plumbing company, viewing the
            services and viewing the amount and location information of the services when the service button is clicked.

         * "AquaShield Plumbing" şirketine tiklar
         * Acilen sayfa’da "Shop Details", "Services ve Shop", "Availability" card’ini goruntuler
         * Sag ust kosede bulunan "Services" butonuna tiklar
         * "Leak Detection", "Pipe Repair", "Drain Cleaning" servislerini goruntuler
         * Hizmet kartlarında bulunan "Amount" bilgisi ve "Location" bilgisini görüntüler
         * "Leak Detection" hizmetine tıklar
         * Acılan sayfa’da hizmete ait "Amount","Service Provider","Service Availability","Service Details","Additional Services","Reviews" ve "Related Services" alanlarini goruntuler
         * "Shops" butonuna tıklarr
         * Acilan dropdown menude  "Shops Services" tiklar
         * Sayfayi kapatir


  Scenario: TC04 By clicking on the filter icon and selecting the store section, the requested information must be entered in the sections in the search form on the page that opens.

          * Filter iconunu goruntuler ve aktif oldugunu dogrular
          * Filter iconuna tıklar
          * Shops butonuna tıklar
          * Acilan sayfa’a bulunan search formundaki alanlar(Location,Sort By,Keyword,Categories,Sub Category,Price Range) ve Search butonu görüntüler
          * Search butonunun aktif olugunu dogrular
          * Form'da istenilen bilgileri girer




   Scenario:  TC05 By clicking on the filter icon and selecting the service section, the requested information must be entered in the sections of the search form on the page that opens.

          * Filter iconuna tıklar
          * Service butonuna tıklar






    #Scenario: TC02 Shops and Service sections can be viewed and activated, companies can be viewed and information can be verified when the Shops button is clicked.
      #* Shops ve Service butonlarini goruntuler ve aktif oldugunu dogrular
     # * Shops butonuna tiklar





