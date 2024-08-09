package pages;

import com.github.javafaker.Faker;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.util.List;

public class ProviderServicesPage {

	public ProviderServicesPage() {
		PageFactory.initElements(Driver.getDriver() ,this);
	}
	Faker faker;

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

	@FindBy(xpath = "//*[@class='form-control provider_datepicker hasDatepicker']")
	public WebElement dateField;

	@FindBy(id = "country_id")
	public WebElement countrySelect;

	@FindBy(id = "state_id")
	public WebElement stateSelect;

	@FindBy(id = "city_id")
	public WebElement citySelect;

	@FindBy(id = "commercial_reg")
	public WebElement commercialRegUploadButton;

	@FindBy(id = "account_holder_name")
	public WebElement accountNameField;

	@FindBy(id = "account_number")
	public WebElement accountIdField;

	@FindBy(id = "account_iban")
	public WebElement accountIbanField;

	@FindBy(id = "form_submit")
	public WebElement formUpdateButton;

	@FindBy(id = "success_message")
	public WebElement succesMessage;

	@FindBy(xpath = "//*[text()='Profile Settings']")
	public WebElement profileSettingsLinkOnHomePage;

	@FindBy(xpath = "//*[@name='pincode']")
	public WebElement postalCodeField;

	@FindBy(name = "bank_name")
	public WebElement bankNameField;

	@FindBy(name = "bank_address")
	public WebElement bankAddressField;

	@FindBy(name = "account_ifsc")
	public WebElement bankIFSCField;

	@FindBy(name = "sort_code")
	public WebElement bankSortCodeField;

	@FindBy(name = "routing_number")
	public WebElement bankRoutingNumber;

	public void performUpdateSettingsOnProvider(String date,
												String accountName,
												String accountNumber,
												String iban) {
		faker = new Faker();
		ReusableMethods.wait(3);
		ReusableMethods.scrollToElement(dateField);
		ReusableMethods.wait(3);
		dateField.clear();
		dateField.sendKeys(date);
		new Actions(Driver.getDriver())
				.click(dateField)
				.sendKeys(Keys.TAB)
				.sendKeys(faker.address().fullAddress(), Keys.TAB).perform();
		ReusableMethods.wait(3);
		ReusableMethods.selectByIndex(countrySelect, 20);
		ReusableMethods.wait(3);
		ReusableMethods.selectByIndex(stateSelect, 1);
		ReusableMethods.wait(3);
		ReusableMethods.selectByIndex(citySelect, 1);
		ReusableMethods.wait(3);
		postalCodeField.sendKeys(faker.address().zipCode());
		ReusableMethods.wait(3);

		String filePath = "data/txt/TicaretSicil.txt";
		 File file = new File(filePath);

		commercialRegUploadButton.sendKeys(file.getAbsolutePath());

		ReusableMethods.wait(3);

		ReusableMethods.scrollToElement(accountNameField);
		ReusableMethods.wait(3);

		accountNameField.clear();
		accountNameField.sendKeys(accountName);
		ReusableMethods.wait(3);
		accountIdField.clear();
		accountIdField.sendKeys(accountNumber);
		ReusableMethods.wait(3);
		accountIbanField.clear();
		accountIbanField.sendKeys(iban);
		ReusableMethods.wait(3);
		bankNameField.sendKeys("Test Bank");
		ReusableMethods.wait(3);
		bankAddressField.sendKeys(faker.address().state());
		ReusableMethods.wait(3);
		bankIFSCField.sendKeys(faker.number().digits(11));
		ReusableMethods.wait(3);
		bankSortCodeField.sendKeys(faker.number().digits(6));
		ReusableMethods.wait(3);
		bankRoutingNumber.sendKeys(faker.number().digits(9));
		ReusableMethods.wait(3);


		ReusableMethods.scrollToElement(formUpdateButton);
		ReusableMethods.wait(3);

		formUpdateButton.click();
		ReusableMethods.wait(5);
	}
}
