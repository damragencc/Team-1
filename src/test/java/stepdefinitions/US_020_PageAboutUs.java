package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PageAboutUs;
import utilities.ConfigReader;
import utilities.Driver;

public class US_020_PageAboutUs {

    PageAboutUs pageAboutUs = new PageAboutUs();

    @Given("Tarayiciyi baslatin")
    public void tarayiciyi_baslatin() {

        Driver.getDriver();

    }

    @Given("Anasayfaya gidin")
    public void anasayfaya_gidin() {

        Driver.getDriver().get(ConfigReader.getProperty("masterUrl"));

    }

    @Given("Anasayfa header bolumunde bulunan About Us linkinin gorunur oldugunu dogrulayin")
    public void anasayfa_header_bolumunde_bulunan_about_us_linkinin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageAboutUs.linkAboutUsHead.isDisplayed());

    }

    @Given("Anasayfa header bolumunde bulunan About Us linkine tiklayin")
    public void anasayfa_header_bolumunde_bulunan_about_us_linkine_tiklayin() {

        pageAboutUs.linkAboutUsHead.click();

    }

    @Given("Anasayfa header bolumunde bulunan About Us linkine tiklandiginda About Us sayfasina gidildigini dogrulayin.")
    public void anasayfa_header_bolumunde_bulunan_about_us_linkine_tiklandiginda_about_us_sayfasina_gidildigini_dogrulayin() {

        String expectedPageAboutUsUrl = "https://qa.onlinemastermarket.com/about-us";
        String actualPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPageAboutUsUrl, actualPageUrl);

    }

    @Given("Sayfayi kapatin")
    public void sayfayi_kapatin() {

        Driver.quitDriver();

    }

    @Given("Anasayfa footer bolumunde bulunan Quick basliginin altinda bulunan About Us linkinin gorunur oldugunu dogrulayin")
    public void anasayfa_footer_bolumunde_bulunan_quick_basliginin_altinda_bulunan_about_us_linkinin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageAboutUs.linkAboutUsFoot.isDisplayed());

    }

    @Given("Quick basliginin altinda bulunan About Us linkine tiklayin")
    public void quick_basliginin_altinda_bulunan_about_us_linkine_tiklayin() {

        pageAboutUs.linkAboutUsFoot.click();

    }

    @Given("Quick basliginin altinda bulunan About Us linkine tiklanildiginda About Us sayfasina gidildigini dogrulayin")
    public void quick_basliginin_altinda_bulunan_about_us_linkine_tiklanildiginda_about_us_sayfasina_gidildigini_dogrulayin() {

        String expectedPageAboutUsUrl = "https://qa.onlinemastermarket.com/about-us";
        String actualPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPageAboutUsUrl, actualPageUrl);

    }

    @Given("Acilan About Us sayfasinda asagida yer alan basliklarin ve bunlarinin iceriklerin oldugunu dogrulayin : Welcome to OnlineMasterMarket!, Our Story, What We Offer, Why Choose Us?")
    public void acilan_about_us_sayfasinda_asagida_yer_alan_basliklarin_ve_bunlarinin_iceriklerin_oldugunu_dogrulayin_welcome_to_online_master_market_our_story_what_we_offer_why_choose_us() {

        String expectedContent = "Welcome to OnlineMasterMarket!";
        String actualContent = pageAboutUs.textContentAboutUsPage.getText();
        Assert.assertTrue(actualContent.contains(expectedContent));

    }

    @Given("Acilan About Us sayfasinin sol ustunde yer alan Home linkinin gorunur oldugunu dogrulayin")
    public void acilan_about_us_sayfasinin_sol_ustunde_yer_alan_home_linkinin_gorunur_oldugunu_dogrulayin() {

        Assert.assertTrue(pageAboutUs.linkHomeOfAboutUs.isDisplayed());
    }

    @Given("Home linkine tiklayin")
    public void home_linkine_tiklayin() {

        pageAboutUs.linkHomeOfAboutUs.click();

    }

    @Given("Home linki tiklanildiginda Home page'e gidildigini dogrulayin")
    public void home_linki_tiklanildiginda_home_page_e_gidildigini_dogrulayin() {

        String expectedHomePageUrl = ConfigReader.getProperty("masterUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedHomePageUrl, actualUrl);

    }


}
