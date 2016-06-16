package comp.fundacionjala.movies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage implements IPage{


    @FindBy(id = "credentials_username")
    private WebElement txtUsername;
    @FindBy(id = "credentials_password")
    private WebElement txtPassword;
    @FindBy(className = "app_signup_submit_button_button")
    private WebElement btnSignIn;
    @FindBy(className = "forgot_password userflow")
    private WebElement lnkForgotPassword;
    @FindBy(xpath="//div[contains(.,'Invalid username/password')]")
    private WebElement lblLoginErrorMessage;


    public SignInPage() {
        URL ="https://www.pivotaltracker.com/signin" ;
    }
    public DashboardPage clickOnSignInBtn() {
        btnSignIn.click();
        return new DashboardPage();
    }

    public DashboardPage clickOnLoginBtn() {
        btnSignIn.click();
        return new DashboardPage();
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public SignInPage setTxtPassword(String password) {
        this.txtPassword.clear();
        this.txtPassword.sendKeys(password);
        return this;
    }

    public void setBtnSignIn(WebElement btnSignIn) {
        this.btnSignIn = btnSignIn;
    }

    public WebElement getBtnSignIn() {
        return this.btnSignIn;
    }

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public SignInPage setTxtUsername(String username) {
        this.txtUsername.clear();
        this.txtUsername.sendKeys(username);
        return this;
    }

    public WebElement getLnkForgotPassword() {
        return lnkForgotPassword;
    }

    public void setLnkForgotPassword(WebElement lnkForgotPassword) {
        this.lnkForgotPassword = lnkForgotPassword;
    }

    public WebElement getLblLoginErrorMessage() {
        return lblLoginErrorMessage;
    }

    public void setLblLoginErrorMessage(WebElement lblLoginErrorMessage) {
        this.lblLoginErrorMessage = lblLoginErrorMessage;
    }
}
