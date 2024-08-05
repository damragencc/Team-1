
package pages.components;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class RegisterPage {

    public RegisterPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    Actions actions=new Actions(Driver.getDriver());

    @FindBy(xpath = "//*[text()='Find Reliable']")
    public WebElement anaSayfaGoruntuleme;   // Anasayfa goruntulenmesi

    @FindBy(xpath = "(//*[@alt='Logo'])[1]")
    public WebElement siteninTitle;  //Ana sayfada'ki tittle

    @FindBy(xpath = "//*[text()='Join as a User']")
    public WebElement joinAsaUserTexti;

    @FindBy(id = "user_name")
    public WebElement loginNameKutusu;

    @FindBy(id = "user_email")
    public WebElement loginMailKutusu;

    @FindBy(id = "user_password")
    public WebElement loginPasswordKutusu;

    @FindBy (id = "emaillogin_submit")
    public WebElement loginButonu;

    @FindBy (id = "emailregistration_finals")
    public WebElement enterButonu;

    @FindBy(id = "user_mobile")
    public WebElement loginMobiledKutusu;

    @FindBy(xpath = "(//*[@role='combobox'])[2]")
    public WebElement ulkeCheckBoxKutusu;

    @FindBy(xpath = "//*[text()=' Male\t\t\t\t\t\t\t\t\t\t\t      ']")
    public WebElement cinsiyetErkekButonu;

    @FindBy(xpath = "(//*[text()='I agree to Online Master Market'])[2]")
    public WebElement ıAgreeButonu;

    @FindBy(xpath = "(//*[text()='Register'])[2]")
    public WebElement registerButonu;





















    public void RegisterForm(String name,String email,String password){

        loginNameKutusu.click();
        actions.sendKeys(ConfigReader
                        .getProperty(name)).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty(email)).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty(password)).perform();


    }

    public void CheckBoxVePhoneNumber(String ulke,String phoneNumber){

        actions.sendKeys(ulkeCheckBoxKutusu).click().sendKeys(ConfigReader.
                getProperty(ulke)).sendKeys(Keys.ENTER).sendKeys(ConfigReader
                .getProperty(phoneNumber)).perform();



    }
    public void selectOptionByValue(String value) {
        WebElement selectElement = driver.findElement(By.id("country"));
        Select select = new Select(selectElement);
        select.selectByValue(value);

    }


    public void beklemeSuresi() throws InterruptedException {

        Thread.sleep(2000);

    }



    }



