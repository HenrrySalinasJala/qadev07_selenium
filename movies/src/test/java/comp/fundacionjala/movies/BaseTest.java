package comp.fundacionjala.movies;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {


    @Parameters({ "browser", "appUrl" })
    @BeforeClass
    public void SetUp(String browser, String appUrl) {
        try {
            Driver.setDriver(browser, appUrl);
        } catch (Exception e) {
            System.out.println(e.getMessage()+"\n"+e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() {
        Driver.quitDriver();
    }
}
