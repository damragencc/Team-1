package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MostPopularServicesMainPage {
    public MostPopularServicesMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[text()='Most Popular Services']")
    public WebElement mainPageMostPopularServicesHeader; //anasayfa MostPopularServicesBaslik

    @FindBy(xpath = "(//a[@class='btn btn-viewall'])[2]")
    public WebElement mainPageMostPopularServicesViewAllButton; //anasayfa MostPopularServicesViewAll

    @FindBy(xpath = "(//button[@role='button'])[5]")
    public WebElement mainPageMostPopularServicesSlider1; //anasayfa MostPopularServicesSlider1.buton

    @FindBy(xpath = "(//button[@role='button'])[6]")
    public WebElement mainPageMostPopularServicesSlider2; //anasayfa MostPopularServicesSlider2.buton

    @FindBy(xpath = "(//button[@role='button'])[7]")
    public WebElement mainPageMostPopularServicesSlider3; //anasayfa MostPopularServicesSlider3.buton

    @FindBy(xpath = "//div[@class='featute-info']")
    public WebElement mainPageMostPopularServicesInfo; //anasayfa MostPopularServicesFirmaBilgileri

    @FindBy(xpath = "//div[@class='star-rating']")
    public WebElement mainPageMostPopularServicesStarRating; //anasayfa MostPopularServicesFirmaPuan

    @FindBy(xpath = "//div[@class='product-by']")
    public WebElement mainPageMostPopularServicesProvider; //anasayfa MostPopularServicesProvider

    @FindBy(xpath = "//div[@class='service-location']")
    public WebElement mainPageMostPopularServiceLocation; //anasayfa MostPopularServicesLocation

    @FindBy(xpath = "//h6[text()]")
    public WebElement mainPageMostPopularServicePrice; //anasayfa MostPopularServicesPrice
}
