package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppoitmentPage {

    public AppoitmentPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//h2[normalize-space()='Appointment']")
    public WebElement appointmentText;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement confirmBooking;

    @FindBy(xpath = "//a[@class='btn btn-danger appoint-btncls']")
    public WebElement cancelBooking;

    @FindBy(xpath = "//span[@id='select2-staff_id-container']")
    public WebElement staffs;

    @FindBy(xpath = "//div[@class='category-lists']//a[normalize-space()='Personal Services']")
    public WebElement personelServicesButton;

    @FindBy(xpath = "//a[@title='Sub Category']")
    public WebElement healthButton;

    @FindBy(xpath = "//*[@class='swal-button swal-button--confirm']")
    public WebElement okayButton;


}
