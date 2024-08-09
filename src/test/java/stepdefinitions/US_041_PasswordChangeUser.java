package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.components.ChangePasswordPage;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;
import pages.components.ProfilPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_041_PasswordChangeUser {

    HeaderComp headerComp = new HeaderComp();
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
    ProfilPage profilPage = new ProfilPage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @Given("Kayitli kullanici {string} ile ana sayfaya gider.")
    public void kayitli_kullanici_ile_ana_sayfaya_gider(String masterUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(masterUrl));
    }

    @Given("Kayitli kullanici Login butonuna tiklar.")
    public void login_butonuna_tiklar() {

        headerComp.mainPageLoginButton
                .click();

    }
    @Given("Acilan Login menusunde {string} girer ve Login butonuna tiklar.")
    public void acilan_login_menusunde_girer_ve_login_butonuna_tiklar(String gecerliUserEmail) {

        ReusableMethods.bekle(1);

        loginLogoutPage.mainPageLoginFormEmailbox
                .sendKeys(ConfigReader.getProperty(gecerliUserEmail));
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailbox.sendKeys(" ");
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailboxLoginButton
                .click();

    }
    @Given("Acilan Password menusunde {string} girer ve Enter butonuna tiklar.")
    public void acilan_password_menusunde_girer_ve_enter_butonuna_tiklar(String gecerliUserPassword) {

        ReusableMethods.bekle(1);

        loginLogoutPage.mainPageLoginFormPasswordbox
                .sendKeys(ConfigReader.getProperty(gecerliUserPassword));

        loginLogoutPage.mainPageLoginFormPasswordEnterButton
                .click();
    }

    @Given("Acilan sayfada Profil ikonuna tiklar")
    public void acilan_sayfada_profil_ikonuna_tiklar() {

        loginLogoutPage.profileIcon.click();

    }
    @Given("Acilan menude Change Password ikonunun gorunur ve aktif oldugu dogrulanir.")
    public void acilan_menude_change_password_ikonunun_gorunur_ve_aktif_oldugu_dogrulanir() {

        Assert.assertTrue(profilPage.iconChangePassword.isDisplayed());
        Assert.assertTrue(profilPage.iconChangePassword.isEnabled());

    }

    @Given("Acilan menude Change Password ikonuna tiklar.")
    public void acilan_menude_change_password_ikonuna_tiklar() {

        ReusableMethods.bekle(1);


        profilPage.iconChangePassword
                .click();

    }
    @Given("Change Password sayfasina yonlendirildigi dogrulanir.")
    public void change_password_sayfasina_yonlendirildigi_dogrulanir() {

        Assert.assertTrue(changePasswordPage.textChangePassword.isDisplayed());
    }

    @Given("Acilan sayfada Current Password, New Password, Confirm Password text boxlarinin gorunur ve aktif oldugu dogrulanir.")
    public void acilan_sayfada_current_password_new_password_confirm_password_text_boxlarinin_gorunur_ve_aktif_oldugu_dogrulanir() {
/*
        Assert.assertTrue((changePasswordPage.textboxCurrentPassword.isDisplayed()));
        Assert.assertTrue((changePasswordPage.textboxNewPassword.isDisplayed()));
        Assert.assertTrue((changePasswordPage.textboxConfirmPassword.isDisplayed()));

        Assert.assertTrue((changePasswordPage.textboxCurrentPassword.isEnabled()));
        Assert.assertTrue((changePasswordPage.textboxNewPassword.isEnabled()));
        Assert.assertTrue((changePasswordPage.textboxConfirmPassword.isEnabled()));
        */
    changePasswordPage.changePasswordVisible();
    changePasswordPage.changePasswordEnable();


    }
    @Given("Current Password textbox'ina {string} girer.")
    public void current_password_textbox_ina_girer(String gecerliUserPassword) {

        changePasswordPage.textboxCurrentPassword
                .sendKeys(ConfigReader.getProperty(gecerliUserPassword));

    }
    @Given("New Password textbox'ina {string} girer.")
    public void new_password_textbox_ina_girer(String gecerliUserNewPassword) {

        changePasswordPage.textboxNewPassword
                .sendKeys(ConfigReader.getProperty(gecerliUserNewPassword));
    }
    @Given("Confirm Password textbox'ina {string} tekrar girer.")
    public void confirm_password_textbox_ina_tekrar_girer(String gecerliUserNewPassword01) {

        changePasswordPage.textboxConfirmPassword
                .sendKeys(ConfigReader.getProperty(gecerliUserNewPassword01));
    }

    @Given("Change butonunu gorunur ve aktif oldugu dogrulanir.")
    public void change_butonunu_gorunur_ve_aktif_oldugu_dogrulanir() {

        Assert.assertTrue(changePasswordPage.buttonChange.isDisplayed());
        Assert.assertTrue(changePasswordPage.buttonChange.isEnabled());
    }
    @Given("Change Butonuna tiklar.")
    public void butonuna_tiklar() {


        ReusableMethods.scrollToElement(changePasswordPage.buttonChange);
        ReusableMethods.waitAndClickElement(changePasswordPage.buttonChange,1);
        //changePasswordPage.buttonChange.click();

    }
    @Given("Basarili bir sekilde sifrenin degistirildigi dogrulanir.")
    public void basarili_bir_sekilde_sifrenin_degistirildigi_dogrulanir() {

        Assert.assertFalse(changePasswordPage.buttonChange.isDisplayed());

    }


}
