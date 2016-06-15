package comp.fundacionjala.movies;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeSuite
    @Parameters({"browser", "appUrl"})
    public void SetUp(String browser, String appUrl) {
        try {
            Driver.setDriver(browser, appUrl);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n" + e.getStackTrace());
        }

    }



    @AfterSuite
    public void tearDown() {
        Driver.quitDriver();
    }
}
