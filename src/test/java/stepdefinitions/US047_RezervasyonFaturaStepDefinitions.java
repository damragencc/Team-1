package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import pages.components.TestPage;
import pages.components.UserDashboardInvoicesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.Set;

import static utilities.Driver.driver;

public class US047_RezervasyonFaturaStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    TestPage testPage = new TestPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());
    String anaSayfaUrl= "https://qa.onlinemastermarket.com/";
    String urlPipeRepair = "https://qa.onlinemastermarket.com/service-preview/Pipe-Repair?sid=9a1158154dfa42caddbd0694a4e9bdc8";
    UserDashboardInvoicesPage userDashboardInvoicesPage = new UserDashboardInvoicesPage();
    String url = "https://qa.onlinemastermarket.com/user-invoices";

    //TC01
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

    //TC02
    @Given("Birinci fatura olan Pipe Repair faturasina tiklandiginda acilan sayfanin Pipe Repair sayfasi oldugu ve sayfada Service Details yazisinin gorundugu dogrulanmalidir.")
    public void birinci_fatura_olan_pipe_repair_faturasina_tiklandiginda_acilan_sayfanin_pipe_repair_sayfasi_oldugu_ve_sayfada_service_details_yazisinin_gorundugu_dogrulanmalidir() {

        userDashboardInvoicesPage.pipeRepairResmi.click();
        ReusableMethods.wait(2);
        Assert.assertEquals("https://qa.onlinemastermarket.com/service-preview/Pipe-Repair?sid=9a1158154dfa42caddbd0694a4e9bdc8", urlPipeRepair);
        actions.moveToElement(userDashboardInvoicesPage.serviceDetailsYazisi).perform();
        Assert.assertTrue(userDashboardInvoicesPage.serviceDetailsYazisi.isDisplayed());
    }

    @Given("Birinci faturanin sag tarafinda bulunan Export butonu gorunur ve aktif olmalidir.")
    public void birinci_faturanin_sag_tarafinda_bulunan_export_butonu_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(userDashboardInvoicesPage.exportButonu.isDisplayed());
    }

    @Given("Export butonuna tiklandiginda yeni acilan sayfanin {string} oldugu dogrulanir.")
    public void export_butonuna_tiklandiginda_yeni_acilan_sayfanin_oldugu_dogrulanir(String string) {
        userDashboardInvoicesPage.exportButonu.click();
        Set<String> windowHandles = driver.getWindowHandles();
        String newWindowHandle = null;
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                newWindowHandle = handle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://qa.onlinemastermarket.com/user/dashboard/export_invoice/70", currentUrl);
    }

    @Given("Invoices sayfasinda Export All butonu gorunur ve aktif olmalidir.")
    public void ınvoices_sayfasinda_export_all_butonu_gorunur_ve_aktif_olmalidir() {
        Assert.assertTrue(userDashboardInvoicesPage.expertAllButonu.isDisplayed());
    }

    @Given("From Date To Date araligi agustos ayi araligi secilerek Export All butonuna tiklanmalidir.")
    public void from_date_to_date_araligi_agustos_ayi_araligi_secilerek_export_all_butonuna_tiklanmalidir() {
        userDashboardInvoicesPage.fromDateKutusu.click();
        userDashboardInvoicesPage.ayinIlkGunu.click();
        userDashboardInvoicesPage.toDateKutusu.click();
        userDashboardInvoicesPage.ayinSonGunu.click();
        userDashboardInvoicesPage.searchButonu.click();

    }
    @Given("Acilan yeni sayfanin linkinin {string} oldugu dogrulanmalidir.")
    public void acilan_yeni_sayfanin_linkinin_oldugu_dogrulanmalidir(String string) {
        userDashboardInvoicesPage.expertAllButonu.click();
        Set<String> windowHandles = driver.getWindowHandles();
        String newWindowHandle = null;
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                newWindowHandle = handle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://qa.onlinemastermarket.com/user/dashboard/export_muliple_invoice/01-08-2024/31-08-2024", currentUrl);
    }
    @Given("Invoices sayfasinda Search butonunun gorunur oldugu dogrulanmalidir.")
    public void ınvoices_sayfasinda_search_butonunun_gorunur_oldugu_dogrulanmalidir() {
       Assert.assertTrue(userDashboardInvoicesPage.searchButonu.isDisplayed());
    }
    @Given("From Date To Date araligi bir agustos on agustos araligi secilerek Search butonuna tiklanmalidir.")
    public void from_date_to_date_araligi_bir_agustos_on_agustos_araligi_secilerek_search_butonuna_tiklanmalidir() {
        userDashboardInvoicesPage.fromDateKutusu.click();
        userDashboardInvoicesPage.ayinIlkGunu.click();
        userDashboardInvoicesPage.toDateKutusu.click();
        userDashboardInvoicesPage.ayinOnuncuGunu.click();
        userDashboardInvoicesPage.searchButonu.click();

    }
    @Given("Arama sonucunda No records found yazisinin gorundugu dogrulanmalidir.")
    public void arama_sonucunda_no_records_found_yazisinin_gorundugu_dogrulanmalidir() {
        Assert.assertTrue(userDashboardInvoicesPage.noRecordsFoundYazisi.isDisplayed());
    }

    @Given("Invoices sayfasindayken sol ustte yer alan Online Master Market logosuna tiklanarak anasayfa acilmalidir.")
    public void ınvoices_sayfasindayken_sol_ustte_yer_alan_online_master_market_logosuna_tiklanarak_anasayfa_acilmalidir() {
        userDashboardInvoicesPage.anaSayfaLogo.click();

    }
    @Given("Acilan sayfanin linkinin {string} oldugu dogrulanmalidir.")
    public void acilan_sayfanin_linkinin_https_qa_onlinemastermarket_com_oldugu_dogrulanmalidir(String string) {
        Assert.assertEquals("https://qa.onlinemastermarket.com/", anaSayfaUrl);

    }
}

