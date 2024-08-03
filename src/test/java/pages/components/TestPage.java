
package pages.components;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class TestPage {

    public TestPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='fas fa-users']")
    public WebElement staffLinki; // Provider Dashboard sayfası Staff Linki

    @FindBy (xpath = "//*[@class='widget-title']")
    public WebElement myStaffYazisi;


}






























