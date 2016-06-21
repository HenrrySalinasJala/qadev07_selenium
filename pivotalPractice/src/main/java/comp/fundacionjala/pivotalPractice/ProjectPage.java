package comp.fundacionjala.pivotalPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProjectPage extends BasePage {

    @FindBy(className = "raw_context_name")
    private WebElement lblProjectName;

    @FindBy(xpath = "//span[contains(.,'settings')]")
    private WebElement tabSettings;

    public WebElement getLblProjectName() {
        return lblProjectName;
    }

    public ProjectSettingsPage clickOnTabSettings() {
        wait.until(visibilityOf(tabSettings));
        tabSettings.click();
        return new ProjectSettingsPage();
    }
}
