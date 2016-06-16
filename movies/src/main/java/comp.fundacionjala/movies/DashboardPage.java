package comp.fundacionjala.movies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends  BasePage{

    private static final String URL = "https://www.pivotaltracker.com/dashboard";
    @FindBy(id = "create_new_project_button")
    private WebElement btnCreateProject;

    @FindBy(id = "create_new_workspace_button")
    private WebElement btnCreateWorkspace;

    @FindBy(className = "tc_form_input")
    private WebElement txtProjectName;

    @FindBy(className = "tc_form_select")
    private WebElement cmbAccounts;

    @FindBy(className = "tc_select_create_account")
    private WebElement btnNewAccount;

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div/div[2]/div/form/div/section/div[2]/input")
    private WebElement txtNewAccountName;

    @FindBy(xpath = "//*[@id=\"modal_area\"]/div/div/div[2]/div/form/div/footer/button[2]")
    private WebElement btnSubmitCreateProject;

    @FindBy(className = "tc_profile_dropdown")
    private WebElement cmbProfile;
    @FindBy(xpath = "//*[@id=\"shared_header\"]/div/div/header/ul/li[3]/div/div/div/ul/li[4]/form/button")
    private WebElement btnLogout;

    public DashboardPage() {
        goToPage();
    }
    public void goToPage() {
        driver.get(URL);
    }

    public DashboardPage clickOnBtnCreateProject(){
        btnCreateProject.click();
        return this;
    }
    public ProjectPage clickOnBtnSubmitCreateProject(){
        btnSubmitCreateProject.click();
        return new ProjectPage();

    }
    public WebElement getBtnCreateProject() {
        return btnCreateProject;
    }

    public void setBtnCreateProject(WebElement btnCreateProject) {
        this.btnCreateProject = btnCreateProject;
    }

    public WebElement getBtnCreateWorkspace() {
        return btnCreateWorkspace;
    }

    public void setBtnCreateWorkspace(WebElement btnCreateWorkspace) {
        this.btnCreateWorkspace = btnCreateWorkspace;
    }


    public WebElement getTxtProjectName() {
        return txtProjectName;
    }

    public DashboardPage setTxtProjectName(String projectName) {
        txtProjectName.clear();
        txtProjectName.sendKeys(projectName);
        return this;
    }

    public WebElement getCmbAccounts() {
        return cmbAccounts;
    }

    public void setCmbAccounts(WebElement cmbAccounts) {
        this.cmbAccounts = cmbAccounts;
    }

    public WebElement getTxtNewAccountName() {
        return txtNewAccountName;
    }

    public DashboardPage setTxtNewAccountName(String newAccountName) {
        cmbAccounts.click();
        btnNewAccount.click();
        txtNewAccountName.clear();
        txtNewAccountName.sendKeys(newAccountName);
        return this;
    }

    public WebElement getCmbProfile() {
        return cmbProfile;
    }
    public DashboardPage clickOnCmbProfile() {
        cmbProfile.click();
        return this;
    }

    public DashboardPage clickOnBtnLogout() {
        btnLogout.click();
        return this;
    }
}
