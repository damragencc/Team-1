package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.components.DashboardPage;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US065_ProviderDashboarddaReviewsGorme {

    DashboardPage dashboardPage = new DashboardPage();
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
    RegisterPage registerPage = new RegisterPage();
    HeaderComp headerComp = new HeaderComp();

    @Then("Anasayfayi goruntulenirR")
    public void anasayfayiGoruntulenirR() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Then("Anasayfa sag ust kisimda Login butonuna tiklanirR")
    public void anasayfaSagUstKisimdaLoginButonunaTiklanirR() {
        headerComp.headerLoginButton.click();
    }

    @Then("Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanirR")
    public void acilanLoginKutucugundaEmailIDKisminaGecerliKullaniciEMailGirilirVeLoginButonunaTiklanirR() {
        headerComp.emailIdBox.click();
        headerComp.emailIdBox.sendKeys(ConfigReader.getProperty("kullaniciMehmet"));
        headerComp.emailIdBox.sendKeys(" ", Keys.ENTER);
        registerPage.loginButonu.click();
    }

    @Then("Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanirR")
    public void aacilanPasswordKutucugundaGecerliSifreGirilirVeEnterButonunaTiklanirR() {
        headerComp.passwordBox.click();
        headerComp.passwordBox.sendKeys(ConfigReader.getProperty("passwordMelike"));
        headerComp.passwordEnterButton.click();
    }


    @Given("Provider header bolumundeki profil simgesine tiklarr")
    public void providerHeaderBolumundekiProfilSimgesineTiklarr() {
        dashboardPage.ProfilIkonu.click();
    }

    @Then("Provider dashboard linkinin gorunur oldugunu dogrularr")
    public void providerDashboardLinkininGorunurOldugunuDogrularr() {
        dashboardPage.DashboardPageLinki.isDisplayed();
    }

    @Then("Provider dashboard linkine tiklarr")
    public void providerDashboardLinkineTiklarr() {
        dashboardPage.DashboardPageLinki.click();
    }


    @Then("Provider Reviews linkinin gorunur oldugunu dogrular")
    public void providerReviewsLinkininGorunurOldugunuDogrular() {
        dashboardPage.ReviewsLinki.isDisplayed();
    }

    @Then("Provider Reviews linkine tiklar")
    public void providerReviewsLinkineTiklar() {
        dashboardPage.ReviewsLinki.click();
    }

    @Given("Provider Reviews sayfasindaki urun degerlendiren musteri listesini kontrol eder")
    public void providerReviewsSayfasindakiUrunDegerlendirenMusteriListesiniKontrolEder() {
        WebElement customerList = driver.findElement(By.xpath("//span[text()='Reviews']\n"));
        assertTrue(customerList.isDisplayed());
    }

    @And("{int} saniye bekleR")
    public void saniyeBekleR(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("Sayfayi kapatiR")
    public void sayfayiKapatiR() {
        Driver.quitDriver();
    }



}





