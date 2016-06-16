package comp.fundacionjala.movies;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage{
    @FindBy(className = "raw_context_name")
    private WebElement projectName;

    public WebElement getProjectName() {
        return projectName;
    }

    public void setProjectName(WebElement projectName) {
        this.projectName = projectName;
    }
}
