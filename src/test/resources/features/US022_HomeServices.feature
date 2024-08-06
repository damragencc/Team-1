Feature: As a user, I would like to have a page on the site where I can request services related to household chores.
  @Mehmet
  Scenario: TC01 The Home Services title appears in the slider on the homepage and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfada bulunan slider'da Home Services basligi gorunur ve aktif olmalidir.
    * Sayfa kapatilir


  Scenario: TC02 When you go to the Home Services page, the Shops, Service buttons and filtering icons are visible and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfada bulunan slider'da Home Services basligina tiklanilir.
    * Acilan home services sayfasinda Shops butonu gorunur ve tiklanabilmelidir.
    * Shops butonuna tiklandiginda Shops Found yazisinin gorundugu teyit edilmelidir.
    * Acilan home services sayfasinda Service butonu gorunur ve tiklanabilmelidir.
    * Service butonuna tiklandiginda Services Found yazisinin gorundugu teyit edilmelidir.
    * Acilan home services sayfasinda filtreleme ikonu gorunur ve tiklanabilmelidir.
    * Filtreleme ikonuna tiklandiginda acilan filtrede Search butonunun ve yazisinin gorundugu teyit edilmelidir.
    * Sayfa kapatilir

  Scenario: TC03 The services on the Home Services page should be displayed and it should be possible to move on to the following pages.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfada bulunan slider'da Home Services basligina tiklanilir.
    * Acilan home services sayfasinda Service butonu gorunur ve tiklanabilmelidir.
    * Service butonuna tiklandiginda Services Found yazisinin gorundugu teyit edilmelidir.
    * Gorunen tum servislere ayri ayri tiklanabilmeli ve ilgili servis sayfalarina gidilebildigi dogrulanmalidir
    * Services sayfalari altinda yer alan ilerleme butonuna tiklandiginda bir sonraki servis listesinin acildigi dogrulanmalidir.
    * Sayfa kapatilir

  Scenario: TC04 When the Shops icon is clicked, the relevant services should be displayed and the Visit Store icon should be visible and active on the Service card. When the desired service is selected (Shop Detail, Shop Availability, Services), the number of services and general information should be accessible.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfada bulunan slider'da Home Services basligina tiklanilir.
    * Acilan home services sayfasinda Shops butonu gorunur ve tiklanabilmelidir.
    * Shops butonuna tiklandiginda Shops Found yazisinin gorundugu teyit edilmelidir.
    * Servis kartinda Visit Store ikonu gorunur ve aktif olmalidir.
    * Sayfa kapatilir

  Scenario: TC05 When you click on the Shops icon and select the desired service (Shop Detail, Shop Availability, Services), you should be able to access the number of services and general information.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfada bulunan slider'da Home Services basligina tiklanilir.
    * Acilan home services sayfasinda Shops butonu gorunur ve tiklanabilmelidir.
    * Shops butonuna tiklandiginda Shops Found yazisinin gorundugu teyit edilmelidir.
    * Servis kartinda Visit Store ikonu gorunur ve aktif olmalidir.
    * Acilan sayfada Shop Detail, Shop Availability, Services yazilarinin gorundugu dogrulanmalidir.
    * Sayfa kapatilir




