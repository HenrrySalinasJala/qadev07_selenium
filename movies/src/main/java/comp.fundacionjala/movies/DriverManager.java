package comp.fundacionjala.movies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    static String driverPath = ".\\lib\\";
    private static DriverManager instance;
    private WebDriver driver;

    private DriverManager() {
        initWebDriver();
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    private void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }


    /*
    public static void setDriver(String browser, String appUrl) {
        switch (browser) {
            case "chrome":
                driver = initChromeDriver(appUrl);
                break;
            case "firefox":
                driver = initFirefoxDriver(appUrl);
                break;
            default:
                return;
        }
    }



    private static WebDriver initChromeDriver(String appUrl) {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(appUrl);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String appUrl) {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get(appUrl);
        return driver;
    }*/
    public  void quitDriver() {
        driver.quit();
    }
}