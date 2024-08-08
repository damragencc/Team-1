Feature: US_017 Bir kullanıcı olarak sitede Tasinma hizmeti talep edebilecegim bir sayfa olmasini istiyorum.

  Background: Kullanici Moving And Transportation sayfasina gelir.
    * Kullanici "masterUrl" ile anasayfaya gider.
    * Anasayfadaki header bolumunde "Categories" sekmesine gelir.

  Scenario: TC_01  Anasayfada bulunan slider'da Moving & Transportation basligi gorunur ve aktif olmalidir.

    * Acilan menuden "Moving&Transportation" basliginin gorunur ve aktif oldugu dogrulanir
    * Sayfayi kapatir

  Scenario: TC_02 Moving & Transportation sayfasına gidildiginde "Shops" ve "Service" butonları gorunur ve aktif olmalidir.

    * Acilan menuden "Moving&Transportation" linkine tiklar.
    * "Shops" ve "Service" butonlarinin gorunur  ve aktif oldugu dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_03 Sayfada filtreleme ikonlari gorunur ve aktif olmalidir.

    * Acilan menuden "Moving&Transportation" linkine tiklar.
    * Sayfada filtreleme ikonlarinin gorunur ve aktif oldugu dogrulanir.
    * Sayfayi kapatir


  Scenario: TC_04 Moving & Transportation sayfasında bulunan servisler görüntülenmeli ve ilerleyen sayfalara gecilebilmelidir

    * Acilan menuden "Moving&Transportation" linkine tiklar.
    * Kullanici "Service" butonuna tiklar.
    * "Local Moving" ve "Long Distance Moving" servislerinin goruntulendigi dogrulanir.
    * Ilerleyen sayfalara gecildigi dogrulanir.
    * Sayfayi kapatir

  Scenario: TC_05 Shops ikonuna tıklandıgında ilgili servisler görüntülenmeli
             ve Servis kartında Visit Store ikonu gorunur ve aktif olmalidir.
            İstenilen shop secildiginde (Shop Detail,Shop Availability,Services)
             servis adedi ve genel bilgilere erişilebilmelidir.

    * Acilan menuden "Moving&Transportation" linkine tiklar.
    * Kullanici "Shops" butonununu tiklar.
    * İlgili sirket kartindaki "Visit Store" ikonunu tiklar.
    * "Shop Detail", "Shop Availability", "Services alanlari", "servis adedi" ve "genel sirket bilgileri" ne erisilebildigi dogrulanir.
    * Sayfayi kapatir
