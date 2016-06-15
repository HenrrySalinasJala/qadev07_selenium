package comp.fundacionjala.movies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    @FindBy(className = "btn-login")
    private WebElement btnSignIn;
    @FindBy(className = "btn-register")
    private WebElement btnSignUp;

    public  HomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public SigInPage clickOnSignInBtn(){
        btnSignIn.click();
        return new SigInPage(driver);
    }
    public SignUpPage clickOnSignUpBtn(){
        btnSignUp.click();
        return new SignUpPage(driver);
    }

    public void setBtnSignIn(WebElement btnSignIn) {
        this.btnSignIn = btnSignIn;
    }
    public WebElement getBtnSignIn(){
        return btnSignIn;
    }

    public void setBtnSignUp(WebElement btnSignUp) {
        this.btnSignUp = btnSignUp;
    }
    public WebElement getBtnSignUp(){
        return btnSignUp;
    }
}
