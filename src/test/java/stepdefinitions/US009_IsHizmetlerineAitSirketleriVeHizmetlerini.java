package stepdefinitions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class US009_IsHizmetlerineAitSirketleriVeHizmetlerini {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testVisitorBusinessServicesFunctionality() {
        // Web sitesine git
        driver.get("https://qa.onlinemastermarket.com/");

        // Categories altındaki Business Services linkinin görünürlüğünü kontrol et
        WebElement categoriesMenu = driver.findElement(By.linkText("Categories"));
        categoriesMenu.click();

        WebElement businessServicesLink = driver.findElement(By.linkText("Business Services"));
        assertTrue("Business Services linki görünmüyor", businessServicesLink.isDisplayed());
        businessServicesLink.click();

        // Business Services sayfasında Shops ve Service butonlarının görünürlüğünü kontrol et
        WebElement shopsButton = driver.findElement(By.id("shopsButton"));
        WebElement serviceButton = driver.findElement(By.id("serviceButton"));
        assertTrue("Shops butonu görünmüyor", shopsButton.isDisplayed());
        assertTrue("Service butonu görünmüyor", serviceButton.isDisplayed());
        assertTrue("Shops butonu aktif değil", shopsButton.isEnabled());
        assertTrue("Service butonu aktif değil", serviceButton.isEnabled());

        // Shops butonuna tıkla ve ilgili şirketlerin görüntülenmesini kontrol et
        shopsButton.click();
        List<WebElement> companiesList = driver.findElements(By.cssSelector(".company-item"));
        assertTrue("Şirketler listesi görüntülenmiyor", companiesList.size() > 0);

        // İlerleyen sayfalara geçilebilmeli
        WebElement nextPageButton = driver.findElement(By.cssSelector(".pagination-next"));
        assertTrue("Sonraki sayfa butonu aktif değil", nextPageButton.isEnabled());
        nextPageButton.click();

        // Şirket kartında Visit Store ikonunun kontrolü
        WebElement visitStoreIcon = driver.findElement(By.cssSelector(".company-item:first-child .visit-store"));
        assertTrue("Visit Store ikonu görünmüyor", visitStoreIcon.isDisplayed());
        assertTrue("Visit Store ikonu aktif değil", visitStoreIcon.isEnabled());

        // Herhangi bir şirketi ziyaret et ve bilgilerinin kontrolü
        visitStoreIcon.click();
        WebElement shopDetails = driver.findElement(By.id("shopDetails"));
        WebElement services = driver.findElement(By.id("services"));
        WebElement shopAvailability = driver.findElement(By.id("shopAvailability"));
        assertTrue("Shop Details alanı görünmüyor", shopDetails.isDisplayed());
        assertTrue("Services alanı görünmüyor", services.isDisplayed());
        assertTrue("Shop Availability card'ı görünmüyor", shopAvailability.isDisplayed());

        // Service butonuna tıkla ve hizmetlerin görüntülenmesini kontrol et
        serviceButton.click();
        List<WebElement> servicesList = driver.findElements(By.cssSelector(".service-item"));
        assertTrue("Hizmetler listesi görüntülenmiyor", servicesList.size() > 0);

        // İlerleyen sayfalara geçilebilmeli
        WebElement nextServicePageButton = driver.findElement(By.cssSelector(".pagination-next"));
        assertTrue("Sonraki sayfa butonu aktif değil", nextServicePageButton.isEnabled());
        nextServicePageButton.click();

        // Hizmet kartında ait olduğu şirket, amount bilgisi ve location bilgisinin kontrolü
        WebElement firstServiceItem = servicesList.get(0);
        WebElement serviceCompany = firstServiceItem.findElement(By.cssSelector(".service-company"));
        WebElement serviceAmount = firstServiceItem.findElement(By.cssSelector(".service-amount"));
        WebElement serviceLocation = firstServiceItem.findElement(By.cssSelector(".service-location"));
        assertTrue("Hizmetin ait olduğu şirket bilgisi görünmüyor", serviceCompany.isDisplayed());
        assertTrue("Hizmetin amount bilgisi görünmüyor", serviceAmount.isDisplayed());
        assertTrue("Hizmetin location bilgisi görünmüyor", serviceLocation.isDisplayed());

        // Herhangi bir hizmete tıkla ve bilgilerinin kontrolü
        firstServiceItem.click();
        WebElement serviceAmountDetail = driver.findElement(By.id("serviceAmount"));
        WebElement serviceProvider = driver.findElement(By.id("serviceProvider"));
        WebElement serviceAvailability = driver.findElement(By.id("serviceAvailability"));
        WebElement serviceDetails = driver.findElement(By.id("serviceDetails"));
        WebElement additionalServices = driver.findElement(By.id("additionalServices"));
        WebElement reviews = driver.findElement(By.id("reviews"));
        WebElement relatedServices = driver.findElement(By.id("relatedServices"));
        assertTrue("Service Amount bilgisi görünmüyor", serviceAmountDetail.isDisplayed());
        assertTrue("Service Provider card'ı görünmüyor", serviceProvider.isDisplayed());
        assertTrue("Service Availability card'ı görünmüyor", serviceAvailability.isDisplayed());
        assertTrue("Service Details alanı görünmüyor", serviceDetails.isDisplayed());
        assertTrue("Additional Services alanı görünmüyor", additionalServices.isDisplayed());
        assertTrue("Reviews alanı görünmüyor", reviews.isDisplayed());
        assertTrue("Related Services alanı görünmüyor", relatedServices.isDisplayed());

        // Shops ve Service sayfalarında filter ikonunun kontrolü
        WebElement filterIcon = driver.findElement(By.cssSelector(".filter-icon"));
        assertTrue("Filter ikonu görünmüyor", filterIcon.isDisplayed());
        assertTrue("Filter ikonu aktif değil", filterIcon.isEnabled());

        // Shops ve Service sayfalarında Search form'unda alanların ve Price Range slider'ının kontrolü
        WebElement searchForm = driver.findElement(By.id("searchForm"));
        WebElement locationField = searchForm.findElement(By.name("location"));
        WebElement sortByField = searchForm.findElement(By.name("sortBy"));
        WebElement keywordField = searchForm.findElement(By.name("keyword"));
        WebElement categoriesField = searchForm.findElement(By.name("categories"));
        WebElement subCategoryField = searchForm.findElement(By.name("subCategory"));
        WebElement priceRangeSlider = searchForm.findElement(By.id("priceRange"));

        assertTrue("Location alanı görünmüyor", locationField.isDisplayed());
        assertTrue("Sort By alanı görünmüyor", sortByField.isDisplayed());
        assertTrue("Keyword alanı görünmüyor", keywordField.isDisplayed());
        assertTrue("Categories alanı görünmüyor", categoriesField.isDisplayed());
        assertTrue("Sub Category alanı görünmüyor", subCategoryField.isDisplayed());
        assertTrue("Price Range slider'ı görünmüyor", priceRangeSlider.isDisplayed());

        // Search butonunun kontrolü
        WebElement searchButton = searchForm.findElement(By.id("searchButton"));
        assertTrue("Search butonu görünmüyor", searchButton.isDisplayed());
        assertTrue("Search butonu aktif değil", searchButton.isEnabled());

        // Search formunu kullanarak filtreleme yapma
        locationField.sendKeys("New York");
        sortByField.sendKeys("Price");
        keywordField.sendKeys("Consulting");
        categoriesField.sendKeys("Business");
        subCategoryField.sendKeys("Consulting");
        searchButton.click();

        // Filtreleme sonuçlarının kontrolü
        List<WebElement> filteredResults = driver.findElements(By.cssSelector(".filtered-result-item"));
        assertTrue("Filtreleme sonuçları görüntülenmiyor", filteredResults.size() > 0);
    }

    @After
    public void tearDown() {
        // Tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}
