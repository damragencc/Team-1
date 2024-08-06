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



}
