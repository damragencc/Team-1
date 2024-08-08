package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProfileSettingsPage;
import utilities.ReusableMethods;

public class US_032_ProfileSettingsStepDefinitions {
	ProfileSettingsPage profileSettingsPage;

	@Then("Verify that Profile Settings icon is visible and active")
	public void verify_that_profile_settings_icon_is_visible_and_active() {
		profileSettingsPage = new ProfileSettingsPage();

		boolean displayed = profileSettingsPage.profileSettingsLink.isDisplayed();
		boolean enabled = profileSettingsPage.profileSettingsLink.isEnabled();

		Assert.assertTrue(displayed);
		Assert.assertTrue(enabled);
	}


	@Then("Click on profile settings link at hamburger menu in dashboard page")
	public void clickOnProfileSettingsLinkAtHamburgerMenuInDashboardPage() {
		profileSettingsPage = new ProfileSettingsPage();

		profileSettingsPage.dashboardProfileSettingsLink.click();
	}

	@And("Verify name text field is filled and not changable")
	public void verifyNameTextFieldIsFilledAndNotChangable() {
		profileSettingsPage = new ProfileSettingsPage();

		String readonly = profileSettingsPage.settingsFields.get(0).getAttribute("readonly");

		Assert.assertNotNull("Error: " + readonly ,readonly);
	}

	@And("Verify name mail field is filled and not changable")
	public void verifyNameMailFieldIsFilledAndNotChangable() {
		profileSettingsPage = new ProfileSettingsPage();

		String readonly = profileSettingsPage.settingsFields.get(1).getAttribute("readonly");

		Assert.assertNotNull("Error: " + readonly ,readonly);
	}

	@And("Verify name commercial register field is fillable")
	public void verifyNameCommercialRegisterFieldIsFillable() {
		profileSettingsPage = new ProfileSettingsPage();
		ReusableMethods.scrollToElement(profileSettingsPage.commercialRegister);

		boolean enabled = profileSettingsPage.commercialRegister.isEnabled();

		Assert.assertTrue(enabled);
	}
}
