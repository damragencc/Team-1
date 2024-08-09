Feature:  Kayıtlı bir kullanici (provider) olarak işlem faturalarını görebilecegim bir alan olmasini istiyorum
  Scenario: TC01 Kayıtlı kullanıcı Provder olarak siteye doğru giriş yapılabilmeli

    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    And 3 saniye beklerr
    And sayfayi kapatirr


 Scenario: TC02 Dashboard Profil ikonundan "Dashboard" menüsüne ulaşabilmeli
   Given  Kullanici "masterUrl" giderr
   Then login butonuna tiklar.
   And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
   And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
   Then profil ikonuna gider
   Then Profil ikonundan Dashboard menüsüne tıklar
   Then Dashboard sayfasını görüntüler
   And 3 saniye beklerr
   And sayfayi kapatirr


Scenario: TC03 Dashboard Sidebardan "İnvocies" menüsüne ulaşabilmeli
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
  And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
  Then profil ikonuna gider
  Then Profil ikonundan Dashboard menüsüne tıklar
  Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
  And 3 saniye beklerr
  And sayfayi kapatirr


  Scenario: TC04 "Invocies" sayfasında ödeme listesi ve ödeme bilgileri görünür olmalı
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    Then profil ikonuna gider
    Then Profil ikonundan Dashboard menüsüne tıklar
    Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
    Then Invoices sayafsında ürünlerin ödeme listesini ve ödeme bilgilerini görür
    And 3 saniye beklerr
    And sayfayi kapatirr

  Scenario: TC05 "Invoices" sayfasında istenilen ürüne tıklandığında bilgilere ulaşılmalı
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    Then profil ikonuna gider
    Then Profil ikonundan Dashboard menüsüne tıklar
    Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
    Then Invoices  sayfasında herhangi bir ürüne tıklanır
    Then Ürün bilgilerinin detaylı görüntüler
    And 3 saniye beklerr
    And sayfayi kapatirr

Scenario: TC06 "Invoices" sayfasında tüm faturaları görüntülemek için başlangıç ve bitiş tarihleri seçilebilmeli
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
  And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
  Then profil ikonuna gider
  Then Profil ikonundan Dashboard menüsüne tıklar
  Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
  Then Invoices sayfasında Framdat'e istediği başlangıç tarihini yazar
  Then Invoices sayfasında To date 'ye istediği son tarih aralığını yazar
  Then Seçilen tarih aralığındaki arama tuşuna tıklar ürünlerin listesini görür
  And 3 saniye beklerr
  And sayfayi kapatirr


  Scenario: TC07 Seçilen tarih aralığında "Export All" butonunda Faturalar yazdırılabilmeli
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
    And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
    Then profil ikonuna gider
    Then Profil ikonundan Dashboard menüsüne tıklar
    Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
    Then Invoices sayfasında Framdat'e istediği başlangıç tarihini yazar
    Then Invoices sayfasında To date 'ye istediği son tarih aralığını yazar
    Then Seçilen tarih aralığındaki arama tuşuna tıklar ürünlerin listesini görür
    Then Export All tuşuna tıklar ürünlerin faturasını görüntülenir
    And 3 saniye beklerr
    And sayfayi kapatirr


    Scenario: TC08 "Invoices" sayfasında Listedeki ürünün üzerinde "Export" butonunda faturaya ulaşabilmeli
      Given  Kullanici "masterUrl" giderr
      Then login butonuna tiklar.
      And Provder email olarak "providerEmail" bilgilerini girerr email login butonuna tiklar.
      And Provder password olarak "providerPassword" bilgilerini girerr enter butonuna tiklarr
      Then profil ikonuna gider
      Then Profil ikonundan Dashboard menüsüne tıklar
      Then Sidebar Dashboarddan Invoices mesnüsüne tıklar
      Then Invoices sayfasında Framdat'e istediği başlangıç tarihini yazar
      Then Invoices sayfasında To date 'ye istediği son tarih aralığını yazar
      Then Seçilen tarih aralığındaki arama tuşuna tıklar ürünlerin listesini görür
      Then Invoices sayfasında Listedeki istediği ürün üzerinde Export  butonuna tıklar ürün faturasına ulaşır
      And 3 saniye beklerr
      And sayfayi kapatirr





