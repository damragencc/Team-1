package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.components.EventsPage;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Instant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US016_AnasayfaEventsTestiStepDefinitions {

    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    EventsPage eventsPage = new EventsPage();


    @Given("Ziyaretçi {string} sayfasına gider")
    public void ziyaretçi_sayfasına_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));


    }


   @Then("Ansayfada silder'a ulasır")
    public void ansayfadaSilderAUlasır() {


        eventsPage.silderCategory.isDisplayed();


    }




    @Then("Events başlığına ulaşır ve tıklar")
    public void eventsBaşlığınaUlaşırVeTıklar() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", eventsPage.Eventsbuton);// sayfa kaydırma

    }

    @Then("Shops butonunu görür")
    public void shopsButonunuGörür() {
        eventsPage.Shopsbutonuu.isDisplayed();


    }

    @Then("Service butonunu görür")
    public void serviceButonunuGörür() {
        eventsPage.ServiceButonuu.isDisplayed();

    }

    @When("Filtreleme ikonuna tıklarr")
    public void filtrelemeIkonunaTıklarr() {
        eventsPage.filtrelemeikonuServic.click();

    }

    @When("Location alanına {string} yazar")
    public void locationAlanınaYazar(String location) {
        eventsPage.Locationserachh.sendKeys(ConfigReader.getProperty(location));

    }


    @When("Sort By alanına sortBy seçer")
    public void sortByAlanınaSortBySeçer() {
        eventsPage.SortByikon.click();

      //  JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView(true);", eventsPage.sortBysecenek);

        eventsPage.sortBysecenek.click();


    }



    @When("Keyword alanına {string} yazar")
    public void keywordAlanınaYazar(String keyword) {
        eventsPage.Keywordikon.sendKeys(ConfigReader.getProperty(keyword));

    }

    @When("Catagories alınını catagories alanını seçer")
    public void catagoriesAlınınıCatagoriesAlanınıSeçer() {
        eventsPage.catagoriesikon.click();
        eventsPage.EventsSeceneginiSec.click();


    }

    @When("SubCatagories subcatagories alanını seçer")
    public void subcatagoriesSubcatagoriesAlanınıSeçer() {
        eventsPage.SubCatagoryikon.click();
        eventsPage.subcatagorideSecenekTıkla.click();

    }
    @Then("Search butonuna tıklarr")
    public void searchButonunaTıklarr() {
        eventsPage.Serchbuttonn.click();

    }


    @Then("Service butonuna tıklarr")
    public void serviceButonunaTıklarr() {
        eventsPage.ServiceButonuu.click();

    }

    @Then("Servis listesinin sayfada görüntüler")
    public void servisListesininSayfadaGörüntüler() {
        eventsPage.ServiseListesi.isDisplayed();

    }

    @Then("istediği servis ürününe tıklar")
    public void istediğiServisÜrününeTıklar() {
eventsPage.ListedeIstedilenUrün.click();

    }

    @Then("ürünün ürün bilgilerini görür")
    public void ürününÜrünBilgileriniGörür() {
        Assert.assertTrue(eventsPage.urunBilgileri.isDisplayed());

    }

    @Then("Shops butonuna tıklarr")
    public void shopsButonunaTıklarr() {
        eventsPage.Shopsbutonuu.click();
    }

    @Then("Shops syafasında servisleri görüntüler")
    public void shopsSyafasındaServisleriGörüntüler() {
        eventsPage.shopsUrunlistesi.isDisplayed();

    }

    @Then("Herhangi bir Servis ürünün üzerindeki Visit Store tıklar")
    public void herhangiBirServisÜrününÜzerindekiVisitStoreTıklar() {
        ReusableMethods.scrollToElement(eventsPage.urunuzeriVisitStore);
        ReusableMethods.bekle(1);
         eventsPage.urunuzeriVisitStore.click();

    }

    @Then("ürün bilgilerine ulaşır")
   public void ürünBilgilerineUlaşır() {
     Assert.assertTrue( eventsPage.shopsürünBligileri.isDisplayed());

    }

    @Then("herhangi bir Shops servis ürününe tıklar")
    public void herhangiBirShopsServisÜrününeTıklar() {
        eventsPage.HarmonyShopsServis.click();
    }

    @Then("ürünün Shop Detail,Shop Availability,Services , servis adedi ve genel bilgilere ulaşır")
    public void ürününShopDetailShopAvailabilityServicesServisAdediVeGenelBilgilereUlaşır() {
        Assert.assertTrue( eventsPage.shopsürünBligileri.isDisplayed());

    }
}
