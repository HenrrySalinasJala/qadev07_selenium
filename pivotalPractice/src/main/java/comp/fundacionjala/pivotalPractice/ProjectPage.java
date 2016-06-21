package comp.fundacionjala.pivotalPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {

    @FindBy(className = "raw_context_name")
    private WebElement lblProjectName;

    @FindBy(xpath = "//*[contains(@class,\"page_header_container\")]/descendant::span[text()=\"settings\"]")
    private WebElement tabSettings;

    public WebElement getLblProjectName() {
        return lblProjectName;
    }

    public ProjectSettingsPage clickOnTabSettings() {
        tabSettings.click();
        return new ProjectSettingsPage();
    }
}
