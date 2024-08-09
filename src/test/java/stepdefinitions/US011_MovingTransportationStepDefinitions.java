package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.components.MovingTransportationPage;
import pages.components.TestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.driver;

public class US011_MovingTransportationStepDefinitions {
    Actions actions = new Actions(Driver.getDriver());
    TestPage testPage=new TestPage();
    MovingTransportationPage movingTransportationPage=new MovingTransportationPage();

    //TC01
    @Given("Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linki gorunur olmalidir.")
    public void anasayfa_header_bolumunde_categories_drop_down_menu_altindaki_moving_transportation_linki_gorunur_olmalidir() {
        actions.moveToElement(movingTransportationPage.categoriesLinki).perform();
        assertTrue(movingTransportationPage.movingTransportationLinki.isDisplayed());
    }
    //TC02
    @Given("Anasayfa header bolumunde Categories drop down menu altindaki Moving & Transportation linkine tiklanir.")
    public void anasayfa_header_bolumunde_categories_drop_down_menu_altindaki_moving_transportation_linkine_tiklanir() {
        actions.moveToElement(movingTransportationPage.categoriesLinki).perform();
        movingTransportationPage.movingTransportationLinki.click();
    }
    @Given("Moving & Transportation linkinde bulunan Shops ve Service butonlari gorunur ve aktif olmalidir.")
    public void moving_transportation_linkinde_bulunan_shops_ve_service_butonlari_gorunur_ve_aktif_olmalidir() {
        assertTrue(testPage.shopsButonu.isDisplayed());
        assertTrue(testPage.homeServicesServicesButonu.isDisplayed());
    }
    @Given("Shops butonuna tiklandiginda Shops Found yazisi gorunur olmalidir.")
    public void shops_butonuna_tiklandiginda_shops_found_yazisi_gorunur_olmalidir() {
        testPage.shopsFoundYazisi.click();
        assertTrue(testPage.shopsFoundYazisi.isDisplayed());
    }
    @Given("Service butonuna tiklandiginda Services Found yazisi gorunur olmalidir.")
    public void service_butonuna_tiklandiginda_services_found_yazisi_gorunur_olmalidir() {
        testPage.homeServicesServicesButonu.click();
        assertTrue(testPage.servicesFoundYazisi.isDisplayed());
    }
    @Given("Shops kartinda Visit Store ikonu gorunur ve aktif olmalidir.")
    public void shops_kartinda_visit_store_ikonu_gorunur_ve_aktif_olmalidir() {
        assertTrue(movingTransportationPage.visitStoreLinki.isDisplayed());
    }
    @Given("Horizon Movers sirketine Visit Store linkine tiklanarak sirket ayrintilarina ulasilmalidir.")
    public void horizon_movers_sirketine_visit_store_linkine_tiklanarak_sirket_ayrintilarina_ulasilmalidir() {
        movingTransportationPage.visitStoreLinki.click();
    }
    @Given("Acilan sirket sayfasinda Shop Details ve Services alanlarina ve Shop Availability card'ina erisilebilmelidir.")
    public void acilan_sirket_sayfasinda_shop_details_ve_services_alanlarina_ve_shop_availability_card_ina_erisilebilmelidir() {
        assertTrue(movingTransportationPage.shopDetailsYazisi.isDisplayed());
        assertTrue(movingTransportationPage.servicesYazisi.isDisplayed());
        assertTrue(movingTransportationPage.shopAvailabilityYazisi.isDisplayed());
    }
    //TC04
    @Given("Acilan sayfada Service butonuna tiklanabilmelidir.")
    public void acilan_sayfada_service_butonuna_tiklanabilmelidir() {
        movingTransportationPage.serviceButonu.click();
    }
    @Given("Hizmet kartinda o hizmetin ait oldugu sirket, amount bilgisi ve location bilgisi goruntulenmelidir.")
    public void hizmet_kartinda_o_hizmetin_ait_oldugu_sirket_amount_bilgisi_ve_location_bilgisi_goruntulenmelidir() {
        assertTrue(movingTransportationPage.localMovingYazisi.isDisplayed());
        assertTrue(movingTransportationPage.amountYazisi.isDisplayed());
        assertTrue(movingTransportationPage.locationYazisi.isDisplayed());
    }
    //TC05
    @Given("Local Moving hizmetine tiklanildiginda o hizmet sayfasina gidilmeli ve amount bilgisine, Service Provider, Service Availability card'larina ve Service Details, Additional Services, Reviews ve Related Services alanlarina erisilebilmelidir.")
    public void local_moving_hizmetine_tiklanildiginda_o_hizmet_sayfasina_gidilmeli_ve_amount_bilgisine_service_provider_service_availability_card_larina_ve_service_details_additional_services_reviews_ve_related_services_alanlarina_erisilebilmelidir() {
        movingTransportationPage.localMovingYazisi.click();
        assertTrue(movingTransportationPage.amountYazisi.isDisplayed());
        assertTrue(movingTransportationPage.serviceProviderYazisi.isDisplayed());
        assertTrue(movingTransportationPage.serviceAvailabilityYazisi.isDisplayed());
        assertTrue(movingTransportationPage.serviceDetailsYazisi.isDisplayed());
        assertTrue(movingTransportationPage.additionalServicesYazisi.isDisplayed());
        assertTrue(movingTransportationPage.reviewsYazisi.isDisplayed());
        assertTrue(movingTransportationPage.relatedServicesYazisi.isDisplayed());

    }
    //TC06
    @Given("Shops butonuna tiklanilip acilan sayfada bulunan filter iconu gorunur ve aktif olmalidir.")
    public void shops_butonuna_tiklanilip_acilan_sayfada_bulunan_filter_iconu_gorunur_ve_aktif_olmalidir() {
        movingTransportationPage.shopsButonu.click();
        assertTrue(movingTransportationPage.filterButonu.isDisplayed());
    }
    @Given("Acilan filter kisminda Search butonunun gorundugu dogrulanmalidir.")
    public void acilan_filter_kisminda_search_butonunun_gorundugu_dogrulanmalidir() {
        movingTransportationPage.filterButonu.click();
        ReusableMethods.wait(1);
        assertTrue(movingTransportationPage.searchButonu.isDisplayed());
    }
    @Given("Service butonuna tiklanilip acilan sayfada bulunan filter iconu gorunur ve aktif olmalidir.")
    public void service_butonuna_tiklanilip_acilan_sayfada_bulunan_filter_iconu_gorunur_ve_aktif_olmalidir() {
        movingTransportationPage.serviceButonu.click();
        assertTrue(movingTransportationPage.filterButonu.isDisplayed());
        assertTrue(movingTransportationPage.searchButonu.isDisplayed());
    }
    //T07
    @Given("Shops butonuna tiklanilip acilan sayfada bulunan Search form'da Location, Sort By, Keyword, Categories, Sub Category ve Price Range slider'i olmalidir.")
    public void shops_butonuna_tiklanilip_acilan_sayfada_bulunan_search_form_da_location_sort_by_keyword_categories_sub_category_ve_price_range_slider_i_olmalidir() {
        movingTransportationPage.filterButonu.click();
        movingTransportationPage.shopsButonu.click();
        ReusableMethods.wait(1);
        List<WebElement> searchElements = movingTransportationPage.getSearchElements();
        Assert.assertEquals(7, searchElements.size());

    }
    @Given("Service butonuna tiklanilip acilan sayfada bulunan Search form'da Location, Sort By, Keyword, Categories, Sub Category ve Price Range slider'i olmalidir.")
    public void service_butonuna_tiklanilip_acilan_sayfada_bulunan_search_form_da_location_sort_by_keyword_categories_sub_category_ve_price_range_slider_i_olmalidir() {
        movingTransportationPage.filterButonu.click();
        movingTransportationPage.filterButonu.click();
        movingTransportationPage.serviceButonu.click();
        ReusableMethods.wait(1);
        List<WebElement> searchElements = movingTransportationPage.getSearchElements();
        Assert.assertEquals(7, searchElements.size());
    }
    @Given("Shops butonuna tiklanilip acilan sayfada bulunan Search form'da Search butonu gorunur ve aktif olmalidir.")
    public void shops_butonuna_tiklanilip_acilan_sayfada_bulunan_search_form_da_search_butonu_gorunur_ve_aktif_olmalidir() {
        movingTransportationPage.shopsButonu.click();
        movingTransportationPage.filterButonu.click();
        ReusableMethods.wait(1);
        assertTrue(movingTransportationPage.searchButonu.isDisplayed());
    }
    @Given("Service butonuna tiklanilip acilan sayfada bulunan Search form'da Search butonu gorunur ve aktif olmalidir.")
    public void service_butonuna_tiklanilip_acilan_sayfada_bulunan_search_form_da_search_butonu_gorunur_ve_aktif_olmalidir() {
        movingTransportationPage.serviceButonu.click();
        movingTransportationPage.filterButonu.click();
        movingTransportationPage.filterButonu.click();
        ReusableMethods.wait(1);
        assertTrue(movingTransportationPage.searchButonu.isDisplayed());
    }
    @Given("Shops butonuna tiklanilip acilan sayfada bulunan Search formuna Keyword olarak Horizon yazilarak cikan sonuc Horizon Movers sirketi oldugu teyit edilir.")
    public void shops_butonuna_tiklanilip_acilan_sayfada_bulunan_search_formuna_keyword_olarak_horizon_yazilarak_cikan_sonuc_horizon_movers_sirketi_oldugu_teyit_edilir() {
        movingTransportationPage.shopsButonu.click();
        movingTransportationPage.filterButonu.click();
        ReusableMethods.wait(1);
        movingTransportationPage.keywordKutusu.click();
        actions.sendKeys("Horizon").perform();
        movingTransportationPage.searchButonu.click();
        assertTrue(movingTransportationPage.horizonMoversYazisi.isDisplayed());
    }
    @Given("Service butonuna tiklanilip acilan sayfada bulunan Search formuna Keyword olarak Local yazilarak cikan sonuc Local Moving sirketi oldugu teyit edilir.")
    public void service_butonuna_tiklanilip_acilan_sayfada_bulunan_search_formuna_keyword_olarak_local_yazilarak_cikan_sonuc_local_moving_sirketi_oldugu_teyit_edilir() {
        movingTransportationPage.serviceButonu.click();
        movingTransportationPage.filterButonu.click();
        movingTransportationPage.filterButonu.click();
        ReusableMethods.wait(1);
        movingTransportationPage.keywordKutusu.click();
        for (int i = 0; i < 7; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        actions.sendKeys("Local").perform();
        movingTransportationPage.searchButonu.click();
        assertTrue(movingTransportationPage.localMovingSirketiYazisi.isDisplayed());

    }
}

