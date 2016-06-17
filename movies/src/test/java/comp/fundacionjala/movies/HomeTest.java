package comp.fundacionjala.movies;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class HomeTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    @Parameters({"username", "password"})
    public void beforeTestSetUp(String username, String password) {
        System.out.print("Home test xsssssss");
        homePage = new HomePage();
        homePage.logOut();
        homePage.goToPage();
    }

    @Test
    public void clickOnSigInBtnShouldOpenSignInPage() {
System.out.print("Home test x");
        SignInPage signInPage = homePage.clickOnSignInBtn();
        assertTrue(signInPage.getBtnSignIn().isDisplayed());
        homePage.getDriver().navigate().back();
    }

    @Test
    public void clickOnSignUpBtnShouldOpenIgnUpPage() {
        System.out.print("Home test y");
        SignUpPage signUpPage = homePage.clickOnSignUpBtn();
        assertTrue(signUpPage.getBtnSignUp().isDisplayed());
        homePage.getDriver().navigate().back();
    }

    @Test
    public void verifyTitlePage() {
        System.out.print("Home test xx");
        assertTrue(homePage.getDriver().getTitle().startsWith("Pivotal Tracker | Agile Project Management"));
    }
}
