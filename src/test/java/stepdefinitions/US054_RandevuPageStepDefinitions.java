package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.AppoitmentPage;
import pages.components.ShopsServicesPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US054_RandevuPageStepDefinitions {

    ShopsServicesPage shopsServicesPage = new ShopsServicesPage();

    AppoitmentPage appoitmentPage = new AppoitmentPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Book Service butonuna tıklanıldığında Appointment sayfasına yonlendirilmelidir")
    public void book_service_butonuna_tıklanıldığında_appointment_sayfasına_yonlendirilmelidir() {
        shopsServicesPage.bookService.click();
        Assert.assertTrue(appoitmentPage.appointmentText.isDisplayed());
    }
    @Given("Appointment sayfasında ki Book Service alanında Confirm Booking ve Cancel Booking butonları gorunur ve aktif olmalidir")
    public void appointment_sayfasında_ki_book_service_alanında_confirm_booking_ve_cancel_booking_butonları_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(appoitmentPage.confirmBooking.isEnabled());
        Assert.assertTrue(appoitmentPage.cancelBooking.isEnabled());
    }
    @Given("Book Service alanında ki alanlar doldurularak rezervasyon doğrulanmalidir")
    public void book_service_alanında_ki_alanlar_doldurularak_rezervasyon_doğrulanmalidir() {
        appoitmentPage.staffs.click();
        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(appoitmentPage.okayButton.isEnabled());
        appoitmentPage.okayButton.click();





    }


}
