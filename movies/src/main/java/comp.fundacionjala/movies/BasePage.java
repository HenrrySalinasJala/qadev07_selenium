package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected  static final String BASE_URL="https://www.pivotaltracker.com";
    protected String URL;
    protected WebDriver driver;
    protected boolean isAlreadyLogged=false;


    public BasePage(String url) {
        driver=DriverManager.getInstance().getDriver();
        URL=url;
        PageFactory.initElements(driver, this);

    }
    public WebDriver getDriver(){
        return driver;
    }

    public void goToPage(){
        System.out.print("\nLa variable tiene: "+URL+"\n El driver tiene: "+driver.getCurrentUrl());
     if (!(URL==driver.getCurrentUrl())){
         driver.navigate().to(URL);
     }
    }
    public void logIn(String username,String password){
        if(!isAlreadyLogged){
            SignInPage signInPage=new SignInPage();
            signInPage.setTxtUsername(username)
                    .setTxtPassword(password)
                    .getBtnSignIn().click();

            isAlreadyLogged=true;
        }
    }
    public void logOut(){
        if(isAlreadyLogged){
            //PageBuilder builder = new PageBuilder();
            //AbstractPageFactory pageFactory = null;
            //pageFactory=new HomePageFactory();
            //IPage page =builder.buildPage(pageFactory);
            DashboardPage dashboardPage=new DashboardPage();
            goToPage();
            dashboardPage.clickOnCmbProfile()
                        .clickOnBtnLogout();
            isAlreadyLogged=false;
        }
    }





}
