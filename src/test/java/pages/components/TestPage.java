
package pages.components;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class TestPage {

    public TestPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='fas fa-users']")
    public WebElement staffLinki; // Provider Dashboard sayfası Staff Linki

    @FindBy (xpath = "//*[@class='widget-title']")
    public WebElement myStaffYazisi;

    @FindBy(xpath = "//*[@id='shops-tab']")
    public WebElement shopsButonu;

    @FindBy(xpath = "//*[text()='AquaShield Plumbing']")          //HomeService-Shops-AquSield
    public WebElement shopsAquaShieldPlumbing;

    @FindBy(xpath = "//*[text()='VoltMaster Solutions']")         //HomeService-Shops-Volt Master
    public WebElement shopVoltMasterSolutions;

    @FindBy(xpath = "//*[text()='Sun Painting']")                 //HomeService-Shops-Sun Painting
    public WebElement shopsSunPainting;

    @FindBy(xpath = "//*[text()='Serene Home Cleaning']")         //HomeService-Shops-Serene Home Cleaning
    public WebElement shopsSereneHomeCleaning;

    @FindBy(xpath = "(//*[text()='Visit Store '])[3]")             //HomeService-Shops-AquSield-Visit
    public  WebElement aquShieldVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[4]")             //HomeService-Shops-Volt Master-Visit
    public  WebElement volMasterdVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[5]")              //HomeService-Shops-Sun Painting
    public  WebElement sunPaintingVisitButonu;

    @FindBy(xpath = "(//*[text()='Visit Store '])[6]")               //HomeService-Shops-Serene Home Cleaning-Visit
    public  WebElement sereneHomeVisitButonu;

    @FindBy(xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsText;

    @FindBy(xpath = "//*[text()='Services']")
    public WebElement servicesText;

    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement shopAvailabilityText;

    @FindBy(xpath = "//*[text()='3 Services']")
    public WebElement threeServicesButonu;


    @FindBy(xpath = "//*[text()='Leak Detection']")
    public WebElement serviceLeakDetection;

    @FindBy(xpath = "//*[text()='Pipe Repair']")
    public WebElement servicePipeRepair;

    @FindBy(xpath = "//*[text()='Drain Cleaning']")
    public WebElement serviceDrainCleaning;

    @FindBy(xpath = "//*[text()='$300']")
    public WebElement leakDetectionAmount;

    @FindBy(xpath = "//*[text()='$450']")
    public WebElement pipeRepairAmount;

    @FindBy(xpath = "//*[text()='$400']")
    public WebElement drainCleaningAmount;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[1]")
    public WebElement leakDetectionLocation;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[2]")
    public WebElement pipeRepairLocation;

    @FindBy(xpath = "(//*[text()=' Mississippi'])[3]")
    public WebElement drainCleaningLocation;


    @FindBy(xpath = "//*[text()='Service Details']")
    public WebElement leakDetectionServiceDetailsText;

    @FindBy(xpath = "(//*[text()='$300'])[2]")
    public WebElement leakDetectionServiceAmountText;

    @FindBy(xpath = "//*[text()='Service Provider']")
    public WebElement leakDetectionServiceProviderText;

    @FindBy(xpath = "//*[text()='Service Availability']")
    public WebElement leakDetectionServiceAvailabilityText;

    @FindBy(xpath = "//*[text()='Additional Services']")
    public WebElement leakDetectionAdditionalServicesText;


    @FindBy(xpath = "//*[text()='Related Services']")
    public WebElement leakDetectionRelatedServicesText;










































  public void leakDetectionServiceTexts(){


      Assert.assertTrue(leakDetectionAdditionalServicesText.isDisplayed());
      Assert.assertTrue(leakDetectionRelatedServicesText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceAmountText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceAvailabilityText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceProviderText.isDisplayed());
      Assert.assertTrue(leakDetectionServiceDetailsText.isDisplayed());

  }





  public void aquaShieldPlumbingServiceAmountsveLocations(){

      Assert.assertTrue(leakDetectionAmount.isDisplayed());
      Assert.assertTrue(pipeRepairAmount.isDisplayed());
      Assert.assertTrue(drainCleaningAmount.isDisplayed());

      Assert.assertTrue(leakDetectionLocation.isDisplayed());
      Assert.assertTrue(pipeRepairLocation.isDisplayed());
      Assert.assertTrue(drainCleaningLocation.isDisplayed());

  }

  public void aquaShieldPlumbingServiceCesitleri(){

      Assert.assertTrue(serviceLeakDetection.isDisplayed());
      Assert.assertTrue(servicePipeRepair.isDisplayed());
      Assert.assertTrue(serviceDrainCleaning.isDisplayed());
  }




    public void homeServiceShops(){

        Assert.assertTrue(shopsAquaShieldPlumbing.isDisplayed());
        Assert.assertTrue(shopVoltMasterSolutions.isDisplayed());
        Assert.assertTrue(shopsSunPainting.isDisplayed());
        Assert.assertTrue(shopsSereneHomeCleaning.isDisplayed());
    }

    public void shopsVisitStoreButonları(){


        Assert.assertTrue(aquShieldVisitButonu.isEnabled());
        Assert.assertTrue(sereneHomeVisitButonu.isEnabled());
        Assert.assertTrue(sunPaintingVisitButonu.isEnabled());
        Assert.assertTrue(volMasterdVisitButonu.isEnabled());
    }


    public void aquaShieldPlumbingTextleri(){

        Assert.assertTrue(shopDetailsText.isDisplayed());
        Assert.assertTrue(shopAvailabilityText.isDisplayed());
        Assert.assertTrue(servicesText.isDisplayed());
    }


    public void aquaShieldPlumbingServisLocations(){


        Assert.assertTrue(leakDetectionLocation.isDisplayed());
        Assert.assertTrue(pipeRepairLocation.isDisplayed());
        Assert.assertTrue(drainCleaningLocation.isDisplayed());
    }


}






























