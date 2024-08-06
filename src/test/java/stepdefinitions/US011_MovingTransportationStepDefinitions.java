package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.MovingTransportationPage;
import pages.components.TestPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US011_MovingTransportationStepDefinitions {
    Actions actions = new Actions(Driver.getDriver());
    TestPage testPage=new TestPage();
    MovingTransportationPage movingTransportationPage=new MovingTransportationPage();

    //TC01
    @Given("Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linki gorunur olmalidir.")
    public void anasayfa_header_bolumunde_categories_drop_down_menu_altindaki_moving_transportation_linki_gorunur_olmalidir() {
        actions.moveToElement(movingTransportationPage.categoriesLinki).perform();
        Assert.assertTrue(movingTransportationPage.movingTransportationLinki.isDisplayed());
    }
    //TC02
    @Given("Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.")
    public void anasayfa_header_bolumunde_categories_drop_down_menu_altindaki_moving_transportation_linkine_tiklanir() {
        actions.moveToElement(movingTransportationPage.categoriesLinki).perform();
        movingTransportationPage.movingTransportationLinki.click();
    }
    @Given("Moving & Transportation linkinde bulunan Shops ve Service butonlari gorunur ve aktif olmalidir.")
    public void moving_transportation_linkinde_bulunan_shops_ve_service_butonlari_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(testPage.shopsButonu.isDisplayed());
        Assert.assertTrue(testPage.homeServicesServicesButonu.isDisplayed());
    }
    @Given("Shops butonuna tiklandiginda Shops Found yazisi gorunur olmalidir.")
    public void shops_butonuna_tiklandiginda_shops_found_yazisi_gorunur_olmalidir() {
        testPage.shopsFoundYazisi.click();
        Assert.assertTrue(testPage.shopsFoundYazisi.isDisplayed());
    }
    @Given("Service butonuna tiklandiginda Services Found yazisi gorunur olmalidir.")
    public void service_butonuna_tiklandiginda_services_found_yazisi_gorunur_olmalidir() {
        testPage.homeServicesServicesButonu.click();
        Assert.assertTrue(testPage.servicesFoundYazisi.isDisplayed());
    }

}
