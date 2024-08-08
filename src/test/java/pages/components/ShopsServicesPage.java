package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShopsServicesPage {

    public ShopsServicesPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Shops'])[1]")
    public WebElement headerShops;

    @FindBy(xpath = "//a[normalize-space()='Shops & Services']")
    public WebElement headerShopsShopsServices;

    @FindBy(xpath = "//a[@id='services-tab']")
    public WebElement servisSayfaServiceButton;

    @FindBy(xpath = "//ul[@class='submenu']//a[normalize-space()='Business Services']")
    public WebElement businessServices;

    @FindBy(xpath = "//a[normalize-space()='Repairs & Maintenance']")
    public WebElement repairsMaintenance;

    @FindBy(xpath = "//ul[@class='submenu']//a[normalize-space()='Moving & Transportation']")
    public WebElement movingTransportation;

    @FindBy(xpath = "//ul[@class='submenu']//a[normalize-space()='Events']")
    public WebElement events;

    @FindBy(xpath = "//ul[@class='submenu']//a[normalize-space()='Personal Services']")
    public WebElement personalServices;

    @FindBy(xpath = "//ul[@class='submenu']//a[normalize-space()='Home Services']")
    public WebElement homeServices;

    @FindBy(xpath = "//*[text()='Categories ']")
    public WebElement catagoriess;

    @FindBy(xpath = "//a[normalize-space()='Book Service']")
    public WebElement bookServicesDropdown;

    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[4]//a[1]")
    public WebElement hizmet;

    @FindBy(xpath = "//a[normalize-space()='Wellness Coaching']")
    public WebElement wellnessCoaching;

    @FindBy(xpath = "//button[@id='go_book_service']")
    public WebElement bookService;




}
