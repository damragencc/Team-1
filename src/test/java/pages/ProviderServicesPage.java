package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProviderServicesPage {

	public ProviderServicesPage() {
		PageFactory.initElements(Driver.getDriver() ,this);
	}

	//Header Part
	@FindBy(className = "user-img")
	public WebElement userImgIcon;

	@FindBy(xpath = "//*[text()='My Services']")
	public WebElement myServicesPageLink;

	@FindBy(xpath = "//*[text()='Dashboard']")
	public WebElement dashboardPageLink;

	//Dashboard Part

	@FindBy(xpath = "//*[@class='nav-item']")
	public List<WebElement> leftSideHamburgerMenuList;

	//HomeServices Part

	@FindBy(xpath = "//*[text()='Active Services']")
	public WebElement activeServicesButton;

	@FindBy(xpath = "//*[text()='Inactive Services']")
	public WebElement inactiveServicesButton;

	@FindBy(xpath = "//*[@aria-current='page']")
	public WebElement pageIndexText;

	@FindBy(xpath = "//*[text()='Leanguage']")
	public WebElement languageServiceTextLink;

	@FindBy(xpath = "//*[text()=' Edit Service ']")
	public WebElement editServiceButton;

}
