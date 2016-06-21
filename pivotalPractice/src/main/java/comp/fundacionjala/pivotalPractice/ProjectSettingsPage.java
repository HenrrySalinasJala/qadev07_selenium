package comp.fundacionjala.pivotalPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectSettingsPage extends BasePage {

    @FindBy(className = "save_bar__cancel")
    private WebElement btnCancel;

    @FindBy(id = "delete_link")
    private WebElement lnkDeleteProject;

    @FindBy(id = "confirm_delete")
    private WebElement btnConfirmDelete;

    @FindBy(id = "project_name")
    private WebElement txtProjectName;

    public WebElement getBtnCancel() {
        return btnCancel;
    }

    public ProjectSettingsPage clickOnLnkDeleteProject() {
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).perform();
        lnkDeleteProject.click();
        return this;
    }

    public DashboardPage clickOnBtnConfirmDelete() {
        btnConfirmDelete.click();
        return new DashboardPage();
    }

    public void setTxtProjectName(String projectName) {
        txtProjectName.clear();
        txtProjectName.sendKeys(projectName);
    }
}
