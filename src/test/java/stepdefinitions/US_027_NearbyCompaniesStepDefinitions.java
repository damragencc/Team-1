package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.chromium.HasCdp;
import pages.NearestShopsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class US_027_NearbyCompaniesStepDefinitions {

	NearestShopsPage nearestShopsPage;
	String companyText;

	@Given("Go to {string} url")
	public void go_to_url(String url) {
		Driver.getDriver().get(ConfigReader.getProperty(url));
	}
	@When("Select location as {string} lat, {string} long")
	public void select_location_as(String lat, String log) {
		nearestShopsPage = new NearestShopsPage();
		((HasCdp) Driver.getDriver())
				.executeCdpCommand("Emulation.setGeolocationOverride",
						nearestShopsPage.parseCordinates(lat, log));

		Driver.getDriver().navigate().refresh();
	}
	@Then("Verify {string} is visible")
	public void verify_nearest_shop_locations_is_visible(String expectedText) {
		nearestShopsPage = new NearestShopsPage();
		ReusableMethods.scrollToElement(nearestShopsPage.getNearestShopSubText);
		String actualText = nearestShopsPage.nearestShopText.getText();
		ReusableMethods.wait(5);
		Assert.assertEquals(expectedText, actualText);
	}
	@Then("Close driver")
	public void close_driver() {
		Driver.quitDriver();
	}

	@Then("Scroll down to Nearest Shop")
	public void scrollDownToNearestShop() {
		nearestShopsPage = new NearestShopsPage();
		ReusableMethods.scrollToElement(nearestShopsPage.viewAllPageButton);
	}

	@Then("Company Name {string} is visible and active")
	public void company_name_is_visible_and_active(String companyName) {
		companyText = companyName;
		nearestShopsPage = new NearestShopsPage();

		int index = nearestShopsPage.getIndexOfStore(companyName);
		if (index == -1)
			Assert.fail("Fatal: Company Name Invalid, test case failed!");

		boolean displayed = nearestShopsPage.sliderShopDetailsList.get(index).isDisplayed();
		boolean enabled = nearestShopsPage.sliderShopDetailsList.get(index).isEnabled();

		Assert.assertTrue(companyName + " is not displayed!" ,displayed);
		Assert.assertTrue(companyName + " is not enabled!" ,enabled);
	}
	@Then("Location information {string} is visible and active")
	public void location_information_is_visible_and_active(String location) {
		int index = nearestShopsPage.getIndexOfStore(companyText);
		if (index == -1)
			Assert.fail("Fatal: Company Name Invalid, test case failed!");

		boolean enabled = nearestShopsPage.sliderShopLocationList.get(index).isEnabled();
		boolean displayed = nearestShopsPage.sliderShopLocationList.get(index).isDisplayed();

		Assert.assertTrue(companyText + " is not displayed!" ,displayed);
		Assert.assertTrue(companyText + " is not enabled!" ,enabled);
	}
	@Then("Visit Store Button is visible and active")
	public void visit_store_button_is_visible_and_active() {
		int index = nearestShopsPage.getIndexOfStore(companyText);
		if (index == -1)
			Assert.fail("Fatal: Company Name Invalid, test case failed!");

		boolean enabled = nearestShopsPage.sliderShopVisitStoreList.get(index).isEnabled();
		boolean displayed = nearestShopsPage.sliderShopVisitStoreList.get(index).isDisplayed();

		Assert.assertTrue(companyText + " is not displayed!" ,displayed);
		Assert.assertTrue(companyText + " is not enabled!" ,enabled);
	}

	@And("Click visit store button on {string}")
	public void clickVisitStoreButtonOn(String storeName) {
		int index = nearestShopsPage.getIndexOfStore(storeName);
		if (index == -1)
			Assert.fail("Fatal: Company Name Invalid, test case failed!");
		nearestShopsPage.sliderShopVisitStoreList.get(index).click();
	}

	@Then("Verify that you are on {string}")
	public void verifyThatYouAreOn(String urlPart) {
		String actualUrl = Driver.getDriver().getCurrentUrl();
		ReusableMethods.wait(1);
		boolean contains = actualUrl.contains(urlPart);

		Assert.assertTrue(contains);
	}

	@Then("View All Button is visible and active")
	public void view_all_button_is_visible_and_active() {
		nearestShopsPage = new NearestShopsPage();

		ReusableMethods.scrollToElement(nearestShopsPage.viewAllPageButton);

		boolean enabled = nearestShopsPage.viewAllPageButton.isEnabled();
		boolean displayed = nearestShopsPage.viewAllPageButton.isDisplayed();

		Assert.assertTrue("Not Enabled!" ,enabled);
		Assert.assertTrue("Not Visible!", displayed);
	}

	@And("Click on view all button")
	public void clickOnViewAllButton() {
		ReusableMethods.scrollAndClickToElement(nearestShopsPage.viewAllPageButton);
		ReusableMethods.wait(2);
	}

	@Then("Verify that you are on relevant url")
	public void verify_that_you_are_on_relevant_url(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);

		String expectedUrl = data.get(0).get(0);
		String actualUrl = Driver.getDriver().getCurrentUrl();

		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Then("Verify that there are shops available in relevant page")
	public void verifyThatThereAreShopsAvailableInRelevantPage() {
		String text = nearestShopsPage.shopCountSize.getText();

		int actualSizeOfTheShops = Integer.parseInt(text);

		Assert.assertTrue("Failed, size: " + text, actualSizeOfTheShops > 0);
	}
}
