package comp.fundacionjala.pivotalPractice.project;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import comp.fundacionjala.pivotalPractice.DashboardPage;
import comp.fundacionjala.pivotalPractice.ProjectPage;
import comp.fundacionjala.pivotalPractice.SignInPage;

import static org.junit.Assert.assertTrue;

public class CreateProjectTest {

    private DashboardPage dashboardPage;

    private String projectName = "example";

    private ProjectPage projectPage;

    @Before
    public void beforeTestSetUp() {
        SignInPage.loginAs("henrrys", "PivotalTracker2292");
        dashboardPage = new DashboardPage();
    }

    @Test
    public void createNewProject() {

        String projectAccountName = "name test";
        projectPage = dashboardPage.clickOnBtnCreateProject()
                .setTxtProjectName(projectName)
                .setTxtNewAccountName(projectAccountName)
                .clickOnBtnSubmitCreateProject();
        assertTrue(projectPage.getLblProjectName().isDisplayed());
    }

    @After
    public void tearDown() {
        projectPage.clickOnTabSettings()
                .clickOnLnkDeleteProject()
                .clickOnBtnConfirmDelete();
    }
}
