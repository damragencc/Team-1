package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.experimental.categories.Categories;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.components.FooterComp;
import utilities.Driver;
import utilities.ReusableMethods;

public class US030_FooterBolumuStepDefinitions {

    Actions actions = new Actions(Driver.getDriver());

    FooterComp footerComp = new FooterComp();
    @Given("Sayfayi asagıya kaydirir")
    public void sayfayi_asagıya_kaydirir() {
        ReusableMethods.scrollToElement(footerComp.personalServicesLink);}
    @Given("Categories yazisini gorundugu test edilir.")
    public void categories_yazisini_gorundugu_test_edilir() {Assert.assertTrue(footerComp.categoriesText.isDisplayed());}
    @Given("Quick Links yazisini gorundugu test edilir.")
    public void quick_links_yazisini_gorundugu_test_edilir() {Assert.assertTrue(footerComp.quickLinksText.isDisplayed());}
    @Given("Contact Us yazisini gorundugu test edilir.")
    public void contact_us_yazisini_gorundugu_test_edilir() {Assert.assertTrue(footerComp.contactUsText.isDisplayed());}
    @Given("Social Links yazisini gorundugu test edilir.")
    public void social_links_yazisini_gorundugu_test_edilir() {Assert.assertTrue(footerComp.socialLinksText.isDisplayed());}
    @Given("Categories altındaki linklerin aktif ve gorunur oldugu test edilir.")
    public void categories_altındaki_linklerin_aktif_ve_gorunur_oldugu_test_edilir() {
        Assert.assertTrue(footerComp.businessServicesLink.isEnabled());
        Assert.assertTrue(footerComp.eventsLinks.isEnabled());
        Assert.assertTrue(footerComp.homeServicesLink.isEnabled());
        Assert.assertTrue(footerComp.movingTransportationLink.isEnabled());
        Assert.assertTrue(footerComp.personalServicesLink.isEnabled());
    }
    @Given("Quick Links altındaki linklerin aktif ve gorunur oldugu test edilir.")
    public void quick_links_altındaki_linklerin_aktif_ve_gorunur_oldugu_test_edilir() {
        Assert.assertTrue(footerComp.aboutUsLink.isEnabled());
        Assert.assertTrue(footerComp.contactUsLink.isEnabled());
        Assert.assertTrue(footerComp.faqLink.isEnabled());
    }
    @Given("Contact Us altındaki bilgilerin gorunur oldugu test edilir.")
    public void contact_us_altındaki_bilgilerin_gorunur_oldugu_test_edilir() {
        Assert.assertTrue(footerComp.addressText.isDisplayed());
        Assert.assertTrue(footerComp.telephoneText.isEnabled());
        Assert.assertTrue(footerComp.mailText.isEnabled());
    }
    @Given("Social Links altındaki linklerin aktif ve gorunur oldugu test edilir.")
    public void social_links_altındaki_linklerin_aktif_ve_gorunur_oldugu_test_edilir() {
        Assert.assertTrue(footerComp.facebookButton.isEnabled());
        Assert.assertTrue(footerComp.xButton.isEnabled());
        Assert.assertTrue(footerComp.youtubeButton.isEnabled());
        Assert.assertTrue(footerComp.linkedinButton.isEnabled());
        Assert.assertTrue(footerComp.githubButton.isEnabled());
        Assert.assertTrue(footerComp.instagramButton.isEnabled());
    }

}
