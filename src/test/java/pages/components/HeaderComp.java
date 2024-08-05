


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

