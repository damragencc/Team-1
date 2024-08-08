package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.components.PersonalServicesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US_013_PersonalServices {

    PersonalServicesPage personalServicesPage = new PersonalServicesPage();

    @Given("Acilan menuden {string} linkinin gorunur oldugu dogrulanir")
    public void acilan_menuden_linkinin_gorunur_oldugu_dogrulanir(String personalServices) {

      Assert.assertTrue(personalServicesPage.linkPersonalServices.isDisplayed());

    }

    @Given("Acilan dropdown menuden {string} linkine tiklar.")
    public void acilan_dropdown_menuden_linkine_tiklar(String personalServices) {

        personalServicesPage.linkPersonalServices.click();

    }

    @Given("Personal Services sayfasindaki {string} ve {string} butonlarinin gorunur  ve aktif oldugu dogrulanir.")
    public void ve_service_butonlarinin_gorunur_ve_aktif_oldugu_dogrulanir(String shops, String service) {

        Assert.assertTrue(personalServicesPage.buttonShops.isDisplayed());
        Assert.assertTrue(personalServicesPage.buttonShops.isEnabled());
        Assert.assertTrue(personalServicesPage.buttonService.isDisplayed());
        Assert.assertTrue(personalServicesPage.buttonService.isEnabled());

    }

    @Given("Kullanici {string} butonununa tiklar.")
    public void butonununa_tiklar(String shops) {

        personalServicesPage.buttonShops.click();

    }
    @Given("{string} ve {string} sirketlerinin goruntulendigi dogrulanir.")
    public void ve_sirketlerinin_goruntulendigi_dogrulanir(String string, String string2) {

        Assert.assertTrue(personalServicesPage.textVitalBalance.isDisplayed());
        Assert.assertTrue(personalServicesPage.textElegantTouch.isDisplayed());

    }
    @Given("Sirket kartindaki {string} ikonunun gorunur ve aktif oldugu dogrulanır.")
    public void sirket_kartindaki_ikonunun_gorunur_ve_aktif_oldugu_dogrulanır(String visitStore) {

        Assert.assertTrue(personalServicesPage.iconVisitStoreVitalBalance.isDisplayed());
        Assert.assertTrue( personalServicesPage.iconVisitStoreVitalBalance.isEnabled());

    }
    @Given("Sirket kartindaki {string} ikonunu tiklar.")
    public void sirket_kartindaki_ikonunu_tiklar(String visitStore) {

        personalServicesPage.iconVisitStoreVitalBalance.click();

    }
    @Given("{string} ve {string} ve {string} alanlarina ve {string} card'ina erisilebildigi dogrulanir.")
    public void sirket_bilgileri_ne_ve_alanlarina_ve_card_ina_erisilebildigi_dogrulanir(String sirketBilgileri, String shopDetails, String services, String shopAvailabilitiy) {

        Assert.assertTrue(personalServicesPage.textSirketBilgisiVitalBalance.isEnabled());
        Assert.assertTrue(personalServicesPage.textShopDetailsVitalBalance.isEnabled());
        Assert.assertTrue(personalServicesPage.textServicesVitalBalance.isEnabled());
        Assert.assertTrue(personalServicesPage.textShopAvailabilityVitalBalance.isEnabled());

    }

    @Given("Kullanici {string} butonunu tiklar.")
    public void butonunu_tiklar(String service) {

        personalServicesPage.buttonService.click();
        ReusableMethods.bekle(1);

    }
    @Given("Service kartinda o hizmetin ait oldugu {string}, {string} ve {string} bilgisinin goruntulendigi dogrulanir.")
    public void service_kartinda_o_hizmetin_ait_oldugu_ve_bilgisinin_goruntulendigi_dogrulanir(String sirket, String amount, String location) {

        Assert.assertTrue(personalServicesPage.textLocation.isDisplayed());
        Assert.assertTrue(personalServicesPage.textAmount.isDisplayed());
        Assert.assertTrue(personalServicesPage.getTextSirketBilgisiVitalBalance.isDisplayed());

    }

    @Given("Herhangi bir hizmete tiklar")
    public void herhangi_bir_hizmete_tiklar() {

        personalServicesPage.linkFitnessHizmeti.click();

    }
    @Given("{string} bilgisine, {string}, {string} card'larina ve {string}, {string}, {string} ve {string} alanlarina erişilebildigi dogrulanir.")
    public void bilgisine_card_larina_ve_ve_alanlarina_erişilebildigi_dogrulanir(String amount,
             String serviceProvider, String serviceAvailability, String serviceDetails,
             String additionalServices, String reviews, String relatedServices) {

      personalServicesPage.fitnessHizmetiEnabled();

    }
    @Given("Onceki sayfaya geri donmek icin {string} butonuna tiklar.")
    public void onceki_sayfaya_geri_donmek_icin_butonuna_tiklar(String geriDon) {

        ReusableMethods.bekle(1);
        Driver.getDriver().navigate().back();

    }
    @Given("Onceki sayfa geri dondugu dogrulanir.")
    public void onceki_sayfa_geri_dondugu_dogrulanir() {

        Assert.assertTrue(personalServicesPage.linkFitnessHizmeti.isEnabled());

    }

    @Given("{string} nun gorunur ve aktif oldugu dogrulanir.")
    public void nun_gorunur_ve_aktif_oldugu_dogrulanir(String filterIcon) {

        Assert.assertTrue(personalServicesPage.filterIconPersonalService.isDisplayed());
        Assert.assertTrue(personalServicesPage.filterIconPersonalService.isEnabled());

    }
    @Given("Filter ikonuna tiklar")
    public void filter_ikonuna_tiklar() {

        personalServicesPage.filterIconPersonalService.click();
        ReusableMethods.bekle(2);

    }
    @Given("Acilan Search Form'da {string}, {string}, {string}, {string}, {string} alanlarinin oldugu ve {string} ve {string} nun gorunur oldugu dogrulanir")
    public void acilan_search_form_da_alanlarinin_oldugu_ve_ve_nun_gorunur_oldugu_dogrulanir(String location,
             String sortBy, String keyword, String categories,
             String subCategory, String priceRangeSlider, String search) {

       personalServicesPage.filterTextboxlariIsVisible();

    }
    @Given("Location alanina {string} girer.")
    public void alanina_girer(String place) {

        personalServicesPage.textboxLocation.sendKeys("Boston");


    }
    @Given("Search Butonuna tiklar.")
    public void search_butonuna_tiklar() {

        personalServicesPage.buttonSearchFilter.click();
        ReusableMethods.bekle(1);

    }
    @Given("Arama sonucunda {string} sirketinin goruntulendigi dogrulanir.")
    public void arama_sonucunda_sirketinin_goruntulendigi_dogrulanir(String companyName) {

        assertEquals("Elegant Touch", personalServicesPage.textElegantTouch.getText());

    }

    @Given("Keyword alanina {string} girer.")
    public void keyword_alanina_girer(String companyName) {

       personalServicesPage.textboxKeyword.sendKeys("Elegant");

    }

    @Given("Sub Category alanina {string} girer.")
    public void sub_category_alanina_girer(String subCategory) {

        personalServicesPage.textboxSubCategories.click();
        personalServicesPage.textboxSubCategories.sendKeys("Beauty");

    }

    @Given("Location alanina deger girer.")
    public void location_alanina_deger_girer() {

        personalServicesPage.textboxLocation.sendKeys("Massachusetts");
    }

    @Given("Keyword alanina deger girer.")
    public void keyword_alanina_deger_girer() {

        personalServicesPage.textboxKeyword.sendKeys("Hair");
    }

    @Given("Sub Category alanina deger girer.")
    public void sub_category_alanina_deger_girer() {

        personalServicesPage.textboxSubCategories.click();
        personalServicesPage.acilirOptionMenuBeauty.click();
    }

    @Given("Arama sonucunda {string} servisinin goruntulendigi dogrulanir.")
    public void arama_sonucunda_servisinin_goruntulendigi_dogrulanir(String hairCut) {

        assertEquals("Haircut",personalServicesPage.textHairCut.getText());

    }

    @Given("{string} {string} {string} {string} textboxlarina filtreleme icin degerler girer.")
    public void textboxlarina_filtreleme_icin_degerler_girer(String location,
                String sortBy, String keyword, String subCategory) {

        personalServicesPage.textboxLocation.sendKeys("Massachusetts");
        personalServicesPage.textboxSortBy.click();
        ReusableMethods.bekle(1);
        personalServicesPage.acilirOptionMenuPriceLowtoHigh.click();
        personalServicesPage.textboxSortBy.click();
        personalServicesPage.textboxKeyword.sendKeys("Hair");
        personalServicesPage.textboxSubCategories.click();
        ReusableMethods.bekle(1);
        personalServicesPage.acilirOptionMenuBeauty.click();


    }




}
