package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class ServiceOfferPage {

	public ServiceOfferPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='table mb-0']//td[1]")
	public List<WebElement> namesOfTheServicesList;

	@FindBy(className = "table-responsive")
	public WebElement slider;

	@FindBy(xpath = "(//*[@data-id='13'])[1]")
	public WebElement editFormButton;

	@FindBy(id = "offer_percentage")
	public WebElement offerBox;

	@FindBy(id = "start_date")
	public WebElement fromDateBox;

	@FindBy(id = "end_date")
	public WebElement toDateBox;

	@FindBy(id = "start_time")
	public WebElement startHourBox;

	@FindBy(id = "end_time")
	public WebElement endHourBox;

	@FindBy(id = "edit_submit_offer")
	public WebElement editFinaliseButton;

	@FindBy(xpath = "(//*[@class='table mb-0']//tr)[2]/td")
	public List<WebElement> firstDiscountServiceDesList;

	public void performEditDiscount(String offer,
									String fromDate,
									String toDate,
									String startHour,
									String endHour) {
		scrollSliderToRight();
		ReusableMethods.wait(1);
		editFormButton.click();
		offerBox.clear();
		offerBox.sendKeys(offer);
		fromDateBox.click();
		fromDateBox.sendKeys(fromDate);
		toDateBox.click();
		ReusableMethods.wait(1);
		toDateBox.clear();
		toDateBox.sendKeys(toDate);
		toDateBox.sendKeys(Keys.ENTER);
		ReusableMethods.selectByVisibleText(startHourBox, startHour);
		ReusableMethods.selectByVisibleText(endHourBox, endHour);

		editFinaliseButton.click();
	}

	public void scrollSliderToRight() {
		Actions actions = new Actions(Driver.getDriver());

		actions.click(namesOfTheServicesList.get(0)).perform();

		for (int i = 0; i < 10; i++) {
			actions.sendKeys(Keys.ARROW_RIGHT).perform();
		}
	}


	public List<String> getStringList(String offer,
									  String fromDate,
									  String toDate,
									  String startHour,
									  String endHour,
									  List<String> list) {
		list.add(offer + "%");
		list.add(fromDate);
		list.add(toDate);
		list.add(startHour + " - " + endHour);
		return (list);
	}

	public List<String> getActualStringList() {
		List<String> actualList = new ArrayList<>();
		int size = firstDiscountServiceDesList.size();

		for (int i = 2; i < 6; i++) {
			actualList.add(firstDiscountServiceDesList.get(i).getText());
		}
		return (actualList);
	}
}
