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


