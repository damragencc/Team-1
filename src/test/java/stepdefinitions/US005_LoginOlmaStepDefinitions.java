package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US005_LoginOlmaStepDefinitions {

    HeaderComp headerComp = new HeaderComp();

    Actions actions = new Actions(Driver.getDriver());
    @Given("Anasayfa header bölümünde Login linki gorunur ve aktif olmali.")
    public void anasayfa_header_bölümünde_login_linki_gorunur_ve_aktif_olmali() {
        Assert.assertTrue(headerComp.headerLoginButton.isEnabled());
    }
    @Given("Login modal'ında LOGIN ve Access to our Online Master Market text'leri gorunur olmali.")
    public void login_modal_ında_logın_ve_access_to_our_online_master_market_text_leri_gorunur_olmali() {
        headerComp.headerLoginButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(headerComp.loginText.isDisplayed());
    }
    @Given("Login modal'ında Email ID textboxi görünür ve aktif olmalı")
    public void login_modal_ında_email_ıd_textboxi_görünür_ve_aktif_olmalı() {
        Assert.assertTrue(headerComp.emailIdBox.isEnabled());
    }
    @Given("Login modal'ında Login butonu gorunur ve aktif olmali.")
    public void login_modal_ında_login_butonu_gorunur_ve_aktif_olmali() {
        Assert.assertTrue(headerComp.emailLoginButton.isEnabled());
    }

    @Given("Login modal'ında Email ID textboxina gecersiz email girildiginde hata mesaji goruntulenmeli.")
    public void login_modal_ında_email_ıd_textboxina_gecersiz_email_girildiginde_hata_mesaji_goruntulenmeli() {
        headerComp.emailIdBox.sendKeys("toprakyemelek.user");
        ReusableMethods.wait(2);
        Assert.assertTrue(headerComp.mailHataText.isDisplayed());
    }
    @Given("Login modal'ında bir Email ID girilip Login olunduğunda PASSWORD ve Verification your account text'leri gorunur olmali.")
    public void login_modal_ında_bir_email_ıd_girilip_login_olunduğunda_password_ve_verification_your_account_text_leri_gorunur_olmali() {
        headerComp.mailGiris("@ommarket.com");
        Assert.assertTrue(headerComp.passwordText.isDisplayed());
    }
    @Given("Login modal'ında password textboxi görünür ve aktif olmalı")
    public void login_modal_ında_password_textboxi_görünür_ve_aktif_olmalı() {
        Assert.assertTrue(headerComp.passwordBox.isEnabled());
    }
    @Given("Login modal'ında Enter butonu gorunur ve aktif olmali.")
    public void login_modal_ında_enter_butonu_gorunur_ve_aktif_olmali() {
        Assert.assertTrue(headerComp.passwordEnterButton.isEnabled());
    }
    @Given("Login modal'ında Click to Get Link linki gorunur ve aktif olmali.")
    public void login_modal_ında_click_to_get_link_linki_gorunur_ve_aktif_olmali() {
        Assert.assertTrue(headerComp.clickToGetLink.isEnabled());
    }

    @Given("Login modal'ında password textboxina gecersiz password girilip Enter butonuna tiklandiginda hata mesaji goruntulenmeli.")
    public void login_modal_ında_password_textboxina_gecersiz_password_girilip_enter_butonuna_tiklandiginda_hata_mesaji_goruntulenmeli() {
        headerComp.passwordBox.sendKeys("Ommarket.");
        headerComp.passwordEnterButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(headerComp.passwordHataText.isDisplayed());
    }
    @Given("Login modal'ında gecerli bilgiler girilip Enter butonuna tiklandiginda sisteme giris yapilabilmeli.")
    public void login_modal_ında_gecerli_bilgiler_girilip_enter_butonuna_tiklandiginda_sisteme_giris_yapilabilmeli() {
        headerComp.passwordEnterButton.click();
        ReusableMethods.wait(2);
        headerComp.passwordBox.sendKeys("2607");
        headerComp.passwordEnterButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(headerComp.profilIkonu.isEnabled());
    }

}
