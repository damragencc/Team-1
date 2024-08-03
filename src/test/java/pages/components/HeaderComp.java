package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeaderComp {

    public HeaderComp(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//*[text()='Become a User']")
    public WebElement becomeAuser; // Become a User butonu

    @FindBy(xpath = "//a[@class='btn btn-signin']")
    public WebElement headerLoginButton; // Login butonu

    @FindBy(xpath = "//input[@class='form-control login_email']")
    public WebElement emailIdBox; // Login butonu - email id box

    @FindBy(xpath = "//button[@id='emaillogin_submit']")
    public WebElement emailLoginButton;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='emailregistration_finals']")
    public WebElement passwordEnterButton;

    @FindBy(xpath = "//span[@class='user-img']")
    public WebElement profilIkonu;






}


