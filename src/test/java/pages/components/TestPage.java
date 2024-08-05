
package pages.components;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class TestPage {

    public WebElement firstServiceInNextList;

    public TestPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public List<WebElement> getServiceLinks() {
        return serviceLinks;
    }
    public void clickAllServicesAndVerify() {
    }

    @FindBy (xpath = "//*[@class='fas fa-users']")
    public WebElement staffLinki; // Provider Dashboard sayfası Staff Linki

    @FindBy (xpath = "//*[@class='widget-title']")
    public WebElement myStaffYazisi;

    @FindBy (xpath = "//h2[text()='Most Popular Shops']")
    public WebElement mostPopularShopsYazisi; // Anasayfa Most Pupular Shops yazısı

    @FindBy (xpath = "(//*[text()='Gourmet Affairs Catering '])[4]")
    public WebElement gourmetAffairsCateringYazisi;  // Anasayfa Most Pupular Shops Gourmet Affairs Catering şirketi ismi

    @FindBy (xpath = "(//*[text()='Houston, Texas'])[1]")
    public WebElement houstonTexasKonumYazisi;   //Anasayfa Most Pupular Shops  Gourmet Affairs Catering konum yazısı

    @FindBy (xpath = "(//*[text()='Visit Store '])[11]")
    public WebElement gourmetAffairsCateringVisitStoreIkonu;  // Anasayfa Most Pupular Shops Gourmet Affairs Catering şirketi Visit Store ikonu

    @FindBy (xpath = "//*[text()='Shop Details']")
    public WebElement shopDetailsYazisi;  // Gourmet Affairs Catering firması sayfasındaki Shop Details yazısı

    @FindBy (xpath = "(//*[@class='btn btn-viewall'])[3]")
    public WebElement mostPopularShopsViewallButonu;  // Anasayfa Most Pupular Shops Viewall ikonu

    @FindBy (xpath = "//*[text()=' Shops Found']")
    public WebElement shopsFoundYazisi;  // All shops kısmında toplam shops sayısını ifade eden yazi

    @FindBy (xpath = "//*[@id=\"category-slider\"]/div[1]/div/div[1]/div/div/div[2]/a/span")
    public WebElement homeServicesLinki;  //  Anasayfa slider'da bulunan Home Services linki

    @FindBy (id = "shops-tab")
    public WebElement homeServicesShopsButonu;  // Home Services sayfasındaki Shops butonu

    @FindBy (id = "services-tab")
    public WebElement homeServicesServicesButonu;  // Home Services sayfasındaki Services butonu

    @FindBy (xpath = "//*[text()=' Services Found']")
    public WebElement servicesFoundYazisi;  // Home Services sayfasındaki toplam services sayısını ifade eden yazi

    @FindBy (xpath = "//*[@class='btn filter-btn']")
    public WebElement filterButonu; //  Home Services sayfasındaki filter butonu

    @FindBy (xpath = "//*[@class='btn btn btn-search btn-block get_services']")
    public WebElement searchButonu;  // Home Services sayfasındaki filter butonuna basıldığında görünen Search butonu

    @FindBy(xpath = "//a[contains(@href, '/services') and contains(text(), 'Service')]/..")
    public List<WebElement> serviceLinks;

    @FindBy (xpath = "//*[@class='arrow']")
    public WebElement ilerlemeButonu;  //Home Services sayfasındaki ilerleme butonu

    @FindBy (xpath = "(//*[text()='Visit Store '])[3]")
    public WebElement aquaShieldPlumbingVisitStoreIkonu; //AquaShield Plumbing Visit Store Ikonu

    @FindBy (xpath = "//*[text()='Shop Availability']")
    public WebElement shopAvailabilityYazisi; // AquaShield Plumbing Shop Availability yazisi

    @FindBy (xpath = "//*[text()='Services']")
    public WebElement servicesYazisi; // AquaShield Plumbing Services yazisi

    @FindBy (xpath = "//*[text()='Necmiye Melike ADIGÜZEL']")
    public WebElement personelMelikeAdiguzelYazisi; // Provider Dashboard Melike Adıgüzel yazısı

    @FindBy (xpath = "(//*[@class='far fa-edit'])[2]")
    public WebElement staffEditIconu;  // Provider Dashboard Staff Edit ikonu

    @FindBy (id = "mobileno")
    public WebElement mobileNoKutusu; // Provider Dashboard Staff Edit mobile no kutusu

    @FindBy (id = "next")
    public WebElement nextButonu; //Provider Dashboard Staff Edit sayfası next butonu

    @FindBy (id = "addstaff_submit")
    public WebElement submitButonu; // Provider Dashboard Staff Edit sayfası submit butonu

    @FindBy (xpath = "(//*[text()='Staff Details Updated successfully'])[2]")
    public WebElement staffDetailsUpdatedSuccessfullyYazisi; // Provider Dashboard Staff Edit sayfası Staff Details Updated successfully yazısı

    @FindBy (xpath = "(//*[@class='far fa-eye'])[2]")
    public WebElement stafDetailsIconu; //Provider Dashboard 2. sıradaki Staff details ikonu

    @FindBy (xpath = "nav-link active")
    public WebElement overviewButonu; //Provider Dashboard Staff Details sayfası overview butonu

    @FindBy (xpath = "//*[@class='btn btn-primary text-white']")
    public WebElement addStaffButonu; //Provider Dashboard Staff sayfası Add Staff butonu

    @FindBy (xpath = "//*[text()='Basic Information']")
    public WebElement basicInformationYazisi; //Provider Dashboard Staff sayfası Add Staff butonu

    @FindBy (xpath = "//*[@class='far fa-calendar-alt']")
    public WebElement invoicesLinki; // Kayıtlı kullanıcı dashboard invoice linki


}






























