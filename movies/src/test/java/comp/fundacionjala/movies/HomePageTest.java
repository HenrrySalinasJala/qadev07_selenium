package comp.fundacionjala.movies;

import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class HomePageTest extends BaseTest {

    @Test
    public void clickOnLoginButtonShouldOpenSignInPage() {
        HomePage homePage = new HomePage(Driver.getDriver());
        SigInPage signInPage = homePage.clickOnSignInBtn();
        assertTrue(signInPage.getBtnSignIn().isDisplayed());
    }
}
