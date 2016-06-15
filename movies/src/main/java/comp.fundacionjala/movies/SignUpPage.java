package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {
    @FindBy(className = "app_signup_submit_button_button")
    private WebElement btnSignUp;
    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    
    public WebElement getBtnSignUp() {
        return btnSignUp;
    }
}
