Feature: US_067 Kayıtlı bir kullanici (provider) olarak yapılan depozitleri görebilecegim bir alan olmasini istiyorum

  Background: Kayıtlı bir kullanici (provider) Dashboard sidebar'a ulasir

    * Provider "masterUrl" ile ana sayfaya gider.
    * Login butonuna tiklar.
    * Acilan Login menusunde gecerli "providerEmail" adresi girer ve Login butonuna tiklar.
    * Acilan Password menusunde gecerli "providerPassword" girer ve Enter butonuna tiklar.
    * Acilan sayfada Profil ikonuna tiklar
    * Acilan menude Dashboard ikonuna tiklar


  Scenario: TC_01 Provider Dashboard sidebar'da Deposit History linki gorunur ve aktif olmali

    * Dashboard sidebar'da Deposit History linkinin gorunur ve aktif oldugu dogrulanir.

  Scenario: TC_02 Deposit History sayfasında ödeme listesi ve ödeme bilgileri görünür olmali.

    * Dashboard sidebar'da Deposit History linkine tiklar.
    * Odeme listesi ve odeme bilgileri ile ilgili olarak acilan tabloda (Name, Date, Amount, Deposited By, Status, Deposited At) alanlarinin goruldugu dogrulanir.

  Scenario: TC_03 Deposit listesinde arama yapabilmek icin filtreleme ikonları ve search box görünür ve aktif olmali.

    * Dashboard sidebar'da Deposit History linkine tiklar.
    * Arama yapabilmek icin filtreleme ikonlari ve search box'in gorunur ve aktif oldugu dogrulanir.
