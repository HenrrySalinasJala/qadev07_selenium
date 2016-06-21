package comp.fundacionjala.pivotalPractice.project;

import comp.fundacionjala.pivotalPractice.DashboardPage;
import comp.fundacionjala.pivotalPractice.ProjectPage;
import comp.fundacionjala.pivotalPractice.ProjectSettingsPage;
import comp.fundacionjala.pivotalPractice.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateProjectTest {

    private DashboardPage dashboardPage;

    private ProjectPage projectPage;

    private String projectName = "project to update";
    private ProjectSettingsPage projectSettingsPage;

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
    public void testProjectNameCanBeUpdated() {
        String newProjectName = "project to delete";
        projectSettingsPage = projectPage.clickOnTabSettings();
        projectSettingsPage.setTxtProjectName(newProjectName)
                .clickOnBtnSave();
        assertEquals(newProjectName, projectSettingsPage.getTxtProjectName());
    }

    @After
    public void tearDown() {
        projectSettingsPage.clickOnLnkDeleteProject()
                .clickOnBtnConfirmDelete();
    }
}
