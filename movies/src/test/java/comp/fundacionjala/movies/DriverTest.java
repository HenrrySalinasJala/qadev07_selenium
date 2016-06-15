package comp.fundacionjala.movies;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

public class DriverTest {
    @Test
    public void aDriverInstanceIsSingleton(){
        assertEquals(Driver.getDriver(),Driver.getDriver());
    }
    @Test
    public void aDriverInstanceIsSingletonII(){
        WebDriver driver1=Driver.getDriver();
        WebDriver driver2=Driver.getDriver();

        assertEquals(driver1,driver2);
    }
}
