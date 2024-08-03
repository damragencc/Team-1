package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.LoginPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US062_ProviderDashboardSidebarStaffsTestStepdefinitions {

    HeaderComp headerComp = new HeaderComp();
    LoginPage loginPage=new LoginPage();
    TestPage testPage= new TestPage();

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenir")
    public void anasayfayi_goruntulenir() {
        loginPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Anasayfa sag ust kisimda Login butonuna tiklanir.")
    public void anasayfa_sag_ust_kisimda_login_butonuna_tiklanir() {
        loginPage.loginNameKutusu.click();
    }

    @Given("Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir")
    public void acilan_login_kutucugunda_email_id_kismina_gecerli_provider_e_mail_girilir_ve_login_butonuna_tiklanir() {
        loginPage.loginMailKutusu.click();
        loginPage.loginMailKutusu.sendKeys(ConfigReader.getProperty("providerEmail"));
        loginPage.loginButonu.click();
    }

    @Given("Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir")
    public void acilan_password_kutucugunda_gecerli_sifre_girilir_ve_enter_butonuna_tiklanir() {
        loginPage.loginPasswordKutusu.click();
        loginPage.loginPasswordKutusu.sendKeys("providerPassword");
        loginPage.enterButonu.click();
    }

    @Given("Tekrar anasayfaya donuldugunde sag ust kisimda gorunen insan figuru resmine tiklanir")
    public void tekrar_anasayfaya_donuldugunde_sag_ust_kisimda_gorunen_insan_figuru_resmine_tiklanir() {
        headerComp.insanIconu.click();
    }

    @Given("Acilan dropdown menude Dashboard'a tiklanir")
    public void acilan_dropdown_menude_dashboard_a_tiklanir() {
        headerComp.dropDownDashboard.click();
    }

    @Given("Dashboard sol kisimda sidebar'daki Staffs linki gorunur ve aktif olmalidir")
    public void dashboard_sol_kisimda_sidebar_daki_staffs_linki_gorunur_ve_aktif_olmalidir() {
        testPage.staffLinki.click();
    }

    @Given("Acilan sayfada My Staffs yazisinin gorundugu dogrulanir")
    public void Acilan_sayfada_My_Staffs_yazisinin_gorundugu_dogrulanir() {
    testPage.myStaffYazisi.isDisplayed();
    }
    @Given("Sayfa kapanir")
    public void sayfa_kapanir() {
        Driver.quitDriver();
    }
}