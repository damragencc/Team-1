package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.components.AvailabilityPage;
import pages.components.HeaderComp;
import pages.components.RegisterPage;

import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.driver;

public class US071_WorkingDaysAndHoursStepDefinitions {

    HeaderComp headerComp=new HeaderComp();
    AvailabilityPage availabilityPage=new AvailabilityPage();
    private WebElement dropdown;



    @Given("{string} ve {string} bilgilerini girerek giris yapar")
    public void ve_bilgilerini_girerek_giris_yapar(String email, String password) {

        headerComp.performLogIn(ConfigReader.getProperty(email),ConfigReader.getProperty(password));

    }
    @Given("{string} Butonuna tiklar")
    public void butonuna_tiklarr(String string) {
        availabilityPage.providerDropdown.click();
    }
    @Given("Acılan dropdown menude {string} butonu goruntulenir")
    public void acılan_dropdown_menude_butonu_goruntulenir(String string) {

        Assert.assertTrue(availabilityPage.availabilityButton.isEnabled());
    }

    @Given("{string} butonunaa tıklar")
    public void butonunaa_tıklar(String string) {
       availabilityPage.availabilityButton.click();
    }





    @Given("{string} sayfasinda {string},{string},{string},{string},{string},{string},{string},{string} textleri goruntulenir")
    public void sayfasinda_textleri_goruntulenir(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
       availabilityPage.gunTextleri();
    }
    @Given("{string},To Time\" checkboxlarin aktif oldugu dogrulanir")
    public void to_time_checkboxlarin_aktif_oldugu_dogrulanir(String string) {
      availabilityPage.gunCheckBoxText();


    }

    @Given("{string} a checkbox kutusuna tıklar.")
    public void a_checkbox_kutusuna_tıklar(String string) {
       availabilityPage.tuesdayCheckBox.click();
    }
    @Given("{string}  b butonuna tiklar {string} {string} secer")
    public void b_butonuna_tiklar_secer(String string, String string2, String string3) {
       availabilityPage.tuesdayFromTimeDropwDown.click();
       availabilityPage.tuesdayFromTime.click();
    }
    @Given("{string} c butonuna tiklar {string} {string} secer")
    public void c_butonuna_tiklar_secer(String string, String string2, String string3) {
        availabilityPage.tuesdayToTİmeDropDown.click();
        availabilityPage.tuesdayToTime.click();
        ReusableMethods.bekle(2);

    }

    @When("{string} d checkbox kutusuna tıklar.")
    public void d_checkbox_kutusuna_tıklar(String string) {

        availabilityPage.wednesDayCheckBox.click();

    }
    @Then("{string} e  butonuna tiklar {string} {string} secer")
    public void e_butonuna_tiklar_secer(String string, String string2, String string3) {

        availabilityPage.wednesdayFromTimeDropDown.click();
        availabilityPage.wednesdayFromTime.click();
    }
    @Then("{string} f butonuna tiklar {string} {string} secer")
    public void f_butonuna_tiklar_secer(String string, String string2, String string3) {
        availabilityPage.wednesdayToTimeDropdown.click();
        availabilityPage.wednesdayToTime.click();
    }


    @Given("{string} g checkbox kutusuna tıklar.")
    public void g_checkbox_kutusuna_tıklar(String string) {
      availabilityPage.thursdayCheckBox.click();
    }
    @Given("{string} h butonuna tiklar {string} {string} secer")
    public void h_butonuna_tiklar_secer(String string, String string2, String string3) {
       availabilityPage.thursdayFromTimeDropDown.click();
       availabilityPage.thursdaydayFromTime.click();
    }
    @Given("{string} i \\(persembe) butonunaa tiklar \"{int}:{int} {string} secerr")
    public void i_persembe_butonunaa_tiklar_secerr(String string, Integer int1, Integer int2, String string2) {
      availabilityPage.thursdayToTimeDropdown.click();
      availabilityPage.thursdayyToTime.click();
    }

    @Given("{string} j checkbox kutusuna tıklar.")
    public void j_checkbox_kutusuna_tıklar(String string) {
       availabilityPage.fridayCheckBox.click();
    }
    @Given("{string} k butonuna tiklar {string} {string} secer")
    public void k_butonuna_tiklar_secer(String string, String string1, String string2) {
       availabilityPage.fridayFromTimeDropDown.click();
       availabilityPage.fridaydayFromTime.click();
    }
    @Given("{string} l butonuna tiklar {string} {string} secerr")
    public void l_butonuna_tiklar_pm_secerr(String string, String string2,String string3) {
        availabilityPage.fridayToTimeDropdown.click();
        availabilityPage.fridayyToTime.click();
        ReusableMethods.bekle(2);
    }

    @Given("{string} m checkbox kutusuna tıklar.")
    public void m_checkbox_kutusuna_tıklar(String string) {
         availabilityPage.saturdayCheckBox.click();
    }
    @Given("{string} n butonuna tiklar {string} {string} secer")
    public void n_butonuna_tiklar_secer(String string, String string2, String string3) {
       availabilityPage.saturdayFromTimeDropDown.click();
       availabilityPage.saturdayFromTime.click();
    }
    @Given("{string} o butonuna tiklar {string} {string} secerr")
    public void o_butonuna_tiklar_secerr(String string, String string2, String string3) {
      availabilityPage.saturdayToTimeDropdown.click();
      availabilityPage.saturdayToTime.click();
      ReusableMethods.bekle(2);
    }


    @Given("{string} butonuna tikla.r")
    public void butonuna_tikla_r(String string) {

        WebElement element = driver.findElement(By.id("time_submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);


    }
    @Given("{string} onay mesaji goruntulenir")
    public void onay_mesaji_goruntulenir(String string) {

        String expectedSuccesfully = "Availability Time Added Successfully";
        String actualSuccesfully = availabilityPage.succesfullyText.getText();
        Assert.assertEquals(actualSuccesfully,expectedSuccesfully);

    }




    @When("I open the {string} dropdown menu")
    public void ı_open_the_dropdown_menu(String dropdownType) {

       dropdown = driver.findElement(By.xpath(dropdownType +"//*[@class='select2-selection__arrow']"));
               dropdown.click();

    }
    @Then("I should see the following options:")
    public void ı_should_see_the_following_options(DataTable dataTable) {

        List<WebElement> options =dropdown.findElements(By.xpath("//*[@class='select2-selection__arrow']"));
        String[] expectedOptions = dataTable.asLists(String.class).toArray(new String[0]);
    }







}