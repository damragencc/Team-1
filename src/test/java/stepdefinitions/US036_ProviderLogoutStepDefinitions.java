package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;

import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US036_ProviderLogoutStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();


    @Given("Login butonuna tiklar")
    public void login_butonuna_tiklar() {

        ReusableMethods.bekle(2);
    }

    @Given("Gecerli  {string} adresini girer")
    public void gecerli_adresini_girer(String providerEmail) {


       loginLogoutPage.mainPageLoginFormEmailbox.sendKeys(ConfigReader.getProperty("providerEmail"));

        
    }
    @Given("Gecerli {string} girer")
    public void gecerli_girer(String string) {
        loginLogoutPage.mainPageLoginFormPasswordbox.sendKeys(ConfigReader.getProperty("providerPassword"));
    }

    @Given("Loginform butonuna tiklar")
    public void loginform_butonuna_tiklar() {

        loginLogoutPage.mainPageLoginFormEmailboxLoginButton.click();
    }


    @Given("Enter butonuna tiklar")
    public void enter_butonuna_tiklar() {

        loginLogoutPage.mainPageLoginFormPasswordEnterButton.click();
    }

    @Given("Header bolumundeki profil simgesine tiklar")
    public void header_bolumundeki_profil_simgesine_tiklar() {
        loginLogoutPage.profileIcon.click();

    }
    @Given("Logout linkinin gorunur ve tiklanabilir oldugunu dogrular")
    public void logout_linkinin_gorunur_ve_tiklanabilir_oldugunu_dogrular() {
        Select select=new Select(loginLogoutPage.profileDropDown);
        select.selectByVisibleText("Logout");

    }

}
