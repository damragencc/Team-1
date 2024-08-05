package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PageChat;
import utilities.Driver;

public class US_035_PageChat {

    PageChat pageChat = new PageChat();

    @Given("Login penceresinde bulunan Email alanina {string} ve password alanina {string} girin")
    public void login_penceresinde_bulunan_email_alanina_ve_password_alanina_girin(String email, String password) {

        pageChat.performLogin(email, password);

    }

    @Given("Anasayfada header bolumunde bulunan user iconuna tiklayin")
    public void anasayfada_header_bolumunde_bulunan_user_iconuna_tiklayin() {

        pageChat.iconUser.click();

    }

    @Given("Acilan menude Chat linkinin gorunur oldugunu dogrulayin")
    public void acilan_menude_chat_linkinin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.linkChats.isDisplayed());

    }

    @Given("Chat linkine tiklayin")
    public void chat_linkine_tiklayin() {

        pageChat.linkChats.click();

    }

    @Given("Sayfanin chats sayfasi oldugunu dogrulayin")
    public void sayfanin_chats_sayfasi_oldugunu_dogrulayin() {

        String expectedPageChatsUrl = "https://qa.onlinemastermarket.com/user-chat";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPageChatsUrl, actualUrl);

    }

    @Given("Chat sayfasinda bulunan search alaninin gorunur oldugunu dogrulayin")
    public void chat_sayfasinda_bulunan_search_alaninin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.searchBox.isDisplayed());

    }

    @Given("Search alaninda arama yapilabildigini dogrulayin")
    public void search_alaninda_arama_yapilabildigini_dogrulayin() {

        Assert.assertTrue(pageChat.searchBox.isEnabled());

    }

    @Given("Chat sayfasinda bulunan text alaninin gorunur oldugunu dogrulayin")
    public void chat_sayfasinda_bulunan_text_alaninin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.fieldMessage.isDisplayed());

    }

    @Given("Chat sayfasinda bulunan text alaninin aktif oldugunu dogrulayin")
    public void chat_sayfasinda_bulunan_text_alaninin_aktif_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.fieldMessage.isEnabled());

    }


    @Given("Submit butonunun gorunur oldugunu dogrulayin.")
    public void submit_butonunun_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.buttonSubmit.isDisplayed());

    }

    @Given("Submit butonunun tiklanabilir oldugunu dogrulayin.")
    public void submit_butonunun_tiklanabilir_oldugunu_dogrulayin() {

        Assert.assertTrue(pageChat.buttonSubmit.isEnabled());
    }


}
