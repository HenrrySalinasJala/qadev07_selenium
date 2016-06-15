package comp.fundacionjala.movies;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;


import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumChromeTest {

    static final String chromePath = ".\\lib\\";
    public static WebDriver driver;
    WebElement element;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", chromePath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);

    }

    @Test
    public void startChromeWebDriver() {
        System.out.println("title :- " + driver.getTitle());
        assertTrue(driver.getTitle().startsWith("Dashboard - Pivotal Tracker"));
    }


    @Test(enabled = true)
    @Parameters({ "username", "password" })
    public void clickLoginButton(String username, String password) {
        System.out.println("Parameter for User Name passed as :- " + username);
        System.out.println("Parameter for Password passed as :- " + password);
        driver.get("https://www.pivotaltracker.com/signin");
        WebElement user=driver.findElement(By.id("credentials_username"));
        user.sendKeys(username);
        WebElement pass=driver.findElement(By.id("credentials_password"));
        pass.sendKeys(password);
        WebElement loginLnk = driver.findElement(By.xpath("//*[@id=\"signin_form\"]/button"));
        loginLnk.click();
        try {
            element = driver.findElement(By.id("create_new_project_button"));
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
