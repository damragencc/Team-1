package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class PageBecomeProfessional {

    public PageBecomeProfessional() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Become a Professional']")
    public WebElement linkBecomeProfessional;

    @FindBy(xpath = "//input[@id='userName']")
    public WebElement fieldName;

    @FindBy(xpath = "//*[@id='userEmail']")
    public WebElement fieldEmail;

    @FindBy(xpath = "//*[@id='UserPassword']")
    public WebElement fieldPassword;

    @FindBy(xpath = "//*[@id='userMobile']")
    public WebElement fieldMobileNumber;

    @FindBy(xpath = "//label[text()='I agree to Online Master Market']")
    public WebElement checkbox;
    @FindBy(xpath = "(//*[text()='Privacy Policy'])[1]")
    public WebElement textPrivacyPolicy;

    @FindBy(xpath = "(//*[text()=' Terms and Conditions.'])[1]")
    public WebElement textTermsConditions;

    @FindBy(xpath = "(//a[text()='Login'])[2]")
    public WebElement linkLoginModal;

    @FindBy(xpath = "(//*[@class='account-content'])[3]")
    public WebElement contentModal;

    @FindBy(xpath = "//button[@id='registration_submit']")
    public WebElement buttonRegister;

    @FindBy(xpath = "//*[@class='iti__flag-container']")
    public WebElement flagContainer;

    @FindBy(xpath = "//*[@class='iti__country iti__standard']")
    public List<WebElement> countryList;

    @FindBy(xpath = "(//small[@data-bv-for='userName'])[1]")
    public WebElement messageForName;

    @FindBy(xpath = "//input[@id='userEmail']//following-sibling::small[@class='help-block']")
    public List<WebElement> errorMessagesForEmail;

    @FindBy(xpath = "//input[@id='UserPassword']//following-sibling::small[@class='help-block']")
    public WebElement errorMessagesForPassword;

    @FindBy(xpath = "//small[@data-bv-for='userMobile']")
    public List<WebElement> errorMessagesForMobilenNumber;

    @FindBy(xpath = "//*[text()='Please Select Agreement']")
    public WebElement textSelectAgreement;

    @FindBy(id = "emaillogin_submit")
    public WebElement buttonLogin;

    public void becomeProfessional(String fullName, String emailAddress, String password, String mobileNumber) {

        fieldName.sendKeys(fullName);
        ReusableMethods.wait(3);
        fieldEmail.sendKeys(emailAddress);
        ReusableMethods.wait(3);
        fieldPassword.sendKeys(password);
        ReusableMethods.wait(3);
        fieldMobileNumber.sendKeys(mobileNumber);
        ReusableMethods.wait(3);
        checkbox.click();
        ReusableMethods.wait(3);
        buttonRegister.click();
        ReusableMethods.wait(3);

    }


}
