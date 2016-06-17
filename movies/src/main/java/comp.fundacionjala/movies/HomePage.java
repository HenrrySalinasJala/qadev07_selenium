package comp.fundacionjala.movies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage implements IPage {
    

    @FindBy(className = "btn-login")
    private WebElement btnSignIn;
    @FindBy(className = "btn-register")
    private WebElement btnSignUp;

    public HomePage() {
        super("https://www.pivotaltracker.com");
    }


    public SignInPage clickOnSignInBtn() {
        btnSignIn.click();
        return new SignInPage();
    }
    public SignUpPage clickOnSignUpBtn() {
        btnSignUp.click();
        return new SignUpPage();
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
