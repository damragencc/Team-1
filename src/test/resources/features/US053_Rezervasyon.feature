Feature:Kayıtlı bir kullanıcı olarak hizmetler sayfasına erişebilmek ve istediğim hizmete rezarvasyon oluşturmak için Shops menusune,
  Book Service butonuna veya Categories alt menulerine tıklayabilmeliyim.

  Background:Kullanicin sayfaya girmesi icin gerekli adimlar
    * Kullanici "masterUrl" adresine gider
    * Anasayfayi goruntulendigini dogrular.
    * Kullaci bilgilerini girer.

  Scenario:TC01
    * Ana sayfa ust barinda ki Shops menu basligi gorunur olmalidir
    * Ana sayfa ust barinda ki Categories altindaki (Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) linkler gorunur olmalidir.
    * Linklere  tıklanıldığında ilgili şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Profil ikonuna tıklandıgında Book Service ikonu görünür ve aktif olmalıdır.
    * Book Service ikonuna tıklanıldığında şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.
    * Hizmetler sayfasında herhangi bir hizmete tıklanıldığında o hizmete ait Book Service butonu gorunur ve aktif olmalıdır.
    * Sayfayi kapatir