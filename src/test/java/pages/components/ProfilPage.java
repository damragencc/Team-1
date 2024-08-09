package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProfilPage {

    public ProfilPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dropdown-item'][1]") //a[(text()='Dashboard')]
    public WebElement iconDashboard; //profil resmi dropdown menusundeki dashboard icon

    @FindBy(xpath = "//*[@class='dropdown-item'][2]")
    public WebElement iconMyBookings; //profil resmi dropdown menusundeki My Bookings icon

    @FindBy(xpath = "//*[@class='dropdown-item'][3]")
    public WebElement iconProfileSettings; //profil resmi dropdown menusundeki Profile Settings icon

    @FindBy(xpath = "//*[@class='dropdown-item'][4]")
    public WebElement iconBookService; //profil resmi dropdown menusundeki Book Service icon

    @FindBy(xpath = "//*[@class='dropdown-item'][5]")
    public WebElement iconChangePassword; //profil resmi dropdown menusundeki Change Password icon

    @FindBy(xpath = "//*[@class='dropdown-item'][6]")
    public WebElement iconMyOrders; //profil resmi dropdown menusundeki My Orders icon

    @FindBy(xpath = "//*[@class='dropdown-item'][7]")
    public WebElement iconChat; //profil resmi dropdown menusundeki Chat icon

    @FindBy(xpath = "//*[@class='dropdown-item'][8]")
    public WebElement iconLogout; //profil resmi dropdown menusundeki Logout icon

    @FindBy(xpath = "//a[text()='Booking List']")
    public WebElement iconBookingList; // profil resmi provider dropdown menusundeki Booking List icon






    

}


