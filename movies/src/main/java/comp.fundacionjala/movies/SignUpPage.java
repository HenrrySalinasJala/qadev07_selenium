package comp.fundacionjala.movies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    @FindBy(className = "app_signup_submit_button_button")
    private WebElement btnSignUp;
    public SignUpPage() {
        super("https://www.pivotaltracker.com/signup");
    }

    
    public WebElement getBtnSignUp() {
        return btnSignUp;
    }

    public void setBtnSignUp(WebElement btnSignUp) {
        this.btnSignUp = btnSignUp;
    }

}
