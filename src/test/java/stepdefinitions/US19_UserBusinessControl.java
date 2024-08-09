package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US19_UserBusinessControl { // .java uzantısını kaldırdım
    HeaderComp headerComp = new HeaderComp();
    LoginLogoutPage loginLogoutPage= new LoginLogoutPage();

    @Given("User goes to {string}")
    public void kullanici_gider(String istenenUrlAdi) {
    Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("User click on the {string} button in the Header section")
    public void userClickOnTheButtonInTheHeaderSection(String arg0) {
        headerComp.performLogIn(ConfigReader.getProperty("userEmail"), ConfigReader.getProperty("userPassword"));
    }

    @Given("tested that the {string} title is visible on the home page")
    public void testedThatTheTitleIsVisibleOnTheHomePage(String businessServices) {
        LoginLogoutPage.businessServices.click();
    }

    @Given("User enter the {string} page, it is verified that the {string} and {string} buttons are visible")
    public void userEnterThePageItIsVerifiedThatTheAndButtonsAreVisible(String businessServices, String shops, String services) {
    LoginLogoutPage.businessServicesShop.isDisplayed();
    LoginLogoutPage.businessServicesService.isDisplayed();
    }

    @Given("User verify that the filter button is visible next to the {string} and {string} buttons")
    public void userVerifyThatTheFilterButtonIsVisibleNextToTheAndButtons(String shops, String service) {
    LoginLogoutPage.filterButton.isDisplayed();
    HeaderComp.filterIcon.isDisplayed();
    }

    @Given("User services on the Business Services page should be displayed")
    public void userServicesOnTheBusinessServicesPageShouldBeDisplayed() {
    LoginLogoutPage.filterButton.click();
    LoginLogoutPage.location.sendKeys("Turkey", Keys.ENTER);

    }

    @Given("User when the Shops icon is clicked, the relevant services should be displayed")
    public void userWhenTheShopsIconIsClickedTheRelevantServicesShouldBeDisplayed() {
    LoginLogoutPage.businessServicesShop.click();
    LoginLogoutPage.shopFoundsText.isDisplayed();
    }
    @And("it is tested that the {string} icon is visible on the Service card")
    public void itIsTestedThatTheIconIsVisibleOnTheServiceCard(String visitStore) {
    LoginLogoutPage.visitstore.click();
    }
    @Then("click on the cards, it must be verified that it goes to the relevant service")
    public void clickOnTheCardsItMustBeVerifiedThatItGoesToTheRelevantService() {
    LoginLogoutPage.shopDetailsText.isDisplayed();
    }
    @Given("User when the desired service is selected, {string}, {string}, {string}, {string} and general information should be accessible")
    public void userWhenTheDesiredServiceIsSelectedAndGeneralInformationShouldBeAccessible(String shopDetail, String shopAvailability, String services, String numberOfServices) {
    LoginLogoutPage.shopDetailsText.isDisplayed();
    LoginLogoutPage.shopAvailabilityText.isDisplayed();
    LoginLogoutPage.servicesText.isDisplayed();
    }

    @Given("Closes the page")
    public void closesThePage() {
        Driver.quitDriver();
    }
}
