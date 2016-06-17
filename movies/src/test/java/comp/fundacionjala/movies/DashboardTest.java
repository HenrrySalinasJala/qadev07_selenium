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
        System.out.print("cashboard test x");
        dashboardPage = new DashboardPage();
        dashboardPage.logIn(username,password);
        dashboardPage.goToPage();
    }
    @Test
    public void createNewProject() {
        System.out.print("cashboard test x");
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
        System.out.print("cashboard test x");
    }
    @AfterTest
    public void tearDown(){
        System.out.print("cashboard test x");
        dashboardPage.logOut();
    }


}
