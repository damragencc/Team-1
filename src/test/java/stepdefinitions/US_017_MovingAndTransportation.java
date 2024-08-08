package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.MovingAndTransportationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_017_MovingAndTransportation {


    MovingAndTransportationPage movingAndTransportationPage = new MovingAndTransportationPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} ile anasayfaya gider.")
    public void kullanici_ile_anasayfaya_gider(String masterUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(masterUrl));
    }
    @Given("Anasayfadaki header bolumunde {string} sekmesine gelir.")
    public void anasayfadaki_header_bolumunde_sekmesine_gelir(String categories) {

        actions.moveToElement(movingAndTransportationPage.linkCategories).perform();
        ReusableMethods.bekle(2);

    }
    @Given("Acilan menuden {string} basliginin gorunur ve aktif oldugu dogrulanir")
    public void acilan_menuden_basliginin_gorunur_ve_aktif_oldugu_dogrulanir(String string) {

        ReusableMethods.waitForVisibility(movingAndTransportationPage.linkMovingAndTransportation,3);
        Assert.assertTrue(movingAndTransportationPage.linkMovingAndTransportation.isDisplayed());
        Assert.assertTrue(movingAndTransportationPage.linkMovingAndTransportation.isEnabled());

    }
    @Given("Kullanici sayfayi kapatir.")
    public void kullanici_sayfayi_kapatir() {

        Driver.getDriver().quit();

    }

    @Given("Acilan menuden {string} linkine tiklar.")
    public void acilan_menuden_linkine_tiklar(String movingAndTransportation) {

        movingAndTransportationPage.linkMovingAndTransportation.click();
        ReusableMethods.bekle(5);

    }
    @Given("{string} ve {string} butonlarinin gorunur  ve aktif oldugu dogrulanir.")
    public void ve_butonlarinin_gorunur_ve_aktif_oldugu_dogrulanir(String shops, String service) {

        Assert.assertTrue(movingAndTransportationPage.buttonShops.isDisplayed());
        Assert.assertTrue(movingAndTransportationPage.buttonShops.isEnabled());
        Assert.assertTrue(movingAndTransportationPage.buttonService.isDisplayed());
        Assert.assertTrue(movingAndTransportationPage.buttonShops.isEnabled());

    }
    @Given("Sayfada filtreleme ikonlarinin gorunur ve aktif oldugu dogrulanir.")
    public void sayfada_filtreleme_ikonlarinin_gorunur_ve_aktif_oldugu_dogrulanir() {

        movingAndTransportationPage.iconFilter.isDisplayed();
        movingAndTransportationPage.iconFilter.isEnabled();
    }
    @Given("Kullanici {string} butonuna tiklar.")
    public void butonuna_tiklar(String service) {

        ReusableMethods.waitForClickablility(movingAndTransportationPage.buttonService,3);
        movingAndTransportationPage.buttonService.click();
        ReusableMethods.bekle(2);
    }

    @Given("{string} ve {string} servislerinin goruntulendigi dogrulanir.")
    public void ve_servislerinin_goruntulendigi_dogrulanir(String localMoving, String longDistanceMoving) {

        Assert.assertTrue(movingAndTransportationPage.textLocalMoving.isDisplayed());
        Assert.assertTrue(movingAndTransportationPage.textLocalMoving.isEnabled());
        Assert.assertTrue(movingAndTransportationPage.textLongDistanceMoving.isDisplayed());
        Assert.assertTrue(movingAndTransportationPage.textLongDistanceMoving.isEnabled());
    }

    @Given("Ilerleyen sayfalara gecildigi dogrulanir.")
    public void ılerleyen_sayfalara_gecildigi_dogrulanir() {

        ReusableMethods.scrollToElement(movingAndTransportationPage.buttonIkinciSayfaGecis);
        ReusableMethods.waitAndClickElement(movingAndTransportationPage.buttonIkinciSayfaGecis, 2);

        ReusableMethods.bekle(2);
        Assert.assertTrue(movingAndTransportationPage.textTransfer.isEnabled());

    }
    @Given("Kullanici {string} butonununu tiklar.")
    public void butonununu_tiklar(String shops) {

        ReusableMethods.waitAndClickElement(movingAndTransportationPage.buttonShops,2);
    }
    @Given("İlgili sirket kartindaki {string} ikonunu tiklar.")
    public void ilgili_sirket_kartindaki_ikonunu_tiklar(String visitStore) {

        movingAndTransportationPage.iconVisitStore.click();
        ReusableMethods.bekle(2);

    }
    @Given("{string}, {string}, {string}, {string} ve {string} ne erisilebildigi dogrulanir.")
    public void ve_ne_erisilebildigi_dogrulanir(String shopDetail, String shopAvailability, String servicesAlanlari, String servisAdedi, String genelSirketBilgileri) {

       movingAndTransportationPage.detailsIsEnabled();

    }


}
