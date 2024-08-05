package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PageChat {

    public PageChat() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    public WebElement linkLogin;

    @FindBy(xpath = "//*[@id='login_email']")
    public WebElement fieldLoginEmail;

    @FindBy(xpath = "//*[@id='emaillogin_submit']")
    public WebElement buttonLogin;

    @FindBy(xpath = "//*[@id='login_password']")
    public WebElement fieldPassword;

    @FindBy(xpath = "//*[@id='emailregistration_finals']")
    public WebElement buttonEnter;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement iconUser;

    @FindBy(xpath = "(//*[text()='Chat'])[1]")
    public WebElement linkChats;

    @FindBy(id = "search_chat_list")
    public WebElement searchBox;

    @FindBy(id = "chat-message")
    public WebElement fieldMessage;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement buttonSubmit;

    public void performLogin(String email, String password) {

        linkLogin.click();
        fieldLoginEmail.sendKeys(ConfigReader.getProperty(email));
        ReusableMethods.wait(1);
        buttonLogin.click();
        fieldPassword.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(1);
        buttonEnter.click();

    }

}
