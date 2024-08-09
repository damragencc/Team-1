package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PageBecomeProfessional;
import pages.ProviderServicesPage;
import utilities.ReusableMethods;

import java.util.List;

public class US000_RegisterStepDefinitions {

	PageBecomeProfessional pageBecomeProfessional;
	ProviderServicesPage providerServicesPage;

	@Then("Anasayfa header bolumunde bulunan Become A Professional linkine tiklayin")
	public void anasayfa_header_bolumunde_bulunan_become_a_professional_linkine_tiklayin() {
		pageBecomeProfessional = new PageBecomeProfessional();
		ReusableMethods.wait(3);

		pageBecomeProfessional.linkBecomeProfessional.click();

	}
	@Then("Acilan Join As A Professional formunda yer alan bolumlere gecerli verileri girerek kayıt olun")
	public void acilan_join_as_a_professional_formunda_yer_alan_bolumlere_gecerli_verileri_girerek_kayıt_olun(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);

		pageBecomeProfessional = new PageBecomeProfessional();

		pageBecomeProfessional.becomeProfessional(
				data.get(0).get(0),
				data.get(0).get(1),
				data.get(0).get(2),
				data.get(0).get(3));
	}
	@Then("Basarili bir sekilde kayit olunabildigini dogrulayin")
	public void basarili_bir_sekilde_kayit_olunabildigini_dogrulayin() {
		pageBecomeProfessional = new PageBecomeProfessional();
		providerServicesPage = new ProviderServicesPage();

		boolean displayed = providerServicesPage.userImgIcon.isDisplayed();
		ReusableMethods.wait(4);
		Assert.assertTrue(displayed);
	}

}
