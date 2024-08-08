package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.ShopsServicesPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US053_RezervasyonStepdefinitions {

    HeaderComp headerComp = new HeaderComp();
    ShopsServicesPage shopsServicesPage = new ShopsServicesPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Ana sayfa ust barinda ki Shops menu basligi gorunur olmalidir")
    public void ana_sayfa_ust_barinda_ki_shops_menu_basligi_gorunur_olmalidir() {
        Assert.assertTrue(shopsServicesPage.headerShops.isEnabled());
    }
    @Given("Ana sayfa ust barinda ki Categories altindaki \\(Business Services, Repairs & Maintenance, Moving & Transportation, Events, Personal Services, Home Services) linkler gorunur olmalidir.")
    public void ana_sayfa_ust_barinda_ki_categories_altindaki_business_services_repairs_maintenance_moving_transportation_events_personal_services_home_services_linkler_gorunur_olmalidir() {
        actions.moveToElement(shopsServicesPage.catagoriess).perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(shopsServicesPage.businessServices.isEnabled());
        Assert.assertTrue(shopsServicesPage.repairsMaintenance.isEnabled());
        Assert.assertTrue(shopsServicesPage.movingTransportation.isEnabled());
        Assert.assertTrue(shopsServicesPage.repairsMaintenance.isEnabled());
        Assert.assertTrue(shopsServicesPage.events.isEnabled());
        Assert.assertTrue(shopsServicesPage.personalServices.isEnabled());
        Assert.assertTrue(shopsServicesPage.homeServices.isEnabled());
    }
    @Given("Linklere  tıklanıldığında ilgili şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.")
    public void linklere_tıklanıldığında_ilgili_şirketler_ve_şirketlere_ait_hizmetler_sayfasına_yonlendirilmelidir() {
        actions.moveToElement(shopsServicesPage.catagoriess).perform();
        ReusableMethods.wait(1);
        //shopsServicesPage.businessServices.click();
    }
    @Given("Profil ikonuna tıklandıgında Book Service ikonu görünür ve aktif olmalıdır.")
    public void profil_ikonuna_tıklandıgında_book_service_ikonu_görünür_ve_aktif_olmalıdır() {
        headerComp.profilIkonu.click();
        Assert.assertTrue(shopsServicesPage.bookServicesDropdown.isEnabled());
    }
    @Given("Book Service ikonuna tıklanıldığında şirketler ve şirketlere ait hizmetler sayfasına yonlendirilmelidir.")
    public void book_service_ikonuna_tıklanıldığında_şirketler_ve_şirketlere_ait_hizmetler_sayfasına_yonlendirilmelidir() {
        shopsServicesPage.bookServicesDropdown.click();
    }
    @Given("Hizmetler sayfasında herhangi bir hizmete tıklanıldığında o hizmete ait Book Service butonu gorunur ve aktif olmalıdır.")
    public void hizmetler_sayfasında_herhangi_bir_hizmete_tıklanıldığında_o_hizmete_ait_book_service_butonu_gorunur_ve_aktif_olmalıdır() {
        shopsServicesPage.hizmet.click();
        ReusableMethods.scrollToElement(shopsServicesPage.wellnessCoaching);
        shopsServicesPage.wellnessCoaching.click();
        Assert.assertTrue(shopsServicesPage.bookService.isEnabled());
    }


}
