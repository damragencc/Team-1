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

}
