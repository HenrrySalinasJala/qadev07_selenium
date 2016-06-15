package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigInPage extends BasePage {

    @FindBy(id = "credentials_username")
    private WebElement username;
    @FindBy(id = "credentials_password")
    private WebElement password;
    @FindBy(id = "signin_form")
    private WebElement btnSignIn;
    @FindBy(className = "forgot_password userflow")
    private WebElement lnkForgotPassword;

    public SigInPage(WebDriver driver) {
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

    public WebElement getPassword() {
        return password;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public void setBtnSignIn(WebElement btnSignIn) {
        this.btnSignIn = btnSignIn;
    }
    public WebElement getBtnSignIn() {
        return this.btnSignIn;
    }

    public WebElement getUsername() {
        return username;
    }

    public void setUsername(WebElement username) {
        this.username = username;
    }

    public WebElement getLnkForgotPassword() {
        return lnkForgotPassword;
    }

    public void setLnkForgotPassword(WebElement lnkForgotPassword) {
        this.lnkForgotPassword = lnkForgotPassword;
    }
}
