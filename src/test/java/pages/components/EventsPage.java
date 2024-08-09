package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import utilities.Driver;

public class EventsPage {

    public EventsPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = ("//*[@class='category-section']"))
    public WebElement silderCategory; // Anasayfa Silder



    @FindBy(xpath = ("(//*[text()= 'Events'])[2]"))
    public WebElement Eventsbuton; // Anasayfya Events buton

@FindBy(xpath = ("(//*[@class='nav-link'])"))
    public WebElement Shopsbutonuu; // Shops butonu

    @FindBy(xpath = ("//*[@class='nav-link test active']"))
    public WebElement ServiceButonuu;


    @FindBy(xpath = ("(//*[@class='me-2'])[3]"))
    public WebElement filtrelemeikonuServic;


    @FindBy(xpath = ("//*[@class='form-control location pac-target-input']"))
    public WebElement Locationserachh; // filteleme loacation

    @FindBy(xpath = ("(//*[@class='select2-selection__rendered'])[1]"))
    public WebElement SortByikon;  // filteleme sort by

    @FindBy(xpath = ("(//*[@class='select2-selection__rendered'])[2]"))
    public WebElement catagoriesikon; // filteleme catagories

    @FindBy(xpath = ("(//*[@class='select2-selection__rendered'])[3]"))
    public WebElement SubCatagoryikon; // filteleme subCatagoryikon

    @FindBy(xpath = ("(//*[@class='form-control common_search location'])"))
    public WebElement Keywordikon ; // filtreleme Keyword

    @FindBy(xpath = ("(//*[@class='ui-slider-range ui-corner-all ui-widget-header'])"))
    public WebElement Pricerange; // filtreleme Price range

    @FindBy(xpath = ("(//*[@class='btn btn btn-search btn-block get_services'])"))
    public WebElement Serchbuttonn; // filtreleme serch button

    @FindBy(xpath = ("//span[contains(@class, 'select2-selection__rendered') and @title='Sort By']"))
    public WebElement sortBysecenek; // sortBy seçeneği

    @FindBy(xpath = ("//span[contains(@class, 'select2-selection__rendered') and @title='Events']"))
    public WebElement EventsSeceneginiSec; // Events seçeneğini tıklar

    @FindBy(xpath = ("//span[contains(@class, 'select2-selection__rendered') and @title='Choose the Sub Category']"))
    public WebElement subcatagorideSecenekTıkla;

    @FindBy(xpath = ("//*[@id='dataList']"))
    public WebElement ServiseListesi;

    @FindBy(xpath = ("//*[@id='dataList']/div[2]/div/div[2]/h4/a"))
    public WebElement ListedeIstedilenUrün;


    @FindBy(xpath = ("(//*[@class='service-view'])[1]"))
    public WebElement urunBilgileri;


    @FindBy(xpath = ("(//*[@class='row'])[2]"))
    public WebElement shopsUrunlistesi;


    @FindBy(xpath = ("(//*[@class='visit-store'])[3]"))
    public WebElement urunuzeriVisitStore; // servis üzerinde yazan Visit store


    @FindBy(xpath = ("(//*[@class='row'])[1]"))
    public WebElement shopsürünBligileri; // Shops ürün bilgilerini gösterir

    @FindBy(xpath = ("(//a[text()='Harmony Events Planning'])[1]"))
    public WebElement HarmonyShopsServis; // Shops Servis ürünü


    @FindBy(xpath = ("//input[@name='common_search']"))
    public WebElement aramaMatoru; // Anasayfya arama matoru

    @FindBy(xpath = ("(//*[@class='btn search_service btn-banner'])"))
    public WebElement anasayfaSerachButonu ; // anasayfa search butonu


    @FindBy(xpath = ("(//*[@class='row align-items-center mb-4'])[1]"))
    public WebElement searchButoonsonrasiKontorl; // butondan sonra sayfa kontorlü

    @FindBy(xpath = ("//*[@class='search-cat']"))
    public WebElement hizliservislinkleriktr; // hızlı servis linklerinin kontorlü

    @FindBy(xpath = ("(//a[contains(text(), 'Full-Service Catering (per person)')])[1]"))
    public WebElement fullServiceHizliLink; // anasayfa servis linki

    @FindBy(xpath = ("(//*[contains(text(), 'Leak Detection')])[1]"))
    public WebElement leakDetectionHizliLink; // anasayfya hzılı link

    @FindBy(xpath = ("(//*[contains(text(), 'Full House Cleaning')])[1]"))
    public WebElement fullHouseClaninghizliLink; // anasayfa hızlı link














}
