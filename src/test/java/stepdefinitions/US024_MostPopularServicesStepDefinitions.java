package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.components.HeaderComp;
import pages.components.MostPopularServicesMainPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US024_MostPopularServicesStepDefinitions {
    MostPopularServicesMainPage mostPopularServices=new MostPopularServicesMainPage();
    HeaderComp headerComp=new HeaderComp();

    @Given("Most popular Services basliginin gorunur oldugunu dogrular")
    public void most_popular_services_basliginin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesHeader.isDisplayed());

    }
    @Given("İlgili hizmete ait asagidaki bilgilerinin  gorunur  oldugunu dogrular hizmet ismi ,provider adi,konum,fiyat")
    public void ilgili_hizmete_ait_asagidaki_bilgilerinin_gorunur_oldugunu_dogrular_hizmet_ismi_provider_adi_konum_fiyat() {

        for (int i = 0; i <4 ; i++) {

        Assert.assertTrue(mostPopularServices.mainPageMostPopularServiceLocationList.get(i).isDisplayed());
        Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesInfoList.get(i).isDisplayed());
        Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesProviderList.get(i).isDisplayed());
        Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesStarRatingList.get(i).isDisplayed());
        Assert.assertTrue(mostPopularServices.mainPageMostPopularServicePriceList.get(i).isDisplayed());
        }



    }
    @Given("View all butonunun ve sliderin gorunur ve tiklanabilir oldugunu dogrular")
    public void view_all_butonunun_ve_sliderin_gorunur_ve_tiklanabilir_oldugunu_dogrular() {
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesViewAllButton.isDisplayed());
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesViewAllButton.isEnabled());
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesSlider.isDisplayed());
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesSlider1.isEnabled());
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesSlider2.isEnabled());
    Assert.assertTrue(mostPopularServices.mainPageMostPopularServicesSlider3.isEnabled());
    }

    @Given("Most popular Services basligina gider")
    public void most_popular_services_basligina_gider() {
        ReusableMethods.scrollToElement(mostPopularServices.mainPageMostPopularServicesHeader);

    }
    @Given("Slayderın {int}. noktasina tıklar")
    public void slayderın_noktasina_tıklar(Integer sliderNokta) {
        String dinamikLocate="(//button[@role='button'])["+(sliderNokta+4)+"]";
        Driver.getDriver().findElement(By.xpath(dinamikLocate)).click();


    }
    @Given("Most Popular Services kisminda yer alan  {string} tiklar")
    public void most_popular_services_kisminda_yer_alan_tiklar(String string) {

    }
    @Given("Acilan sayfanin ilgili {string} sayfasina yonlendirdigini dogrular")
    public void acilan_sayfanin_ilgili_sayfasina_yonlendirdigini_dogrular(String string) {

    }
    @Given("Anasayfaya geri doner.")
    public void anasayfaya_geri_doner() {

    }



}
