package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboardInvoicesPage {
    public UserDashboardInvoicesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@alt='Service Image'])[1]")
    public WebElement pipeRepairResmi;

    @FindBy (xpath = "//*[text()='Service Details']")
    public WebElement serviceDetailsYazisi;

    @FindBy (xpath = "(//*[@class='booking-action'])[1]")
    public WebElement exportButonu;

    @FindBy (xpath = "//*[text()='Export All']")
    public WebElement expertAllButonu;

    @FindBy (id = "from_date")
    public WebElement fromDateKutusu;

    @FindBy (id = "to_date")
    public WebElement toDateKutusu;

    @FindBy (xpath = "(//*[@class='ui-state-default'])[1]")
    public WebElement ayinIlkGunu;

    @FindBy (xpath = "(//*[@class='ui-state-default'])[30]")
    public WebElement ayinSonGunu;

    @FindBy (xpath = "(//*[@class='ui-state-default'])[9]")
    public WebElement ayinOnuncuGunu;

    @FindBy (xpath = "(//*[@class='fa fa-search'])[1]")
    public WebElement searchButonu;

    @FindBy (xpath = "//*[text()='No records found']")
    public WebElement noRecordsFoundYazisi;

    @FindBy (xpath = "//*[@class='fa fa-times']")
    public WebElement carpiIkonu;

    @FindBy (xpath = "//*[@class='navbar-header']")
    public WebElement anaSayfaLogo;



}
