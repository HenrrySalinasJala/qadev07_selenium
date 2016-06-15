package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    static String driverPath = ".\\lib\\";
    private static WebDriver driver = null;
    protected Driver() {
    }
    public static WebDriver getDriver() {
        return driver;
    }
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
    public static void quitDriver() {
        driver.quit();
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
    }
}