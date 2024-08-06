package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.event.KeyEvent;

public  class US014_UserEvHizmetleriVeSirketleriStepDefinitions  {

    Actions actions=new Actions(Driver.getDriver());
    HeaderComp headerComp=new HeaderComp();
    RegisterPage registerPage=new RegisterPage();
    TestPage testPage=new TestPage();



    @Given("Anasayfa header bölümünde bulunan {string} bolumunu görüntüler")
    public void anasayfa_header_bölümünde_bulunan_categories_bolumunu_görüntüler(String categories) {

         headerComp.categoriesButton.isDisplayed();

    }
    @Given("{string} bolumune tıklar")
    public void categories_bolumune_tıklar(String categories) throws InterruptedException {
         actions.moveToElement(headerComp.categoriesButton).perform();
         registerPage.beklemeSuresi();

    }
    @Given("Acılan dropdown menude {string} bolumunu goruntuler")
    public void acılan_dropdown_menude_home_services_bolumunu_goruntuler(String homeService) throws InterruptedException {

        headerComp.categoriesHomeServisButton.isDisplayed();

        registerPage.beklemeSuresi();



    }
    @Given("{string} bolumune tiklar")
    public void home_services_bolumune_tiklar(String homeService) {
          headerComp.categoriesHomeServisButton.click();
    }


    @Given("{string} butonları goruntulenir ve aktif oldugunu dogrular")
    public void shops_ve_service_butonları_goruntulenir_ve_aktif_oldugunu_dogrular(String shopsVeService) {

          Assert.assertTrue(testPage.shopsButonu.isDisplayed());
          Assert.assertTrue(testPage.shopsButonu.isEnabled());

    }
    @Given("{string} butonuna tıklar")
    public void shops_butonuna_tıklar(String shops) {
           testPage.shopsButonu.click();
    }
    @Given("{string},{string},{string}, {string} sirketlerini goruntuler")
    public void aqua_shield_plumbing_volt_master_solutions_sun_painting_serene_home_cleaning_sirketlerini_goruntuler(String aquaShield,String voltMaster,String sunPainting,String serenaHome) {

            testPage.homeServiceShops();

    }
    @Given("Sirket kartlarında bulunan {string} ikonunu görüntüleyebilmeli ve aktif oldugunu dogrulayabilmeli.")
    public void sirket_kartlarında_bulunan_visit_store_ikonunu_görüntüleyebilmeli_ve_aktif_oldugunu_dogrulayabilmeli(String visitStore) {


             testPage.shopsVisitStoreButonları();
    }



    @Given("{string} şirketine tiklar")
    public void aqua_shield_plumbing_şirketine_tiklar(String aquaShield) throws InterruptedException {
             testPage.shopsAquaShieldPlumbing.click();
             registerPage.beklemeSuresi();
    }


    @Given("Acilen sayfa’da {string}, {string}, {string} card’ini goruntuler")
    public void acilen_sayfa_da_shop_details_services_ve_shop_availability_card_ini_goruntuler(String shopDetails,String servicesShop,String availability) {
              testPage.aquaShieldPlumbingTextleri();
    }


    @Given("Sag ust kosede bulunan {string} butonuna tiklar")
    public void sag_ust_kosede_bulunan_services_butonuna_tiklar(String threeService) {
             Assert.assertTrue(testPage.threeServicesButonu.isEnabled());
              testPage.threeServicesButonu.click();
    }


    @Given("{string}, {string}, {string} servislerini goruntuler")
    public void leak_detection_pipe_repair_drain_cleaning_servislerini_goruntuler(String leakDetection,String pipeReapir,String drainCleaning) {
        testPage.aquaShieldPlumbingServiceCesitleri();
    }


    @Given("Hizmet kartlarında bulunan {string} bilgisi ve {string} bilgisini görüntüler")
    public void hizmet_kartlarında_bulunan_bilgisi_ve_bilgisini_görüntüler(String amounts, String locations) {
                testPage.aquaShieldPlumbingServiceAmountsveLocations();
    }


    @Given("{string} hizmetine tıklar")
    public void leak_detection_hizmetine_tıklar(String leakDetection) {

        ReusableMethods.bekle(2);
      testPage.serviceLeakDetection.click();
    }


    @Given("Acılan sayfa’da hizmete ait {string},{string},{string},{string},{string},{string} ve {string} alanlarini goruntuler")
    public void acılan_sayfa_da_hizmete_ait_amount_service_provider_service_availability_service_details_additional_services_reviews_ve_related_services_alanlarini_goruntuler(String amount,String serviceProiver,String availability,String details,String additional,String reviews,String relatedService) {
       testPage.leakDetectionServiceTexts();
    }



    @Given("{string} butonuna tıklarr")
    public void shops_butonuna_tıklarr(String shops) throws InterruptedException {

        actions.moveToElement(headerComp.shopsButton).perform();
        registerPage.beklemeSuresi();

    }



    @Given("Acilan dropdown menude  {string} tiklar")
    public void acilan_dropdown_menude_shops_services_tiklar(String shopsService) throws InterruptedException {
        headerComp.shopsMenuShopsService.click();
        registerPage.beklemeSuresi();
    }

    @Then("{string} iconunu goruntuler ve aktif oldugunu dogrular")
    public void filter_iconunu_goruntuler_ve_aktif_oldugunu_dogrular(String filter) {

        Assert.assertTrue(testPage.filterIconu.isDisplayed());
        Assert.assertTrue(testPage.filterIconu.isEnabled());
    }
    @When("{string} iconuna tıklar")
    public void filter_iconuna_tıklar(String filter) {

        testPage.filterIconu.click();
    }
    @When("Shops butonuna tıklar")
    public void shops_butonuna_tıklar() {
        testPage.shopsButonu.click();

    }
    @Then("Acilan sayfa’a bulunan search formundaki alanlar\\({string},{string},{string},{string},{string},{string}) ve {string} butonu görüntüler")
    public void acilan_sayfa_a_bulunan_search_formundaki_alanlar_location_sort_by_keyword_categories_sub_category_price_range_ve_search_butonu_görüntüler(String location,String sortBy,String keyword,String categories,String subCategories,String priceRange,String search) {
            testPage.filterFormTextleri();
    }
    @Then("{string} butonunun aktif olugunu dogrular")
    public void search_butonunun_aktif_olugunu_dogrular(String search) {

        Assert.assertTrue(testPage.searchButonu.isEnabled());

}

    @When("{string}'da {string},{string},{string},{string},{string},{string} bilgilerini girer")
    public void da_sort_by_keyword_price_range_bilgilerini_girer(String form, String location, String sortBy,String keyword, String Categories,String subCategory,String priceRange) throws InterruptedException {

             testPage.filterLocationTextBox.click();
             testPage.filterLocationTextBox.sendKeys(ConfigReader.getProperty(location));
             testPage.filterSortByTextBox.click();
             testPage.sortByDropDownMenuPriceLowToHigh.click();
             registerPage.beklemeSuresi();
             testPage.filterKeywordtextBox.sendKeys(ConfigReader.getProperty(keyword));

             testPage.filterSubCategoryTextBox.click();

         actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();



          registerPage.beklemeSuresi();

    }

    }