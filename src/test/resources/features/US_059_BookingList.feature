Feature: US_059 Kayıtlı bir kullanici (provider) olarak sipariş alınan hizmetlerimi görüntülemek ve yönetebilmek istiyorum

  Background: Provider Booking List sayfasina gider.

    * Provider "masterUrl" ile ana sayfaya gider.
    * Kayitli kullanici Login butonuna tiklar.
    * Acilan Login menusunde gecerli "providerEmail" adresi girer ve Login butonuna tiklar.
    * Acilan Password menusunde gecerli "providerPassword" girer ve Enter butonuna tiklar.
    * Acilan sayfada Profil ikonuna tiklar
    * Acilan menude Booking List ikonuna tiklar

  Scenario: TC_01 Provider Dashboard sidebar'da Booking List linki gorunur ve aktif olmali

    * Dashboard sidebar'da Booking List linkinin gorunur ve akitf oldugunu dogrular.


  Scenario: TC_02 Booking List sayfasinda filtreleme ikonları gorunur ve aktif olmali

    * Booking List sayfasinda filtreme ikonunun gorunur ve aktif oldugu dogrulanir.


  Scenario: TC_03 Siparişi verilen ürün için onaylama islemi yapilabilmeli

    * Siparisi verilen urun icin Complete Request to user linkine tiklar.
    * Cikan pop-up ekranda Confirm butonuna tiklar.
    * Cİkan pop-up ekranda Okay butonuna tiklar.
    * Complete Request sent to User yazisinin gorundugu dogrulanir.

  Scenario: TC_04 Siparişi verilen ürün için iptal islemi yapilabilmeli

    * Sipari verilen urun icin Cancel the Service linkine tiklar.
    * Acilan pop-up ekranda Reason for Cancel formuna iptal nedenini yazar.
    * Submit butonuna basar.
    * Acilan pop-up ekranda okay butonuna tiklar.
    * Sipari verilen urun icin cancelled by Provider yazisinin goruldugu dogrulanir.


  Scenario: TC_05 Siparişi verilen ürün için chat bölümünden müsteri ile iletisim kurulabilmeli

    * Siparisi verilen urun icin Chat linkine tiklar.
    * Acilan chat formuna yazmak istedigi mesaji girer.
    * Gonderme butonuna tiklar.
    * Mesajin gonderildigi dogrulanir.

  Scenario: TC_06 Booking List sayfasinda sipariş ile ilgili (Booking date,user,location,staffs)
            detaylar görünür olmali.

    * Sipariş ile ilgili "User", "Booking Date", "Location", "Staffs" detaylarin gorunur oldugu dogrulanir.
