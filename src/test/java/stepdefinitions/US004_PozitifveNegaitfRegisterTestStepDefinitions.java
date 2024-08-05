package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
    public void name_mail_password_bilgilerini_girer(String name, String email, String password) {


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
    public void ulke_telefonNumarasını_girer(String ulke,String phoneNumber) {

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





       //####################################$$$$$$$#############################





    //Negatif Senaryolar

       //  GECERSİZ NAME İLE REGİSTER OLAMAMALİ

    @Given("{string} girer")
    public void nameGirer(String name) {

        registerPage.loginNameKutusu.sendKeys("       ",name);


    }


    @When("{string} {string} bilgilerini girer")
    public void Email_Password_bilgilerini_girer(String email, String password) {

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
    @Then("cinsiyet olarak erkek butonuna ve onay butonuna tıklar")
    public void cinsiyet_olarak_erkek_butonuna_ve_onay_butunona_tıklar() {
        registerPage.cinsiyetErkekButonu.click(); registerPage.ıAgreeButonu.click();
    }

    @Then("kayit olamadigini test eder")
    public void kayit_olamadigini_test_eder() {
        Assert.assertTrue(registerPage.registerButonu.isEnabled());
    }







                //####################################$$$$$$$#############################








       //  GECERSİZ EMAİL İLE REGİSTER OLAMAMALİ

       @When("{string} adresi girer")
       public void adresi_girer(String mail) {
           registerPage.loginMailKutusu.sendKeys(mail);
       }
       @When("{string} girerr")
       public void password_girer(String password) {

        registerPage.loginPasswordKutusu.sendKeys(ConfigReader.getProperty(password));

       }
       @Then("checkboxa tıklarr")
       public void checkboxa_tıklarr() {
          registerPage.ulkeCheckBoxKutusu.click();
       }

       @When("{string} ve {string} verilerini girer")
       public void ulke_ve_telefon_verilerini_girer(String ulke,String phoneNumber) throws InterruptedException {

        ReusableMethods.wait(2);
       registerPage.CheckBoxVePhoneNumber(ulke,phoneNumber);

       }
       @Then("Cinsiyet olarak erkek butouna ve onay butunona tıklar")
       public void cinsiyet_olarak_erkek_butouna_ve_onay_butunona_tıklarr() throws InterruptedException {
        registerPage.cinsiyetErkekButonu.click();
        registerPage.beklemeSuresi();

       }
       @Then("register olamadıgını test eder")
       public void register_olamadıgını_test_eder() {

        Assert.assertTrue(registerPage.registerButonu.isEnabled());

       }






       //####################################$$$$$$$#############################






       //  GECERSİZ PASSWORD İLE REGİSTER OLAMAMALİ

       @When("{string} verisini girer")
       public void gecerli_name_verisini_girer(String name) {

        registerPage.loginNameKutusu.sendKeys(ConfigReader.getProperty(name));
       }
       @When("{string} bilgisini girer")
       public void gecerli_email_bilgisini_girer(String email) {
          registerPage.loginMailKutusu.sendKeys(ConfigReader.getProperty(email));
       }
       @When("{string} girmeli")
       public void girmeli(String password) {
           registerPage.loginPasswordKutusu.sendKeys("          ",password);
       }



       //###############################$$$$$$$$$$$$$$$$$$$#########################











       //  GECERSİZ PHONENUMBER İLE REGİSTER OLAMAMALİ


       @When("{string} girer.")
       public void gecerli_password_girer(String password) {

        registerPage.loginPasswordKutusu.sendKeys(ConfigReader.getProperty(password));

       }

       @When("{string} secer")
       public void ulke_secer(String ulke) {


        registerPage.ulkeCheckBoxKutusu.click();

          actions.sendKeys(ConfigReader.getProperty(ulke)).sendKeys(Keys.ENTER).perform();

       }

       @When("{string} bilgisini yanlıs girer")
       public void gecersiz_phone_number_bilgisini_yanlıs_girer(String phoneNumber) {

        registerPage.loginMobiledKutusu.sendKeys(phoneNumber);

       }


   }
