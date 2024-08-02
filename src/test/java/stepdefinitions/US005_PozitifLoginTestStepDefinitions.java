package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.LoginPage;
import pages.components.TestPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US005_PozitifLoginTestStepDefinitions {

    HeaderComp headerComp = new HeaderComp();
    Actions actions=new Actions(Driver.getDriver());
    LoginPage loginPage=new LoginPage();


    @Then("Header bolumunde bulunan Become a User butonunu goruntuler")
    public void header_bolumunde_bulunan_become_a_user_butonunu_goruntuler() {

        headerComp.becomeAuser.isDisplayed();

    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }

    @Then("Join as a User texti dogrular")
    public void join_as_a_user_texti_dogrular() {

        loginPage.joinAsaUserTexti.isDisplayed();

    }
    @Then("{string} {string} {string} {string} texti dogrulanir")
    public void texti_dogrulanir(String string, String string2, String string3, String string4) {

    }
    @When("{string} {string} {string} bilgilerini girer")
    public void bilgilerini_girer(String name, String email, String password) {


        loginPage.LoginForm(name,email,password);

    }

    @When("{int} saniye bekle")
    public void saniye_bekle(Integer bekle) {
        ReusableMethods.wait(bekle);
    }
    @Then("Checkboxa tıklar")
    public void checkboxa_tıklar() {
        loginPage.ulkeCheckBoxKutusu.click();

    }

    @When("{string} ve {string} bilgilerini girer")
    public void ve_bilgilerini_girer(String ulke,String phoneNumber) {

       loginPage.CheckBoxVePhoneNumber(ulke,phoneNumber);

    }

    @When("cinsiyet olarak erkek butonuna tıklar")
    public void cinsiyet_olarak_erkek_butonuna_tıklar() {
      loginPage.cinsiyetErkekButonu.click();
    }
    @When("onay butonuna tıklar")
    public void onay_butonuna_tıklar() {
     loginPage.ıAgreeButonu.click();
    }


    @When("Register butonuna tıklar")
    public void register_butonuna_tıklar() {
    loginPage.registerButonu.click();
    }













}