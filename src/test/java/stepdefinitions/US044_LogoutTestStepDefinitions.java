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
    @When("Kullaci bilgilerini girer.")
    public void kullaci_bilgilerini_girer() {headerComp.performLogIn("toprakyemelek.user@ommarket.com","Ommarket.2607");}
    @Then("Header bolumundeki profil ikonunun goruntulendigi dogrulanir.")
    public void header_bolumundeki_profil_ikonunun_goruntulendigi_dogrulanir() {
        headerComp.profilIkonu.isDisplayed();
    }


}
