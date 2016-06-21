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

    @FindBy(className = "save_bar__submit")
    private WebElement btnSave;

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

    public ProjectSettingsPage setTxtProjectName(String projectName) {
        txtProjectName.clear();
        txtProjectName.sendKeys(projectName);
        return this;
    }

    public ProjectSettingsPage clickOnBtnSave() {
        btnSave.click();
        return this;
    }
    public String getTxtProjectName(){
        return txtProjectName.getAttribute("value");
    }
}
