package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
public ContactUsPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//h2[text()='Contact US']")
    public WebElement contactUsPageContactUsHeader;//contact us baslık




    @FindBy(xpath = "//h2[text()='Address ']")
    public WebElement contactUsPageContactUsAdressHeader; //contact us adress baslik

    @FindBy(xpath = "//h5[text()='367 Hillcrest Lane, Irvine, California, United States']")
    public WebElement contactUsPageContactUsAdress; //contact us adress info

    @FindBy(xpath = "//h2[text()='Phone  ']")
    public WebElement contactUsPageContactUsPhoneHeader; //contact us phone baslik

    @FindBy(xpath = "//h5[text()=' 321 546 8764 65']")
    public WebElement contactUsPageContactUsPhone; //contact us phone number

    @FindBy(xpath = "//h2[text()='Email ']")
    public WebElement contactUsPageContactUsEmailHeader; // contact us email baslik

    @FindBy(xpath = "//h5[text()='info@onlinemastermarket.com']")
    public WebElement contactUsPageContactUsEmail; // contact us email info

    @FindBy(xpath = "//input[@id='name']")
    public WebElement contactUsPageContactUsNameBox; //contact us name box

    @FindBy(xpath = "//input[@id='email']")
    public WebElement contactUsPageContactUsEmailBox; //contact us email box

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contactUsPageContactUsMessageBox; //contact us message box

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement contactUsPageContactUsSubmitButton;//contact us submit button

    @FindBy(xpath = "//div[@class='swal-title']")
    public WebElement contactUsPageContactUsMessageSent;//contact us submit button sonrası mesaj

    @FindBy(xpath = "//div[@class='swal-text']")
    public WebElement contactUsPageContactUsMessageSuccess;//contact us submit button sonrası mesaj


    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement contactUsPageContactUsMessageOkButton;//contact us submit button sonrası mesaj ok butonu


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement contactUsPagMailSentSuccesfully;//contact us okay sonrası yazi

    @FindBy(xpath = "//a[text()='Home']")
    public WebElement contactUsPageContactUsHomeLink;//contact us submit button

    @FindBy(xpath = "(//img[@class='img-fluid'])[1]")
    public WebElement contactUsPageContactUsOMLogo;//contact us ommarket logo image

    @FindBy(xpath = "//a[@href='mailto:info@onlinemastermarket.com']")
    public WebElement contactUsPageContactFooterLink;//contact us ommarket logo image

    //@FindBy(xpath = "//iframe[@name='__privateStripeMetricsController4540']")
    public WebElement ContactUSIframe;//contact us submit button sonrası mesaj

}
