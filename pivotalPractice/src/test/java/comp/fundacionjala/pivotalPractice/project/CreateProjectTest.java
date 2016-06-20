package comp.fundacionjala.pivotalPractice.project;

import comp.fundacionjala.pivotalPractice.DashboardPage;
import comp.fundacionjala.pivotalPractice.ProjectPage;
import comp.fundacionjala.pivotalPractice.SignInPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CreateProjectTest {
    private DashboardPage dashboardPage;
    private String projectName="example";
    @Before
    public void beforeTestSetUp() {
        SignInPage.loginAs("henrrys", "PivotalTracker2292");
        dashboardPage = new DashboardPage();
    }
    @Test
    public void createNewProject() {


        String projectAccountName="name test";
        ProjectPage projectPage=dashboardPage.clickOnBtnCreateProject()
                .setTxtProjectName(projectName)
                .setTxtNewAccountName(projectAccountName)
                .clickOnBtnSubmitCreateProject();
        assertTrue(projectPage.getLblProjectName().isDisplayed());
    }

    @After
    public void tearDown(){

    }
    
}
