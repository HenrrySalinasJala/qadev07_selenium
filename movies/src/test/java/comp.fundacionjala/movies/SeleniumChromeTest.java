package comp.fundacionjala.movies;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumChromeTest {
    static final String chromePath="D:/lib/";
    private static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.navigate().to("http://localhost:3000");
    }
    @Test
    public void startChromeWebDriver(){

        assertTrue("the title should be mean",driver.getTitle().startsWith("mean"));
        //driver.close();

    }
    @Test
    public void clickLoginButton(){
        //driver.get("");
        WebElement loginLnk=driver.findElement(By.id("dropdownMenuLogin"));
        loginLnk.click();
    }
    @AfterClass
    public static void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
    }
}
