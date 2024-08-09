package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = ("//a[@class='dropdown-item' and @href='https://qa.onlinemastermarket.com/provider-dashboard']\n"))
    public WebElement DashboardPageLinki;

    @FindBy(xpath = ("//img[@src='https://qa.onlinemastermarket.com/uploads/profile_img/1722516163.png' and @width='31']\n"))
    public WebElement ProfilIkonu;

    @FindBy(xpath = ("//span[text()='Reviews']\n"))
    public WebElement ReviewsLinki;

}
