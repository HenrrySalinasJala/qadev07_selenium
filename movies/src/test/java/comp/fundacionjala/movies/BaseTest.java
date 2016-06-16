package comp.fundacionjala.movies;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeSuite
    @Parameters({"browser", "appUrl"})
    public void SetUp(String browser, String appUrl) {
           // DriverManager.setDriver(browser, appUrl);
    }



    @AfterSuite
    public void tearDown() {
       DriverManager.getInstance().quitDriver();
    }
}
