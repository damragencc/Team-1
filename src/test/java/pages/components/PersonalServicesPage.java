package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PersonalServicesPage {

    public PersonalServicesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@class='submenu']//a[text()='Personal Services']")
    public WebElement linkPersonalServices; // Header Categories altindaki Personal Services linki

    @FindBy(xpath = "//a[@id='shops-tab']")
    public WebElement buttonShops; // Personal Services sayfasindaki Shops butonu

    @FindBy(xpath = "//a[@id='services-tab']")
    public WebElement buttonService; // Personal Services sayfasindaki Service butonu

    @FindBy(xpath = "//a[text()='Vital Balance']")
    public WebElement textVitalBalance; // Vital Balance sirketinin yazisi

    @FindBy(xpath = "//a[text()='Elegant Touch']")
    public WebElement textElegantTouch; // Elegant Touch sirketinin yazisi

    @FindBy(xpath = "//a[normalize-space()='Visit Store']")
    public WebElement iconVisitStoreVitalBalance; // VitalBalance Visit Store yazisi

    @FindBy(xpath = "//h3[text()='Vital Balance']")
    public WebElement textSirketBilgisiVitalBalance; // Vital Balance sirket yazisi

    @FindBy(xpath = "//h2[text()='Shop Details']")
    public WebElement textShopDetailsVitalBalance; // Vital Balance shop details yazisi

    @FindBy(xpath = "//h2[text()='Services']")
    public WebElement textServicesVitalBalance; // Vital Balance Services yazisi

    @FindBy(xpath = "//h5[text()='Shop Availability']")
    public WebElement textShopAvailabilityVitalBalance; // Vital Balance Shop Availability yazisi

    @FindBy(xpath = "//div[@id='dataList']//div[1]//div[1]//span[1]//a[1]")
    public WebElement getTextSirketBilgisiVitalBalance; //// Vital Balance sirket yazisi

    @FindBy(xpath = "//div[@id='dataList']//div[1]//div[1]//div[2]//h6[1]")
    public WebElement textAmount; // Vital Balance amount bilgisi

    @FindBy(xpath = "//div[@id='dataList']//div[1]//div[1]//div[2]//p[1]")
    public WebElement textLocation; // Vital Balance location bilgisi

    @FindBy(xpath = "//a[text()='Personalized Fitness Programs']")
    public WebElement linkFitnessHizmeti; // Vital Balance Fitness Hizmet linki

    @FindBy(xpath = "//p[@class='label-amount']")
    public WebElement textAmountFitness; // Fitness hizmeti amount bilgisi

    @FindBy(xpath = "//h5[text()='Service Provider']")
    public WebElement textServiceProvider; // Fitness hizmeti Service Provider cartı

    @FindBy(xpath = "//h5[text()='Service Availability']")
    public WebElement textServiceAvailability; // Fitness hizmeti Service Availability cartı

    @FindBy(xpath = "//h3[text()='Service Details']")
    public WebElement textServiceDetails; // Fitness hizmeti Service Details yazisi

    @FindBy(xpath = "//h3[text()='Additional Services']")
    public WebElement textAdditionalServices; // Fitness hizmeti Additional Services yazisi

    @FindBy(xpath = "//h3[text()='Reviews']")
    public WebElement textReviews; // Fitness hizmeti Reviews yazisi

    @FindBy(xpath = "//h4[text()='Related Services']")
    public WebElement textRelatedServices; // Fitness hizmeti Related Services yazisi

    @FindBy(xpath = "//a[@id='filter_search']")
    public WebElement filterIconPersonalService; // filter iconu

    @FindBy(xpath = "//input[@id='service_location']")
    public WebElement textboxLocation; // Personal Service filter formu Location textboxı

    @FindBy(xpath = "//span[@id='select2-sort_by-container']")
    public WebElement textboxSortBy; // Personal Service filter formu Sort By textboxı

    @FindBy(xpath = "//input[@id='common_search']")
    public WebElement textboxKeyword; // Personal Service filter formu Keyword textboxı

    @FindBy(xpath = "//span[@id='select2-categories-container']")
    public WebElement textboxCategories; // Personal Service filter formu Categories textboxı

    @FindBy(xpath = "//span[@id='select2-subcategories-container']")
    public WebElement textboxSubCategories; // Personal Service filter formu Sub Categories textboxı

    @FindBy(xpath = "//div[@class='range-slider price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']")
    public WebElement textboxPriceRange; // Personal Service filter formu PriceRange textboxı

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement buttonSearchFilter; // Personal Service filter formu Search button

    @FindBy(xpath = "//option[text()='Beauty']")
    public WebElement acilirOptionMenuBeauty; // acilir menude Beauty secenegi

    @FindBy(xpath = "//a[text()='Haircut']")
    public WebElement textHairCut; // Hair Cut yazisi

    @FindBy(xpath = "//option[text()='Price Low to High']")
    public WebElement acilirOptionMenuPriceLowtoHigh;


    public void fitnessHizmetiEnabled(){

        Assert.assertTrue(textAmountFitness.isEnabled());
        Assert.assertTrue(textServiceProvider.isEnabled());
        Assert.assertTrue(textServiceAvailability.isEnabled());
        Assert.assertTrue(textServiceDetails.isEnabled());
        Assert.assertTrue(textAdditionalServices.isEnabled());
        Assert.assertTrue(textReviews.isEnabled());
        Assert.assertTrue(textRelatedServices.isEnabled());
    }

    public void filterTextboxlariIsVisible(){

        Assert.assertTrue(textboxLocation.isDisplayed());
        Assert.assertTrue(textboxSortBy.isDisplayed());
        Assert.assertTrue(textboxKeyword.isDisplayed());
        Assert.assertTrue(textboxCategories.isDisplayed());
        Assert.assertTrue(textboxSubCategories.isDisplayed());
        Assert.assertTrue(textboxPriceRange.isDisplayed());
        Assert.assertTrue(buttonSearchFilter.isDisplayed());
    }





}
