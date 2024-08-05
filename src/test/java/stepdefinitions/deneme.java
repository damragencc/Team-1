package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class deneme {


    public class US044_LogoutTestStepDefinitions {

        HeaderComp headerComp = new HeaderComp();

        RegisterPage registerPage=new RegisterPage();

        Actions actions = new Actions(Driver.getDriver());

        @Given("Kullanici url gider")
        public void kullanici_url_gider(String istenenURL) {
            Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
        }
        @When("Anasayfayi goruntulendigini dogrular")
        public void anasayfayi_goruntulendigini_dogrular() {
            registerPage.anaSayfaGoruntuleme.isDisplayed();
        }
        @When("Login butonuna tiklar")
        public void login_butonuna_tiklar() {
            headerComp.headerLoginButton.click();
        }
        @When("Email Box'a tiklar")
        public void email_box_a_tiklar() {
            headerComp.emailIdBox.click();
        }
        @When("Email ID bolumune {String} bilgileri giris yapar")
        public void email_ıd_bolumune_bilgileri_giris_yapar(String userMail) {
            Driver.getDriver().get(ConfigReader.getProperty(userMail));
        }
        @When("Password box'a tiklar")
        public void password_box_a_tiklar() {
            headerComp.passwordBox.click();
        }
        @Then("Password bolumune bilgileri giris yapar")
        public void password_bolumune_bilgileri_giris_yapar(String userPassword) {
            Driver.getDriver().get(ConfigReader.getProperty(userPassword));
        }
        @Then("Enter butonuna tiklar")
        public void enter_butonuna_tiklar() {
            headerComp.passwordEnterButton.click();
        }
        @Then("Header bolumundeki profil ikonunun goruntulendigi dogrulanir")
        public void header_bolumundeki_profil_ikonunun_goruntulendigi_dogrulanir() {
            headerComp.profilIkonu.isDisplayed();
        }


    }

}
