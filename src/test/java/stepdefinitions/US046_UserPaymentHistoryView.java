package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import pages.components.ProfilPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US046_UserPaymentHistoryView {
    HeaderComp headerComp = new HeaderComp();
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();

    @Given("User goes to {string}")
    public void kullanici_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }
    @Given("user click on the {string} button in the Header section")
    public void userClickOnTheButtonInTheHeaderSection(String login) {
        headerComp.performLogIn(ConfigReader.getProperty("userEmail"), ConfigReader.getProperty("userPassword"));
    }


    @Given("User click on the user panel, click {string} from the menu that opens")
    public void userClickOnTheUserPanelClickFromTheMenuThatOpens(String dashbboard) {
        HeaderComp.insanIconu.click();
        ProfilPage.iconDashboard.click();
    }


    @Given("User Click on the {string} link under {string}")
    public void userClickOnTheLinkUnder(String payment, String dashboard) {


    }
}