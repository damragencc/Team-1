package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;

import pages.components.MovingTransportationPage;
import pages.components.RegisterPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US062_ProviderDashboardSidebarStaffsTestStepdefinitions {

    HeaderComp headerComp = new HeaderComp();
    TestPage testPage = new TestPage();
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());
    MovingTransportationPage movingTransportationPage=new MovingTransportationPage();

    //TC01
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
        headerComp.headerLoginButton.click();
    }

    @Given("Acilan Login kutucugunda Email ID kismina gecerli provider e-mail girilir ve Login butonuna tiklanir")
    public void acilan_login_kutucugunda_email_id_kismina_gecerli_provider_e_mail_girilir_ve_login_butonuna_tiklanir() throws InterruptedException {
        headerComp.emailIdBox.click();
        headerComp.emailIdBox.sendKeys(ConfigReader.getProperty("providerEmail"));
        headerComp.emailIdBox.sendKeys(" ", Keys.ENTER);

        registerPage.loginButonu.click();


    }

    @Given("Acilan Password kutucugunda gecerli sifre girilir ve Enter butonuna tiklanir")
    public void acilan_password_kutucugunda_gecerli_sifre_girilir_ve_enter_butonuna_tiklanir() throws InterruptedException {
        headerComp.passwordBox.click();
        headerComp.passwordBox.sendKeys(ConfigReader.getProperty("providerPassword"));
        headerComp.passwordEnterButton.click();
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
        actions.moveToElement(testPage.staffLinki).perform();
        testPage.staffLinki.click();
    }

    @Given("Acilan sayfada My Staffs yazisinin gorundugu dogrulanir")
    public void Acilan_sayfada_My_Staffs_yazisinin_gorundugu_dogrulanir() {
        Assert.assertTrue(testPage.myStaffYazisi.isDisplayed());
    }

    @Given("Sayfa kapanir")
    public void sayfa_kapanir() {
        Driver.quitDriver();
    }

    //TC02
    @Given("Dashboard sol kisimda sidebar'daki Staffs linkine tiklanir")
    public void dashboard_sol_kisimda_sidebar_daki_staffs_linkine_tiklanir() {
        actions.moveToElement(testPage.staffLinki).perform();
        testPage.staffLinki.click();
    }

    @Given("Dashboard sidebar'daki Staffs linkine tiklanildiginda ikinci sirada Necmiye Melike ADIGUZEL isimli personel ismi goruntulenmelidir")
    public void dashboard_sidebar_daki_staffs_linkine_tiklanildiginda_ikinci_sirada_necmiye_melike_adıguzel_isimli_personel_ismi_goruntulenmelidir() {
        Assert.assertTrue(testPage.personelMelikeAdiguzelYazisi.isDisplayed());
    }

    //TC03
    @Given("Acilan My Staffs sayfasinda mevcut personellerden ikinci siradaki personel bilgilerinde degisiklik yapmak icin action kismindan edit staff ikonuna tiklanir.")
    public void acilan_my_staffs_sayfasinda_mevcut_personellerden_ikinci_siradaki_personel_bilgilerinde_degisiklik_yapmak_icin_action_kismindan_edit_staff_ikonuna_tiklanir() {
        testPage.staffEditIconu.click();
    }

    @Given("ilgili personelin mevcut tel numarasi {int} iken {int} olarak degistirilip Next butonuna tiklanir.")
    public void ilgili_personelin_mevcut_tel_numarasi_iken_olarak_degistirilip_next_butonuna_tiklanir(Integer int1, Integer int2) {
        actions.moveToElement(testPage.mobileNoKutusu).perform();
        testPage.mobileNoKutusu.click();
        for (int i = 0; i < 10; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }
        testPage.mobileNoKutusu.sendKeys("1111111111");
        actions.moveToElement(testPage.nextButonu).perform();
        testPage.nextButonu.click();
    }

    @Given("Acilan yeni sayfadaki Submit butonuna tiklanir ve sag ustte Staff Details Updated successfully uyarisinin yazisinin belirdigi dogrulanir.")
    public void acilan_yeni_sayfadaki_submit_butonuna_tiklanir_ve_sag_ustte_staff_details_updated_successfully_uyarisinin_yazisinin_belirdigi_dogrulanir() {
        ReusableMethods.wait(1);
        actions.moveToElement(testPage.submitButonu).perform();
        testPage.submitButonu.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(testPage.staffDetailsUpdatedSuccessfullyYazisi.isDisplayed());
    }

    @Given("My Staffs sayfasinda mevcut personellerden ikinci siradaki personel bilgilerini goruntulemek icin action kismindan staff details ikonuna tiklanir.")
    public void my_staffs_sayfasinda_mevcut_personellerden_ikinci_siradaki_personel_bilgilerini_goruntulemek_icin_action_kismindan_staff_details_ikonuna_tiklanir() {
        testPage.stafDetailsIconu.click();
    }

    @Given("Acilan sayfada Overview yazisinin gorundugu dogrulanir.")
    public void acilan_sayfada_overview_yazisinin_gorundugu_dogrulanir() {
        Assert.assertTrue(movingTransportationPage.overviewYazisi.isDisplayed());
    }

    @Given("My Staffs sayfasinda mevcut personellerden birinci siradaki personeli silmek icin action kismindan cop kutusu ikonuna tiklanir.")
    public void my_staffs_sayfasinda_mevcut_personellerden_birinci_siradaki_personeli_silmek_icin_action_kismindan_cop_kutusu_ikonuna_tiklanir() {

    }

    @Given("Acilan Delete Staff uyari penceresinden Yes butonuna tiklanir.")
    public void acilan_delete_staff_uyari_penceresinden_yes_butonuna_tiklanir() {

    }

    @Given("Sag ust kosede Staff Details deleted successfully yazisinin gorundugu dogrulanir.")
    public void sag_ust_kosede_staff_details_deleted_successfully_yazisinin_gorundugu_dogrulanir() {

    }

    //TC04
    @Given("My Staffs sayfasinda yeni calisan ekleyebilmek icin Add Staff butonu gorunur ve aktif olmalidir.")
    public void my_staffs_sayfasinda_yeni_calisan_ekleyebilmek_icin_add_staff_butonu_gorunur_ve_aktif_olmalidir() {
        testPage.addStaffButonu.click();
    }

    @Given("Add Staff butonuna tiklandiginda acilan sayfada Basic Information yazisinin goruldugu dogrulanmalidir.")
    public void add_staff_butonuna_tiklandiginda_acilan_sayfada_basic_ınformation_yazisinin_goruldugu_dogrulanmalidir() {
        Assert.assertTrue(testPage.basicInformationYazisi.isDisplayed());
    }
}

