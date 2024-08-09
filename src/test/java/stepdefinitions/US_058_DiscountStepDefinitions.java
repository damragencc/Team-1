package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProviderServicesPage;
import pages.ServiceOfferPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class US_058_DiscountStepDefinitions {

	ProviderServicesPage providerServicesPage;

	ServiceOfferPage serviceOfferPage;

	static List<String> editedList = new ArrayList<>();

	@Then("click on Service Offer History")
	public void click_on_service_offer_history() {
		providerServicesPage = new ProviderServicesPage();

		providerServicesPage.leftSideHamburgerMenuList.get(2).click();
	}
	@Then("should see the Service Offer History link active and visible")
	public void should_see_the_service_offer_history_link_active_and_visible(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);

		String actualUrl = Driver.getDriver().getCurrentUrl();
		String expectedUrl = data.get(0).get(0);

		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Then("should see a list of discounted services")
	public void should_see_a_list_of_discounted_services() {
		serviceOfferPage = new ServiceOfferPage();

		int size = serviceOfferPage.namesOfTheServicesList.size();
		if (size == 0)
			Assert.fail("Fatal: There are no services displayed!");

		for (int i = 0; i < size; i++) {
			WebElement webElement = serviceOfferPage.namesOfTheServicesList.get(i);

			Assert.assertTrue(webElement.isDisplayed());
			Assert.assertTrue(webElement.isEnabled());
		}
	}

	@When("edit valid data for {string}, {string}, {string}, {string}, and {string}")
	public void edit_valid_data_for_and(String offer,
										 String fromDate,
										 String toDate,
										 String startHour,
										 String endHour) {
		serviceOfferPage = new ServiceOfferPage();
		serviceOfferPage.getStringList(offer, fromDate, toDate, startHour, endHour, editedList);
		serviceOfferPage.performEditDiscount(offer, fromDate, toDate, startHour, endHour);
	}

	@Then("should see the updated discount information")
	public void should_see_the_updated_discount_information() {
		Driver.getDriver().navigate().refresh();
		serviceOfferPage = new ServiceOfferPage();
		List<String> actualList = serviceOfferPage.getActualStringList();

		Assert.assertEquals(editedList, actualList);
	}

	@And("edit invalid data for {string}, {string}, {string}, {string}, and {string}")
	public void editInvalidDataForAnd(String offer,
										 String fromDate,
										 String toDate,
										 String startHour,
										 String endHour) {
		serviceOfferPage = new ServiceOfferPage();
		serviceOfferPage.performEditDiscount(offer, fromDate, toDate, startHour, endHour);
	}

	@Then("verify error message is shown")
	public void verifyErrorMessageIsShown() {
		serviceOfferPage = new ServiceOfferPage();
		boolean displayed =  false;
		try {
			displayed = serviceOfferPage.editFinaliseButton.isDisplayed();
		} catch (NoSuchElementException e) {
			Assert.fail("Fatal: Error Message is not showed!");
		}
	}
}
