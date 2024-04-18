package Testcases;

import base.BaseClass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Dunlopillopage;
import pages.Homepage;
import pages.LauraAshleypage;
import pages.NestHomepage;


public class Brands extends BaseClass {
RemoteWebDriver driver;
Homepage homepage;
Dunlopillopage dunlopillopage;
NestHomepage nesthomepage;
LauraAshleypage lauraashleypage;


    public Brands(){
        super();
    }
    @BeforeMethod
    public void setup() throws ElementClickInterceptedException {
       driver= intialzineBrowserandOpenApplication(p.getProperty("browserName"));
    }
 @Test(priority = 1)
    public void LoadTheDunlopillopageAndVerifyThatAllElementsLoadCorrectly() throws InterruptedException {
    homepage = new Homepage(driver);
    homepage.moveAndClickElement();
    }
    @Test(priority = 2)
    public void VerifyThatTheInformationAboutTheDunlopilloLatexPillowsIsDisplayedCorrectly() throws InterruptedException {
dunlopillopage = new Dunlopillopage(driver);
dunlopillopage.dunlopillopageimages();
    }
    @Test(priority = 3)
    public void LoadTheNestHomePageAndVerifyThatAllElementsLoadCorrectly() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.moveAndClickElement1();
        nesthomepage= new NestHomepage(driver);
        nesthomepage.nestHomepagepageimages();
    }
    @Test(priority = 4)
    public void LoadTheLauraAshleyAndVerifyThatAllElementsLoadCorrectly() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.moveAndClickElement2();
        lauraashleypage= new LauraAshleypage(driver);
        lauraashleypage.LauraAshleypagpageimages();
    }
    @AfterMethod
    public void  closesite() {
        driver.close();
    }
}

