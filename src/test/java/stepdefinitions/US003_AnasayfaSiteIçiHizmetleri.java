package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.ContactUsPage;
import pages.components.EventsPage;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US003_AnasayfaSiteIçiHizmetleri {

    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    EventsPage eventsPage = new EventsPage();
    ContactUsPage contactUsPage = new ContactUsPage();


    @Then("Online Master Market simgesine tıklar Anasayfaya ulaşır")
    public void online_master_market_simgesine_tıklar_anasayfaya_ulaşır() {

        contactUsPage.contactUsPageContactUsOMLogo.click();
    }
    @Then("Anasayfada Arama matorunu görür")
    public void anasayfada_arama_matorunu_görür() {


        eventsPage.aramaMatoru.isDisplayed();


    }

    @Then("Arama matoruna {string} yazar")
    public void aramaMatorunaYazar(String keyword) {
        eventsPage.aramaMatoru.sendKeys(ConfigReader.getProperty(keyword));


    }

    @Then("Anasayfa Serach butonuna tıklarr")
    public void anasayfaSerachButonunaTıklarr() {
        eventsPage.anasayfaSerachButonu.click();
    }

    @When("başarılı bir şekilde sayfaya ulaştığını kontorl eder")
    public void başarılıBirŞekildeSayfayaUlaştığınıKontorlEder() {
        Assert.assertTrue(eventsPage.searchButoonsonrasiKontorl.isDisplayed());
    }

    @Then("Search butonun altında hızlı servis linklerini görür")
    public void searchButonunAltındaHızlıServisLinkleriniGörür() {
        eventsPage.hizliservislinkleriktr.isDisplayed();
    }

    @Then("Full-Service Catering \\( per person) hızlı linke tıklar")
    public void fullServiceCateringPerPersonHızlıLinkeTıklar() {
        eventsPage.fullServiceHizliLink.click();
    }

    @Then("Full House Cleaning hzılı linke tıklar")
    public void fullHouseCleaningHzılıLinkeTıklar() {
        eventsPage.fullHouseClaninghizliLink.click();
    }



    @Then("Leak Detection hızlı linkine tıklar")
    public void leakDetectionHızlıLinkineTıklar() {
        eventsPage.leakDetectionHizliLink.click();
    }
}
