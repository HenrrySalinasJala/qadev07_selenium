package comp.fundacionjala.movies;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DashboardTest {
    private DashboardPage dashboardPage;
    @BeforeTest
    @Parameters({"DashboardPageUrl"})
    public void beforeTestSetUp(String urlPage) {
        dashboardPage = new DashboardPage(Driver.getDriver());
        dashboardPage.goTo(urlPage);
    }


}
