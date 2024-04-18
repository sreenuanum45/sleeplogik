package Testcases;

import base.BaseClass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BathRoompage;
import pages.BedRoompage;

import pages.Homepage;
import pages.LivingRoomPage;

public class Products extends BaseClass {
    RemoteWebDriver driver;
    Homepage homepage;
    BedRoompage bedRoompage;
    LivingRoomPage livingRoomPage;
    BathRoompage bathRoompage;
    public Products(){
        super();
    }
    @BeforeMethod
    public void setup() throws ElementClickInterceptedException {
        driver= intialzineBrowserandOpenApplication(p.getProperty("browserName"));
    }
    @AfterMethod
    public void  closesite() {
        driver.close();
    }
    @Test(priority = 1)
    public void LoadTheBedRoomPageAndVerifyThatAllElementsLoadcorrectly () throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.moveToProductsClickOnProduct();
    }
    @Test(priority = 2)
    public void VerifyThatTheInformationAboutTheBedRoomProductsIsDisplayedCorrectly() throws InterruptedException {
       bedRoompage = new BedRoompage(driver);
       bedRoompage.bedRoompagepageimages();
    }
    @Test(priority = 3)
    public void LoadTheLivingRoomPageAndVerifyThatAllElementsLoadcorrectly () throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.moveToProductsClickOnProduct1();
    }
    @Test(priority = 4)
    public void VerifyThatTheInformationAboutTheLivingRoomProductsIsDisplayedCorrectly() throws InterruptedException {
       livingRoomPage = new LivingRoomPage(driver);
       livingRoomPage.livingRoompagepageimages();

    }
    @Test(priority = 5)
    public void LoadTheBathRoomPageAndVerifyThatAllElementsLoadcorrectly () throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.moveToProductsClickOnProduct2();
    }
    @Test(priority = 6)
    public void VerifyThatTheInformationAboutTheBathRoomRoomProductsIsDisplayedCorrectly() throws InterruptedException {
bathRoompage = new BathRoompage(driver);
bathRoompage.bathRoompagepageimages();
    }
}
