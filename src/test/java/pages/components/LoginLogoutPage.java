package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginLogoutPage {
    public LoginLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='login_email']")
    public WebElement mainPageLoginFormEmailbox;


    @FindBy(xpath = "//button[@id='emaillogin_submit']")
    public WebElement mainPageLoginFormEmailboxLoginButton;


    //input[@id='login_password']
    @FindBy(xpath = "//input[@id='login_password']")
    public WebElement mainPageLoginFormPasswordbox;


    @FindBy(xpath = "//button[@id='emailregistration_finals']")
    public WebElement mainPageLoginFormPasswordEnterButton;

    @FindBy(xpath = "//span[@class='user-img']")
    public WebElement profileIcon;

    @FindBy(css = ".dropdown-menu.dropdown-menu-end.show > a:nth-of-type(10)")
    public WebElement profileDropDown;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutDropDown;

    @FindBy(xpath = "(//*[text()='Business Services'])[2]")
    public WebElement businessServices; // Login olduktan sonra açılan sayfadaki element

    @FindBy(xpath = "//*[@id='shops-tab']")
    public WebElement businessServicesShop; // login>businessServices>shops

    @FindBy(xpath = "//*[@id='services-tab']")
    public WebElement businessServicesService; // login>businessServices>shops

    @FindBy(xpath = "(//*[@class='me-2'])[3]")
    public WebElement filterButton; //login>businessServices>filter

    @FindBy(xpath = "(//*[@id='service_location'])[1]")
    public WebElement location;  //login>businessServices>filter>location

    @FindBy(xpath = "//*[@id='shop_count']")
    public WebElement shopsFoundText;

    @FindBy(xpath = "(//*[text()='Visit Store '])[1]")
    public WebElement visitStore; //login>businessService>visitStore

    @FindBy(xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsText; //login>businessService>visitStore>shopDetailsText

    @FindBy(xpath = "//*[@class='card-title service-title']")
    public WebElement shopAvailabilityText; // login>businessService>visitStore>shopAvailability

    @FindBy(xpath = "(//*[@class='inner-tab-shop'])[2]")
    public WebElement servicesText; //login>businessService>visitStore>shopAvailability

    @FindBy(xpath = "//*[text()='Featured Shop']")
    public WebElement featuredShop; // login>homepage

    @FindBy(xpath = "(//*[@class='shop-location'])[3]")
    public WebElement shopLocation; // Login>homepage>featuredShop>shopLocation

    @FindBy(xpath = "//div[3]/div/div/div[2]/h3/a")
    public WebElement shopName; //Login>homepage>featuredShop>shopName

    @FindBy(xpath = "(//*[text()='Visit Store '])[3]")
    public WebElement visitStoreText; //Login>homepage>featuredShop>shopName>visitStore

    @FindBy(xpath = "//*[text()='Shop Details']")
    public WebElement getShopDetailsText;

    @FindBy(xpath = "(//*[@class='btn btn-viewall'])[1]")
    public WebElement viewAllButton; //Login>homepage>featuredShop>shopName>viewAllButton




}
