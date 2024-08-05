package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US047_RezervasyonFaturaStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    TestPage testPage = new TestPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    String url="https://qa.onlinemastermarket.com/user-invoices";

    @Given("Kkullanici {string} adresine gider")
    public void kkullanici_adresine_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Aanasayfayi goruntulenir")
    public void aanasayfayi_goruntulenir() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Aanasayfa sag ust kisimda Login butonuna tiklanir.")
    public void aanasayfa_sag_ust_kisimda_login_butonuna_tiklanir() {
        headerComp.headerLoginButton.click();
    }

    @Given("Acilan Login kutucugunda Email ID kismina gecerli kullanici e-mail girilir ve Login butonuna tiklanir")
    public void aacilan_login_kutucugunda_email_id_kismina_gecerli_kullanici_e_mail_girilir_ve_login_butonuna_tiklanir() throws InterruptedException {
        headerComp.emailIdBox.click();
        headerComp.emailIdBox.sendKeys(ConfigReader.getProperty("kullaniciMehmet"));
        headerComp.emailIdBox.sendKeys(" ", Keys.ENTER);
        registerPage.loginButonu.click();

    }

    @Given("Aacilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir")
    public void aacilan_password_kutucugunda_gecerli_sifre_girilir_ve_enter_butonuna_tiklanir() throws InterruptedException {
        headerComp.passwordBox.click();
        headerComp.passwordBox.sendKeys(ConfigReader.getProperty("passwordMehmet"));
        headerComp.passwordEnterButton.click();
    }

    @Given("Ttekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir")
    public void ttekrar_anasayfaya_donuldugunde_sag_ust_kisimda_gorunen_insan_figuru_resmine_tiklanir() {

        headerComp.insanIconu.click();
    }

    @Given("Aacilan dropdown menude Dashboard'a tiklanir")
    public void aacilan_dropdown_menude_dashboard_a_tiklanir() {
        headerComp.dropDownDashboard.click();
    }

    @Given("Dashboard sol kisimda sidebar'daki Invoices linki gorunur ve aktif olmalidir.")
    public void dashboard_sol_kisimda_sidebar_daki_ınvoices_linki_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(testPage.invoicesLinki.isDisplayed());
    }

    @Given("Dashboard sidebar'daki Invoices linkine tiklanildiginda ilgili sayfaya gidilmelidir.")
    public void dashboard_sidebar_daki_ınvoices_linkine_tiklanildiginda_ilgili_sayfaya_gidilmelidir() {
        actions.moveToElement(testPage.invoicesLinki).perform();
        testPage.invoicesLinki.click();
        Assert.assertEquals("https://qa.onlinemastermarket.com/user-invoices", url);

    }
    @Given("Acilan fatura sayfasinda {int} adet faturanin gorundugu dogrulanmalidir.")
    public void acilan_fatura_sayfasinda_adet_faturanin_gorundugu_dogrulanmalidir(Integer int1) {

    }
    @Given("Birinci fatura olan Pipe Repair faturasina tiklandiginda acilan sayfanin Pipe Repair sayfasi oldugu ve sayfada Service Details yazisinin gorundugu dogrulanmalidir.")
    public void birinci_fatura_olan_pipe_repair_faturasina_tiklandiginda_acilan_sayfanin_pipe_repair_sayfasi_oldugu_ve_sayfada_service_details_yazisinin_gorundugu_dogrulanmalidir() {

    }


}