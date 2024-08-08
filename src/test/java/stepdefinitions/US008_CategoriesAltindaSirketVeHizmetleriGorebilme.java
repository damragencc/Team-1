package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.components.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US008_CategoriesAltindaSirketVeHizmetleriGorebilme {

    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage=new RegisterPage();
    CategoriesPage categoriesPage = new CategoriesPage();
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();

    String urlPipeRepair="https://qa.onlinemastermarket.com/service-preview/Pipe-Repair?sid=9a1158154dfa42caddbd0694a4e9bdc8";
    UserDashboardInvoicesPage userDashboardInvoicesPage=new UserDashboardInvoicesPage();

    String url="https://qa.onlinemastermarket.com/user-invoices";

    //TC1

    @Given("Kullanıcı {string} anasayfasını ziyaret eder.")
    public void kullaniciAnasayfasiniZiyaretEder(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Then("Anasayfayi goruntuleniR")
    public void anasayfayiGoruntuleniR() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Then("Anasayfa sag ust kisimda Login butonuna tiklaniR")
    public void anasayfaSagUstKisimdaLoginButonunaTiklaniR() {
        headerComp.headerLoginButton.click();
    }

    @Then("Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklaniR")
    public void acilanLoginKutucugundaEmailIDKisminaGecerliKullaniciEMailGirilirVeLoginButonunaTiklaniR() {
        headerComp.emailIdBox.click();
        headerComp.emailIdBox.sendKeys(ConfigReader.getProperty("kullaniciMehmet"));
        headerComp.emailIdBox.sendKeys(" ", Keys.ENTER);
        registerPage.loginButonu.click();
    }

    @Then("Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklaniR")
    public void aacilanPasswordKutucugundaGecerliSifreGirilirVeEnterButonunaTiklaniR() {
        headerComp.passwordBox.click();
        headerComp.passwordBox.sendKeys(ConfigReader.getProperty("passwordMelike"));
        headerComp.passwordEnterButton.click();
    }


    @Then("Kullanıcı header bölümünü kontrol eder.")
    public void kullaniciHeaderBolumunuKontrolEder() {
        Assert.assertTrue(categoriesPage.AnasayfaHeader.isDisplayed());
    }

    @Then("Kullanıcı Categories linkini kontrol eder.")
    public void kullaniciCategoriesLinkiniKontrolEder() {
        Assert.assertTrue(categoriesPage.CategoriesLinki.isDisplayed());
    }

    @Then("Kullanıcı header bölümünde bulunan Categories linkine tıklar.")
    public void kullanici_header_bolumunde_bulunan_categories_linkine_tiklar () {

        categoriesPage.CategoriesLinki.click();

    }

    @Given("Kullanıcı Categories linkine tıkladığında Categories sayfasına yönlendirilir.")
    public void kullanici_categories_linkine_tikladiginda_categories_sayfasina_yonlendirilir () {

        headerComp.categoriesButton.isDisplayed();

    }

    @And("{int} saniye bekleR.")
    public void saniyeBekleR(int saniye) {
        ReusableMethods.bekle(saniye);
    }


    //TC2

    @Given("Kullanıcı header bölümünde bulunan 'Categories' linkini kontrol eder.")
    public void kullanici_header_bolumunde_bulunan_categories_linkini_kontrol_eder () {

        categoriesPage.CategoriesLinki.isDisplayed();

    }

    @Given("Kullanıcı headerdaki Categories linkinin altındaki Business Services linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiBusinessServicesLinkiniKontrolEder() {
        categoriesPage.BusinessServices.isDisplayed();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Repairs & Maintenance linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiRepairsMaintenanceLinkiniKontrolEder() {
        categoriesPage.RepairsMaintenance.isDisplayed();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Moving & Transportation linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiMovingTransportationLinkiniKontrolEder() {
        categoriesPage.MovingTransportation.isDisplayed();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Events linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiEventsLinkiniKontrolEder() {
        categoriesPage.Events.isDisplayed();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Personal Services linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiPersonalServicesLinkiniKontrolEder() {
        categoriesPage.PersonalServices.isDisplayed();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Home Services linkini kontrol eder.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiHomeServicesLinkiniKontrolEder() {
        categoriesPage.HomeServices.isDisplayed();
    }

    @Given("Kullanıcı headerdaki Categories linkinin altındaki Business Services linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiBusinessServicesLinkineTiklar() {
        categoriesPage.BusinessServices.click();
    }

    @Given("Kullanıcı anasayfaya döner.")
    public void kullaniciAnasayfayaDoner() {
        registerPage.anaSayfaGoruntuleme.click();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Repairs & Maintenance linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiRepairsMaintenanceLinkineTiklar() {
        categoriesPage.RepairsMaintenance.click();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Moving & Transportation linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiMovingTransportationLinkineTiklar() {
        categoriesPage.MovingTransportation.click();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Events linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiEventsLinkineTiklar() {
        categoriesPage.Events.click();
    }

    @Then("Kullanıcı headerdaki Categories linkinin altındaki Personal Services linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiPersonalServicesLinkineTiklar() {
        categoriesPage.PersonalServices.click();
    }


    @Then("Kullanıcı headerdaki Categories linkinin altındaki Home Services linkine tıklar.")
    public void kullaniciHeaderdakiCategoriesLinkininAltindakiHomeServicesLinkineTiklar() {
        categoriesPage.HomeServices.click();
    }


    @Given("Kullanıcı {string} linkine tıklar.")
    public void kullaniciHomeLinkineTiklar() {
        registerPage.anaSayfaGoruntuleme.click();
    }

    @And("Sayfayı kapatıR.")
    public void sayfayiKapatiR() {
        Driver.quitDriver();
    }



}


