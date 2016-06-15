package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(id = "credentials_username")
    private WebElement txtUsername;
    @FindBy(id = "credentials_password")
    private WebElement txtPassword;
    @FindBy(id = "signin_form")
    private WebElement btnSignIn;
    @FindBy(className = "forgot_password userflow")
    private WebElement lnkForgotPassword;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DashboardPage clickOnSignInBtn() {
        btnSignIn.click();
        return new DashboardPage(driver);
    }

    public DashboardPage clickOnLoginBtn() {
        btnSignIn.click();
        return new DashboardPage(driver);
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

}
