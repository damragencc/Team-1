Feature: As a registered user, I would like to have an area where I can view the invoices of my completed reservations.
  @Mehmet
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
    * Acilan fatura sayfasinda 2 adet faturanin gorundugu dogrulanmalidir.
    * Birinci fatura olan Pipe Repair faturasina tiklandiginda acilan sayfanin Pipe Repair sayfasi oldugu ve sayfada Service Details yazisinin gorundugu dogrulanmalidir.
    * Sayfa kapanir












