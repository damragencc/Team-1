package pages.components;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AvailabilityPage {


    public AvailabilityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='user-img']")
    public WebElement providerDropdown;

    @FindBy(xpath = "(//*[text()='Availability'])[1]")
    public WebElement availabilityButton;

    @FindBy(xpath = "(//*[text()='Availability'])[2]")
    public WebElement availabilityText;

    @FindBy(xpath = "//*[text()='All Days            ']")
    public WebElement allDaysText;

    @FindBy(xpath ="//*[@data-select2-id='72']" )
    public WebElement fromTimeText;

    @FindBy(xpath ="//*[@data-select2-id='139']" )
    public WebElement toTimeText;

    @FindBy(xpath = "//*[text()=' Monday            ']")
    public WebElement mondayText;

    @FindBy(xpath = "//*[text()=' Tuesday            ']")
    public WebElement tuesdayText;

    @FindBy(xpath = "//*[text()=' Wednesday            ']")
    public WebElement wednesdayText;

    @FindBy(xpath = "//*[text()=' Thursday            ']")
    public WebElement thursdayText;

    @FindBy(xpath = "//*[text()=' Friday            ']")
    public WebElement fridayText;

    @FindBy(xpath = "//*[text()=' Saturday            ']")
    public WebElement saturdayText;

    @FindBy(xpath = "//*[text()=' Sunday            ']")
    public WebElement sundayText;




    @FindBy(xpath = "//*[@data-id='1']")
    public WebElement mondayCheckBox;

    @FindBy(xpath = "//*[@value='3']")
    public WebElement wednesDayCheckBox;

    @FindBy(xpath = "//*[@value='2']")
    public WebElement tuesdayCheckBox;

    @FindBy(xpath = "//*[@value='4']")
    public WebElement thursdayCheckBox;

    @FindBy(xpath = "//*[@value='5']")
    public WebElement fridayCheckBox;

    @FindBy(xpath = "//*[@value='6']")
    public WebElement saturdayCheckBox;







     @FindBy(xpath = "(//*[text()='Select Time'])[8]")
     public WebElement tuesdayFromTimeDropwDown;

      @FindBy(xpath = "(//*[@class='select2-results__option'])[19]")
      public WebElement tuesdayFromTime;

      @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[6]")
      public WebElement tuesdayToTİmeDropDown;

      @FindBy(xpath = "(//*[@class='select2-results__option'])[9]")
       public WebElement tuesdayToTime;






       @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[7]")
       public WebElement wednesdayFromTimeDropDown;

       @FindBy(xpath ="(//*[@class='select2-results__option'])[19]" )
       public WebElement wednesdayFromTime;


        @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[8]")
        public WebElement wednesdayToTimeDropdown;

       @FindBy(xpath = "(//*[@class='select2-results__option'])[9]")
       public WebElement wednesdayToTime;




    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[9]")
    public WebElement thursdayFromTimeDropDown;

    @FindBy(xpath ="(//*[@class='select2-results__option'])[19]" )
    public WebElement thursdaydayFromTime;


    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[10]")
    public WebElement thursdayToTimeDropdown;

    @FindBy(xpath = "(//*[@class='select2-results__option'])[8]")
    public WebElement thursdayyToTime;




    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[11]")
    public WebElement fridayFromTimeDropDown;

    @FindBy(xpath ="(//*[@class='select2-results__option'])[19]" )
    public WebElement fridaydayFromTime;


    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[12]")
    public WebElement fridayToTimeDropdown;

    @FindBy(xpath = "(//*[@class='select2-results__option'])[8]")
    public WebElement fridayyToTime;





    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[13]")
    public WebElement saturdayFromTimeDropDown;

    @FindBy(xpath ="(//*[@class='select2-results__option'])[19]" )
    public WebElement saturdayFromTime;


    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[14]")
    public WebElement saturdayToTimeDropdown;

    @FindBy(xpath = "(//*[@class='select2-results__option'])[5]")
    public WebElement saturdayToTime;

    @FindBy(xpath = "//*[@id='time_submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "//*[text()='Availability Time Added Successfully']")
    public WebElement succesfullyText;

    public void gunTextleri(){


        Assert.assertTrue(allDaysText.isDisplayed());
        Assert.assertTrue(mondayText.isDisplayed());
        Assert.assertTrue(thursdayText.isDisplayed());
        Assert.assertTrue(wednesdayText.isDisplayed());
        Assert.assertTrue(fridayText.isDisplayed());
        Assert.assertTrue(saturdayText.isDisplayed());
        Assert.assertTrue(sundayText.isDisplayed());
    }

    public void gunCheckBoxText(){


        Assert.assertTrue(mondayCheckBox.isEnabled());
        Assert.assertTrue(tuesdayCheckBox.isEnabled());
        Assert.assertTrue(thursdayCheckBox.isEnabled());
        Assert.assertTrue(wednesDayCheckBox.isEnabled());
        Assert.assertTrue(fridayCheckBox.isEnabled());
        Assert.assertTrue(saturdayCheckBox.isEnabled());
        Assert.assertTrue(saturdayCheckBox.isEnabled());
    }



    }