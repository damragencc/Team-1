package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class US022_HomeServicesStepDefinitions {

    HeaderComp headerComp = new HeaderComp();
    TestPage testPage = new TestPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    //TC01

    @Given("Kullanici {string} adresinee gider")
    public void kullanici_adresinee_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayii goruntulenir")
    public void anasayfayii_goruntulenir() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Anasayfada bulunan slider'da Home Services basligi gorunur ve aktif olmalidir.")
    public void anasayfada_bulunan_slider_da_home_services_basligi_gorunur_ve_aktif_olmalidir() {
        testPage.homeServicesLinki.isDisplayed();
    }

    @Given("Sayfaa kapatilir")
    public void sayfaa_kapatilir() {
        Driver.quitDriver();
    }

    //TC02

    @Given("Anasayfada bulunan slider'da Home Services basligina tiklanilir.")
    public void anasayfada_bulunan_slider_da_home_services_basligina_tiklanilir() {
        actions.moveToElement(testPage.homeServicesLinki).perform();
        testPage.homeServicesLinki.click();
    }

    @Given("Acilan home services sayfasinda Shops butonu gorunur ve tiklanabilmelidir.")
    public void acilan_home_services_sayfasinda_shops_butonu_gorunur_ve_tiklanabilmelidir() throws InterruptedException {
        Thread.sleep(1000);
        testPage.homeServicesShopsButonu.isDisplayed();
        testPage.homeServicesShopsButonu.click();
    }

    @Given("Shops butonuna tiklandiginda Shops Found yazisinin gorundugu teyit edilmelidir.")
    public void shops_butonuna_tiklandiginda_shops_found_yazisinin_gorundugu_teyit_edilmelidir() {
        Assert.assertTrue(testPage.shopsFoundYazisi.isDisplayed());
    }

    @Given("Acilan home services sayfasinda Service butonu gorunur ve tiklanabilmelidir.")
    public void acilan_home_services_sayfasinda_service_butonu_gorunur_ve_tiklanabilmelidir() {
        Assert.assertTrue(testPage.homeServicesServicesButonu.isDisplayed());
        testPage.homeServicesServicesButonu.click();
    }

    @Given("Service butonuna tiklandiginda Services Found yazisinin gorundugu teyit edilmelidir.")
    public void service_butonuna_tiklandiginda_services_found_yazisinin_gorundugu_teyit_edilmelidir() {
        Assert.assertTrue(testPage.servicesFoundYazisi.isDisplayed());
    }

    @Given("Acilan home services sayfasinda filtreleme ikonu gorunur ve tiklanabilmelidir.")
    public void acilan_home_services_sayfasinda_filtreleme_ikonu_gorunur_ve_tiklanabilmelidir() {
        Assert.assertTrue(testPage.filterButonu.isDisplayed());
        testPage.filterButonu.click();
    }

    @Given("Filtreleme ikonuna tiklandiginda acilan filtrede Search butonunun ve yazisinin gorundugu teyit edilmelidir.")
    public void filtreleme_ikonuna_tiklandiginda_acilan_filtrede_search_butonunun_ve_yazisinin_gorundugu_teyit_edilmelidir() throws InterruptedException {
        Assert.assertTrue(testPage.filterButonu.isDisplayed());

    }
    //TC03

    @Given("Gorunen tum servislere ayri ayri tiklanabilmeli ve ilgili servis sayfalarina gidilebildigi dogrulanmalidir")
    public void testAllServices() throws InterruptedException {
        TestPage testPage = new TestPage();
        List<WebElement> services = testPage.getServiceLinks();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

        for (WebElement service : services) {
            String serviceName = service.getText();
            service.click();

            wait.until(ExpectedConditions.titleContains(serviceName));
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertTrue("Wrong page for service: " + serviceName, actualTitle.contains(serviceName));

            // Diğer doğrulamalar (örneğin, spesifik elementlerin varlığı)
            Driver.getDriver().navigate().back();
            testPage.clickAllServicesAndVerify();
        }
    }
    // DIKKAT: BU STEP BIR BUGDIR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Given("Services sayfalari altinda yer alan ilerleme butonuna tiklandiginda bir sonraki servis listesinin acildigi dogrulanmalidir.")
    public void services_sayfalari_altinda_yer_alan_ilerleme_butonuna_tiklandiginda_bir_sonraki_servis_listesinin_acildigi_dogrulanmalidir() {
        actions.moveToElement(testPage.ilerlemeButonu).perform();
        testPage.ilerlemeButonu.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(testPage.firstServiceInNextList));

        Assert.assertTrue("First service in the next list is not visible", testPage.firstServiceInNextList.isDisplayed());
    }
    //TC04

    @Given("Servis kartinda Visit Store ikonu gorunur ve aktif olmalidir.")
    public void servis_kartinda_visit_store_ikonu_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(testPage.aquaShieldPlumbingVisitStoreIkonu.isDisplayed());
    }
    //TC05
    @Given("Acilan sayfada Shop Detail, Shop Availability, Services yazilarinin gorundugu dogrulanmalidir.")
    public void acilan_sayfada_shop_detail_shop_availability_services_yazilarinin_gorundugu_dogrulanmalidir() {
        testPage.aquaShieldPlumbingVisitStoreIkonu.click();
        Assert.assertTrue(testPage.shopDetailsYazisi.isDisplayed());
        Assert.assertTrue(testPage.shopAvailabilityYazisi.isDisplayed());
        Assert.assertTrue(testPage.servicesYazisi.isDisplayed());

    }
}