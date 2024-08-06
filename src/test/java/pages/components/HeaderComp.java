package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class HeaderComp {

    public HeaderComp(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Become a User']")
    public WebElement becomeAuser; // Become a User button

    @FindBy(xpath = "//a[@class='btn btn-signin']")
    public WebElement headerLoginButton; // Login button

    @FindBy(xpath = "//*[@id='login_email']")
    public WebElement emailIdBox; // Login email ID box

    @FindBy(xpath = "//button[@id='emaillogin_submit']")
    public WebElement emailLoginButton;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='emailregistration_finals']")
    public WebElement passwordEnterButton;

    @FindBy(xpath = "//span[@class='user-img']")
    public WebElement profilIkonu;

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement insanIconu; // User icon on the top right corner

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement dropDownDashboard;

    @FindBy(xpath = "//a[text()='Contact US']")
    public WebElement headerContactUsLink; // Home page Contact Us link

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement mainPageLoginButton; // Home page Login button

    @FindBy(xpath = "//*[text()='Categories ']")
    public WebElement categoriesButton; // Home page Categories

    @FindBy(xpath = "(//*[text()='Home Services'])[1]")
    public WebElement categoriesHomeServisButton; // Categories - Home Services

    @FindBy(xpath = "//*[text()='Shops']")
    public WebElement shopsButton;

    @FindBy(xpath = "//*[text()='Shops & Services']")
    public WebElement shopsMenuShopsService; // Shops menu Shops & Service

    @FindBy(id = "Profile Settings")
    public WebElement profilSettings; // Profile icon menu Profile Settings

    @FindBy(xpath = "(//*[@class='has-submenu'])[2]")
    public static WebElement headerCategories; // header > categories

    @FindBy(xpath = "(//*[text()='Events'])[2]")
    public static WebElement headerEvents; // header > categories > events

    @FindBy(xpath = "//*[@id='shops-tab']")
    public static WebElement eventsShops; // header > categories > events > shop

    @FindBy(xpath = "//*[@id='services-tab']")
    public static WebElement eventsService; // header > categories > events > service

    @FindBy(xpath = "//*[text()=' Shops Found']")
    public static WebElement shopsFoundText; // header > categories > events > shop > shopsFound

    @FindBy(xpath = "(//*[@class='visit-store'])[1]")
    public static WebElement visitStoreText; // header > categories > events > shop > visitStoreText

    @FindBy(xpath = "//*[text()='Shop Details']")
    public static WebElement shopDetails; // header > categories > events > shop > visitStoreText > shopDetails

    @FindBy(xpath = "//*[text()='Shop Availability']")
    public static WebElement shopAvailability; // header > categories > events > shop > visitStoreText > shopAvailability

    @FindBy(xpath = "(//*[@class=\"btn btn-secondary\"])[1]")
    public static WebElement shopDetailsServices; // header > categories > events > shop > visitStoreText > Services

    @FindBy(xpath = "//*[h2='Services']")
    public static WebElement services; // Shop details page - Services heading

    @FindBy(xpath = "fas fa-location-arrow")
    public static WebElement servicesAddress; // Service address information

    @FindBy(xpath = "//*[@class='label-amount']")
    public static WebElement labelAmount; // Service price information

    @FindBy(xpath = "(//*[@class='me-2'])[3]")
    public static WebElement filterIcon; // Filter icon next to Shops-Service

    @FindBy(xpath = "//*[text()='Location']")
    public static WebElement location; // Location filter option

    @FindBy(xpath = "(//*[text()='Sort By'])[1]")
    public static WebElement sortBy; // Sort By filter option

    @FindBy(xpath = "(//*[text()='Keyword'])[1]")
    public static WebElement keyword; // Keyword filter option

    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public static WebElement categories; // Categories filter option

    @FindBy(xpath = "(//*[text()='Sub Category'])[1]")
    public static WebElement subCategory; // Sub Category filter option

    @FindBy(xpath = "//*[@class='btn btn btn-search btn-block get_services']")
    public static WebElement filterSearch; // Search button in filter options

    @FindBy(xpath = "class=\"form-control location pac-target-input\"")
    public static WebElement searchLocation; // Location input box in filter options

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public WebElement sortByArrow; // Sort By dropdown arrow

    public void performLogIn(String mail, String password) {
        headerLoginButton.click();
        emailIdBox.sendKeys(mail);
        ReusableMethods.wait(1);
        emailIdBox.sendKeys(" ", Keys.ENTER);
        ReusableMethods.wait(1);
        emailLoginButton.click();
        passwordBox.sendKeys(password);
        passwordEnterButton.click();
    }
}
