package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProviderInvoicesChangepaswd {
    public ProviderInvoicesChangepaswd(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = ("//*[@class='dropdown-item' and text()='Dashboard']"))
    public WebElement ikondanDashbord;

@FindBy(xpath = ("//*[@class='content']"))
    public WebElement dashbordSayfa;

@FindBy(xpath = ("(//*[@class='nav-link '])[15]"))
public WebElement invoicesBtn;

@FindBy(xpath = "//*[@class='col-xl-9 col-md-8']")
    public WebElement invocesUrunSayf;
@FindBy(xpath = ("(//*[contains(@href, 'service-preview/Pipe-Repair')])[2]"))
    public WebElement invoicesUrunnn;
@FindBy(xpath = ("(//*[@class='service-view'])[1]"))
    public WebElement urunBilgileri;

    @FindBy (id = "from_date")
    public WebElement fromDateKutusu;

    @FindBy (id = "to_date")
    public WebElement toDateKutusu;

    @FindBy (xpath = "(//*[@class='fa fa-search'])[1]")
    public WebElement aramaserchButonu;
    @FindBy (xpath = "//*[@class='fa fa-times']")
    public WebElement carpibutton;

    @FindBy (xpath = "//*[text()='Export All']")
    public WebElement ExpertAllButonu;

    @FindBy(xpath = ("(//*[@class='booking-action'])[2]"))
    public WebElement exporturunuzeri;

    @FindBy(xpath = ("(//*[@class='dropdown-item'])[8]"))
    public WebElement changePasswordbutton;

    @FindBy(xpath = ("(//*[@class='bv-form'])[1]"))
    public WebElement changepasswordTextboxlari;

    @FindBy(xpath = ("(//*[@class='form-control'])[1]"))
    public WebElement currentPassword;

    @FindBy(xpath = ("(//*[@class='form-control'])[2]"))
    public WebElement newPassword;

    @FindBy(xpath = ("(//*[@class='form-control'])[3]"))
    public WebElement confirmPassword;

@FindBy(xpath = ("(//*[@class='btn btn-primary pl-5 pr-5'])"))
    public WebElement changebuttonn;

@FindBy(xpath = ("//*[@id='otp_error_msg_login']"))
    public WebElement CheckYourCredentials;







}
