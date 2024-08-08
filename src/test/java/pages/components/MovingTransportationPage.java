package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MovingTransportationPage {

    public MovingTransportationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[text()='Categories ']")
    public WebElement categoriesLinki;

    @FindBy (xpath = "(//*[text()='Moving & Transportation'])[1]")
    public WebElement movingTransportationLinki;

}
