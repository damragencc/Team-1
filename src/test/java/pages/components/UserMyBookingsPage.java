package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UserMyBookingsPage {
    public UserMyBookingsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[text()='My Bookings']")
public WebElement myBookings;

@FindBy(xpath = "//span[@class='badge badge-pill badge-prof bg-primary']")
public WebElement bookingStatusInprogress;

@FindBy(xpath = "//div[@class='booking-list']")
public List<WebElement> bookingList;

@FindBy(xpath = "//div[@class='col-xl-9 col-md-8']")
public WebElement myBookingsList;

@FindBy(xpath = "//h4[@class='widget-title mb-0']")
public WebElement myBookingsHeader;

@FindBy(xpath = "//span[@class='badge badge-pill badge-prof bg-success']")
public WebElement bookingStatusCompleteReqSendByProv;

@FindBy(xpath = "//span[@class='badge badge-pill badge-prof bg-danger']")
public WebElement bookingStatusRejectedByUser;

@FindBy(xpath = "//span[@class='badge badge-pill badge-prof bg-success']")
public WebElement bookingStatusCompletedAccepted;

@FindBy(xpath = "//div[@class='booking-action']")
public WebElement bookingAction;

@FindBy(xpath = "(//a[@class='btn btn-sm bg-info-light'])[1]")
public WebElement chatIcon;

@FindBy(xpath = "//div[@class='main-wrapper']")
public WebElement chatsPageHeader;

@FindBy(xpath = "//input[@id='search_chat_list']")
public WebElement chatSearchBox;

@FindBy(xpath = "//input[@id='chat-message']")
public WebElement typeYourMessage;

@FindBy(xpath = "//button[@id='submit']")
public WebElement submitTypeYourMessage;

@FindBy(xpath = "//div[@id='chat_box']")
public WebElement chatBox;

@FindBy(xpath = "//i[@class='far fa-edit']")
public WebElement editIcon;

@FindBy(xpath = "(//*[text()=' Cancel the Service                                            '])[1]")
public WebElement cancelTheServiceIcon;

@FindBy(xpath = "//i[@class='fas fa-check']")
public WebElement checkCompReqIcon;

@FindBy(xpath = "//i[@class='fas fa-info-circle']")
public WebElement infoReasonIcon;

@FindBy(xpath = "//p[@class='cancel_reason']")
public WebElement cancelReasonShow;

@FindBy(xpath = "//i[@class='fas fa-plus']")
public WebElement plusReviewIcon;

@FindBy(xpath = "//h2[text()='Reviews']")
public WebElement reviewsPageHeader;

@FindBy(xpath = "//select[@id='status']")
public WebElement allDropDown;

@FindBy(xpath = "//h2[text()='Appointment']")
public WebElement appointmentPageHeader;

@FindBy(xpath = "//h5[text()='Reason for Cancel']")
public WebElement reasonForCancelHeader;

@FindBy(xpath = "//textarea[@id='cancel_review']")
public WebElement reasonBox;

@FindBy(xpath = "//button[@id='provider_cancel_booking']")
public WebElement submitButton;

@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
public WebElement closeButton;

@FindBy(xpath = "//p[@class='error_cancel error']")
public WebElement reasonIsRequiredUyarisi;

    @FindBy(xpath = "//div[text()='Updated the booking status !']")
    public WebElement updatedBookingStatusUyarisi;

    @FindBy(xpath = "//button[text()='okay']")
    public WebElement okayButton;


@FindBy(xpath = "(//span[@title='Service Name'])[1]")
public  WebElement servisDetailsAppointment;

@FindBy(xpath = "//select[@id='shop_id']")
public  WebElement shopsAppointment;

@FindBy(xpath = "//input[@name='service_at']")
public WebElement radioButtonsAppoinment;

    @FindBy(xpath = "(//input[@name='service_at'])[1]")
    public WebElement radioButtonsAtShopAppoinment;

    @FindBy(xpath = "(//input[@name='service_at'])[2]")
    public WebElement radioButtonsAtHomeAppoinment;

    @FindBy(xpath = "//input[@id='service_amount']")
    public WebElement serviceAmount;

    @FindBy(xpath = "//select[@class='form-control select select2-hidden-accessible']")
    public WebElement staffDD;

    @FindBy(xpath = "//input[@id='bookingdate']")
    public WebElement dateBox;

    @FindBy(xpath = "//select[@class='form-control from_time']")
    public WebElement timeSlot;

    @FindBy(xpath = "//textarea[@id='notes']")
    public WebElement notesBox;

}
