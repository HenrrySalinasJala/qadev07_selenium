package comp.fundacionjala.movies;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class SignInTest extends BaseTest {
    private SignInPage signInPage;
    @BeforeTest
    @Parameters({"SignInPageUrl"})
    public void SetUp(String urlPage) {
        signInPage = new SignInPage();
        signInPage.logOut();
        signInPage.goToPage();
    }
    @Test
    @Parameters({"username", "password"})
    public void loginWithValidCredentials(String username, String password) {

        DashboardPage dashboard = signInPage.setTxtUsername(username)
                                          .setTxtPassword(password)
                                          .clickOnLoginBtn();
        assertTrue(dashboard.getBtnCreateWorkspace().isDisplayed());
        signInPage.getDriver().navigate().back();
    }
    @Test
    public void errorMessageShouldBeDisplayedWenTheCredentialsIsWronng(){
        signInPage.setTxtUsername("what").setTxtPassword("what");
        signInPage.getBtnSignIn().click();
        assertTrue(signInPage.getLblLoginErrorMessage().isDisplayed());
    }
    @AfterTest
    public void tearDown(){
        signInPage.logOut();
    }

}
