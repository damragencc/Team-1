package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CategoriesPage {

    public CategoriesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = ("//a[@href='https://qa.onlinemastermarket.com/all-categories']"))
    public WebElement CategoriesLinki; //Header bölümündeki Categories

    @FindBy(xpath = ("//a[@href='https://qa.onlinemastermarket.com/search/business-services']"))
    public WebElement BusinessServices; // Categories altında

    @FindBy(xpath = ("//*[@class='navbar navbar-expand-lg header-nav']"))
    public WebElement AnasayfaHeader;

    @FindBy(xpath = ("(//a[text()='Repairs & Maintenance'])[1]"))
    public WebElement RepairsMaintenance; //Categories altında

    @FindBy(xpath = ("(//a[text()='Moving & Transportation'])[1]"))
    public WebElement MovingTransportation; //Categories altında

    @FindBy(xpath = ("(//a[text()='Events'])[1]"))
    public WebElement Events; //Categories altında

    @FindBy(xpath = ("(//a[text()='Personal Services'])[1]"))
    public WebElement PersonalServices; //Categories altında

    @FindBy(xpath = ("(//a[text()='Home Services'])[1]"))
    public WebElement HomeServices; //Categories altında

}
