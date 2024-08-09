package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.AppoitmentPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US055_OdemeYapmaBolumuStepDefinitions {

    AppoitmentPage appoitmentPage = new AppoitmentPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Appointment sayfasında ki Guests alanında Proceed To Payment ve Cancel Booking butonları gorunur ve aktif olmalı.")
    public void appointment_sayfasında_ki_guests_alanında_ve_butonları_gorunur_ve_aktif_olmalı() {
        Assert.assertTrue(appoitmentPage.paymentButton.isEnabled());
        Assert.assertTrue(appoitmentPage.cancelAppt.isEnabled());
    }
    @Given("Daha fazla hizmet eklemek için Guests alanında ki service card'ında bulunan checkbox seçilebilmeli.")
    public void daha_fazla_hizmet_eklemek_için_guests_alanında_ki_service_card_ında_bulunan_checkbox_seçilebilmeli() {
       appoitmentPage.checkBox.click();
    }
    @Given("Daha fazla hizmet eklemek için Guests alanında ki service card'ında bulunan checkbox seçildikten sonra alanlar doldurularak daha fazla hizmet eklenir.")
    public void daha_fazla_hizmet_eklemek_için_guests_alanında_ki_service_card_ında_bulunan_checkbox_seçildikten_sonra_alanlar_doldurularak_daha_fazla_hizmet_eklenir() {
        appoitmentPage.servicesBox.click();
    }
    @Given("Guests alanında ki Add More linki gorunur ve aktif olmalı.")
    public void guests_alanında_ki_linki_gorunur_ve_aktif_olmalı() {
        Assert.assertTrue(appoitmentPage.addMore.isEnabled());
    }
    @Given("Add More linkine tıklanıldığında yeni bir Service card'ı açılmalı. Yeni açılan Service card'ında Remove Services linki gorunur ve aktif olmalı. Tıklanıldığında hizmet kaldırılmalı.")
    public void add_more_linkine_tıklanıldığında_yeni_bir_service_card_ı_açılmalı_yeni_açılan_service_card_ında_linki_gorunur_ve_aktif_olmalı_tıklanıldığında_hizmet_kaldırılmalı() {
        appoitmentPage.addMore.click();
        Assert.assertTrue(appoitmentPage.removeServices.isEnabled());
        appoitmentPage.removeServices.click();
    }
    @Given("Guests alanında ki Proceed To Payment butonuna tıklanıldığında Ödemeye devam edilmeli.")
    public void guests_alanında_ki_proceed_to_payment_butonuna_tıklanıldığında_ödemeye_devam_edilmeli() {
        Assert.assertTrue(appoitmentPage.paymentButton.isEnabled());
    }

}
