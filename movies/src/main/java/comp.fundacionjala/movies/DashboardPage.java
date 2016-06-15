package comp.fundacionjala.movies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    private WebDriver driver;
    @FindBy(id = "create_new_project_button")
    private WebElement btnCreateProject;
    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnCreateProject() {
        return btnCreateProject;
    }

    public void setBtnCreateProject(WebElement btnCreateProject) {
        this.btnCreateProject = btnCreateProject;
    }
}
