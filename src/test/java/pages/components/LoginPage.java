package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import static utilities.Driver.driver;

public class LoginPage {

    LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }




}
