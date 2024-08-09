package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.ProfileSettings;
import pages.components.RegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US049_UserProductList {
    HeaderComp headerComp = new HeaderComp();
    RegisterPage registerPage = new RegisterPage();

    Actions actions = new Actions(Driver.getDriver());

    ProfileSettings profileSettings = new ProfileSettings();

    @Then("Kullanıcı Header bölümüne ulaşır")
    public void kullanıcıHeaderBölümüneUlaşır() {
profileSettings.headerbolumu.isDisplayed();

    }


    @Then("Kullanıcı Shopping simgesini gördü ve tıkladı")
    public void kullanıcıShoppingSimgesiniGördüVeTıkladı() {
        profileSettings.shoppingSimgesi.click();
    }



    @Then("Kullanıcı Shopping sayfasında Product List sayfasına yönlendirir")
    public void kullanıcıShoppingSayfasındaProductListSayfasınaYönlendirir() {
        profileSettings.productlistsayfasikontorl.isSelected();
    }



    @Then("Kullanıcı Header bölümünde Shops menüsüne ulaşır")
    public void kullanıcıHeaderBölümündeShopsMenüsüneUlaşır() {
        actions.moveToElement(profileSettings.shopsHeader).perform();
        ReusableMethods.bekle(1);
      //  profileSettings.shopsHeader.click();

    }


    @Then("Shops menüsünün alt menüsü Product menüsüne tıklar")
    public void shopsMenüsününAltMenüsüProductMenüsüneTıklar() {

        actions.moveToElement(profileSettings.shopsHeader).perform();
        ReusableMethods.bekle(1);
        actions.moveToElement(profileSettings.productHeader).perform();
        ReusableMethods.bekle(1);
        profileSettings.productHeader.click();
        ReusableMethods.bekle(1);

    }

    @Then("Product menüsünden Product List sayfasını görüntüler")
    public void productMenüsündenProductListSayfasınıGörüntüler() {
        profileSettings.productlistsayfasikontorl.isDisplayed();
    }

    @Then("Ürün listesinden herhangi bir ürüne tıklar")
    public void ürünListesindenHerhangiBirÜrüneTıklar() {
        ReusableMethods.scrollToElement(profileSettings.listedekiUrun);
        ReusableMethods.bekle(1);
        profileSettings.listedekiUrun.click();
    }

    @Then("Seçtiği ürünün ürün bilgilerine ulaşır")
    public void seçtiğiÜrününÜrünBilgilerineUlaşır() {
        profileSettings.listUrunBilgileri.isDisplayed();
    }

    @Then("Ürünü Add To Cart  butonundan alışveriş sepetine ekler")
    public void ürünüAddToCartButonundanAlışverişSepetineEkler() {
        profileSettings.AddTiCartButton.click();
    }



    @Then("Listede istediği herhangi bir ürünün Add to Cart butonuna tıklar")
    public void listedeIstediğiHerhangiBirÜrününAddToCartButonunaTıklar() {
        ReusableMethods.scrollToElement(profileSettings.listedeliAddToCart);
        ReusableMethods.bekle(1);
        profileSettings.listedeliAddToCart.click();
    }

    @Then("Alışveriş sepetinde eklediği ürünleri görüntüler")
    public void alışverişSepetindeEklediğiÜrünleriGörüntüler() {
        profileSettings.shoppingsepetekiUrunler.isDisplayed();
    }

}
