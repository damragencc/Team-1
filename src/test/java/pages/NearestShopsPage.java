package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestShopsPage {

	public NearestShopsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//*[@class='title-set'])[5]/h2")
	public WebElement nearestShopText;

	@FindBy(xpath = "(//*[@class='title-set'])[5]/h5")
	public WebElement getNearestShopSubText;

	@FindBy(xpath = "(//*[@class='btn btn-viewall'])[5]")
	public WebElement viewAllPageButton;

	@FindBy(xpath = "(//*[@class='owl-dots'])[4]/button")
	public List<WebElement> sliderDotButtonList;

	@FindBy(xpath = "(//*[@class='owl-stage'])[6]//*[@class='shop-location']")
	public List<WebElement> sliderShopLocationList;

	@FindBy(xpath = "(//*[@class='owl-stage'])[6]//*[@class='shop-det']/h3")
	public List<WebElement> sliderShopDetailsList;

	@FindBy(xpath = "(//*[@class='owl-stage'])[6]//*[@class='visit-store']")
	public List<WebElement> sliderShopVisitStoreList;

	@FindBy(id = "shop_count")
	public WebElement shopCountSize;

	public Map<String, Object> parseCordinates(String lat, String log) {
		Double parsedLat = Double.parseDouble(lat);
		Double parsedLog = Double.parseDouble(log);

		Map<String, Object> coordinates = new HashMap<String, Object>();

		coordinates.put("latitude", parsedLat);
		coordinates.put("longitude", parsedLog);
		coordinates.put("accuracy", 1);

		return (coordinates);
	}

	public int	getIndexOfStore(String shopName) {
		int	i;

		i = 0;
		while (i < sliderShopDetailsList.size()) {
			if (sliderShopDetailsList.get(i).getText().equalsIgnoreCase(shopName)) {
				return (i);
			}
			i++;
		}
		System.out.println(shopName);
		return (-1);
	}
}
