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

    @FindBy(id ="Profile Settings")
    public WebElement profilSettingss;  // profil ikonu menüdeki profil Setting menüsü

     @FindBy(xpath = ("//*[@class='form-control'])[1]"))
        public WebElement nameTexbox;  // ProfilSettings name textboxı


    @FindBy(xpath = ("//*[@class='form-control'])[2]"))
    public WebElement emailTextbox; // ProfilSetting e-mail textbox

    @FindBy(xpath = ("//*[@class='form-control no_only umobileno'])"))
    public WebElement mobileNumber; // ProfilSetting mobile number

    @FindBy(xpath = ("//*[@class='form-control user_dob hasDatepicker'])"))
    public WebElement DateOfBirth; // ProfilSetting Date of birth


    @FindBy(xpath = ("(//*[@class='select2-selection__rendered'])"))
    public WebElement GenderTextbox; // ProfilSetting Gender

    @FindBy(xpath = ("//*[@class='form-control'])[4]"))
    public WebElement AdressTextbox; // Profil Setting Adres

    @FindBy(xpath = ("//*[@class='form-control'])[5]"))
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



}
