


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
    public WebElement becomeAuser; // Become a User butonu

    @FindBy(xpath = "//a[@class='btn btn-signin']")
    public WebElement headerLoginButton; // Login butonu

    @FindBy(xpath = "//*[@id='login_email']")
    public WebElement emailIdBox; // Login butonu - email id box

    @FindBy(xpath = "//button[@id='emaillogin_submit']")
    public WebElement emailLoginButton;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='emailregistration_finals']")
    public WebElement passwordEnterButton;

    @FindBy(xpath = "//span[@class='user-img']")
    public WebElement profilIkonu;


    @FindBy (xpath = "//*[@class='user-img']")
    public WebElement insanIconu; // Anasayfa sağ üst köşedeki kullanıcı girişi insan ikonu





    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement dropDownDashboard;

    @FindBy(xpath = "//a[text()='Contact US']")
    public WebElement headerContactUsLink;//anasayfa Contact us linki



    @FindBy(xpath = " (//a[text()='Login'])[1]")
    public WebElement mainPageLoginButton;// anasayfa Login butonu






    @FindBy(xpath = "//*[text()='Categories ']")
    public WebElement categoriesButton;  // Anasayfa categories

    @FindBy(xpath = "(//*[text()='Home Services'])[1]")
    public WebElement categoriesHomeServisButton; //Categories-Home Service





    @FindBy(xpath = "//*[text()='Shops']")
    public WebElement shopsButton;

    @FindBy(xpath = "//*[text()='Shops & Services']")
    public WebElement shopsMenuShopsService;      //Shops menudeki Shops % Service






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







  

    @FindBy(xpath = "//*[text()='Become a User']")
    public WebElement becomeAuser; // Become a User butonu

    @FindBy(xpath ="(//*[@class='has-submenu'])[2]" )
    public static WebElement headerCategories; //header>categories

    @FindBy(xpath ="(//*[text()='Events'])[2]")
    public static WebElement headerEvents; //header>categories>events

    @FindBy(xpath = "//*[@id='shops-tab']")
    public static WebElement eventsShops; //header>categories>events>shop

    @FindBy(xpath = "//*[@id='services-tab']")
    public static WebElement eventsService; //header>categories>events>service

    @FindBy(xpath = "//*[text()=' Shops Found']")
    public static WebElement shopsFoundText; //header>categories>events>shop>shopsFound

    @FindBy(xpath = "(//*[@class='visit-store'])[1]")
    public static WebElement visitStoreText; //header>categories>events>shop>visitStoreText

    @FindBy(xpath = "//*[text()='Shop Details']")
    public static WebElement shopDetails; //header>categories>events>shop>visitStoreText>shopDetails

    @FindBy(xpath = "//*[text()='Shop Availability']")
    public static WebElement shopAvailability; //header>categories>events>shop>visitStoreText>shopAvailabilty

    @FindBy(xpath = "(//*[@class=\"btn btn-secondary\"])[1]")
    public static WebElement shopDetailsServices; //header>categories>events>shop>visitStoreText>Services

    @FindBy(xpath = "//*[h2='Services']")
    public static WebElement services; //Shop details sayfasındaki servislerin listelendiğiyerdeki servicess yazısının locate

    @FindBy(xpath = "fas fa-location-arrow")
    public static WebElement servicesAddress; //Servis adres bilgisi

    @FindBy(xpath = "//*[@class='label-amount']")
    public static WebElement labelAmount;  //Servisin fiyat bilgisi

    @FindBy(xpath = "(//*[@class='me-2'])[3]")
    public static WebElement filterIcon;  //Header>Categories>Event>Shops-Service yanındaki filtre ikonu

    @FindBy(xpath = "//*[text()='Location']")
    public static WebElement location; //Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan location

    @FindBy(xpath = "(//*[text()='Sort By'])[1]")
    public static WebElement sortBy; //Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan Sort By

    @FindBy(xpath = "(//*[text()='Keyword'])[1]")
    public static WebElement keyword; //Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan keyword

    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public static WebElement categories; //Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan categories

    @FindBy(xpath = "(//*[text()='Sub Category'])[1]")
    public static WebElement subCategory; //Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan subCategory

    @FindBy(xpath = "//*[@class='btn btn btn-search btn-block get_services']")
    public static WebElement filterSearch; // Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan search butonu

    @FindBy(xpath = "class=\"form-control location pac-target-input\"")
    public static WebElement searchLocation; // Header>Categories>Event>Shops-Service yanındaki filtre ikonu altında açılan location kutucuğu

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public static WebElement sortBy;


}






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



    public HeaderComp() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Become a User']")
    public WebElement becomeAuser; // Become a User butonu

    @FindBy(xpath = "//a[@class='btn btn-signin']")
    public WebElement headerLoginButton; // Login butonu

    @FindBy(xpath = "//*[@id='login_email']")
    public WebElement emailIdBox; // Login butonu - email id box

    @FindBy(xpath = "//button[@id='emaillogin_submit']")
    public WebElement emailLoginButton;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@id='emailregistration_finals']")
    public WebElement passwordEnterButton;

    @FindBy(xpath = "//span[@class='user-img']")
    public WebElement profilIkonu;


    @FindBy (xpath = "//*[@class='user-img']")
    public WebElement insanIconu; // Anasayfa sağ üst köşedeki kullanıcı girişi insan ikonu

    @FindBy (xpath = "(//*[@class='dropdown-item'])[1]")

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement insanIconu; // Anasayfa sağ üst köşedeki kullanıcı girişi insan ikonu

    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")

    public WebElement dropDownDashboard;

    @FindBy(xpath = "//a[text()='Contact US']")
    public WebElement headerContactUsLink;//anasayfa Contact us linki



    @FindBy(xpath = " (//a[text()='Login'])[1]")
    public WebElement mainPageLoginButton;// anasayfa Login butonu



    @FindBy(xpath = " (//a[text()='Login'])[1]")
    public WebElement mainPageLoginButton;// anasayfa Login butonu


    @FindBy(xpath = "//*[text()='Categories ']")
    public WebElement categoriesButton;  // Anasayfa categories

    @FindBy(xpath = "(//*[text()='Home Services'])[1]")
    public WebElement categoriesHomeServisButton; //Categories-Home Service





    @FindBy(xpath = "//*[text()='Shops']")
    public WebElement shopsButton;

    @FindBy(xpath = "//*[text()='Shops & Services']")
    public WebElement shopsMenuShopsService;      //Shops menudeki Shops % Service

    @FindBy(id ="Profile Settings")
    public WebElement profilSettings;  // profil ikonu menüdeki profil Setting menüsü






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



