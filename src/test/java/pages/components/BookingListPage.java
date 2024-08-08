package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BookingListPage {

    public BookingListPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Booking List']")
    public WebElement linkBookingList; // Provider Dashboard SideBar'daki Booking List linki

    @FindBy(xpath = "//select[@id='status']")
    public WebElement iconFiltreleme; // Booking List sayfasindaki filtreleme icon

    @FindBy(xpath = "//*[@data-id=121][2]")
    public WebElement linkCompleteRequestToUser;// Booking list sayfasindaki CompleteRequestToUser link

    @FindBy(xpath = "//button[text()='confirm']")
    public WebElement buttonPopUpConfirm;
    // Booking list sayfasinda complete request sonrasi cikan pop-up ekranindaki Confir butonu

    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    public WebElement buttonPopUpOkay;
    // Booking list sayfasinda complete request sonrasi cikan pop-up ekranindaki Okay butonu

    @FindBy(xpath = "//span[text()='Complete Request sent to User']")
    public WebElement textCompleteRequestSentToUser;
    // Booking list sayfasinda complete request sonrasi cikan yazi

    @FindBy(xpath = "//*[@data-userid=22][1]")
    public WebElement linkCanceltheService; // Booking list sayfasindaki Cancel the Service linki

    @FindBy(xpath = "//textarea[@id='cancel_review']")
    public WebElement formCancelReasonPopUp;
    // Booking list sayfasinda Cancel the Service sonrasi cikan pop-up ekrandaki form

    @FindBy(xpath = "//button[@id='provider_cancel_booking']")
    public WebElement buttonPopUpCancelSubmit;
    // Booking list sayfasinda Cancel the Service sonrasi cikan pop-up ekrandaki Submit butonu

    @FindBy(xpath = "//span[text()='Cancelled by Provider']")
    public WebElement textCancelledByProvider;
    // Booking list sayfasinda cancel sonrasi cikan yazi

    @FindBy(xpath = "//div[4]//div[1]//div[2]//a[1]")
    public WebElement linkChat; // Booking list sayfasindaki chat linki

    @FindBy(xpath = "//*[@id='chat_box']")
    public WebElement formChatBox; // Booking list sayfasindaki chat linkini tiklayinca acilan chat box

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement buttonGonder; //chat box daki gonder butonu


    @FindBy(xpath = "//div[@class='content']//div[3]//div[1]//div[1]//div[1]//ul[1]//li[1]/span[1]")
    public WebElement user;

    @FindBy(xpath = "//div[@class='content']//div[3]//div[1]//div[1]//div[1]//ul[1]//li[2]/span[1]")
    public WebElement bookingDate;

    @FindBy(xpath = "//div[@class='content']//div[3]//div[1]//div[1]//div[1]//ul[1]//li[5]/span[1]")
    public WebElement location;

    @FindBy(xpath = "//div[@class='content']//div[3]//div[1]//div[1]//div[1]//ul[1]//li[8]/span[1]")
    public WebElement staffs;















}
