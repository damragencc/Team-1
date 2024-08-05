package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US036_ProviderLogoutStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    LoginLogoutPage loginLogoutPage=new LoginLogoutPage();




    @Given("{string} ve {string} ile giris yapar")
    public void ve_ile_giris_yapar(String providerEmail, String providerPassword) {
        headerComp.performLogIn(ConfigReader.getProperty("providerEmail"),ConfigReader.getProperty("providerPassword"));
    }


    @Given("Header bolumundeki profil simgesine tiklar")
    public void header_bolumundeki_profil_simgesine_tiklar() {
        loginLogoutPage.profileIcon.click();

    }
    @Given("Logout linkinin gorunur ve tiklanabilir oldugunu dogrular")
    public void logout_linkinin_gorunur_ve_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(loginLogoutPage.logoutDropDown.isDisplayed());

    }
    @Given("Logout linkine tiklar")
    public void logout_linkine_tiklar() {
        loginLogoutPage.logoutDropDown.click();
    }
    @Given("Basari ile cikis yapildigini dogrular")
    public void basari_ile_cikis_yapildigini_dogrular() {
        Assert.assertTrue(headerComp.mainPageLoginButton.isEnabled());
    }
    @Given("Geri tuşu ile onceki sayfaya giderek logout durumunda olundugunu dogrular")
    public void geri_tuşu_ile_onceki_sayfaya_giderek_logout_durumunda_olundugunu_dogrular() {
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        Assert.assertTrue(headerComp.mainPageLoginButton.isDisplayed());
    }
}
