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
}


