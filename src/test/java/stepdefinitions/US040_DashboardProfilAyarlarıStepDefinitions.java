package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.ProfileSettings;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US040_DashboardProfilAyarlarıStepDefinitions {

    //      login butonu log : //*[@class='btn btn-signin']
    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    ProfileSettings profileSettings = new ProfileSettings();
    @Given("Kullanici {string} giderr")
    public void kullanici_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }
    @Then("login butonuna tiklar.")
    public void login_butonuna_tiklar() {
        headerComp.headerLoginButton.click();
    }
    @Then("email olarak {string} bilgilerini girerr")
    public void email_olarak_bilgilerini_girer(String EmailDashboard) {


            headerComp.emailIdBox.sendKeys(ConfigReader.getProperty(EmailDashboard));


    }
    @Then("email login butonuna tiklar.")
    public void emailLoginButonunaTiklar() {
        headerComp.emailLoginButton.click();
    }


    @Then("password olarak {string} bilgilerini girerr")
    public void password_olarak_bilgilerini_girer(String password) {
        headerComp.passwordBox.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("enter butonuna tiklarr.")
    public void enter_butonuna_tiklar() {
        headerComp.passwordEnterButton.click();
    }
    @Then("basarili giris yapilabildiğini test ederr")
    public void basarili_giris_yapilabildiğini_test_eder() {
        Assert.assertTrue(registerPage.anaSayfaGoruntuleme.isDisplayed());
    }
    @Then("{int} saniye beklerr")
    public void saniye_bekler(Integer saniye) {
        ReusableMethods.bekle(saniye);
    }

    @And("sayfayi kapatirr")
    public void sayfayi_kapatir() {

        Driver.quitDriver();
    }


    @Then("profil ikonuna gider")
    public void profilIkonunaGider() {

        headerComp.profilIkonu.click();
    }

    @Then("Profil settings menüsüne tıklar")
    public void profilSettingsMenüsüneTıklar() {

       profileSettings.profilSettingss.click();

    }




    @Then("Profil Settings sayfasında e-mail Textboxa ulaşır")
    public void profilSettingsSayfasındaEMailTextboxaUlaşır() {

        profileSettings.emailTextbox.isDisplayed();

    }

    @Then("Profil setting sayfasında name Textboxa {string} yazar")
    public void profilSettingSayfasındaNameTextboxaYazar(String yeniName) {

        profileSettings.nameTexbox.sendKeys(ConfigReader.getProperty(yeniName));

    }

    @Then("Profil Settings sayfasında e-mail Textboxa {string} yazar")
    public void profilSettingsSayfasındaEMailTextboxaYazar(String yeniEmail) {

        profileSettings.emailTextbox.sendKeys(ConfigReader.getProperty(yeniEmail));


    }

    @Then("Profil Settings sayfasında e-mail Textboxa görür")
    public void profilSettingsSayfasındaEMailTextboxaGörür() {
        profileSettings.emailTextbox.isDisplayed();
    }

    @Then("Profil Setting sayfasında name Textbaxı görür")
    public void profilSettingSayfasındaNameTextbaxıGörür() {
        profileSettings.nameTexbox.isDisplayed();
    }

    @Then("sayfada mobile number görür")
    public void sayfadaMobileNumberGörür() {

        profileSettings.mobileNumber.isDisplayed();
    }

    @Then("sayfada Date of birth görür")
    public void sayfadaDateOfBirthGörür() {
        profileSettings.DateOfBirth.isDisplayed();

    }

    @Then("Sayfada Genderı görür")
    public void sayfadaGenderıGörür() {

        profileSettings.GenderTextbox.isDisplayed();
    }


    @Then("sayfada Address görür")
    public void sayfadaAddressGörür() {
        profileSettings.AdressTextbox.isDisplayed();

    }

    @Then("sayfada Conturyi görür")
    public void sayfadaConturyiGörür() {
        profileSettings.CountyTextbox.isDisplayed();

    }

    @Then("sayafada State görür")
    public void sayafadaSatateGörür() {
        profileSettings.SatateTextbox.isDisplayed();

    }

    @Then("sayfada City i görür")
    public void sayfadaCityIGörür() {
        profileSettings.CityTextbox.isDisplayed();

    }

    @Then("sayfada Postal code görür")
    public void sayfadaPostalCodeGörür() {
        profileSettings.PostalCodeTextbox.isDisplayed();

    }


    @And("Mobile Number {string} girer")
    public void mobileNumberGirer(String number) {
        profileSettings.mobileNumber.sendKeys(ConfigReader.getProperty(number));


    }

    @And("Date of Birth {string} girer")
    public void dateOfBirthGirer(String dogum) {
        profileSettings.DateOfBirth.sendKeys(ConfigReader.getProperty(dogum));

    }

    @And("Adress bilgileri {string} girer")
    public void adressBilgileriGirer(String adres) {
        profileSettings.AdressTextbox.sendKeys(ConfigReader.getProperty(adres));


    }

    @And("Country {string} girer")
    public void countryGirer(String ulke) {
        profileSettings.CountyTextbox.sendKeys(ConfigReader.getProperty(ulke));
    }

    @And("State {string} girer")
    public void stateGirer(String state) {
        profileSettings.SatateTextbox.sendKeys(ConfigReader.getProperty(state));

    }

    @And("City {string} girer")
    public void cityGirer(String City) {
        profileSettings.CityTextbox.sendKeys(ConfigReader.getProperty(City));

    }

    @And("Postal Code {string} girer")
    public void postalCodeGirer(String postakodu) {
        profileSettings.PostalCodeTextbox.sendKeys(ConfigReader.getProperty(postakodu));
    }

    @Then("Uptade butonuna tıklar")
    public void uptadeButonunaTıklar() {
        profileSettings.ProfilSettingUptade.click();

    }

    @Then("Profil Seting sayfasında olduğunu doğrular")
    public void profilSetingSayfasındaOlduğunuDoğrular() {
        profileSettings.profilSettingss.isDisplayed();
    }

    @Then("home butonuna tıklar")
    public void homeButonunaTıklar() {
        profileSettings.homebutton.click();
    }

    @Then("ansayfaya gittiğini doğrular")
    public void ansayfayaGittiğiniDoğrular() {
        Assert.assertTrue(registerPage.anaSayfaGoruntuleme.isDisplayed());

    }
}