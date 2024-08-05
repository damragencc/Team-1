package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageAboutUs {

    public PageAboutUs() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='About US']")
    public WebElement linkAboutUsHead; // Anasayfa headerda yer alan About Us linki

    @FindBy(xpath = "//*[text()='About Us']")
    public WebElement linkAboutUsFoot; // Anasayfa footerda yer alan About Us linki

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement linkHomeOfAboutUs; // About Us sayfasinda sag üstte yer alan Home linki

    @FindBy(xpath = "//h2[text()='About Us']")
    public WebElement textAboutUs; // About Us sayfasindaki baslik

    @FindBy(xpath = "//div[@class='about-blk-content']")
    public WebElement textContentAboutUsPage;

}

