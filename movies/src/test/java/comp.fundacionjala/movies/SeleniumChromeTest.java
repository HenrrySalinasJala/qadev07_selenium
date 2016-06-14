package comp.fundacionjala.movies;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SeleniumChromeTest {

    static final String chromePath = "D:/lib/";
    private static WebDriver driver;
    WebElement element;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", chromePath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        //driver.navigate().to("http://localhost:3000");
    }
    @Test
    public void startChromeWebDriver() {
        driver.get("http://localhost:3000");
        assertTrue("the title should be mean", driver.getTitle().startsWith("mean"));
        //driver.close();

    }
    @Test
    public void clickLoginButton() {
        driver.get("http://localhost:3000/#/home");
        WebElement loginLnk = driver.findElement(By.id("dropdownMenuLogin"));
        loginLnk.click();
        try {
            element = driver.findElement(By.name("submit"));
        } catch (Exception e) {
        }
        assertNotNull(element);
    }
    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
