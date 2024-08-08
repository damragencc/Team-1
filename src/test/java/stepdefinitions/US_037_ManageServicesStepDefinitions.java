package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_037_ManageServicesStepDefinitions {

	ProviderServicesPage providerServicesPage;

	@Then("click on the Home Profile Icon in the header")
	public void click_on_the_home_profile_ıcon_in_the_header() {
		providerServicesPage = new ProviderServicesPage();
		providerServicesPage.userImgIcon.click();
	}

	@Then("click on dashboard link")
	public void clickOnDashboardLink() {
		providerServicesPage = new ProviderServicesPage();
		providerServicesPage.dashboardPageLink.click();
	}

	@Then("verifying that the My Service link is visible and active")
	public void verifying_that_the_link_is_visible_and_active() {
		providerServicesPage = new ProviderServicesPage();

		boolean displayed = providerServicesPage.leftSideHamburgerMenuList.get(1).isDisplayed();
		boolean enabled = providerServicesPage.leftSideHamburgerMenuList.get(1).isEnabled();

		Assert.assertTrue(displayed);
		Assert.assertTrue(enabled);
	}

	@And("click on the My Service link in header")
	public void clickOnTheMyServiceLinkInHeader() {
		providerServicesPage = new ProviderServicesPage();
		providerServicesPage.myServicesPageLink.click();
	}

	@And("verifying the page index has {string}")
	public void verifyingThePageIndexHas(String expectedPageIndexText) {
		providerServicesPage = new ProviderServicesPage();

		String actualPageIndexText = providerServicesPage.pageIndexText.getText();

		boolean isContained = actualPageIndexText.contains(expectedPageIndexText);

		Assert.assertTrue(isContained);
	}

	@And("click on the Language service item")
	public void clickOnTheLanguageServiceItem() {
		providerServicesPage = new ProviderServicesPage();

		ReusableMethods.scrollAndClickToElement(providerServicesPage.languageServiceTextLink);
	}

	@And("verifying the page name is {string}")
	public void verifyingThePageNameIs(String expectedUrl) {
		String actualUrl = Driver.getDriver().getCurrentUrl();

		Assert.assertTrue(actualUrl.contains(expectedUrl));
	}

	@And("verifying the Edit button is visible and active")
	public void verifyingTheEditButtonIsVisibleAndActive() {
		providerServicesPage = new ProviderServicesPage();

		boolean displayed = providerServicesPage.editServiceButton.isDisplayed();

		Assert.assertTrue(displayed);
	}
}
