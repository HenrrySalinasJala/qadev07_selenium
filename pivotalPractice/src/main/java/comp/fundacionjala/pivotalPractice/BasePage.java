package comp.fundacionjala.pivotalPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    protected Actions action;

    public BasePage() {
        driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
        action = new Actions(driver);
    }
}
