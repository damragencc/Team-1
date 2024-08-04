package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.LoginLogoutPage;

import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US062_ProviderDashboardSidebarStaffsTestStepdefinitions {

    HeaderComp headerComp = new HeaderComp();

    TestPage testPage= new TestPage();
    RegisterPage registerPage=new RegisterPage();


    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Given("Anasayfayi goruntulenir")
    public void anasayfayi_goruntulenir() {
        registerPage.anaSayfaGoruntuleme.isDisplayed();
    }

    @Given("Anasayfa sag ust kisimda Login butonuna tiklanir.")
    public void anasayfa_sag_ust_kisimda_login_butonuna_tiklanir() {
        registerPage.loginNameKutusu.click();
    }

    @Given("Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir")
    public void acilan_login_kutucugunda_email_id_kismina_gecerli_provider_e_mail_girilir_ve_login_butonuna_tiklanir() {
        registerPage.loginMailKutusu.click();
        registerPage.loginMailKutusu.sendKeys(ConfigReader.getProperty("providerEmail"));
        registerPage.loginButonu.click();
    }

    @Given("Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir")
    public void acilan_password_kutucugunda_gecerli_sifre_girilir_ve_enter_butonuna_tiklanir() {
        registerPage.loginPasswordKutusu.click();
        registerPage.loginPasswordKutusu.sendKeys("providerPassword");
        registerPage.enterButonu.click();
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