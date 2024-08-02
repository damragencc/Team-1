package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeaderComp {

    public HeaderComp(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//*[text()='Become a User']")
    public WebElement becomeAuser; // Become a User butonu

    @FindBy (xpath = "//*[@class='user-img']")
    public WebElement insanIconu; // Anasayfa sağ üst köşedeki kullanıcı girişi insan ikonu

    @FindBy (xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement dropDownDashboard;

}


