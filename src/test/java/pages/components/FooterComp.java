package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FooterComp {

    public FooterComp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Categories']")
    public WebElement categoriesText;

    @FindBy(xpath = "//h2[normalize-space()='Quick Links']")
    public WebElement quickLinksText;

    @FindBy(xpath = "//h2[normalize-space()='Contact Us']")
    public WebElement contactUsText;

    @FindBy(xpath = "//h2[normalize-space()='Social links']")
    public WebElement socialLinksText;

    @FindBy(xpath = "//div[@class='contactdet']//a[normalize-space()='Business Services']")
    public WebElement businessServicesLink;

    @FindBy(xpath = "//div[@class='contactdet']//a[normalize-space()='Events']")
    public WebElement eventsLinks;

    @FindBy(xpath = "//div[@class='contactdet']//a[normalize-space()='Home Services']")
    public WebElement homeServicesLink;

    @FindBy(xpath = "//div[@class='contactdet']//a[normalize-space()='Moving & Transportation']")
    public WebElement movingTransportationLink;

    @FindBy(xpath = "//div[@class='contactdet']//a[normalize-space()='Personal Services']")
    public WebElement personalServicesLink;

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUsLink;

    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    public WebElement contactUsLink;

    @FindBy(xpath = "//a[normalize-space()='FAQ']")
    public WebElement faqLink;

    @FindBy(xpath = "//p[contains(text(),'367 Hillcrest Lane, Irvine, California, United Sta')]")
    public WebElement addressText;

    @FindBy(xpath = "//a[normalize-space()='321 546 8764 65']")
    public WebElement telephoneText;

    @FindBy(xpath = "//a[normalize-space()='info@onlinemastermarket.com']")
    public WebElement mailText;

    @FindBy(xpath = "//a[@href='https://facebook.com']")
    public WebElement facebookButton;

    @FindBy(xpath = "//img[@src='https://qa.onlinemastermarket.com/uploads/x-twitter.svg']")
    public WebElement xButton;

    @FindBy(xpath = "//i[@class='fab fa-youtube']")
    public WebElement youtubeButton;

    @FindBy(xpath = "//a[@href='https://linkedin.com/']")
    public WebElement linkedinButton;

    @FindBy(xpath = "//i[@class='fab fa-github']")
    public WebElement githubButton;

    @FindBy(xpath = "//a[@href='https://instagram.com']")
    public WebElement instagramButton;

}
