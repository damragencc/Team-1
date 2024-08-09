package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class ProfileSettings {
    public ProfileSettings(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath =("//*[text()='Profile Settings']"))
    public WebElement profilSettingss;  // profil ikonu menüdeki profil Setting menüsü

     @FindBy(xpath = ("//*[@class='form-control'])[1]"))
        public WebElement nameTexbox;  // ProfilSettings name textboxı


    @FindBy(xpath = ("//*[@class='form-control'])[2]"))
    public WebElement emailTextbox; // ProfilSetting e-mail textbox

    @FindBy(xpath = ("(//*[@class='form-control no_only umobileno'])"))
    public WebElement mobileNumber; // ProfilSetting mobile number

    @FindBy(xpath = ("(//*[@class='form-control user_dob hasDatepicker'])"))
    public WebElement DateOfBirth; // ProfilSetting Date of birth


    @FindBy(xpath = ("(//*[@class='select2-selection__rendered'])"))
    public WebElement GenderTextbox; // ProfilSetting Gender

    @FindBy(xpath = ("(//*[@class='form-control'])[4]"))
    public WebElement AdressTextbox; // Profil Setting Adres

    @FindBy(xpath = ("(//*[@class='form-control'])[5]"))
    public WebElement CountyTextbox; // ProfilSetting Country

    @FindBy(xpath = ("(//*[@class='form-control'])[6]"))
    public WebElement SatateTextbox; // ProfilSetting State

    @FindBy(xpath = ("(//*[@class='form-control'])[7]"))
    public WebElement CityTextbox; // Profil Setting City

    @FindBy(xpath = ("(//*[@class='form-control'])[8]"))
    public WebElement PostalCodeTextbox; // Profil Setting postal code

    @FindBy(xpath = ("(//*[@class='btn btn-primary ps-5 pe-5'])"))
    public WebElement ProfilSettingUptade; // Uptade

    @FindBy(xpath = ("//*[@class='breadcrumb-item']"))
    public  WebElement homebutton; // ProfilSetting Home button

    @FindBy(xpath = ("(//input[@type='password'])[3]"))
    public  WebElement passwordboxbuton; //password login yeri

    @FindBy(xpath = ("(//*[@class='login-btn'])[4]"))
    public  WebElement Loginbutton;

    @FindBy(xpath = ("(//input[@type='password'])[3]"))
    public  WebElement passwordbutton;

    @FindBy(xpath = ("//*[@class='header sticktop']"))
    public WebElement headerbolumu;

    @FindBy(xpath = (" (//*[@class='fas fa-chevron-down'])[1]"))
    public WebElement shopsHeader;


    @FindBy(xpath = ("(//*[contains(text(), 'Products')])[1]"))
    public WebElement productHeader;

    @FindBy(xpath = ("(//*[contains(text(), 'Shops & Services')])[1]"))
    public WebElement ShopsaltmenusuShops;

    @FindBy(xpath = ("//*[@class='feather-shopping-cart']"))
    public WebElement shoppingSimgesi;

    @FindBy(xpath = ("//*[@class='breadcrumb-title']"))
    public WebElement productlistsayfasikontorl;

    @FindBy(xpath = ("//*[text()='COSLUS Facial Cleansing Brush Face Scrubber']"))
    public WebElement listedekiUrun;

    @FindBy(xpath = ("//*[@class='product-detail accordion-detail']"))
    public WebElement listUrunBilgileri;

    @FindBy(xpath = ("//*[@class='btn btn-prod-addcart add_cart_btn']"))
    public WebElement AddTiCartButton;

    @FindBy(xpath = ("(//*[@class='cart-btn add_cart_btn add'])[4]"))
    public WebElement listedeliAddToCart;

    @FindBy(xpath = ("//*[@class='breadcrumb-title']"))
    public WebElement shoppingsepetekiUrunler;

    @FindBy(xpath = ("//*[@class='col-xl-9 col-md-8']"))
    public WebElement ProfilSettingAlanları;

    @FindBy(xpath = ("//span[@title='Female']"))
    public WebElement FemaleGender;

    @FindBy(xpath = ("//*[@class='select2-selection select2-selection--single']"))
    public WebElement GenderButon;

    @FindBy(xpath = ("(//option[@value='6'])[1]"))
    public WebElement ulkeSecimi;

    @FindBy(xpath = ("(//option[text()='Benguela'])[1]"))
    public WebElement statesecimiii;

    @FindBy(xpath = ("//option[text()='Lobito']"))
    public WebElement cityysecimii;







}
