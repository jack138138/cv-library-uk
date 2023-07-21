package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;


@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest  {


    HomePage homepage;
    ResultPage resultpage;

    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        resultpage = new ResultPage();
        }

    @Test(groups = {"regression"}, dataProvider = "criteria", dataProviderClass = TestData.class)
public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        homepage.setAcceptCookies();
        homepage.enterJobTitle(jobTitle);
        homepage.enterLocation(location);
        homepage.selectDistance(distance);
        homepage.clickOnMoreSearchOptionLink();
        homepage.enterMinSalary(salaryMin);
        homepage.enterMaxSalary(salaryMax);
        homepage.selectSalaryType(salaryType);
        homepage.selectJobType(jobType);
        homepage.clickOnFindJobsButton();

        resultpage.verifyTheResults(result);

    }

}
