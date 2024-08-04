package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;

import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US044_LogoutTestStepDefinitions {

    HeaderComp headerComp = new HeaderComp();

   RegisterPage registerPage=new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} gider.")
    public void kullanici_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @When("Anasayfayi goruntulendigini dogrular.")
    public void anasayfayi_goruntulendigini_dogrular() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }
    @When("Login butonuna tiklar.")
    public void login_butonuna_tiklar() {
        headerComp.headerLoginButton.click();
    }

    @When("Email ID bolumune {string} bilgileri giris yapar")
    public void email_ıd_bolumune_bilgileri_giris_yapar() {
    headerComp.emailIdBox.sendKeys(ConfigReader.getProperty("userMail1"));
    }
    

    @When("Password bolumune {string} bilgileri giris yapar.")
    public void password_bolumune_bilgileri_giris_yapar(String password) {
       headerComp.passwordBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("Enter butonuna tiklar.")
    public void enter_butonuna_tiklar() {
        headerComp.passwordEnterButton.click();
    }
    @Then("Header bolumundeki profil ikonunun goruntulendigi dogrulanir.")
    public void header_bolumundeki_profil_ikonunun_goruntulendigi_dogrulanir() {
        headerComp.profilIkonu.isDisplayed();
    }


}
