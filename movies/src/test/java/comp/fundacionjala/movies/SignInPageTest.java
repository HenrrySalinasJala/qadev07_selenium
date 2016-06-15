package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class SignInPageTest {
    private WebDriver driver;

    @Test
    public void loginWithValidCredentials(){
        SigInPage signIn=new SigInPage(driver);
        //DashboardPage dashboard=SigInPage;
        //assertTrue(dashboard.isBtnSignInVisible());
    }
}
