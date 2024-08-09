package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.components.BookingListPage;
import pages.components.ProfilPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_059_BookingList {

    ProfilPage profilPage = new ProfilPage();
    BookingListPage bookingListPage = new BookingListPage();


    @Given("Acilan menude Booking List ikonuna tiklar")
    public void acilan_menude_booking_list_ikonuna_tiklar() {

        profilPage.iconBookingList.click();
    }

    @Given("Dashboard sidebar'da Booking List linkinin gorunur ve akitf oldugunu dogrular.")
    public void dashboard_sidebar_da_booking_list_linkinin_gorunur_ve_akitf_oldugunu_dogrular() {

        Assert.assertTrue(bookingListPage.linkBookingList.isDisplayed());
        Assert.assertTrue(bookingListPage.linkBookingList.isEnabled());
    }

    @Given("Booking List sayfasinda filtreme ikonunun gorunur ve aktif oldugu dogrulanir.")
    public void booking_list_sayfasinda_filtreme_ikonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        Assert.assertTrue(bookingListPage.iconFiltreleme.isDisplayed());
        Assert.assertTrue(bookingListPage.iconFiltreleme.isEnabled());
    }

    @Given("Siparisi verilen urun icin Complete Request to user linkine tiklar.")
    public void siparisi_verilen_urun_icin_complete_request_to_user_linkine_tiklar() {

        bookingListPage.linkCompleteRequestToUser.isEnabled();
        // bookingListPage.textCompleteRequestSentToUser.click();
        ReusableMethods.clickWithJS(bookingListPage.linkCompleteRequestToUser);
        ReusableMethods.bekle(2);
    }

    @Given("Cikan pop-up ekranda Confirm butonuna tiklar.")
    public void cikan_pop_up_ekranda_confirm_butonuna_tiklar() {

        bookingListPage.buttonPopUpConfirm.click();
        ReusableMethods.bekle(2);

    }

    @Given("Cİkan pop-up ekranda Okay butonuna tiklar.")
    public void c_ikan_pop_up_ekranda_okay_butonuna_tiklar() {

        bookingListPage.buttonPopUpOkay.click();
        ReusableMethods.bekle(1);

    }

    @Given("Complete Request sent to User yazisinin gorundugu dogrulanir.")
    public void complete_request_sent_to_user_yazisinin_gorundugu_dogrulanir() {

        Assert.assertTrue(bookingListPage.textCompleteRequestSentToUser.isDisplayed());
    }

    @Given("Sipari verilen urun icin Cancel the Service linkine tiklar.")
    public void sipari_verilen_urun_icin_cancel_the_service_linkine_tiklar() {

        ReusableMethods.clickWithJS(bookingListPage.linkCanceltheService);
        ReusableMethods.bekle(1);
        // bookingListPage.linkCanceltheService.click();
    }

    @Given("Acilan pop-up ekranda Reason for Cancel formuna iptal nedenini yazar.")
    public void acilan_pop_up_ekranda_reason_for_cancel_formuna_iptal_nedeni_olarak_yazar() {

        bookingListPage.formCancelReasonPopUp.sendKeys("begenilmedi");
        ReusableMethods.bekle(1);
    }

    @Given("Submit butonuna basar.")
    public void submit_butonuna_basar() {

        bookingListPage.buttonPopUpCancelSubmit.click();
        ReusableMethods.bekle(2);

    }

    @Given("Acilan pop-up ekranda okay butonuna tiklar.")
    public void acilan_pop_up_ekranda_okay_butonuna_tiklar() {

        bookingListPage.buttonPopUpOkay.click();
        ReusableMethods.bekle(1);
    }

    @Given("Sipari verilen urun icin cancelled by Provider yazisinin goruldugu dogrulanir.")
    public void sipari_verilen_urun_icin_cancelled_by_provider_yazisinin_goruldugu_dogrulanir() {

        Assert.assertTrue(bookingListPage.textCancelledByProvider.isDisplayed());
    }

    @Given("Siparisi verilen urun icin Chat linkine tiklar.")
    public void siparisi_verilen_urun_icin_chat_linkine_tiklar() {

        ReusableMethods.waitForClickablility(bookingListPage.linkChat, 2);
        Assert.assertTrue(bookingListPage.linkChat.isEnabled());
        ReusableMethods.clickWithJS(bookingListPage.linkChat);
        // bookingListPage.linkChat.click();

    }

    @Given("Acilan chat formuna yazmak istedigi mesaji girer.")
    public void acilan_chat_formuna_yazmak_istedigi_mesaji_girer() {

        Assert.assertTrue(bookingListPage.formChatBox.isEnabled());
        bookingListPage.formChatBox.sendKeys("iyi gunlerde kullanin");

    }

    @Given("Gonderme butonuna tiklar.")
    public void gonderme_linkine_tiklar() {

        bookingListPage.buttonGonder.click();

    }

    @Given("Mesajin gonderildigi dogrulanir.")
    public void mesajin_gonderildigi_dogrulanir() {

    }

    @Given("Sipariş ile ilgili {string}, {string}, {string}, {string} detaylarin gorunur oldugu dogrulanir.")
    public void sipariş_ile_ilgili_detaylarin_gorunur_oldugu_dogrulanir(String user, String bookingDate, String location, String staffs) {


        user = ReusableMethods.webElementTextAl(bookingListPage.user);
        Assert.assertEquals(ConfigReader.getProperty("userText"),user);

        bookingDate = ReusableMethods.webElementTextAl(bookingListPage.bookingDate);
        Assert.assertEquals(ConfigReader.getProperty("bookingDateText"),bookingDate);

        location = ReusableMethods.webElementTextAl(bookingListPage.location);
        Assert.assertEquals(ConfigReader.getProperty("locationText"),location);

        staffs = ReusableMethods.webElementTextAl(bookingListPage.staffs);
        Assert.assertEquals(ConfigReader.getProperty("staffsText"),staffs);


    }
}
