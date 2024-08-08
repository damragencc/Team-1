package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import pages.components.ContactUsPage;
import pages.components.HeaderComp;
import pages.components.UserMyBookingsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US039_UserMyBookingsStepDefinitions {
    String message="sorry I do not have time for this";
    HeaderComp headerComp = new HeaderComp();
    UserMyBookingsPage userMyBookingsPage = new UserMyBookingsPage();
    ContactUsPage contactUsPage=new ContactUsPage();


    @Given("{string} ve {string} girerek giris yapar")
    public void ve_girerek_giris_yapar(String userEmail, String userPassword) {
        headerComp.performLogIn
                (ConfigReader.getProperty("userEmail.gokcen"), ConfigReader.getProperty("userPassword.gokcen"));
    }

    @Given("MyBookings linkine tiklar")
    public void my_bookings_linkine_tiklar() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(userMyBookingsPage.myBookings.isDisplayed());
        userMyBookingsPage.myBookings.click();

    }

    @Given("İlgili sayfaya yonlendirdigini dogrular")
    public void ilgili_sayfaya_yonlendirdigini_dogrular() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(userMyBookingsPage.myBookingsHeader.isDisplayed());
    }

    @Given("Rezervasyon listesinin goruntulenebildigini dogrular")
    public void rezervasyon_listesinin_goruntulenebildigini_dogrular() {
        Assert.assertTrue(userMyBookingsPage.myBookingsList.isDisplayed());
    }

    @Given("Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular")
    public void mybookings_basligi_altinda_durumundaki_rezervasyonlarda_asagidaki_edit_chat_cancel_the_service_butonlarinin_gorunur_oldugunu_dogrular() {
        List<String> bookingListString = ReusableMethods.stringListeDonustur(userMyBookingsPage.bookingList);
        for (int i = 0; i < bookingListString.size(); i++) {
            if (bookingListString.get(i).contains("Inprogress")) {
                Assert.assertTrue(bookingListString.get(i).contains("Chat"));
                //Assert.assertTrue(bookingListString.get(i).contains("Edit"));
                //Assert.assertTrue(bookingListString.get(i).contains("Cancel the Service"));
                Assert.assertFalse(bookingListString.get(i).contains("Complete Request Accept"));
                Assert.assertFalse(bookingListString.get(i).contains("Reviews"));
                Assert.assertFalse(bookingListString.get(i).contains("Reason"));

            }
        }
    }

    @Given("Mybookings basligi altinda Completed Accepted durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular")
    public void mybookings_basligi_altinda_completed_accepted_durumundaki_rezervasyonlarda_ilgili_butonlarin_gorunur_oldugunu_dogrular() {
        List<String> bookingListString = ReusableMethods.stringListeDonustur(userMyBookingsPage.bookingList);
        for (int i = 0; i < bookingListString.size(); i++) {
            if (bookingListString.get(i).contains("Completed Accepted")) {
                Assert.assertTrue(bookingListString.get(i).contains("Reviews"));
                Assert.assertFalse(bookingListString.get(i).contains("Edit"));
                Assert.assertFalse(bookingListString.get(i).contains("Cancel the Service"));
                Assert.assertFalse(bookingListString.get(i).contains("Complete Request Accept"));
                Assert.assertFalse(bookingListString.get(i).contains("Chat"));
                Assert.assertFalse(bookingListString.get(i).contains("Reason"));

            }
        }
    }
    @Given("Mybookings basligi altinda Complete Request sent by Provider durumundaki rezervasyonlarda ilgili butonlarin gorunur oldugunu dogrular")
    public void mybookings_basligi_altinda_complete_request_sent_by_provider_durumundaki_rezervasyonlarda_ilgili_butonlarin_gorunur_oldugunu_dogrular() {
        List<String> bookingListString = ReusableMethods.stringListeDonustur(userMyBookingsPage.bookingList);
        for (int i = 0; i < bookingListString.size(); i++) {
            if (bookingListString.get(i).contains("Complete Request sent by Provider")) {
                Assert.assertTrue(bookingListString.get(i).contains("Chat"));
                Assert.assertTrue(bookingListString.get(i).contains("Complete Request Accept"));
                Assert.assertFalse(bookingListString.get(i).contains("Cancel the Service"));
                Assert.assertFalse(bookingListString.get(i).contains("Edit"));
                Assert.assertFalse(bookingListString.get(i).contains("Reviews"));
                Assert.assertFalse(bookingListString.get(i).contains("Reason"));
    }

}}
    @Given("Home linkiyle anasayfaya donulebildigini dogrular")
    public void home_linkiyle_anasayfaya_donulebildigini_dogrular() {
    contactUsPage.contactUsPageContactUsHomeLink.click();
    Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("masterUrl"));
    }

    @Given("Header Online  Master market logosuna tıklayarak anasayfaya donuldugunu dogrular")
    public void header_online_master_market_logosuna_tıklayarak_anasayfaya_donuldugunu_dogrular() {
        contactUsPage.contactUsPageContactUsOMLogo.click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("masterUrl"));
    }
    @Given("All dropdown listesinin gorunur oldugunu dogrular")
    public void all_dropdown_listesinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(userMyBookingsPage.allDropDown.isDisplayed());
    }
    @Given("All dropdown listesinden {string} durumunu secer")
    public void all_dropdown_listesinden_durumunu_secer(String secim) {
        Select selectDD=new Select(userMyBookingsPage.allDropDown);
        ReusableMethods.bekle(2);
        selectDD.selectByVisibleText(secim);
        userMyBookingsPage.allDropDown.click();

    }
    @Given("Rezervasyon listesinde {string} durumlu rezervasyonların goruntulendigi dogrulanir")
    public void rezervasyon_listesinde_durumlu_rezervasyonların_goruntulendigi_dogrulanir(String durum) {
        List<String> bookingListString = ReusableMethods.stringListeDonustur(userMyBookingsPage.bookingList);
        for (int i = 0; i < bookingListString.size(); i++) {

                Assert.assertTrue(bookingListString.get(i).contains(durum));


        }
    }
    @Given("sayfayi yeniler")
    public void sayfayi_yeniler() {
       Driver.getDriver().navigate().refresh();
    }
    @Given("Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda bulunan Edit butonuna tıklar")
    public void mybookings_basligi_altinda_ınprogress_durumundaki_rezervasyonlarda_bulunan_edit_butonuna_tıklar() {
       userMyBookingsPage.editIcon.click();
    }

    @Given("Appointment sayfasina yonlendirildigini goruntuler")
    public void appointment_sayfasina_yonlendirildigini_goruntuler() {
        Assert.assertTrue(userMyBookingsPage.appointmentPageHeader.isDisplayed());
    }
    @Given("Mybookings basligi altinda Inprogress durumundaki rezervasyonlarda Cancel te Service butonuna tıklar")
    public void mybookings_basligi_altinda_ınprogress_durumundaki_rezervasyonlarda_cancel_te_service_butonuna_tıklar() {
       userMyBookingsPage.cancelTheServiceIcon.click();
    }

    @Given("Acilan formda Reason for cancel basligi,Reason boxı ,submit butonu ve carpi kapatma butonunun görünür oldugu dogrulanir")
    public void acilan_formda_reason_for_cancel_basligi_reason_boxı_submit_butonu_ve_carpi_kapatma_butonunun_görünür_oldugu_dogrulanir() {
    ReusableMethods.bekle(3);
        userMyBookingsPage.reasonBox.sendKeys("");
        Assert.assertTrue(userMyBookingsPage.reasonForCancelHeader.isDisplayed());
    Assert.assertTrue(userMyBookingsPage.reasonBox.isDisplayed());
    Assert.assertTrue(userMyBookingsPage.closeButton.isDisplayed());
    Assert.assertTrue(userMyBookingsPage.submitButton.isDisplayed());
    }
    @Given("Service Details altındaki bolumlerin tıklanabilir olmadıgı dogrulanır")
    public void service_details_altındaki_bolumlerin_tıklanabilir_olmadıgı_dogrulanır() {
    Assert.assertTrue(userMyBookingsPage.servisDetailsAppointment.isDisplayed());

    }

    @Given("Shops drop down menusu altında sadece ilgili firma adi goruntulendigi dogrulanır")
    public void shops_drop_down_menusu_altında_sadece_ilgili_firma_adi_goruntulendigi_dogrulanır() {
    Select selectShopDD=new Select(userMyBookingsPage.shopsAppointment);
    List<WebElement> shopsList=selectShopDD.getOptions();
    List<String>shopListString=ReusableMethods.stringListeDonustur(shopsList);
        Assert.assertEquals(shopListString.size(),1);
    }

    @Given("Do you want the service altında önceki secim dısında secim yapilamadigi tiklanabilir olmadigi dogrulanir")
    public void do_you_want_the_service_altında_önceki_secim_dısında_secim_yapilamadigi_tiklanabilir_olmadigi_dogrulanir() {
        ReusableMethods.wait(2);
        if (userMyBookingsPage.radioButtonsAppoinment.getAttribute("value").equals("2")){
            Assert.assertFalse(userMyBookingsPage.radioButtonsAtHomeAppoinment.isSelected());
        }else {
            Assert.assertFalse(userMyBookingsPage.radioButtonsAtShopAppoinment.isSelected());
        }
    }

    @Given("Service amount tutarinin degistirilebilir olmadigi dogrulanir")
    public void service_amount_tutarinin_degistirilebilir_olmadigi_dogrulanir() {
        String attribute=userMyBookingsPage.serviceAmount.getAttribute("readonly");
        if (attribute.equals("true")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }
    @Given("Staffs drop down menusunden personel isimlerinin goruntulendigi dogrulanir")
    public void staffs_drop_down_menusunden_personel_isimlerinin_goruntulendigi_dogrulanir() {
        Select selectStaffDD=new Select(userMyBookingsPage.staffDD);
        List<String> staffNames=ReusableMethods.stringListeDonustur(selectStaffDD.getOptions());
        Assert.assertFalse(staffNames.isEmpty());


    }
    @Given("Date drop down menusu altında farkli tarih secilebildigi dogrulanır")
    public void date_drop_down_menusu_altında_farkli_tarih_secilebildigi_dogrulanır() {

    userMyBookingsPage.dateBox.clear();
    userMyBookingsPage.dateBox.sendKeys("25-08-2024"+ Keys.ESCAPE);
    userMyBookingsPage.dateBox.clear();
    userMyBookingsPage.dateBox.sendKeys("22-08-2021"+ Keys.ESCAPE);

    }
    @Given("Timeslot drop down menusu altında farkli saat secilebildigi dogrulanır")
    public void timeslot_drop_down_menusu_altında_farkli_saat_secilebildigi_dogrulanır() {
        userMyBookingsPage.dateBox.clear();
        userMyBookingsPage.dateBox.sendKeys("30-08-2024"+ Keys.ESCAPE);
    Select selectTimeSlotDD=new Select(userMyBookingsPage.timeSlot);
    List<String> timeSlots=ReusableMethods.stringListeDonustur(selectTimeSlotDD.getOptions());
        Assert.assertFalse(timeSlots.isEmpty());


    }
    @Given("Notes boxına  veri girisi yapilabildigi dogrulanır")
    public void notes_boxına_veri_girisi_yapilabildigi_dogrulanır() {
    Assert.assertTrue(userMyBookingsPage.notesBox.isEnabled());
    }
    @Given("Acilan formda  kapatma butonuna basildiginda formun kapandigi dogrulanir")
    public void acilan_formda_kapatma_butonuna_basildiginda_formun_kapandigi_dogrulanir() {
        userMyBookingsPage.closeButton.click();
        Assert.assertTrue(userMyBookingsPage.cancelTheServiceIcon.isDisplayed());
    }
    @Given("Acilan formda  reason formu bos birakilarak submit butonuna tiklanir")
    public void acilan_formda_reason_formu_bos_birakilarak_submit_butonuna_tiklanir() {
    userMyBookingsPage.reasonBox.click();
    userMyBookingsPage.submitButton.click();

    }

    @Given("Reason is required uyarisi goruntulenir")
    public void reason_is_required_uyarisi_goruntulenir() {
Assert.assertTrue(userMyBookingsPage.reasonIsRequiredUyarisi.isDisplayed());
    }

    @Given("Acilan formda  reason formuna veri girilerek submit butonuna tiklanir")
    public void acilan_formda_reason_formuna_veri_girilerek_submit_butonuna_tiklanir() {

        userMyBookingsPage.reasonBox.sendKeys(message);
        userMyBookingsPage.submitButton.click();
    }

    @Given("Updated the booking status ekranı goruntulenir")
    public void updated_the_booking_status_ekranı_goruntulenir() {
    Assert.assertTrue(userMyBookingsPage.updatedBookingStatusUyarisi.isDisplayed());
    userMyBookingsPage.okayButton.click();
    }

    @Given("Bookingin durumunun Inprogressten Rejected by User a degistigi goruntulenir")
    public void bookingin_durumunun_ınprogressten_rejected_by_user_a_degistigi_goruntulenir() {
        userMyBookingsPage.infoReasonIcon.click();
        Assert.assertEquals(userMyBookingsPage.cancelReasonShow.getText(),message);

    }

    @Given("Rejected by User durumundaki rezervasyon için reason Butonuna tiklandiginda Cancellation Reason boxında girilen verinin goruntulendigi dogrulanir")
    public void rejected_by_user_durumundaki_rezervasyon_için_reason_butonuna_tiklandiginda_cancellation_reason_boxında_girilen_verinin_goruntulendigi_dogrulanir() {

    }

    @Given("Mybookings basligi altinda rezervasyonlarda chat butonuna tiklar")
    public void mybookings_basligi_altinda_ınprogress_durumundaki_rezervasyonlarda_chat_butonuna_tiklar() {
        userMyBookingsPage.chatIcon.click();
    }
    @Given("Chats sayfasina yonlendirdigi dogrulanir")
    public void chats_sayfasina_yonlendirdigi_dogrulanir() {
       Assert.assertTrue(userMyBookingsPage.chatsPageHeader.isDisplayed());
    }
    @Given("İlgili sayfada searchbox, type your message boxı goruntulendigi dogrulanir")
    public void ilgili_sayfada_searchbox_type_your_message_boxı_goruntulendigi_dogrulanir() {
        Assert.assertTrue(userMyBookingsPage.chatSearchBox.isDisplayed());
        Assert.assertTrue(userMyBookingsPage.typeYourMessage.isDisplayed());
        Assert.assertTrue(userMyBookingsPage.submitTypeYourMessage.isDisplayed());
        Assert.assertTrue(userMyBookingsPage.chatBox.isDisplayed());



    }
    @Given("İlgili sayfada  type your message boxına veri girildiginde tiklanabilir hale geldigi dogrulanir")
    public void ilgili_sayfada_type_your_message_boxına_veri_girildiginde_tiklanabilir_hale_geldigi_dogrulanir() {
        userMyBookingsPage.typeYourMessage.sendKeys("Hello");
        ReusableMethods.wait(3);
        Assert.assertTrue(userMyBookingsPage.submitTypeYourMessage.isEnabled());

    }

    @Given("Veri gonderildiginde messages kısmında goruntulendigi dogrulanir")
    public void veri_gonderildiginde_messages_kısmında_goruntulendigi_dogrulanir() {
        userMyBookingsPage.submitTypeYourMessage.click();
        ReusableMethods.wait(3);
       Assert.assertEquals(userMyBookingsPage.chatBox.getText(),"Hello");

    }
    @Given("Mybookings basligi altinda Completed Accepted durumundaki Reviews butonuna tiklandiginda ilgili sayfaya yonlendirdigi dogrulanir")
    public void mybookings_basligi_altinda_completed_accepted_durumundaki_reviews_butonuna_tiklandiginda_ilgili_sayfaya_yonlendirdigi_dogrulanir() {
        userMyBookingsPage.plusReviewIcon.click();
        Assert.assertTrue(userMyBookingsPage.reviewsPageHeader.isDisplayed());

    }




}