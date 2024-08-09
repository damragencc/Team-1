package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProfileSettingsPage;
import pages.ProviderServicesPage;
import utilities.ReusableMethods;

import java.util.List;

public class US_032_ProfileSettingsStepDefinitions {
	ProfileSettingsPage profileSettingsPage;

	ProviderServicesPage providerServicesPage;

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
	@Then("Asagidaki bilgilerle kullanicinin bilgilerini update edin")
	public void asagidaki_bilgilerle_kullanicinin_bilgilerini_update_edin(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		providerServicesPage = new ProviderServicesPage();

		providerServicesPage.performUpdateSettingsOnProvider(
				data.get(0).get(0),
				data.get(0).get(1),
				data.get(0).get(2),
				data.get(0).get(3));
	}
	@Then("Basarili bir sekilde bilgilerin update edildigini dogrulayin")
	public void basarili_bir_sekilde_bilgilerin_update_edildigini_dogrulayin() {
		providerServicesPage = new ProviderServicesPage();

		boolean displayed = providerServicesPage.succesMessage.isDisplayed();
		ReusableMethods.wait(3);
		Assert.assertTrue(displayed);
	}

	@Then("Profile Settings linkine tiklayin")
	public void profileSettingsLinkineTiklayin() {
		providerServicesPage = new ProviderServicesPage();
		ReusableMethods.wait(1);
		providerServicesPage.profileSettingsLinkOnHomePage.click();
	}
}
