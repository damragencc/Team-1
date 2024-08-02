package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.components.HeaderComp;
import pages.components.LoginPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001_AnasayfaStepDefinitions {


    HeaderComp headerComp = new HeaderComp();
    LoginPage loginPage=new LoginPage();

    @Given("Kullanici {istenenUrlAdi} gider")
    public void kullanici_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));

    }
    @Then("Anasayfayi goruntuler")
    public void anasayfayi_goruntuler() {
        loginPage.anaSayfaGoruntuleme.isDisplayed();

    }
    @Then("Sitenin tittleri {string} oldugunu dogrular")
    public void sitenin_tittleri_oldugunu_dogrular(String string) {
        loginPage.siteninTitle.isDisplayed();
    }

    @When("Become a User butonuna tiklar")
    public void become_a_user_butonuna_tiklar() {
        headerComp.becomeAuser.click();

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();

    }
    }