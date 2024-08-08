package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DepositHistoryPage {

    public DepositHistoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Deposit History']")
    public WebElement linkDepositHistory; // provider Dashboard sidebardaki Deposit History linki

    @FindBy(xpath = "//th[text()='Name']")
    public WebElement textName; // Deposit History sayfasindaki tablo basligindaki Name yazisi

    @FindBy(xpath = "//th[text()='Date']")
    public WebElement textDate; // Deposit History sayfasindaki tablo basligindaki Date yazisi

    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement textAmount; // Deposit History sayfasindaki tablo basligindaki Amount yazisi

    @FindBy(xpath = "//th[text()='Deposited By']")
    public WebElement textDepositedBy; // Deposit History sayfasindaki tablo basligindaki Deposited By yazisi

    @FindBy(xpath = "//th[text()='Status']")
    public WebElement textStatus; // Deposit History sayfasindaki tablo basligindaki Status yazisi

    @FindBy(xpath = "//th[text()='Deposited At']")
    public WebElement textDepositedAt; // Deposit History sayfasindaki tablo basligindaki Deposited At yazisi

    @FindBy(xpath = "//input[@type='search']")
    public WebElement textboxSearchDepositHistory; // Deposit History sayfasinda olması gereken Search textbox'ı


    public void depositHistoryDatalariIsVisible (){
        Assert.assertTrue(textName.isDisplayed());
        Assert.assertTrue(textDate.isDisplayed());
        Assert.assertTrue(textAmount.isDisplayed());
        Assert.assertTrue(textDepositedBy.isDisplayed());
        Assert.assertTrue(textStatus.isDisplayed());
        Assert.assertTrue(textDepositedAt.isDisplayed());
    }


}
