package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.components.*;
import utilities.Driver;

public class US034_ChangePassword {
    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    ProfileSettings profileSettings = new ProfileSettings();

    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();

    ProviderInvoicesChangepaswd providerInvoicesChangepaswd = new ProviderInvoicesChangepaswd();



    @Then("Kullanıcı Dashboard profil panelinden Change Password menüsüne tıklar")
    public void kullanıcıDashboardProfilPanelindenChangePasswordMenüsüneTıklar() {
        providerInvoicesChangepaswd.changePasswordbutton.click();
    }

    @Then("Change Password sayfasında Current Password,New Password,Confirm Password text boxları görür")
    public void changePasswordSayfasındaCurrentPasswordNewPasswordConfirmPasswordTextBoxlarıGörür() {

        Assert.assertTrue(providerInvoicesChangepaswd.changepasswordTextboxlari.isDisplayed());
    }

    @Then("Şifre değiştirmek için Current Password alanı doldurur")
    public void şifreDeğiştirmekIçinCurrentPasswordAlanıDoldurur() {

        providerInvoicesChangepaswd.currentPassword.sendKeys("Urban.123",Keys.ENTER);
    }

    @Then("New Password doldurur")
    public void newPasswordDoldurur() {
        providerInvoicesChangepaswd.newPassword.sendKeys("Beyza78.",Keys.ENTER);
    }

    @Then("Confirm Password alanları doldurur")
    public void confirmPasswordAlanlarıDoldurur() {
        providerInvoicesChangepaswd.confirmPassword.sendKeys("Beyza78.",Keys.ENTER);
    }


    @Then("Kayıt etmek için Change butonuna tıklar")
    public void kayıtEtmekIçinChangeButonunaTıklar() {
        providerInvoicesChangepaswd.changebuttonn.click();
    }

    @Then("New Password e uygun olmayan karakterler yazar")
    public void newPasswordEUygunOlmayanKarakterlerYazar() {
        providerInvoicesChangepaswd.newPassword.sendKeys("Bey/*-//-+$$",Keys.ENTER);
    }

    @Then("Confirm Password alanla uygun olmayan karakterler yazar")
    public void confirmPasswordAlanlaUygunOlmayanKarakterlerYazar() {
        providerInvoicesChangepaswd.confirmPassword.sendKeys("Bey/*-//-+$$",Keys.ENTER);
    }

    @And("Provder passworde hatalı şifre yaz")
    public void provderPasswordeHatalıŞifreYaz() {
        loginLogoutPage.mainPageLoginFormPasswordbox.sendKeys("Beyzaa55.",Keys.ENTER);
        loginLogoutPage.mainPageLoginFormPasswordEnterButton
                .click();
    }

    @And("Check Your Credentials hata mesajını görüntüler")
    public void checkYourCredentialsHataMesajınıGörüntüler() {
        providerInvoicesChangepaswd.CheckYourCredentials.isDisplayed();
    }
}
