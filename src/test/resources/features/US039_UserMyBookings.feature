
Feature:Kayitli bir kullanici olarak dashboardda rezervasyonlarimi gorebilmeliyim
  Scenario: TC_01-Rezervasyon Listesi goruntulenmeli
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * İlgili sayfaya yonlendirdigini dogrular
    * Rezervasyon listesinin goruntulenebildigini dogrular
    * sayfayi kapatir

  Scenario:TC_02-Inprogress durumunda aktif butonların kontrolu
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular
    * sayfayi kapatir

    Scenario: TC_003
      * Kullanıcı ilgili urle gider
      * "user Email" ve "user Password" girerek giris yapar
      * Header bolumundeki profil simgesine tiklar
      * MyBookings linkine tiklar
      * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda bulunan Edit butonuna tıklar
      * Appointment sayfasina yonlendirildigini goruntuler
      * sayfayi kapatir

      Scenario: TC_004
        * Kullanıcı ilgili urle gider
        * "user Email" ve "user Password" girerek giris yapar
        * Header bolumundeki profil simgesine tiklar
        * MyBookings linkine tiklar
        * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda bulunan Edit butonuna tıklar
        * Service Details altındaki bolumlerin tıklanabilir olmadıgı dogrulanır
        * Shops drop down menusu altında sadece ilgili firma adi goruntulendigi dogrulanır
        * Do you want the service altında önceki secim dısında secim yapilamadigi tiklanabilir olmadigi dogrulanir
        * Service amount tutarinin degistirilebilir olmadigi dogrulanir
        * sayfayi kapatir

        Scenario: TC_005
          * Kullanıcı ilgili urle gider
          * "user Email" ve "user Password" girerek giris yapar
          * Header bolumundeki profil simgesine tiklar
          * MyBookings linkine tiklar
          * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda bulunan Edit butonuna tıklar
          * Staffs drop down menusunden personel isimlerinin goruntulendigi dogrulanir
          * Date drop down menusu altında farkli tarih secilebildigi dogrulanır
          * Timeslot drop down menusu altında farkli saat secilebildigi dogrulanır
          * Notes boxına  veri girisi yapilabildigi dogrulanır
          * sayfayi kapatir

      Scenario: TC_006
        * Kullanıcı ilgili urle gider
        * "user Email" ve "user Password" girerek giris yapar
        * Header bolumundeki profil simgesine tiklar
        * MyBookings linkine tiklar
        * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda Cancel te Service butonuna tıklar
        * Acilan formda Reason for cancel basligi,Reason boxı ,submit butonu ve carpi kapatma butonunun görünür oldugu dogrulanir
        * sayfayi kapatir
