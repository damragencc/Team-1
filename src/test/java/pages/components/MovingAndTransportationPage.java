package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MovingAndTransportationPage {

    public MovingAndTransportationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Categories ']")
    public WebElement linkCategories; //Anasayfa header bolumunde Categories sekmesi

    @FindBy(xpath = "//ul[@class='submenu']//a[text()='Moving & Transportation']")
    public WebElement linkMovingAndTransportation;
    // Anasayfa Categories sekmesi altinda Moving And Transportation linki

    @FindBy(xpath = "//a[@id='shops-tab']")
    public WebElement buttonShops; // Moving And Transportation sayfasindaki Shops butonu

    @FindBy(xpath = "//a[@id='services-tab']")
    public WebElement buttonService; // Moving And Transportation sayfasindaki Service butonu

    @FindBy(xpath = "//*[@id='filter_search']")
    public WebElement iconFilter; // Moving And Transportation sayfasindaki filter iconu

    @FindBy(xpath = "//*[text()='Local Moving']")
    public WebElement textLocalMoving;
    // Moving And Transportation sayfasindaki Local Moving servisinin yazisi

    @FindBy(xpath = "//*[text()='Long Distance Moving']")
    public WebElement textLongDistanceMoving;
    // Moving And Transportation sayfasindaki Long distance Moving servisinin yazisi

    @FindBy(xpath = "//a[normalize-space()='Visit Store']")
    public WebElement iconVisitStore;
    // Moving And Transportation sayfasindaki Visit Store yazisi

    @FindBy(xpath = "//h2[text()='Shop Details']")
    public WebElement textShopDetails;
    // Moving And Transportation sayfasindaki shop details yazisi

    @FindBy(xpath = "//h5[text()='Shop Availability']")
    public WebElement textShopAvailability;

    @FindBy(xpath = "//h2[text()='Services']")
    public WebElement textServices;

    @FindBy(xpath = "//a[@id='service_view']")
    public WebElement textServiceAdedi;

    @FindBy(xpath = "//h3[@class='mb-3']")
    public WebElement textSirketBilgisi;

    @FindBy(xpath = "//a[@class='pagination_no page_nos_12']")
    public WebElement buttonIkinciSayfaGecis; // 2. sayfaya gecis butonu

    @FindBy(xpath = "//a[text()='Transfer']")
    public WebElement textTransfer; // 2. sayfadaki Transfer yazisi

    public void detailsIsEnabled (){

        Assert.assertTrue(textShopDetails.isEnabled());
        Assert.assertTrue(textShopAvailability.isEnabled());
        Assert.assertTrue(textServices.isEnabled());
        Assert.assertTrue(textServiceAdedi.isEnabled());
        Assert.assertTrue(textSirketBilgisi.isEnabled());

    }







}
