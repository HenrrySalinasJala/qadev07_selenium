package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;
    protected String urlPage;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        urlPage=this.driver.getCurrentUrl();
    }
    public void goTo(){
            Driver.getDriver().get(urlPage);
    }
    public void goTo(String url){
        Driver.getDriver().get(url);
    }
}
