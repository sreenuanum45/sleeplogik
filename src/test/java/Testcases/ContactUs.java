package Testcases;

import base.BaseClass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContactusPage;
import pages.Homepage;

public class ContactUs extends BaseClass {
    RemoteWebDriver driver;
    Homepage homepage;
 ;ContactusPage  contactusPage;
    public ContactUs(){
        super();
    }
    @BeforeMethod
    public void setup() throws ElementClickInterceptedException {
        driver= intialzineBrowserandOpenApplication(p.getProperty("browserName"));
    }
    @Test(priority = 1)
    public void LoadTheContactUsPageAndVerifyThatAllElementsLoadCorrectly() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.clickonContactUs();
    }
    @Test(priority = 2)
    public void FillOutTheContactFormWithValidDataAndSubmitVerifyThatASuccessMessageIsDisplayed() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.clickonContactUs();
contactusPage = new ContactusPage(driver);
contactusPage.filldatawithvaliddata();
    }

    @AfterMethod
    public void  closesite() {
        driver.close();
    }
}
