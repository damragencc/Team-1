
package pages.components;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class TestPage {

    public WebElement firstServiceInNextList;

    public TestPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public List<WebElement> getServiceLinks() {
        return serviceLinks;
    }
    public void clickAllServicesAndVerify() {
    }

    @FindBy (xpath = "//*[@class='fas fa-users']")
    public WebElement staffLinki; // Provider Dashboard sayfası Staff Linki

    @FindBy (xpath = "//*[@class='widget-title']")
    public WebElement myStaffYazisi;

    @FindBy (xpath = "//h2[text()='Most Popular Shops']")
    public WebElement mostPopularShopsYazisi; // Anasayfa Most Pupular Shops yazısı

    @FindBy (xpath = "(//*[text()='Gourmet Affairs Catering '])[4]")
    public WebElement gourmetAffairsCateringYazisi;  // Anasayfa Most Pupular Shops Gourmet Affairs Catering şirketi ismi

    @FindBy (xpath = "(//*[text()='Houston, Texas'])[1]")
    public WebElement houstonTexasKonumYazisi;   //Anasayfa Most Pupular Shops  Gourmet Affairs Catering konum yazısı

    @FindBy (xpath = "(//*[text()='Visit Store '])[11]")
    public WebElement gourmetAffairsCateringVisitStoreIkonu;  // Anasayfa Most Pupular Shops Gourmet Affairs Catering şirketi Visit Store ikonu

    @FindBy (xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsYazisi;  // Gourmet Affairs Catering firması sayfasındaki Shop Details yazısı

    @FindBy (xpath = "(//*[@class='btn btn-viewall'])[3]")
    public WebElement mostPopularShopsViewallButonu;  // Anasayfa Most Pupular Shops Viewall ikonu

    @FindBy (xpath = "//*[text()=' Shops Found']")
    public WebElement shopsFoundYazisi;  // All shops kısmında toplam shops sayısını ifade eden yazi

    @FindBy (xpath = "//*[@id=\"category-slider\"]/div[1]/div/div[1]/div/div/div[2]/a/span")
    public WebElement homeServicesLinki;  //  Anasayfa slider'da bulunan Home Services linki

    @FindBy (id = "shops-tab")
    public WebElement homeServicesShopsButonu;  // Home Services sayfasındaki Shops butonu

    @FindBy (id = "services-tab")
    public WebElement homeServicesServicesButonu;  // Home Services sayfasındaki Services butonu

    @FindBy (xpath = "//*[text()=' Services Found']")
    public WebElement servicesFoundYazisi;  // Home Services sayfasındaki toplam services sayısını ifade eden yazi

    @FindBy (xpath = "//*[@class='btn filter-btn']")
    public WebElement filterButonu; //  Home Services sayfasındaki filter butonu

    @FindBy (xpath = "//*[@class='btn btn btn-search btn-block get_services']")
    public WebElement searchButonu;  // Home Services sayfasındaki filter butonuna basıldığında görünen Search butonu

    @FindBy(xpath = "//a[contains(@href, '/services') and contains(text(), 'Service')]/..")
    public List<WebElement> serviceLinks;

    @FindBy (xpath = "//*[@class='arrow']")
    public WebElement ilerlemeButonu;  //Home Services sayfasındaki ilerleme butonu

    @FindBy (xpath = "(//*[text()='Visit Store '])[3]")
    public WebElement aquaShieldPlumbingVisitStoreIkonu; //AquaShield Plumbing Visit Store Ikonu

    @FindBy (xpath = "//*[text()='Shop Availability']")
    public WebElement shopAvailabilityYazisi; // AquaShield Plumbing Shop Availability yazisi

    @FindBy (xpath = "//*[text()='Services']")
    public WebElement servicesYazisi; // AquaShield Plumbing Services yazisi

    @FindBy (xpath = "//*[text()='Necmiye Melike ADIGÜZEL']")
    public WebElement personelMelikeAdiguzelYazisi; // Provider Dashboard Melike Adıgüzel yazısı

    @FindBy (xpath = "(//*[@class='far fa-edit'])[2]")
    public WebElement staffEditIconu;  // Provider Dashboard Staff Edit ikonu

    @FindBy (id = "mobileno")
    public WebElement mobileNoKutusu; // Provider Dashboard Staff Edit mobile no kutusu

    @FindBy (id = "next")
    public WebElement nextButonu; //Provider Dashboard Staff Edit sayfası next butonu

    @FindBy (id = "addstaff_submit")
    public WebElement submitButonu; // Provider Dashboard Staff Edit sayfası submit butonu

    @FindBy (xpath = "(//*[text()='Staff Details Updated successfully'])[2]")
    public WebElement staffDetailsUpdatedSuccessfullyYazisi; // Provider Dashboard Staff Edit sayfası Staff Details Updated successfully yazısı

    @FindBy (xpath = "(//*[@class='far fa-eye'])[2]")
    public WebElement stafDetailsIconu; //Provider Dashboard 2. sıradaki Staff details ikonu

    @FindBy (xpath = "nav-link active")
    public WebElement overviewButonu; //Provider Dashboard Staff Details sayfası overview butonu

    @FindBy (xpath = "//*[@class='btn btn-primary text-white']")
    public WebElement addStaffButonu; //Provider Dashboard Staff sayfası Add Staff butonu

    @FindBy (xpath = "//*[text()='Basic Information']")
    public WebElement basicInformationYazisi; //Provider Dashboard Staff sayfası Add Staff butonu

    @FindBy (xpath = "//*[@class='far fa-calendar-alt']")
    public WebElement invoicesLinki; // Kayıtlı kullanıcı dashboard invoice linki
    
    @FindBy(xpath = "//*[@id='shops-tab']")
    public WebElement shopsButonu;

    @FindBy(xpath = "//*[text()='AquaShield Plumbing']")          //HomeService-Shops-AquSield
    public WebElement shopsAquaShieldPlumbing;

    @FindBy(xpath = "//*[text()='VoltMaster Solutions']")         //HomeService-Shops-Volt Master
    public WebElement shopVoltMasterSolutions;

    @FindBy(xpath = "//*[text()='Sun Painting']")                 //HomeService-Shops-Sun Painting
    public WebElement shopsSunPainting;

    @FindBy(xpath = "//*[text()='Serene Home Cleaning']")         //HomeService-Shops-Serene Home Cleaning
    public WebElement shopsSereneHomeCleaning;

    @FindBy(xpath = "(//*[text()='Visit Store '])[3]")             //HomeService-Shops-AquSield-Visit
    public  WebElement aquShieldVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[4]")             //HomeService-Shops-Volt Master-Visit
    public  WebElement volMasterdVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[5]")              //HomeService-Shops-Sun Painting
    public  WebElement sunPaintingVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[6]")               //HomeService-Shops-Serene Home Cleaning-Visit
    public  WebElement sereneHomeVisitButonu;

    @FindBy(xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsText;

    @FindBy(xpath = "//*[text()='Services']")
    public WebElement servicesText;

    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement shopAvailabilityText;

    @FindBy(xpath = "//*[text()='3 Services']")
    public WebElement threeServicesButonu;


    @FindBy(xpath = "//*[text()='Leak Detection']")
    public WebElement serviceLeakDetection;

    @FindBy(xpath = "//*[text()='Pipe Repair']")
    public WebElement servicePipeRepair;

    @FindBy(xpath = "//*[text()='Drain Cleaning']")
    public WebElement serviceDrainCleaning;

    @FindBy(xpath = "//*[text()='$300']")
    public WebElement leakDetectionAmount;

    @FindBy(xpath = "//*[text()='$450']")
    public WebElement pipeRepairAmount;

    @FindBy(xpath = "//*[text()='$400']")
    public WebElement drainCleaningAmount;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[1]")
    public WebElement leakDetectionLocation;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[2]")
    public WebElement pipeRepairLocation;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[3]")
    public WebElement drainCleaningLocation;


    @FindBy(xpath = "//*[text()='Service Details']")
    public WebElement leakDetectionServiceDetailsText;

    @FindBy(xpath = "//*[text()='$300']")
    public WebElement leakDetectionServiceAmountText;

    @FindBy(xpath = "//*[text()='Service Provider']")
    public WebElement leakDetectionServiceProviderText;

    @FindBy(xpath = "//*[text()='Service Availability']")
    public WebElement leakDetectionServiceAvailabilityText;

    @FindBy(xpath = "//*[text()='Additional Services']")
    public WebElement leakDetectionAdditionalServicesText;


    @FindBy(xpath = "//*[text()='Related Services']")
    public WebElement leakDetectionRelatedServicesText;


    //Filter iconu Form Bilgileri Text Bilgileri


    @FindBy(xpath = "//*[@id='filter_search']")
    public WebElement filterIconu;

    @FindBy(xpath = "//*[text()='Location']")
    public WebElement filterLocationText;

    @FindBy(xpath = "//*[text()='Sort By']")
    public WebElement filterSortByText;

    @FindBy(xpath = "//*[text()='Keyword']")
    public WebElement filterKeywordText;

    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement filterCategoriesText;

    @FindBy(xpath = "//*[text()='Sub Category']")
    public WebElement filterSubCategoryText;

    @FindBy(xpath = "//*[text()='Price Range']")
    public WebElement filterPriceRangeText;


    //Filter iconu Form Bilgileri TextBox Bilgileri




    @FindBy(xpath = "(//*[@id='service_location'])[1]")
    public WebElement filterLocationTextBox;

    @FindBy(xpath = "(//*[text()='Sort By'])[3]")
    public WebElement filterSortByTextBox;

    @FindBy(xpath = "//*[@id='common_search']")
    public WebElement filterKeywordtextBox;

    @FindBy(xpath = "(//*[text()='All Categories'])[2]")
    public WebElement filterAllCategoriesTextBox;

    @FindBy(id = "select2-subcategories-container")
    public WebElement filterSubCategoryTextBox;


    @FindBy(xpath = "//*[text()='Search']")
    public WebElement searchButonu;





    @FindBy(xpath = "//*[@id='filter_search']")
    public WebElement filterIconu;

    @FindBy(xpath = "//*[text()='Location']")
    public WebElement filterLocation;

    @FindBy(xpath = "//*[text()='Sort By']")
    public WebElement filterSortBy;

    @FindBy(xpath = "//*[text()='Keyword']")
    public WebElement filterKeyword;

    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement filterCategories;

    @FindBy(xpath = "//*[text()='Sub Category']")
    public WebElement filterSubCategory;

    @FindBy(xpath = "//*[text()='Price Range']")
    public WebElement filterPriceRange;


    //Filter iconu Form Bilgileri TextBox Bilgileri




    @FindBy(xpath = "(//*[@id='service_location'])[1]")
    public WebElement filterLocationTextBox;

    @FindBy(xpath = "(//*[text()='Sort By'])[3]")
    public WebElement filterSortByTextBox;

    @FindBy(xpath = "//*[@id='common_search']")
    public WebElement filterKeywordtextBox;

    @FindBy(xpath = "(//*[text()='All Categories'])[2]")
    public WebElement filterAllCategoriesTextBox;

    @FindBy(id = "select2-subcategories-container")
    public WebElement filterSubCategoryTextBox;







public void filterFormTextleri(){

      filterLocationText.isDisplayed();
    filterSortByText.isDisplayed();
    filterKeywordText.isDisplayed();
    filterCategoriesText.isDisplayed();
    filterSubCategoryText.isDisplayed();
    filterPriceRangeText.isDisplayed();




}


































    //Methods

  public void leakDetectionServiceTexts(){


      Assert.assertTrue(leakDetectionAdditionalServicesText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceAmountText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceAvailabilityText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceProviderText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceDetailsText.isDisplayed());

  }


  public void aquaShieldPlumbingServiceAmountsveLocations(){

      Assert.assertTrue(leakDetectionAmount.isDisplayed());
      Assert.assertTrue(pipeRepairAmount.isDisplayed());
      Assert.assertTrue(drainCleaningAmount.isDisplayed());

      Assert.assertTrue(leakDetectionLocation.isDisplayed());
      Assert.assertTrue(pipeRepairLocation.isDisplayed());
      Assert.assertTrue(drainCleaningLocation.isDisplayed());

  }

  public void aquaShieldPlumbingServiceCesitleri(){

      Assert.assertTrue(serviceLeakDetection.isDisplayed());
      Assert.assertTrue(servicePipeRepair.isDisplayed());
      Assert.assertTrue(serviceDrainCleaning.isDisplayed());
  }



    public void homeServiceShops(){

        Assert.assertTrue(shopsAquaShieldPlumbing.isDisplayed());
        Assert.assertTrue(shopVoltMasterSolutions.isDisplayed());
        Assert.assertTrue(shopsSunPainting.isDisplayed());
        Assert.assertTrue(shopsSereneHomeCleaning.isDisplayed());
    }

    public void shopsVisitStoreButonları(){


        Assert.assertTrue(aquShieldVisitButonu.isEnabled());
        Assert.assertTrue(sereneHomeVisitButonu.isEnabled());
        Assert.assertTrue(sunPaintingVisitButonu.isEnabled());
        Assert.assertTrue(volMasterdVisitButonu.isEnabled());
    }


    public void aquaShieldPlumbingTextleri(){

        Assert.assertTrue(shopDetailsText.isDisplayed());
        Assert.assertTrue(shopAvailabilityText.isDisplayed());
        Assert.assertTrue(servicesText.isDisplayed());
    }


    public void aquaShieldPlumbingServisLocations(){


        Assert.assertTrue(leakDetectionLocation.isDisplayed());
        Assert.assertTrue(pipeRepairLocation.isDisplayed());
        Assert.assertTrue(drainCleaningLocation.isDisplayed());
    }

}






























