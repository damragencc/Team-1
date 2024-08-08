package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestOfferedServicesPage {

    public BestOfferedServicesPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Best Offered Services']")
    public WebElement bestOfferedServiceText;

    @FindBy(xpath = "//*[text()='Offers valid only now']")
    public WebElement offersValidOnlyNowText;

    @FindBy(xpath = "(//*[@class='owl-stage'])[5]//*[@class='featute-info']/h4")
    public List<WebElement> sliderServiceList;


    @FindBy(xpath = "(//*[@class='owl-stage'])[5]//*[@class='service-location']")
    public List<WebElement> sliderServiceLocationList;

    @FindBy(xpath = "(//*[text()='Digital Nexus Solutions'])[3]")
    public WebElement shopService;

    @FindBy(xpath = "(//*[@class='owl-stage'])[5]//*[@class='featute-info']/h6")
    public List<WebElement> sliderServiceAmount;















    public Map<String, Object> parseCordinates(String lat, String log) {
        Double parsedLat = Double.parseDouble(lat);
        Double parsedLog = Double.parseDouble(log);

        Map<String, Object> coordinates = new HashMap<String, Object>();

        coordinates.put("latitude", parsedLat);
        coordinates.put("longitude", parsedLog);
        coordinates.put("accuracy", 1);

        return (coordinates);
    }


    public void	getOfService(String serviceName) {
        int i;
        i = 0;
        while (i < sliderServiceList.size()) {
            if (sliderServiceList.get(i).getText().equalsIgnoreCase(serviceName)) {

                Assert.assertTrue(true);

                return;
            }
            i++;

        }
        Assert.fail(serviceName +" ," + ReusableMethods.stringListeDonustur(sliderServiceList));

    }

    public void locationServiceIndex(String location) {

        int i = 0;

        List<String >LocationList=ReusableMethods.stringListeDonustur(sliderServiceLocationList);
        System.out.println(location + "," +LocationList);
        Assert.assertTrue(LocationList.contains(location));

       /* while (i < sliderServiceLocationList.size()) {
            if (sliderServiceLocationList.get(i).getText().equalsIgnoreCase(location)) {

                Assert.assertTrue(true);

                return;
            }
            i++;
      } */
      //  Assert.fail(location + "," + ReusableMethods.stringListeDonustur(sliderServiceLocationList));
    }

    public void serviceAmount(String amount) {

        int i = 0;
        while (i < sliderServiceAmount.size()) {
            if (sliderServiceAmount.get(i).getText().equalsIgnoreCase(amount)) {
               Assert.assertTrue(true);

               return;
            }
            i++;
        }
        Assert.fail(amount + "," +ReusableMethods.stringListeDonustur(sliderServiceAmount));

    }

    }








