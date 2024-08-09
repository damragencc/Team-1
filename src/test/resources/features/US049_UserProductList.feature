Feature:  Kayıtlı bir kullanıcı (User) olarak ürün listelerini görebilmek ve begendigim ürünleri satin almak icin bir sayfada listelenmesini istiyorum.

  Scenario: TC01 Kullanıcı siteye Doğru , Kullanıcı maili ve parola ile giriş yapabilmeli
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
    And 3 saniye beklerr
    And sayfayi kapatirr

   Scenario: TC02 Kullancı Header bölümüne ulaşabilmeli
     Given  Kullanici "masterUrl" giderr
     Then login butonuna tiklar.
     And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
     Then Kullanıcı Header bölümüne ulaşır
     And 3 saniye beklerr
     And sayfayi kapatirr


   Scenario: TC03 Kullanıcı Header bölümünden Shopping simgesini görebilmeli
     Given  Kullanici "masterUrl" giderr
     Then login butonuna tiklar.
     And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
     Then Kullanıcı Header bölümüne ulaşır
     Then Kullanıcı Shopping simgesini gördü ve tıkladı
     And 3 saniye beklerr
     And sayfayi kapatirr

Scenario: TC04 Kullannıcı Shoppinh ikonundan "Profuct List" sayfasına yönlendirilmeli
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  Then Kullanıcı Header bölümüne ulaşır
  Then Kullanıcı Shopping simgesini gördü ve tıkladı
  Then Kullanıcı Shopping sayfasında Product List sayfasına yönlendirir
  And 3 saniye beklerr
  And sayfayi kapatirr

  Scenario: TC05 Kullanıcı Anasayfada Header bölümünden "Shops" menusune ulaşabilmeli
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
    Then Kullanıcı Header bölümüne ulaşır
    Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
    And 3 saniye beklerr
    And sayfayi kapatirr

Scenario: TC06 Kullanıcı "Shops" menüsünün alt menülerini görütüleyebilmeli, ve "Product" alt menüsünden "Product List" menüsüne ulaşabilmeli

  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  Then Kullanıcı Header bölümüne ulaşır
  Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
  Then Shops menüsünün alt menüsü Product menüsüne tıklar
  Then Product menüsünden Product List sayfasını görüntüler
  And 3 saniye beklerr
  And sayfayi kapatirr

  Scenario: TC07 Kullanıcı "Poruct List" sayfasındaki ürünleri görüntüleyebilmeli, Herhangi bir ürüne tıkladığında ürünün bilgilerine erişim sağlayabilmeli
    Given  Kullanici "masterUrl" giderr
    Then login butonuna tiklar.
    And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
    Then Kullanıcı Header bölümüne ulaşır
    Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
    Then Shops menüsünün alt menüsü Product menüsüne tıklar
    Then Product menüsünden Product List sayfasını görüntüler
    Then Ürün listesinden herhangi bir ürüne tıklar
    Then Seçtiği ürünün ürün bilgilerine ulaşır
    And 3 saniye beklerr
    And sayfayi kapatirr

Scenario: TC08 Kullanıcı "Product List" sayfasında seçilen ürün bilgirerinden "Add to Car" butonundan alışveriş sepetinde ekleyebilmeli
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  Then Kullanıcı Header bölümüne ulaşır
  Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
  Then Shops menüsünün alt menüsü Product menüsüne tıklar
  Then Product menüsünden Product List sayfasını görüntüler
  Then Ürün listesinden herhangi bir ürüne tıklar
  Then Seçtiği ürünün ürün bilgilerine ulaşır
  Then Ürünü Add To Cart  butonundan alışveriş sepetine ekler
  And 3 saniye beklerr
  And sayfayi kapatirr

Scenario: TC09 Kullanıcı "Product List" sayfasındaki istediği ürünü "Add to Cart" butonundan alışveriş sepetine ekleyebilmeli
  Given  Kullanici "masterUrl" giderr
  Then login butonuna tiklar.
  And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
  Then Kullanıcı Header bölümüne ulaşır
  Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
  Then Shops menüsünün alt menüsü Product menüsüne tıklar
  Then Product menüsünden Product List sayfasını görüntüler
  Then Listede istediği herhangi bir ürünün Add to Cart butonuna tıklar
  Then Kullanıcı Shopping simgesini gördü ve tıkladı
  Then Alışveriş sepetinde eklediği ürünleri görüntüler
  And 3 saniye beklerr
  And sayfayi kapatirr

 Scenario: TC10 Kullanıcı eklediği ürünü alışveriş sepetinde görebilmeli
   Given  Kullanici "masterUrl" giderr
   Then login butonuna tiklar.
   And email olarak "EmailDashboard" bilgilerini girerr ve password olarak "userPassword1" girer
   Then Kullanıcı Header bölümüne ulaşır
   Then Kullanıcı Header bölümünde Shops menüsüne ulaşır
   Then  Kullanıcı Shopping simgesini gördü ve tıkladı
   Then Alışveriş sepetinde eklediği ürünleri görüntüler
   And 3 saniye beklerr
   And sayfayi kapatirr

