package comp.fundacionjala.pivotalPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {


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

    public String getTxtUsername() {
        String username="";
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            txtUsername.getText();
        }catch (NoSuchElementException e){

        }finally {
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        }
        return username;
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
    public static DashboardPage loginAs(String username, String password){
        IndexPage indexPage=new IndexPage();
        DashboardPage dashboardPage=new DashboardPage();
        if (!dashboardPage.getUserNameText().equals(username)){

            return  indexPage.clickOnSignInBtn()
                    .setTxtUsername(username)
                    .setTxtPassword(password)
                    .clickOnLoginBtn();
        }
        return dashboardPage;
    }
}
