package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.components.HeaderComp;
import pages.components.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US004_PozitifveNegaitfRegisterTestStepDefinitions {

    HeaderComp headerComp = new HeaderComp();
    Actions actions=new Actions(Driver.getDriver());
    RegisterPage registerPage=new RegisterPage();


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

        registerPage.joinAsaUserTexti.isDisplayed();

    }
    @Then("{string} {string} {string} {string} texti dogrulanir")
    public void texti_dogrulanir(String string, String string2, String string3, String string4) {

    }
    @When("{string} {string} {string} bilgilerini girer")
    public void bilgilerini_girer(String name, String email, String password) {


        registerPage.RegisterForm(name,email,password);

    }

    @When("{int} saniye bekle")
    public void saniye_bekle(Integer bekle) {
        ReusableMethods.wait(bekle);
    }
    @Then("Checkboxa tıklar")
    public void checkboxa_tıklar() {
       registerPage.ulkeCheckBoxKutusu.click();

    }

    @When("{string} ve {string} bilgilerini girer")
    public void ve_bilgilerini_girer(String ulke,String phoneNumber) {

     registerPage.CheckBoxVePhoneNumber(ulke,phoneNumber);

    }

    @When("cinsiyet olarak erkek butonuna tıklar")
    public void cinsiyet_olarak_erkek_butonuna_tıklar() {
      registerPage.cinsiyetErkekButonu.click();
    }

    @When("onay butonuna tıklar")
    public void onay_butonuna_tıklar() {
     registerPage.ıAgreeButonu.click();
    }


    @When("Register butonuna tıklar")
    public void register_butonuna_tıklar() {
    registerPage.registerButonu.click();
    }




    //Negatif Senaryolar

    @Given("{string} girer")
    public void gecersiz_name_girer(String name) {

        registerPage.loginNameKutusu.click();
         actions.sendKeys(ConfigReader.getProperty(name));

    }


    @When("{string} {string} bilgilerini girer")
    public void bilgilerini_girer(String email, String password) {

        registerPage.loginMailKutusu.sendKeys(ConfigReader.getProperty(email));
        registerPage.loginPasswordKutusu.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("checkboxa tıklar")
    public void checkboxaa_tıklar() {
        registerPage.ulkeCheckBoxKutusu.click();
    }



    @When("{string} secer ve {string} girer")
    public void secer_ve_girer(String ulke,String phoneNumber) {

        registerPage.CheckBoxVePhoneNumber(ulke,phoneNumber);


    }
    @Then("cinsiyet olarak erkek butouna ve onay butunona tıklar")
    public void cinsiyet_olarak_erkek_butouna_ve_onay_butunona_tıklar() {
        registerPage.cinsiyetErkekButonu.click(); registerPage.ıAgreeButonu.click();
    }
    @When("register butonuna tıklar")
    public void Register_butonuna_tıklar() {
        registerPage.registerButonu.click();
    }
    @Then("kayit olamadigini test eder")
    public void kayit_olamadigini_test_eder() {
        Assert.assertTrue(registerPage.registerButonu.isDisplayed());
    }


}
