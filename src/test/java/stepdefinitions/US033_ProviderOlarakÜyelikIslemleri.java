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

public class US033_ProviderOlarakÜyelikIslemleri {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testProviderLoginAndSubscription() {
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

        // Dashboard'ta Subscription linkinin kontrolü
        WebElement subscriptionLink = driver.findElement(By.linkText("Subscription"));
        assertTrue("Subscription linki görünmüyor", subscriptionLink.isDisplayed());
        assertTrue("Subscription linki aktif değil", subscriptionLink.isEnabled());

        // Subscription linkine tıkla
        subscriptionLink.click();

        // Subscription sayfasında üyelik planlarının kontrolü
        List<WebElement> membershipPlans = driver.findElements(By.cssSelector(".plan-name"));
        boolean basicFound = false, freeFound = false, silverFound = false, goldFound = false;

        for (WebElement plan : membershipPlans) {
            String planName = plan.getText();
            if (planName.equalsIgnoreCase("Basic")) basicFound = true;
            if (planName.equalsIgnoreCase("Free")) freeFound = true;
            if (planName.equalsIgnoreCase("Silver")) silverFound = true;
            if (planName.equalsIgnoreCase("Gold")) goldFound = true;
        }

        assertTrue("Basic plan görünmüyor", basicFound);
        assertTrue("Free plan görünmüyor", freeFound);
        assertTrue("Silver plan görünmüyor", silverFound);
        assertTrue("Gold plan görünmüyor", goldFound);

        // Silver ve Gold planlar için ödeme yöntemleri
        WebElement silverSelect = driver.findElement(By.xpath("//div[contains(text(),'Silver')]//following-sibling::div//select"));
        WebElement goldSelect = driver.findElement(By.xpath("//div[contains(text(),'Gold')]//following-sibling::div//select"));

        assertTrue("Silver plan için ödeme seçeneği yok", silverSelect.isDisplayed());
        assertTrue("Gold plan için ödeme seçeneği yok", goldSelect.isDisplayed());

        // Ödeme yöntemi seçilebilir mi kontrol et
        silverSelect.click();
        WebElement silverOption = silverSelect.findElement(By.xpath(".//option[@value='credit_card']"));
        silverOption.click();

        goldSelect.click();
        WebElement goldOption = goldSelect.findElement(By.xpath(".//option[@value='credit_card']"));
        goldOption.click();

        // Silver planı seç ve Subscribe yap
        WebElement silverSubscribeButton = driver.findElement(By.xpath("//div[contains(text(),'Silver')]//following-sibling::div//button[contains(text(),'Subscribe')]"));
        silverSubscribeButton.click();

        // Subscription linkine tekrar tıkla ve doğrula
        subscriptionLink.click();

        // "Subscribed" olarak görünüyor mu kontrol et
        WebElement subscribedPlan = driver.findElement(By.xpath("//div[contains(text(),'Silver')]//following-sibling::div[contains(text(),'Subscribed')]"));
        assertTrue("Silver plan Subscribed olarak görünmüyor", subscribedPlan.isDisplayed());
    }

    @After
    public void tearDown() {
        // Tarayıcıyı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}
