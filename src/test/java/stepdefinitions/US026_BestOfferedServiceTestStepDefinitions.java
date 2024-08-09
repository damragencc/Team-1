package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.chromium.HasCdp;
import pages.NearestShopsPage;
import pages.components.BestOfferedServicesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US026_BestOfferedServiceTestStepDefinitions {

    BestOfferedServicesPage bestOfferedServicesPage=new BestOfferedServicesPage();
    String bestOffered;


    @Given("Go to {string} URl")
    public void go_to_u_rl(String uRl) {
      Driver.getDriver().get(ConfigReader.getProperty(uRl));
    }
    @Given("{string} text is verified")
    public void text_is_verified(String expectedText) {
        ReusableMethods.scrollToElement(bestOfferedServicesPage.shopService);
        ReusableMethods.scrollToElement(bestOfferedServicesPage.bestOfferedServiceText);
        String actualText = bestOfferedServicesPage.bestOfferedServiceText.getText();
        ReusableMethods.wait(2);
        Assert.assertEquals(expectedText, actualText);


    }
    @Given("{string} only now text is verified")
    public void only_now_text_is_verified(String expectedText) {

        ReusableMethods.scrollToElement(bestOfferedServicesPage.bestOfferedServiceText);
        String actualText = bestOfferedServicesPage.offersValidOnlyNowText.getText();
        Assert.assertEquals(expectedText, actualText);

    }
    @Given("quit driverr")
    public void quit_driverr() {
        Driver.quitDriver();
    }

    @Given("Location information: Select {string} latitude, {string} long")
    public void location_information_select_latitude_long(String lat, String log) {

        ((HasCdp) Driver.getDriver())
                .executeCdpCommand("Emulation.setGeolocationOverride",
                      bestOfferedServicesPage  .parseCordinates(lat, log));

        Driver.getDriver().navigate().refresh();
    }
    @Given("Service Name {string} is visible and active")
    public void service_name_is_visible_and_active(String serviceName) {

        bestOfferedServicesPage.getOfService(serviceName);


    }
    @Given("Location information {string} is visible and activee")
    public void location_information_is_visible_and_activee(String Location) {

        bestOfferedServicesPage.locationServiceIndex(Location);


    }

    @Given("Service Amount {string} is visible and active")
    public void service_amount_is_visible_and_active(String serviceAmount) {

        bestOfferedServicesPage.serviceAmount(serviceAmount);


    }

}
