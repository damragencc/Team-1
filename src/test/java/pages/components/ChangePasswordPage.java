package pages.components;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChangePasswordPage {

    public ChangePasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h4[text()='Change Password']")
    public WebElement textChangePassword;  // Change Password sayfasindaki Change Password yazisi

    @FindBy(xpath = "//input[@id='current_password']")
    public WebElement textboxCurrentPassword; // Change Password sayfasindaki Current Password textbox'ı

    @FindBy(xpath = "//input[@id='new_password']")
    public WebElement textboxNewPassword; // Change Password sayfasindaki New Password textbox'ı


    @FindBy(xpath = "//input[@id='confirm_password']")
    public WebElement textboxConfirmPassword; // Change Password sayfasindaki Confirm Password textbox'ı

    @FindBy(xpath = "//button[@id='form_submit']")
    public WebElement buttonChange; // Change Password sayfasindaki Change butonu


    public void changePasswordVisible(){

        Assert.assertTrue((textboxCurrentPassword.isDisplayed()));
        Assert.assertTrue((textboxNewPassword.isDisplayed()));
        Assert.assertTrue((textboxConfirmPassword.isDisplayed()));

    }

    public  void changePasswordEnable(){

        Assert.assertTrue((textboxCurrentPassword.isEnabled()));
        Assert.assertTrue((textboxNewPassword.isEnabled()));
        Assert.assertTrue((textboxConfirmPassword.isEnabled()));

    }




}
