package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.components.ContactUsPage;
import pages.components.HeaderComp;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US021_ContactUsStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    ContactUsPage contactUsPage = new ContactUsPage();


    @Given("Kullanıcı ilgili urle gider")
    public void kullanıcı_ilgili_urle_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("masterUrl"));
    }

    @Given("AnaSayfa header bolumunden Contact us butonunun aktif ve tıklanabilir oldugunu dogrular")
    public void ana_sayfa_header_bolumunden_contact_us_butonunun_aktif_ve_tıklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(headerComp.headerContactUsLink.isDisplayed());
        Assert.assertTrue(headerComp.headerContactUsLink.isEnabled());

    }
    @Given("Contact us linkine tiklar")
    public void contact_us_butonuna_tiklar() {
        headerComp.headerContactUsLink.click();
    }

    @Given("AnaSayfa header bolumunden Contact us butonunun ilgili sayfaya yonlendirdigini dogrular")
    public void ana_sayfa_header_bolumunden_contact_us_butonunun_ilgili_sayfaya_yonlendirdigini_dogrular() {
    String actualContactUsText = ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsHeader);
    Assert.assertEquals(actualContactUsText,ConfigReader.getProperty("ContactUsText"));
    }


    @Given("Contact us sayfasinda Home linkine tıkladıgında anasayfaya donebildigini dogrular")
    public void contact_us_sayfasinda_home_linkine_tıkladıgında_anasayfaya_donebildigini_dogrular() {
      contactUsPage.contactUsPageContactUsHomeLink.click();
      Assert.assertTrue(headerComp.headerContactUsLink.isDisplayed());
    }
    @Given("Contact us butonu ile Contact us sayfasına gider")
    public void contact_us_butonu_ile_contact_us_sayfasına_gider() {
        headerComp.headerContactUsLink.click();
    }
    @Given("Sol üst logo ile anasayfaya gidilebildigini dogrular")
    public void sol_üst_logo_ile_anasayfaya_gidilebildigini_dogrular() {
    contactUsPage.contactUsPageContactUsOMLogo.click();
    Assert.assertTrue(headerComp.mainPageLoginButton.isDisplayed());
    }
    @Given("footer bolumundeki contact us linkinin tıklanabilir ve gorunur oldugunu dogrular")
    public void footer_bolumundeki_contact_us_linkinin_tıklanabilir_ve_gorunur_oldugunu_dogrular() {
    Assert.assertTrue(contactUsPage.contactUsPageContactFooterLink.isDisplayed());
    Assert.assertTrue(contactUsPage.contactUsPageContactFooterLink.isEnabled());

    }

    @Given("Bilgilerin  gorunur oldugunu dogrular {string},{string},{string}")
    public void bilgilerin_gorunur_oldugunu_dogrular(String address, String phone, String email) {
       address= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsAdress);
       Assert.assertEquals(address,ConfigReader.getProperty("Address"));
        phone= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsPhone);
        Assert.assertEquals(phone,ConfigReader.getProperty("Phone"));
        email= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsEmail);
        Assert.assertEquals(email,ConfigReader.getProperty("Email"));
    }
    @Given("Bilgilerin  gorunur oldugunu dogrular {string},{string},{string},{string}")
    public void bilgilerin_gorunur_oldugunu_dogrular(String contactUsText, String addressText, String phoneText, String emailText) {
        addressText= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsAdressHeader);
        Assert.assertEquals(addressText,ConfigReader.getProperty("AddressText"));
        phoneText= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsPhoneHeader);
        Assert.assertEquals(phoneText,ConfigReader.getProperty("PhoneText"));
        emailText= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsEmailHeader);
        Assert.assertEquals(emailText,ConfigReader.getProperty("EmailText"));
        contactUsText= ReusableMethods.webElementTextAl(contactUsPage.contactUsPageContactUsHeader);
        Assert.assertEquals(contactUsText,ConfigReader.getProperty("ContactUsText"));
    }

    @Given("Asagidaki box ve butonun gorunur ve tiklanabilir oldugunu dogrular Name,email message boxları,submit butonu")
    public void asagidaki_box_ve_butonun_gorunur_tiklanabilir_oldugunu_dogrular_name_email_message_boxları_submit_butonu() {
        Assert.assertTrue(contactUsPage.contactUsPageContactUsNameBox.isEnabled());
        Assert.assertTrue(contactUsPage.contactUsPageContactUsEmailBox.isEnabled());
        Assert.assertTrue(contactUsPage.contactUsPageContactUsMessageBox.isEnabled());
        Assert.assertTrue(contactUsPage.contactUsPageContactUsNameBox.isDisplayed());
        Assert.assertTrue(contactUsPage.contactUsPageContactUsEmailBox.isDisplayed());
        Assert.assertTrue(contactUsPage.contactUsPageContactUsMessageBox.isDisplayed());
    }


    @Given("Asagidaki boxlara gecerli veri girer {string} ,{string},{string}")
    public void asagidaki_boxlara_gecerli_veri_girer(String name, String email, String message) {
    contactUsPage.contactUsPageContactUsNameBox.sendKeys(ConfigReader.getProperty(name));
    contactUsPage.contactUsPageContactUsEmailBox.sendKeys(ConfigReader.getProperty(email));
    contactUsPage.contactUsPageContactUsMessageBox.sendKeys(ConfigReader.getProperty(message));

    }
    @Given("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
    contactUsPage.contactUsPageContactUsSubmitButton.click();
    }
    @Given("Message Send ! Yazisini goruntuler")
    public void message_send_yazisini_goruntuler() {

    Assert.assertTrue(contactUsPage.contactUsPageContactUsMessageSent.isDisplayed());
    Assert.assertTrue(contactUsPage.contactUsPageContactUsMessageSuccess.isDisplayed());
    }
    @Given("Okay tusuna tiklar")
    public void okay_tusuna_tiklar() {

    contactUsPage.contactUsPageContactUsMessageOkButton.click();
    }
    @Given("Contact us formunun bos oldugunu dogrular")
    public void contact_us_formunun_bos_oldugunu_dogrular() {
    Assert.assertEquals(contactUsPage.contactUsPageContactUsNameBox.getText(),"");
    Assert.assertEquals(contactUsPage.contactUsPageContactUsEmailBox.getText(),"");
    Assert.assertEquals(contactUsPage.contactUsPageContactUsMessageBox.getText(),"");

    }
    @Given("Mail sent succesfully yazisi goruntulenir")
    public void mail_sent_succesfully_yazisi_goruntulenir() {
        Assert.assertTrue(contactUsPage.contactUsPagMailSentSuccesfully.isDisplayed());
    }
    @Given("Asagidaki boxlara gecersiz veri girer {string} ,{string},{string}")
    public void asagidaki_boxlara_gecersiz_veri_girer(String name, String email, String message) {
        contactUsPage.contactUsPageContactUsNameBox.sendKeys(ConfigReader.getProperty(name));
        ReusableMethods.bekle(2);
        contactUsPage.contactUsPageContactUsEmailBox.sendKeys(ConfigReader.getProperty(email));
        ReusableMethods.bekle(2);
        contactUsPage.contactUsPageContactUsMessageBox.sendKeys(ConfigReader.getProperty(message));
        ReusableMethods.bekle(2);
    }
    @Given("Submit butonunun tiklanamadigini dogrular")
    public void submit_butonunun_tiklanamadigini_dogrular() {
        Assert.assertFalse(contactUsPage.contactUsPageContactUsSubmitButton.isEnabled());
    }

    @Given("Mesaj gonderilemedigini  dogrular")
    public void mesaj_gonderilemedigini_dogrular() {
    Assert.assertFalse(contactUsPage.contactUsPageContactUsMessageSuccess.isDisplayed());
    }

    }




