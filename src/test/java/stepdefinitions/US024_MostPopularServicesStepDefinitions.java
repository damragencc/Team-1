package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
        ReusableMethods.scrollToElement(mostPopularServices.mainPageMostPopularServicesViewAllButton);

    }
    @Given("Slayderın ikinci noktasina tıklar")
    public void slayderın_ikinci_noktasina_tıklar() {
        mostPopularServices.mainPageMostPopularServicesSlider2.click();
        ReusableMethods.bekle(2);

    }
    @Given("Slayderın ucuncu noktasina tıklar")
    public void slayderın_ucuncu_noktasina_tıklar() {
      mostPopularServices.mainPageMostPopularServicesSlider3.click();
        ReusableMethods.bekle(2);
    }

    @Given("Most Popular Services kisminda yer alan  {int}. service tiklar ve ilgili sayfaya yonlendirdigini dogrular")
    public void most_popular_services_kisminda_yer_alan_service_tiklar(int i) {

            String dinamikXpathMainPtext="(//div[@class='featute-info'])["+i+"]";
            String textMainPageService=Driver.getDriver().findElement(By.xpath(dinamikXpathMainPtext)).getText();
            String dinamikXpathMainPhoto="(//img[@class='categorie-img'])["+(10+i)+"]";
            ReusableMethods.bekle(3);
            Driver.getDriver().findElement(By.xpath(dinamikXpathMainPhoto)).click();
            Assert.assertTrue(textMainPageService.contains(mostPopularServices.acilanServiceBaslik.getText()));

    }





    @Given("Anasayfaya geri doner.")
    public void anasayfaya_geri_doner() {
    Driver.getDriver().navigate().back();
    }



}
