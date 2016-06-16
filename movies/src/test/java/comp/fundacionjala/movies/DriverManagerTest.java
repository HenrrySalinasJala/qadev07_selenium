package comp.fundacionjala.movies;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class DriverManagerTest {

    @Test
    public void aDriverInstanceIsSingletonII(){
        WebDriver driver1= DriverManager.getInstance().getDriver();
        WebDriver driver2= DriverManager.getInstance().getDriver();
        assertEquals(driver1,driver2);
    }
}
