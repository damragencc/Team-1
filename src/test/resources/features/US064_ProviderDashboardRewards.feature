
Feature: Kayıtlı bir kullanici (provider) olarak müsterilerime ödül verebilecegim bir alan olmasini istiyorum
  Scenario:TC_001- Dashboard rewards gorunurlugunun dogrulanmasi
  * Kullanıcı ilgili urle gider
  * "providerEmail" ve "providerPassword" ile giris yapar
  * Header bolumundeki profil simgesine tiklar
  * Dashboard linkinin gorunur oldugunu dogrular
  * Dashboard linkine tiklar
  * Dashboard sol menüde Rewards linkinin gorunur ve tiklanabilir oldugunu dogrular
  * sayfayi kapatir

  Scenario: TC_002-Dashboard rewards tiklanarak ilgili sayfaya gidilmesi,siparisi tamamlamis musteri listesinin goruntulenmesi
    * Kullanıcı ilgili urle gider
    * "providerEmail" ve "providerPassword" ile giris yapar
    * Header bolumundeki profil simgesine tiklar
    * Dashboard linkinin gorunur oldugunu dogrular
    * Dashboard linkine tiklar
    * Dashboard sol menüde Rewards linkinin gorunur ve tiklanabilir oldugunu dogrular
    * Dashboard sol menüde Rewards linkine tiklar
    * Listede siparişini tamamlamis musteri listesini goruntuledigini dogrular
    * sayfayi kapatir

  Scenario: TC_003-Dashboard rewards tiklanarak ilgili sayfaya gidilmesi,siparisi tamamlamis musteri listesin butonlarının goruntulenmesi
    * Kullanıcı ilgili urle gider
    * "providerEmail" ve "providerPassword" ile giris yapar
    * Header bolumundeki profil simgesine tiklar
    * Dashboard linkinin gorunur oldugunu dogrular
    * Dashboard linkine tiklar
    * Dashboard sol menüde Rewards linkinin gorunur ve tiklanabilir oldugunu dogrular
    * Dashboard sol menüde Rewards linkine tiklar
    * Listede Action basliginin altindaki Add rewards butonunun ve view reward history linkinin goruntulendigini ve tiklanabilir oldugunu dogrular
    * sayfayi kapatir

  @wip
  Scenario: TC_004-Dashboard rewards tiklanarak ilgili sayfaya gidilmesi,siparisi tamamlamis musterilere add rewards formu gorunurluk testi
    * Kullanıcı ilgili urle gider
    * "providerEmail" ve "providerPassword" ile giris yapar
    * Header bolumundeki profil simgesine tiklar
    * Dashboard linkinin gorunur oldugunu dogrular
    * Dashboard linkine tiklar
    * Dashboard sol menüde Rewards linkinin gorunur ve tiklanabilir oldugunu dogrular
    * Dashboard sol menüde Rewards linkine tiklar
    * Listede Action basliginin altindaki Add rewards butonuna tiklar
    * Acilan formda Service,Reward type,Discount,Message box ve drop down menülerin goruntulendigi dogrulanir
    * sayfayi kapatir