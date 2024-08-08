package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepdefinitions.US024_MostPopularServicesStepDefinitions;
import utilities.Driver;

import java.util.List;

public class MostPopularServicesMainPage {

    public MostPopularServicesMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h2[text()='Most Popular Services']")
    public WebElement mainPageMostPopularServicesHeader; //anasayfa MostPopularServicesBaslik

    @FindBy(xpath = "(//*[@class='owl-dots'])[2]")
    public WebElement mainPageMostPopularServicesSlider; //anasayfa MostPopularServicesSlider

    @FindBy(xpath = "(//*[@class='owl-stage'])[3]")
    public List<WebElement> sliderServicelerListesi;

    @FindBy(xpath = "(//a[@class='btn btn-viewall'])[2]")
    public WebElement mainPageMostPopularServicesViewAllButton; //anasayfa MostPopularServicesViewAll

    @FindBy(xpath = "(//button[@role='button'])")
    public WebElement mainPageMostPopularServicesSliderAnaLocate; //anasayfa MostPopularServicesSlider buton analocate

    @FindBy(xpath = "(//button[@role='button'])[5]")
    public WebElement mainPageMostPopularServicesSlider1; //anasayfa MostPopularServicesSlider1.buton

    @FindBy(xpath = "(//button[@role='button'])[6]")
    public WebElement mainPageMostPopularServicesSlider2; //anasayfa MostPopularServicesSlider2.buton

    @FindBy(xpath = "(//button[@role='button'])[7]")
    public WebElement mainPageMostPopularServicesSlider3; //anasayfa MostPopularServicesSlider3.buton

    @FindBy(xpath = "//div[@class='featute-info']")
    public List<WebElement> mainPageMostPopularServicesInfoList; //anasayfa MostPopularServicesFirmaBilgileri

    @FindBy(xpath = "//div[@class='star-rating']")
    public List<WebElement> mainPageMostPopularServicesStarRatingList; //anasayfa MostPopularServicesFirmaPuan

    @FindBy(xpath = "//div[@class='product-by']")
    public List<WebElement> mainPageMostPopularServicesProviderList; //anasayfa MostPopularServicesProvider

    @FindBy(xpath = "//div[@class='service-location']")
    public List<WebElement> mainPageMostPopularServiceLocationList; //anasayfa MostPopularServicesLocation

    @FindBy(xpath = "//h6[text()]")
    public List<WebElement> mainPageMostPopularServicePriceList; //anasayfa MostPopularServicesPrice
    @FindBy(xpath = "(//h2)[1]")
    public WebElement acilanServiceBaslik;


}
