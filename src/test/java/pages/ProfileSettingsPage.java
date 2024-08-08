package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProfileSettingsPage {

	public ProfileSettingsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='Profile Settings']")
	public WebElement profileSettingsLink;

	@FindBy(xpath = "//span[text()='Profile Settings']")
	public WebElement dashboardProfileSettingsLink;

	@FindBy(xpath = "//*[@class='form-control']")
	public List<WebElement> settingsFields;

	@FindBy(xpath = "(//*[@type='file'])[1]")
	public WebElement commercialRegister;
}
