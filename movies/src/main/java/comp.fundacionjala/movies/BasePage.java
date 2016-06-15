package comp.fundacionjala.movies;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract  class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver=driver;
    }
}
