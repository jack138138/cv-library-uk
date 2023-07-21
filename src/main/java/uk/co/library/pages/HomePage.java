package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitlexp;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationxp;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;


    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitlexp, jobTitle);
        CustomListeners.test.log(Status.PASS, "enter Job Title" + jobTitle);
        Reporter.log("enter job Title" + jobTitlexp.toString());

    }

    public void enterLocation(String location) {
        sendTextToElement(locationxp, location);
        CustomListeners.test.log(Status.PASS, "enter Location" + location);
        Reporter.log("enter Location" + locationxp.toString());
    }

    public void selectDistance(String distance) throws InterruptedException {
        Thread.sleep(10000);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "select distance" + distance  );
        Reporter.log("select distance"+ distanceDropDown.toString());
    }

    public void clickOnMoreSearchOptionLink() throws InterruptedException{
        Thread.sleep(10000);
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "click on search option"  );
        Reporter.log("click on search option"+ moreSearchOptionsLink.toString());

    }

    public void enterMinSalary(String minSalary) throws InterruptedException {
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "enter min. salary" + minSalary  );
        Reporter.log("enter min. salary"+salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "enter Max Salary" + maxSalary  );
        Reporter.log("enter max. salary"+ jobTitlexp.toString());

    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        CustomListeners.test.log(Status.PASS, "enter salary Type" + sType );
        Reporter.log("enter salary Type"+ jobTitlexp.toString());
    }

    public void selectJobType(String jobType) throws InterruptedException {
        Thread.sleep(10000);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "select job type" + jobType  );
        Reporter.log("select job type"+ jobTypeDropDown.toString());
    }

    public void clickOnFindJobsButton() throws InterruptedException{
        Thread.sleep(10000);
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "click on find job button" );
        Reporter.log("click on find job button"+ findJobsBtn.toString());
    }
    public void setAcceptCookies() throws InterruptedException {
        Thread.sleep(10000);

        // driver.switchTo().frame(iframe);
        switchToIframe(iframe);
        System.out.println("we are switching to iFrame");
        clickOnElement(acceptCookies);//click on Acceptall
        System.out.println("We are done with iFrame");

        driver.switchTo().defaultContent();//switch to default window
    }


}
