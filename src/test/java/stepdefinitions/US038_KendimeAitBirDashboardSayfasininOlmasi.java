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

public class US038_KendimeAitBirDashboardSayfasininOlmasi {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testUserLoginAndDashboardFunctionality() {
        // Web sitesine git
        driver.get("https://qa.onlinemastermarket.com/");

        // Giriş butonuna tıkla
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

        // Kullanıcı adı ve şifreyi gir
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("barisakbas.user@ommarket.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Ommarket.2607");

        // Giriş yap butonuna tıkla
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

        // Ana sayfada profil ikonunun kontrolü
        WebElement profileIcon = driver.findElement(By.cssSelector(".navbar-profile-icon"));
        assertTrue("Profil ikonu görünmüyor", profileIcon.isDisplayed());
        assertTrue("Profil ikonu aktif değil", profileIcon.isEnabled());

        // Profil ikonuna tıkla
        profileIcon.click();

        // Dashboard ikonunun kontrolü
        WebElement dashboardIcon = driver.findElement(By.linkText("Dashboard"));
        assertTrue("Dashboard ikonu görünmüyor", dashboardIcon.isDisplayed());
        assertTrue("Dashboard ikonu aktif değil", dashboardIcon.isEnabled());

        // Dashboard ikonuna tıkla ve yönlendirme kontrolü
        dashboardIcon.click();
        String expectedDashboardUrl = "https://qa.onlinemastermarket.com/dashboard";
        assertEquals("Dashboard sayfası açılmadı", expectedDashboardUrl, driver.getCurrentUrl());

        // Dashboard sayfasında kartların kontrolü
        WebElement bookingsCard = driver.findElement(By.id("bookingsCard"));
        WebElement reviewsCard = driver.findElement(By.id("reviewsCard"));
        WebElement notificationsCard = driver.findElement(By.id("notificationsCard"));

        assertTrue("Bookings kartı görünmüyor", bookingsCard.isDisplayed());
        assertTrue("Reviews kartı görünmüyor", reviewsCard.isDisplayed());
        assertTrue("Notifications kartı görünmüyor", notificationsCard.isDisplayed());

        // Kartların tıklanabilirliğini kontrol et
        bookingsCard.click();
        assertEquals("Bookings sayfasına yönlendirme başarısız",
                "https://qa.onlinemastermarket.com/dashboard/bookings", driver.getCurrentUrl());
        driver.navigate().back();

        reviewsCard.click();
        assertEquals("Reviews sayfasına yönlendirme başarısız",
                "https://qa.onlinemastermarket.com/dashboard/reviews", driver.getCurrentUrl());
        driver.navigate().back();

        notificationsCard.click();
        assertEquals("Notifications sayfasına yönlendirme başarısız",
                "https://qa.onlinemastermarket.com/dashboard/notifications", driver.getCurrentUrl());
        driver.navigate().back();

        // Dashboard'dan ana sayfaya geçiş yapma
        WebElement homeButton = driver.findElement(By.cssSelector(".navbar-home-link"));
        assertTrue("Home butonu görünmüyor", homeButton.isDisplayed());
        homeButton.click();

        // Ana sayfaya dönüldüğünü kontrol et
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
