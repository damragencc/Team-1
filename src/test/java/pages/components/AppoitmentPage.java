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

    @FindBy(xpath = "//button[@id='submit_button_id']")
    public WebElement paymentButton;

    @FindBy(xpath = "//a[@class='btn btn-danger cancelappt appoint-btncls']")
    public WebElement cancelAppt;

    @FindBy(xpath = "//input[@id='chkbox_1']")
    public WebElement checkBox;

    @FindBy(xpath = "//i[@class='fas fa-plus-circle']")
    public WebElement addMore;

    @FindBy(xpath = "//a[@class='remove_guest']")
    public WebElement removeServices;

    @FindBy(xpath = "//input[@id='chkbox_2']")
    public WebElement yeniServisCardCheckBox;

    @FindBy(xpath = "//div[@class='toast toast-success']")
    public WebElement successText;

    @FindBy(xpath = "//*[@id='guest_ser1']")
    public WebElement servicesBox;

    @FindBy(xpath = "//select[@id='guest_ser1']")
    public WebElement staffsBox;

    @FindBy(xpath = "//select[@id='guest_ser1']")
    public WebElement timeBox;

    @FindBy(xpath = "(//*[text()='Personalized Fitness Programs'])[2]")
    public WebElement fitnessp;


}
