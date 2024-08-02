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

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-end show']")
    public WebElement profileDropDown;
}
