package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected)throws InterruptedException{
        Thread.sleep(10000);
      verifyThatElementIsDisplayed(resultText);
        CustomListeners.test.log(Status.PASS, "verify result" + expected );
        Reporter.log("verify result"+ resultText.toString());
    }

}
