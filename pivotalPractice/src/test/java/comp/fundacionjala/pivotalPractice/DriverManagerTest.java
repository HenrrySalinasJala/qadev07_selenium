package comp.fundacionjala.pivotalPractice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class DriverManagerTest {

    @Test
    public void aDriverInstanceIsSingletonII(){
        WebDriver driver1= DriverManager.getInstance().getDriver();
        WebDriver driver2= DriverManager.getInstance().getDriver();
        assertEquals(driver1,driver2);
    }
}
