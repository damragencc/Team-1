package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.driver;

public class MovingTransportationPage {

    public MovingTransportationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[text()='Categories ']")
    public WebElement categoriesLinki;
    @FindBy (xpath = "(//*[text()='Moving & Transportation'])[1]")
    public WebElement movingTransportationLinki;
    @FindBy (xpath = "//*[text()='$500']")
    public WebElement amountYazisi;
    @FindBy (xpath = "(//*[text()=' Oklahoma'])[1]")
    public WebElement locationYazisi;
    @FindBy (xpath = "//*[text()='Visit Store ']")
    public WebElement visitStoreLinki;
    @FindBy (id = "shops-tab")
    public WebElement shopsButonu;
    @FindBy (xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsYazisi;
    @FindBy (xpath = "//*[text()='Services']")
    public WebElement servicesYazisi;
    @FindBy (xpath = "//*[text()='Shop Availability']")
    public WebElement shopAvailabilityYazisi;
    @FindBy (id = "services-tab")
    public WebElement serviceButonu;
    @FindBy (xpath = "//*[text()='Local Moving']")
    public WebElement localMovingYazisi;
    @FindBy (xpath = "//*[text()='$500']")
    public WebElement besyuzusd;
    @FindBy (xpath = "//*[text()='Service Provider']")
    public WebElement serviceProviderYazisi;
    @FindBy (xpath = "//*[text()='Service Availability']")
    public WebElement serviceAvailabilityYazisi;
    @FindBy (xpath = "//*[text()='Service Details']")
    public WebElement serviceDetailsYazisi;
    @FindBy (xpath = "//*[text()='Additional Services']")
    public WebElement additionalServicesYazisi;
    @FindBy (xpath=" (//*[text()='Reviews'])[1]")
    public WebElement reviewsYazisi;
    @FindBy (xpath="//*[text()='Related Services']")
    public WebElement relatedServicesYazisi;
    @FindBy (xpath="//*[@class='btn filter-btn']")
    public WebElement filterButonu;
    @FindBy (xpath="//*[@class='btn btn btn-search btn-block get_services']")
    public WebElement searchButonu;
    @FindBy (xpath = "(//*[@class='col-lg-4 col-sm-6 col-12'])[3]")
    public WebElement keywordKutusu;
    @FindBy (xpath = "//*[text()='Horizon Movers']")
    public WebElement horizonMoversYazisi;
    @FindBy(xpath = "(//*[text()='Local Moving'])[1]")
    public WebElement localMovingSirketiYazisi;

    @FindBy (xpath = "//*[text()='Overview']")
    public WebElement overviewYazisi;

    public List<WebElement> getSearchElements() {
        return driver.findElements(By.xpath("//*[@class='col-lg-4 col-sm-6 col-12']"));
    }

}



