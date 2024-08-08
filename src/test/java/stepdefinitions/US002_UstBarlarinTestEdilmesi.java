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

public class US002_UstBarlarinTestEdilmesi {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testHeaderLinksVisibilityAndFunctionality() {
        // Ana sayfaya git
        driver.get("https://qa.onlinemastermarket.com/");

        // Üst bar linklerinin görünürlüğünü ve aktifliğini kontrol et
        String[] linkTexts = {"Shops", "Categories", "About Us", "Contact Us", "Become a Professional", "Become a User"};

        for (String linkText : linkTexts) {
            WebElement link = driver.findElement(By.linkText(linkText));
            assertTrue("Link görünmüyor: " + linkText, link.isDisplayed());
            assertTrue("Link aktif değil: " + linkText, link.isEnabled());
        }
    }

    @Test
    public void testLoginButtonVisibilityAndFunctionality() {
        // Ana sayfaya git
        driver.get("https://qa.onlinemastermarket.com/");

        // Login butonunun görünürlüğünü ve aktifliğini kontrol et
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        assertTrue("Login butonu görünmüyor", loginButton.isDisplayed());
        assertTrue("Login butonu aktif değil", loginButton.isEnabled());
    }

    @Test
    public void testSiteLogoFunctionality() {
        // Ana sayfaya git
        driver.get("https://qa.onlinemastermarket.com/");

        // Site logosunu bul ve tıkla
        WebElement siteLogo = driver.findElement(By.cssSelector(".navbar-brand img"));
        siteLogo.click();

        // Ana sayfanın yenilendiğini kontrol et
        String expectedUrl = "https://qa.onlinemastermarket.com/";
        assertEquals("Ana sayfa yenilenmedi", expectedUrl, driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        // Tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }

    
}


