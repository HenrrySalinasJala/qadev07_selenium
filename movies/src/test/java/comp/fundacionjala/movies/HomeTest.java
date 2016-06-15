package comp.fundacionjala.movies;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class HomeTest extends BaseTest {
    private HomePage homePage;
    @BeforeTest
    public void beforeTestSetUp() {
             homePage = new HomePage(Driver.getDriver());
    }
    @Test
    public void clickOnSigInBtnShouldOpenSignInPage() {

        SignInPage signInPage = homePage.clickOnSignInBtn();
        assertTrue(signInPage.getBtnSignIn().isDisplayed());
        homePage.goTo();
    }
    @Test
    public void clickOnSignUpBtnShouldOpenIgnUpPage(){
        SignUpPage signUpPage = homePage.clickOnSignUpBtn();
        assertTrue(signUpPage.getBtnSignUp().isDisplayed());
        homePage.goTo();
    }
    @Test
    public void verifyTitlePage(){
        assertTrue(Driver.getDriver().getTitle().startsWith("Pivotal Tracker | Agile Project Management"));
    }
}
