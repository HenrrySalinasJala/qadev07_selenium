package comp.fundacionjala.pivotalPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    private static String BASE_URL = "https://www.pivotaltracker.com";
    @FindBy(className = "btn-login")
    private WebElement btnSignIn;
    @FindBy(className = "btn-register")
    private WebElement btnSignUp;

    public IndexPage() {
        goTo(BASE_URL);
    }
    public void goTo(String url){
        if (url!=driver.getCurrentUrl()){
            driver.navigate().to(BASE_URL);
        }
    }
    public SignInPage clickOnSignInBtn() {
        btnSignIn.click();
        return new SignInPage();
    }

    public void setBtnSignIn(WebElement btnSignIn) {
        this.btnSignIn = btnSignIn;
    }

    public WebElement getBtnSignIn() {
        return btnSignIn;
    }

    public void setBtnSignUp(WebElement btnSignUp) {
        this.btnSignUp = btnSignUp;
    }

    public WebElement getBtnSignUp() {
        return btnSignUp;
    }
}
