package comp.fundacionjala.movies;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;

public class DashboardTest extends BaseTest{
    private DashboardPage dashboardPage;

    @BeforeTest
    @Parameters({"DashboardPageUrl","username", "password"})
    public void beforeTestSetUp(String urlPage,String username,String password) {
        dashboardPage = new DashboardPage();
        dashboardPage.logIn(username,password);
    }
    @Test
    public void createNewProject() {
        String projectName="project test";
        String projectAccountName="name test";
        ProjectPage projectPage=dashboardPage.clickOnBtnCreateProject()
                                                .setTxtProjectName(projectName)
                                                .setTxtNewAccountName(projectAccountName)
                                                .clickOnBtnSubmitCreateProject();
        assertTrue(projectPage.getProjectName().isDisplayed());
    }
    @Test
    public void deleteProject() {

    }
    @AfterTest
    public void tearDown(){
        dashboardPage.logOut();
    }


}
