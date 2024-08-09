package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
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
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
    @Given("Kullanici {string} giderr")
    public void kullanici_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }
    @Then("login butonuna tiklar.")
    public void login_butonuna_tiklar() {
        headerComp.headerLoginButton.click();
        ReusableMethods.bekle(2);
    }

        @And("email olarak {string} bilgilerini girerr ve password olarak {string} girer")
        public void emailOlarakBilgileriniGirerrVePasswordOlarakGirer(String emil, String password) {
            ReusableMethods.bekle(1);
            loginLogoutPage.mainPageLoginFormEmailbox
                    .sendKeys(ConfigReader.getProperty(emil));
            ReusableMethods.bekle(1);
            loginLogoutPage.mainPageLoginFormEmailbox.sendKeys(" ", Keys.ENTER);
            ReusableMethods.bekle(1);
            loginLogoutPage.mainPageLoginFormEmailboxLoginButton
                    .click();

            ReusableMethods.bekle(1);
            loginLogoutPage.mainPageLoginFormPasswordbox
                    .sendKeys(ConfigReader.getProperty(password));
            loginLogoutPage.mainPageLoginFormPasswordEnterButton
                    .click();
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




    @And("Mobile Number yeniNumber girer")
    public void mobileNumberYeniNumberGirer() {

profileSettings.mobileNumber.click();
ReusableMethods.bekle(1);
profileSettings.mobileNumber.clear();
ReusableMethods.bekle(1);
profileSettings.mobileNumber.sendKeys("+1 533521555151",Keys.ENTER);

    }

    @And("Date of Birth dogumtarihi girer")
    public void dateOfBirthDogumtarihiGirer() {

    profileSettings.DateOfBirth.click();
    ReusableMethods.bekle(1);
    profileSettings.DateOfBirth.clear();
    ReusableMethods.bekle(1);

    profileSettings.DateOfBirth.sendKeys("04-02-1999",Keys.ENTER);
    }
    @Then("Gender bilgilerini girer")
    public void genderBilgileriniGirer() {
        profileSettings.GenderTextbox.click();
        profileSettings.FemaleGender.click();
    }
    @And("Adress bilgileri adressyeni girer")
    public void adressBilgileriAdressyeniGirer() {

        ReusableMethods.scrollToElement(profileSettings.AdressTextbox);
        ReusableMethods.bekle(1);
        profileSettings.AdressTextbox.click();
        ReusableMethods.bekle(1);
        profileSettings.AdressTextbox.clear();
        profileSettings.AdressTextbox.sendKeys("isparta Turkey",Keys.ENTER);
    }

    @And("Country yeniCountry girer")
    public void countryYeniCountryGirer() {
        ReusableMethods.scrollToElement(profileSettings.CountyTextbox);
        ReusableMethods.bekle(1);
        profileSettings.CountyTextbox.click();
        profileSettings.ulkeSecimi.click();

    }

    @And("State Stateyeni girer")
    public void stateStateyeniGirer() {
        ReusableMethods.scrollToElement(profileSettings.SatateTextbox);
        ReusableMethods.bekle(1);
        profileSettings.SatateTextbox.click();
     profileSettings.statesecimiii.click();
    }

    @And("City Cityyeni girer")
    public void cityCityyeniGirer() {
        ReusableMethods.scrollToElement(profileSettings.SatateTextbox);
        ReusableMethods.bekle(1);
        profileSettings.CityTextbox.click();
        profileSettings.cityysecimii.click();


    }

    @And("Postal Code postaKodu girer")
    public void postalCodePostaKoduGirer() {
        profileSettings.PostalCodeTextbox.click();
        profileSettings.PostalCodeTextbox.clear();
        profileSettings.PostalCodeTextbox.sendKeys("254896",Keys.ENTER);
    }
    @Then("Uptade butonuna tıklar")
    public void uptadeButonunaTıklar() {
        ReusableMethods.scrollToElement(profileSettings.ProfilSettingUptade);
        ReusableMethods.bekle(1);
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


    @Given("Profil Setting sayfasındaki alanlar \\(Name, Email, Mobile Number, Date of birth, Gender, Address, Country, State, City, Postal Code) görür")
    public void profilSettingSayfasındakiAlanlarNameEmailMobileNumberDateOfBirthGenderAddressCountryStateCityPostalCodeGörür() {

        ReusableMethods.scrollToElement(profileSettings.ProfilSettingAlanları);
        ReusableMethods.bekle(1);
        profileSettings.ProfilSettingAlanları.isDisplayed();
    }



}