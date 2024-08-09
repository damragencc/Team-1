package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.components.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US068_ProvderInvoices {

    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    ProfileSettings profileSettings = new ProfileSettings();

    LoginLogoutPage loginLogoutPage = new LoginLogoutPage();

ProviderInvoicesChangepaswd providerInvoicesChangepaswd = new ProviderInvoicesChangepaswd();

    @And("Provder email olarak {string} bilgilerini girerr email login butonuna tiklar.")
    public void provderEmailOlarakBilgileriniGirerrEmailLoginButonunaTiklar(String providerEmail) {
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailbox
                .sendKeys(ConfigReader.getProperty(providerEmail));
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailbox.sendKeys(" ", Keys.ENTER);
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormEmailboxLoginButton
                .click();
    }

    @And("Provder password olarak {string} bilgilerini girerr enter butonuna tiklarr")
    public void provderPasswordOlarakBilgileriniGirerrEnterButonunaTiklarr(String providerPassword) {
        ReusableMethods.bekle(1);
        loginLogoutPage.mainPageLoginFormPasswordbox
                .sendKeys(ConfigReader.getProperty(providerPassword));
        loginLogoutPage.mainPageLoginFormPasswordEnterButton
                .click();

    }


    @Then("Profil ikonundan Dashboard menüsüne tıklar")
    public void profilIkonundanDashboardMenüsüneTıklar() {
        providerInvoicesChangepaswd.ikondanDashbord.click();
    }

    @Then("Dashboard sayfasını görüntüler")
    public void dashboardSayfasınıGörüntüler() {
        providerInvoicesChangepaswd.dashbordSayfa.isDisplayed();

    }

    @Then("Sidebar Dashboarddan Invoices mesnüsüne tıklar")
    public void sidebarDashboarddanInvoicesMesnüsüneTıklar() {

        ReusableMethods.scrollToElement(providerInvoicesChangepaswd.invoicesBtn);
        ReusableMethods.bekle(1);
        providerInvoicesChangepaswd.invoicesBtn.click();
        ReusableMethods.bekle(1);


    }

    @Then("Invoices sayafsında ürünlerin ödeme listesini ve ödeme bilgilerini görür")
    public void ınvoicesSayafsındaÜrünlerinÖdemeListesiniVeÖdemeBilgileriniGörür() {
        providerInvoicesChangepaswd.invocesUrunSayf.isDisplayed();


    }

    @Then("Invoices  sayfasında herhangi bir ürüne tıklanır")
    public void ınvoicesSayfasındaHerhangiBirÜrüneTıklanır() {
        providerInvoicesChangepaswd.invoicesUrunnn.click();
    }

    @Then("Ürün bilgilerinin detaylı görüntüler")
    public void ürünBilgilerininDetaylıGörüntüler() {
        providerInvoicesChangepaswd.urunBilgileri.isDisplayed();

    }

    @Then("Invoices sayfasında Framdat'e istediği başlangıç tarihini yazar")
    public void ınvoicesSayfasındaFramdatEIstediğiBaşlangıçTarihiniYazar() {
        providerInvoicesChangepaswd.fromDateKutusu.sendKeys("01-01-2024 ", Keys.ENTER);

    }

    @Then("Invoices sayfasında To date 'ye istediği son tarih aralığını yazar")
    public void ınvoicesSayfasındaToDateYeIstediğiSonTarihAralığınıYazar() {
        providerInvoicesChangepaswd.toDateKutusu.sendKeys("31-12-2024", Keys.ENTER);
    }

    @Then("Seçilen tarih aralığındaki arama tuşuna tıklar ürünlerin listesini görür")
    public void seçilenTarihAralığındakiAramaTuşunaTıklarÜrünlerinListesiniGörür() {
providerInvoicesChangepaswd.aramaserchButonu.click();
    }

    @Then("Export All tuşuna tıklar ürünlerin faturasını görüntülenir")
    public void exportAllTuşunaTıklarÜrünlerinFaturasınıGörüntülenir() {
        providerInvoicesChangepaswd.ExpertAllButonu.click();
    }

    @Then("Invoices sayfasında Listedeki istediği ürün üzerinde Export  butonuna tıklar ürün faturasına ulaşır")
    public void ınvoicesSayfasındaListedekiIstediğiÜrünÜzerindeExportButonunaTıklarÜrünFaturasınaUlaşır() {
        providerInvoicesChangepaswd.exporturunuzeri.click();
    }

}
