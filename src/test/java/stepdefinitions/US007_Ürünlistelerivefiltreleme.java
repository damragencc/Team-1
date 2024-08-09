package stepdefinitions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
public class US007_Ürünlistelerivefiltreleme {

    private WebDriver driver;

    @Before
    public void setUp() {
        // WebDriverManager ile ChromeDriver ayarlanır ve başlatılır

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testShopsProductsLink() {
        // Ana sayfaya git
        driver.get("https://qa.onlinemastermarket.com/");

        // "Shops" altındaki "Products" linkini bul ve tıkla
        WebElement shopsMenu = driver.findElement(By.linkText("Shops"));
        shopsMenu.click();

        WebElement productsLink = driver.findElement(By.linkText("Products"));
        assertTrue("Products linki görünmüyor", productsLink.isDisplayed());
        productsLink.click();

        // "Product Lists" sayfasının doğru açıldığını doğrula
        String expectedUrl = "https://qa.onlinemastermarket.com/products";
        assertEquals("Products sayfası açılmadı", expectedUrl, driver.getCurrentUrl());
    }

    @Test
    public void testProductListPaginationAndDetails() {
        // Product Lists sayfasına git
        driver.get("https://qa.onlinemastermarket.com/products");

        // Ürünlerin görüntülendiğini doğrula
        WebElement productList = driver.findElement(By.id("productList"));
        assertTrue("Ürün listesi görüntülenmiyor", productList.isDisplayed());

        // İlerleyen sayfalara geçebilme
        WebElement nextPageButton = driver.findElement(By.cssSelector(".pagination-next"));
        assertTrue("Sonraki sayfa butonu aktif değil", nextPageButton.isEnabled());
        nextPageButton.click();

        // Bir ürüne tıklayıp detaylarına erişme
        WebElement productItem = driver.findElement(By.cssSelector(".product-item:first-child"));
        productItem.click();

        // Ürün detay sayfasının açıldığını doğrula
        WebElement productDetails = driver.findElement(By.id("productDetails"));
        assertTrue("Ürün detay sayfası görüntülenmiyor", productDetails.isDisplayed());

        // Add to Cart ve Buy Now butonlarının görünürlüğü ve aktifliği
        WebElement addToCartButton = driver.findElement(By.id("addToCartButton"));
        WebElement buyNowButton = driver.findElement(By.id("buyNowButton"));
        assertTrue("Add to Cart butonu görünmüyor", addToCartButton.isDisplayed());
        assertTrue("Buy Now butonu görünmüyor", buyNowButton.isDisplayed());
        assertTrue("Add to Cart butonu aktif değil", addToCartButton.isEnabled());
        assertTrue("Buy Now butonu aktif değil", buyNowButton.isEnabled());

        // Ürün quantity bilgisini güncelleyebilme
        WebElement quantityField = driver.findElement(By.name("quantity"));
        quantityField.clear();
        quantityField.sendKeys("3");
        assertEquals("Quantity güncellenemedi", "3", quantityField.getAttribute("value"));
    }

    @Test
    public void testProductListAddToCartAndFilters() {
        // Product Lists sayfasına git
        driver.get("https://qa.onlinemastermarket.com/products");

        // Ürün kartında Add to Cart butonunun görünürlüğü ve aktifliği
        WebElement productAddToCartButton = driver.findElement(By.cssSelector(".product-item:first-child .add-to-cart"));
        assertTrue("Ürün kartındaki Add to Cart butonu görünmüyor", productAddToCartButton.isDisplayed());
        assertTrue("Ürün kartındaki Add to Cart butonu aktif değil", productAddToCartButton.isEnabled());

        // Filter kartlarının görünürlüğü
        WebElement allCategoriesFilter = driver.findElement(By.id("allCategoriesFilter"));
        WebElement priceFilter = driver.findElement(By.id("priceFilter"));
        assertTrue("All Categories filter kartı görünmüyor", allCategoriesFilter.isDisplayed());
        assertTrue("Price filter kartı görünmüyor", priceFilter.isDisplayed());

        // Price filter kartındaki checkBox'ların tıklanabilirliği
        WebElement priceCheckBox = driver.findElement(By.cssSelector("#priceFilter input[type='checkbox']"));
        assertTrue("Price filter checkBox tıklanabilir değil", priceCheckBox.isEnabled());
        priceCheckBox.click();
        assertTrue("Price filter checkBox tıklanamadı", priceCheckBox.isSelected());

        // All Categories ve Price filter kartlarında filtreleme
        WebElement categoryCheckBox = driver.findElement(By.cssSelector("#allCategoriesFilter input[type='checkbox']"));
        categoryCheckBox.click();
        assertTrue("All Categories filter checkBox tıklanamadı", categoryCheckBox.isSelected());
    }

    @After
    public void tearDown() {
        // Tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}