Scenario: TC_007
  * Kullanıcı ilgili urle gider
  * "user Email" ve "user Password" girerek giris yapar
  * Header bolumundeki profil simgesine tiklar
  * MyBookings linkine tiklar
  * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda Cancel te Service butonuna tıklar
  * Acilan formda  kapatma butonuna basildiginda formun kapandigi dogrulanir
  * sayfayi kapatir
  Scenario: TC_008
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda Cancel te Service butonuna tıklar
    * Acilan formda  reason formu bos birakilarak submit butonuna tiklanir
    * Reason is required uyarisi goruntulenir
    * sayfayi kapatir

    Scenario:TC_009
      * Kullanıcı ilgili urle gider
      * "user Email" ve "user Password" girerek giris yapar
      * Header bolumundeki profil simgesine tiklar
      * MyBookings linkine tiklar
      * Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda Cancel te Service butonuna tıklar
      * Acilan formda  reason formuna veri girilerek submit butonuna tiklanir
      * Updated the booking status ekranı goruntulenir
      * Rejected by User durumundaki rezervasyon için reason Butonuna tiklandiginda Cancellation Reason boxında girilen verinin goruntulendigi dogrulanir
      * sayfayi kapatir

      Scenario: TC_011
        * Kullanıcı ilgili urle gider
        * "user Email" ve "user Password" girerek giris yapar
        * Header bolumundeki profil simgesine tiklar
        * MyBookings linkine tiklar
        * Mybookings basligi altinda rezervasyonlarda chat butonuna tiklar
        * Chats sayfasina yonlendirdigi dogrulanir
        * İlgili sayfada searchbox, type your message boxı goruntulendigi dogrulanir
        * sayfayi kapatir

        Scenario: TC_012
          * Kullanıcı ilgili urle gider
          * "user Email" ve "user Password" girerek giris yapar
          * Header bolumundeki profil simgesine tiklar
          * MyBookings linkine tiklar
          * Mybookings basligi altinda rezervasyonlarda chat butonuna tiklar
          * İlgili sayfada  type your message boxına veri girildiginde tiklanabilir hale geldigi dogrulanir
          * Veri gonderildiginde messages kısmında goruntulendigi dogrulanir
          * sayfayi kapatir

    Scenario:TC_13-Completed Accepted durumunda aktif butonların kontrolu
      * Kullanıcı ilgili urle gider
      * "user Email" ve "user Password" girerek giris yapar
      * Header bolumundeki profil simgesine tiklar
      * MyBookings linkine tiklar
      * Mybookings basligi altinda Completed Accepted durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular
      * sayfayi kapatir

      Scenario: TC_014
        * Kullanıcı ilgili urle gider
        * "user Email" ve "user Password" girerek giris yapar
        * Header bolumundeki profil simgesine tiklar
        * MyBookings linkine tiklar
        * Mybookings basligi altinda Completed Accepted durumundaki Reviews butonuna tiklandiginda ilgili sayfaya yonlendirdigi dogrulanir
        * sayfayi kapatir

  Scenario:TC_15-Complete Request sent by Provider durumunda aktif butonların kontrolu
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Mybookings basligi altinda Complete Request sent by Provider durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular
    * sayfayi kapatir

    Scenario: TC_-016
      * Kullanıcı ilgili urle gider
      * "user Email" ve "user Password" girerek giris yapar
      * Header bolumundeki profil simgesine tiklar
      * MyBookings linkine tiklar
      * Mybookings basligi altinda "Complete Request sent by Provider" durumundaki rezervasyonda Complete Request Accept butonuna tıklanır
      * Acilan alertte Confirm ve Cancel butonlarının oldugunu dogrular
      * Cancel butonuna tikladiginda alertin kapandıgı "Complete Request sent by Provider" tusunun tekrar tiklanabilir oldugu dogrulanir
      * Complete Request Accept butonuna tıklanır
      * Acilan alertte Confirm butonuna tıklanır
      * Updated the booking status  yazisi  ve  okay butonu goruntulenir
      * Okay e tiklanir
      * Rezervasyonun durumunun "Completed Accepted" olarak guncellendigi dogrulanir.

    Scenario: TC_17
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Home linkiyle anasayfaya donulebildigini dogrular
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Header Online  Master market logosuna tıklayarak anasayfaya donuldugunu dogrular
    * sayfayi kapatir

  Scenario: TC_18
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * All dropdown listesinin gorunur oldugunu dogrular
    * sayfayi kapatir

  Scenario Outline: TC_19
    * Kullanıcı ilgili urle gider
    * "user Email" ve "user Password" girerek giris yapar
    * 2 saniye bekle
    * Header bolumundeki profil simgesine tiklar
    * MyBookings linkine tiklar
    * All dropdown listesinden "<x>" durumunu secer
    * 3 saniye bekle
    * Rezervasyon listesinde "<x>" durumlu rezervasyonların goruntulendigi dogrulanir
    * 2 saniye bekle
    * sayfayi kapatir
    Examples:
    | x |
    |Pending|
    |Inprogress|
    |Complete Request|
    |Rejected        |
    |Cancelled       |
    |Completed       |