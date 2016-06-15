package comp.fundacionjala.movies;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class SignInTest extends BaseTest {
    private SignInPage signInPage;
    @BeforeTest
    @Parameters({"SignInPageUrl"})
    public void beforeTestSetUp(String urlPage) {
        if (Driver.getDriver()==null)
            System.out.print("sssss");
        signInPage = new SignInPage(Driver.getDriver());
        signInPage.goTo(urlPage);
    }
    @Test
    @Parameters({"username", "password"})
    public void loginWithValidCredentials(String username, String password) {
        DashboardPage dashboard = signInPage.setTxtUsername(username)
                                          .setTxtPassword(password)
                                          .clickOnLoginBtn();
        assertTrue(dashboard.getBtnCreateProject().isDisplayed());
        signInPage.goTo();
    }
}
