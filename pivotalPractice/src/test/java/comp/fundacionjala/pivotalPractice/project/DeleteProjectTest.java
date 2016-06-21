package comp.fundacionjala.pivotalPractice.project;

import org.junit.Before;
import org.junit.Test;

import comp.fundacionjala.pivotalPractice.DashboardPage;
import comp.fundacionjala.pivotalPractice.ProjectPage;
import comp.fundacionjala.pivotalPractice.SignInPage;

import static org.junit.Assert.assertTrue;

public class DeleteProjectTest {

    private DashboardPage dashboardPage;

    private ProjectPage projectPage;

    private String projectName = "project to delete";

    @Before
    public void setUp() {
        String username = "henrrys";
        String password = "PivotalTracker2292";
        SignInPage.loginAs(username, password);
        dashboardPage = new DashboardPage();
        String projectAccountName = "name test";

        projectPage = dashboardPage.clickOnBtnCreateProject()
                .setTxtProjectName(projectName)
                .setTxtNewAccountName(projectAccountName)
                .clickOnBtnSubmitCreateProject();
    }

    @Test
    public void testAProjectCanBeDeleted() {
        dashboardPage = projectPage.clickOnTabSettings()
                .clickOnLnkDeleteProject()
                .clickOnBtnConfirmDelete();
        assertTrue(dashboardPage.getMsgDelete().isDisplayed());
    }
}
