package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class US023_FeturedCompanies {
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
    @Given("User {string} title should be visible in the homepage body section.")
    public void userTitleShouldBeVisibleInTheHomepageBodySection(String featuredShop ) {
        LoginLogoutPage.featuredShop.isDisplayed();
    }

    @Given("User It is tested that the company name and location information are visible on the slider under the title")
    public void userItIsTestedThatTheCompanyNameAndLocationInformationAreVisibleOnTheSliderUnderTheTitle() {
        LoginLogoutPage.shopLocation.isDisplayed();
        LoginLogoutPage.shopName.isDisplayed();
    }
    @Given("User is verified that the {string} icon is visible and when clicked")
    public void userIsVerifiedThatTheIconIsVisibleAndWhenClicked(String visitStore) {
        LoginLogoutPage.visitStoreText.isDisplayed();
    }
    @Then("User goes to the relevant page")
    public void userGoesToTheRelevantPage() {
        LoginLogoutPage.getShopDetailsText.isDisplayed();
    }
    @Given("user go to the previous page using the back button")
    public void userGoToThePreviousPageUsingTheBackButton() {
        driver.navigate().back();
    }
    @Given("User verify that the {string} button under the company headings is visible")
    public void userVerifyThatTheButtonUnderTheCompanyHeadingsIsVisible(String arg0) {
        LoginLogoutPage.viewAllButton.isDisplayed();
    }
    @Given("User click on the {string} button, it is tested that you go to the relevant page")
    public void userClickOnTheButtonItIsTestedThatYouGoToTheRelevantPage(String viewAll) {
        LoginLogoutPage.viewAllButton.click();
        LoginLogoutPage.shopsFoundText.isDisplayed();
    }
}
