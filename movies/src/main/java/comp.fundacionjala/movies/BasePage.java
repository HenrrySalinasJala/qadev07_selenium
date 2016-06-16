package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static  String URL;
    protected WebDriver driver;
    protected boolean isAlreadyLogged=false;

    public BasePage() {
        driver=DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);

    }
    public WebDriver getDriver(){
        return driver;
    }

    public void goToPage() {
        driver.navigate().to(URL);
    }
    public void logIn(String username,String password){
        if(!isAlreadyLogged){
            SignInPage signInPage=new SignInPage();
            signInPage.setTxtUsername(username)
                    .setTxtPassword(password)
                    .clickOnLoginBtn();
            isAlreadyLogged=true;
        }
    }
    public void logOut(){
        if(isAlreadyLogged){
            DashboardPage dashboardPage=new DashboardPage();
            dashboardPage.clickOnCmbProfile()
                        .clickOnBtnLogout();
            isAlreadyLogged=false;
        }
    }





}
