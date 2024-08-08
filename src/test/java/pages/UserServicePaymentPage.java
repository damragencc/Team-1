package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserServicePaymentPage {
    public UserServicePaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@class='categorie-img']")
    public List<WebElement> mainPageMostPopularServicesoList; //anasayfa MostPopularServices

    @FindBy(xpath = "//button[@id='go_book_service']")
    public WebElement bookServiceButton;
    @FindBy(xpath = "//button[@id='submit_button_id']")
    public WebElement proceedToPaymentButton;
    @FindBy(xpath = "//input[@id='stripe']")
    public WebElement stripeRadioButton;
    @FindBy(xpath = "//h2[text()='Service Booking']")
    public WebElement serviceModalHeader;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;
    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement cardNumberBox;
    @FindBy(xpath = "//input[@id='cc-exp']")
    public WebElement mMYYBox;
    @FindBy(xpath = "//input[@id='cc-csc']")
    public WebElement cVCBox;
    @FindBy(xpath = "//button[@id='submitButton']")
    public WebElement payButton;
    @FindBy(xpath = "//div[text()='Payment Success']")
    public WebElement paymentSuccessText;


}
