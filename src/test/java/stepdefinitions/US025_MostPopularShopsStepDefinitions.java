package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US025_MostPopularShopsStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    TestPage testPage = new TestPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions=new Actions(Driver.getDriver());


    //TC01

    @Given("Kullanici {string} adresine giderr")
    public void kullanici_adresine_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenirr")
    public void anasayfayi_goruntulenir() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Anasayfa body bolumunde Most Popular Shops basligi gorunur olmalidir")
    public void anasayfa_body_bolumunde_most_popular_shops_basligi_gorunur_olmalidir() {
        testPage.mostPopularShopsYazisi.isDisplayed();

    }

    @Given("Sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.quitDriver();

    }
    //TC02
    @Given("Kullanici {string} adresine giderrr")
    public void kullanici_adresine_giderr(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenirrr")
    public void anasayfayi_goruntulenirr() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Anasayfa body bolumunde Most Popular Shops basligi gorunur olmalidirr")
    public void anasayfa_body_bolumunde_most_popular_shops_basligi_gorunur_olmalidirr() {
        testPage.mostPopularShopsYazisi.isDisplayed();

    }
    @Given("Anasayfa body bolumunde Most Popular Shops basligi altinda yer alan Gourmet Affairs Catering firmasinin isminin gorundugu ve konumunun Houston, Texas oldugu teyit edilir")
    public void anasayfa_body_bolumunde_most_popular_shops_basligi_altinda_yer_alan_gourmet_affairs_catering_firmasinin_isminin_gorundugu_ve_konumunun_houston_texas_oldugu_teyit_edilir() {
        testPage.gourmetAffairsCateringYazisi.isDisplayed();
        testPage.houstonTexasKonumYazisi.isDisplayed();
    }
    @Given("Sayfa kapatilirr")
    public void sayfa_kapatilirr() {
        Driver.quitDriver();

    }

    // TC03

    @Given("Kullanici {string} adresine giderrrr")
    public void kullanici_adresine_giderrr(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenirrrr")
    public void anasayfayi_goruntulenirrr() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }
    @Given("Anasayfa body bolumunde Most Popular Shops basligi altinda yer alan Gourmet Affairs Catering firmasi kartinda Visit store ikonu gorunur ve aktif olmalidir")
    public void anasayfa_body_bolumunde_most_popular_shops_basligi_altinda_yer_alan_gourmet_affairs_catering_firmasi_kartinda_visit_store_ikonu_gorunur_ve_aktif_olmalidir() {
        testPage.gourmetAffairsCateringVisitStoreIkonu.isDisplayed();
    }
    @Given("Acilan sayfada Shop Details yazisinin gorunur oldugu teyit edilmelidir.")
    public void acilan_sayfada_shop_details_yazisinin_gorunur_oldugu_teyit_edilmelidir() throws InterruptedException {
        actions.moveToElement(testPage.gourmetAffairsCateringVisitStoreIkonu).perform();
        testPage.gourmetAffairsCateringVisitStoreIkonu.click();
        testPage.shopDetailsYazisi.isDisplayed();
    }
    @Given("Sayfa kapatilirrr")
    public void sayfa_kapatilirrr() {
        Driver.quitDriver();

    }
    // TC04

    @Given("Kullanici {string} adresine giderrrrr")
    public void kullanici_adresine_giderrrr(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenirrrrr")
    public void anasayfayi_goruntulenirrrr() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }
    @Given("Ana sayfada Most Popular Shops basligi altinda bulunan View All ikonu gorunur ve aktif olmalidir.")
    public void ana_sayfada_most_popular_shops_basligi_altinda_bulunan_view_all_ikonu_gorunur_ve_aktif_olmalidir() {
        actions.moveToElement(testPage.mostPopularShopsViewallButonu).perform();
        testPage.mostPopularShopsViewallButonu.isDisplayed();

    }
    @Given("View All ikonuna tiklandiginda ilgili sayfaya yonlendirmelidir.")
    public void view_all_ikonuna_tiklandiginda_ilgili_sayfaya_yonlendirmelidir() {
        actions.moveToElement(testPage.mostPopularShopsViewallButonu).perform();
        testPage.mostPopularShopsViewallButonu.click();
        }
    @Given("Acilan sayfada Shops Found yazisinin gorundugu teyit edilmelidir.")
    public void acilan_sayfada_shops_found_yazisinin_gorundugu_teyit_edilmelidir() throws InterruptedException {
        Assert.assertTrue(testPage.shopsFoundYazisi.isDisplayed());
    }
    @Given("Sayfa kapatilirrrr")
    public void sayfa_kapatilirrrr() {
        Driver.quitDriver();
    }
}

