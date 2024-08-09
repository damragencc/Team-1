@Mehmet
Feature: As a registered user, I would like to have an area where I can view the invoices of my completed reservations.

  Scenario: TC01 The Invoices link in the Dashboard sidebar must be visible and active. When clicked, the relevant page should be taken.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sol kisimda sidebar'daki Invoices linki gorunur ve aktif olmalidir.
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Sayfa kapanir

  Scenario: TC02 Invoices page displays invoices for reservations with completed requests. When you click on the invoice, you should go to the relevant service.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Birinci fatura olan Pipe Repair faturasina tiklandiginda acilan sayfanin Pipe Repair sayfasi oldugu ve sayfada Service Details yazisinin gorundugu dogrulanmalidir.
    * Sayfa kapanir

  Scenario: TC03 On the Invoices page, the 'Export' button on the invoice of the reservations whose requests have been completed is visible and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Birinci faturanin sag tarafinda bulunan Export butonu gorunur ve aktif olmalidir.
    * Export butonuna tiklandiginda yeni acilan sayfanin "https://qa.onlinemastermarket.com/user/dashboard/export_invoice/70" oldugu dogrulanir.
    * Sayfa kapanir

  Scenario: TC04 On the Invoices page, the 'Export' button on the invoice of the reservations whose requests have been completed is visible and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Invoices sayfasinda Export All butonu gorunur ve aktif olmalidir.
    * From Date To Date araligi agustos ayi araligi secilerek Export All butonuna tiklanmalidir.
    * Acilan yeni sayfanin linkinin "https://qa.onlinemastermarket.com/user/dashboard/export_muliple_invoice/01-08-2024/31-08-2024" oldugu dogrulanmalidir.
    * Sayfa kapanir

  Scenario: TC05 On the Invoices page, the Search and cross buttons are visible and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Invoices sayfasinda Search butonunun gorunur oldugu dogrulanmalidir.
    * From Date To Date araligi bir agustos on agustos araligi secilerek Search butonuna tiklanmalidir.
    * Arama sonucunda No records found yazisinin gorundugu dogrulanmalidir.
    * Sayfa kapanir

  Scenario: TC06

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir
    * Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.
    * Invoices sayfasindayken sol ustte yer alan Online Master Market logosuna tiklanarak anasayfa acilmalidir.
    * Acilan sayfanin linkinin "https://qa.onlinemastermarket.com/" oldugu dogrulanmalidir.
    * Sayfa kapanir









