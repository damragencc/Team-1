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

public class US070_AnasayfadanKolayBirBicimdeBildirimlereUlasmak {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testProviderNotificationsFunctionality() {
        // Web sitesine git
        driver.get("https://qa.onlinemastermarket.com/");

        // Giriş butonuna tıkla
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        // Kullanıcı adı ve şifreyi gir
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("info@team1.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Urban.123");

        // Giriş yap butonuna tıkla
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

        // Ana sayfada Notifications ikonunun kontrolü
        WebElement notificationsIcon = driver.findElement(By.cssSelector(".navbar-notifications-icon"));
        assertTrue("Notifications ikonu görünmüyor", notificationsIcon.isDisplayed());
        assertTrue("Notifications ikonu aktif değil", notificationsIcon.isEnabled());

        // Notifications ikonuna tıkla
        notificationsIcon.click();

        // Clear All ve View All Notifications ikonlarının kontrolü
        WebElement clearAllIcon = driver.findElement(By.id("clearAll"));
        WebElement viewAllIcon = driver.findElement(By.id("viewAll"));

        assertTrue("Clear All ikonu görünmüyor", clearAllIcon.isDisplayed());
        assertTrue("View All Notifications ikonu görünmüyor", viewAllIcon.isDisplayed());
        assertTrue("Clear All ikonu aktif değil", clearAllIcon.isEnabled());
        assertTrue("View All Notifications ikonu aktif değil", viewAllIcon.isEnabled());

        // View All ikonuna tıkla
        viewAllIcon.click();

        // Notifications sayfasında Delete All ikonunun kontrolü
        WebElement deleteAllIcon = driver.findElement(By.id("deleteAll"));
        assertTrue("Delete All ikonu görünmüyor", deleteAllIcon.isDisplayed());
        assertTrue("Delete All ikonu aktif değil", deleteAllIcon.isEnabled());

        // Gelen bildirimleri tek tek veya toplu olarak silme
        List<WebElement> notifications = driver.findElements(By.cssSelector(".notification-item"));

        if (notifications.size() > 0) {
            // Tek tek silme
            for (WebElement notification : notifications) {
                WebElement deleteButton = notification.findElement(By.cssSelector(".delete-notification"));
                deleteButton.click();
            }

            // Toplu silme
            deleteAllIcon.click();

            // Bildirimlerin silindiğini doğrula
            List<WebElement> remainingNotifications = driver.findElements(By.cssSelector(".notification-item"));
            assertEquals("Bildirimler silinemedi", 0, remainingNotifications.size());
        } else {
            System.out.println("Hiç bildirim bulunamadı.");
        }

        // Ana sayfaya geçiş için Home ikonunun kontrolü
        WebElement homeIcon = driver.findElement(By.cssSelector(".navbar-home-link"));
        assertTrue("Home ikonu görünmüyor", homeIcon.isDisplayed());
        assertTrue("Home ikonu aktif değil", homeIcon.isEnabled());

        // Home ikonuna tıkla ve ana sayfaya dön
        homeIcon.click();
        assertEquals("Ana sayfaya geri dönülemedi", "https://qa.onlinemastermarket.com/", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        // Tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}
