@Mehmet
Feature: As a registered user (provider), I want to have an area where I can see and manage my employees.

  Scenario: TC01 The Staffs link appears in the Provider Dashboard sidebar and must be active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir
    * Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sol kisimda sidebar'daki Staffs linki gorunur ve aktif olmalidir
    * Acilan sayfada My Staffs yazisinin gorundugu dogrulanir
    * Sayfa kapanir

  Scenario: TC02 When you click on the Staffs link in the Provider Dashboard sidebar, the employee list should be visible on the My Staffs page.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir
    * Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sol kisimda sidebar'daki Staffs linkine tiklanir
    * Dashboard sidebar'daki Staffs linkine tiklanildiginda ikinci sirada Necmiye Melike ADIGUZEL isimli personel ismi goruntulenmelidir
    * Sayfa kapanir

  Scenario: TC03 Editing, reviewing and deleting operations should be performed on employees.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir
    * Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sol kisimda sidebar'daki Staffs linkine tiklanir
    * Acilan My Staffs sayfasinda mevcut personellerden ikinci siradaki personel bilgilerinde degisiklik yapmak icin action kismindan edit staff ikonuna tiklanir.
    * ilgili personelin mevcut tel numarasi 2021478569 iken 1111111111 olarak degistirilip Next butonuna tiklanir.
    * Acilan yeni sayfadaki Submit butonuna tiklanir ve sag ustte Staff Details Updated successfully uyarisinin yazisinin belirdigi dogrulanir.
    * My Staffs sayfasinda mevcut personellerden ikinci siradaki personel bilgilerini goruntulemek icin action kismindan staff details ikonuna tiklanir.
    * Acilan sayfada Overview yazisinin gorundugu dogrulanir.
    * My Staffs sayfasinda mevcut personellerden birinci siradaki personeli silmek icin action kismindan cop kutusu ikonuna tiklanir.
    * Acilan Delete Staff uyari penceresinden Yes butonuna tiklanir.
    * Sag ust kosede Staff Details deleted successfully yazisinin gorundugu dogrulanir.
    * Sayfa kapanir

  Scenario: TC04 In order to add a new employee on the My Staffs page, the Add Staff button must be visible and active.

    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulenir
    * Anasayfa sag ust kisimda Login butonuna tiklanir.
    * Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir
    * Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir
    * Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir
    * Acilan dropdown menude Dashboard'a tiklanir
    * Dashboard sol kisimda sidebar'daki Staffs linkine tiklanir
    * My Staffs sayfasinda yeni calisan ekleyebilmek icin Add Staff butonu gorunur ve aktif olmalidir.
    * Add Staff butonuna tiklandiginda acilan sayfada Basic Information yazisinin goruldugu dogrulanmalidir.
    * Sayfa kapanir

