package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.DepositHistoryPage;
import pages.components.LoginLogoutPage;
import pages.components.ProfilPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_067_ProviderDepositHistory {

    ProfilPage profilPage = new ProfilPage();
    DepositHistoryPage depositHistoryPage = new DepositHistoryPage();
    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Provider {string} ile ana sayfaya gider.")
    public void provider_ile_ana_sayfaya_gider(String masterUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(masterUrl));
    }
    @Given("Acilan Login menusunde gecerli {string} adresi girer ve Login butonuna tiklar.")
    public void acilan_login_menusunde_gecerli_adresi_girer_ve_login_butonuna_tiklar(String providerEmail) {

        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailbox
                .sendKeys(ConfigReader.getProperty(providerEmail));
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailbox.sendKeys(" ", Keys.ENTER);
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailboxLoginButton
                .click();
    }
    @Given("Acilan Password menusunde gecerli {string} girer ve Enter butonuna tiklar.")
    public void acilan_password_menusunde_gecerli_girer_ve_enter_butonuna_tiklar(String providerPassword) {

        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormPasswordbox
                .sendKeys(ConfigReader.getProperty(providerPassword));
        loginLogoutPage.mainPageLoginFormPasswordEnterButton
                .click();
    }

    @Given("Acilan menude Dashboard ikonuna tiklar")
    public void acilan_menude_Dashboard_ikonuna_tiklar() {

        profilPage.iconDashboard.click();

    }

    @Given("Dashboard sidebar'da Deposit History linkinin gorunur ve aktif oldugu dogrulanir.")
    public void dashboard_sidebar_da_linkinin_gorunur_ve_aktif() {

        //ReusableMethods.scrollToElement(depositHistoryPage.linkDepositHistory);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);

        Assert.assertTrue(depositHistoryPage.linkDepositHistory.isDisplayed());
        Assert.assertTrue(depositHistoryPage.linkDepositHistory.isEnabled());
        ReusableMethods.bekle(1);

    }

    @Given("Dashboard sidebar'da Deposit History linkine tiklar.")
    public void dashboard_sidebar_da_linkine_tiklar() {

        ReusableMethods.scrollToElement(depositHistoryPage.linkDepositHistory);
        ReusableMethods.bekle(1);
        depositHistoryPage.linkDepositHistory.click();
        ReusableMethods.bekle(1);


    }
    @Given("Odeme listesi ve odeme bilgileri ile ilgili olarak acilan tabloda \\(Name, Date, Amount, Deposited By, Status, Deposited At) alanlarinin goruldugu dogrulanir.")
    public void odeme_listesi_ve_odeme_bilgileri_ile_ilgili_olarak_acilan_tabloda_name_date_amount_deposited_by_status_deposited_at_alanlarinin_goruldugu_dogrulanir() {

       depositHistoryPage.depositHistoryDatalariIsVisible();

    }

    @Given("Arama yapabilmek icin filtreleme ikonlari ve search box'in gorunur ve aktif oldugu dogrulanir.")
    public void arama_yapabilmek_icin_filtreleme_ikonlari_ve_search_box_in_gorunur_ve_aktif_oldugu_dogrulanir() {

        Assert.assertTrue(depositHistoryPage.textboxSearchDepositHistory.isEnabled());
    }

}
