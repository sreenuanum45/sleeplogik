package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ImagesCollection;
import utilities.LinksUtility;

import java.util.List;

public class ContactusPage {
    RemoteWebDriver driver;
    ImagesCollection imagesCollection;
    LinksUtility linksUtility;
    List<WebElement> images;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement name;
    public ContactusPage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ContactusPagepageimages() throws InterruptedException {
        images =driver.findElements(By.tagName("img"));
        imagesCollection= new ImagesCollection();
        imagesCollection.MyCollection(images);
        linksUtility= new LinksUtility();
        linksUtility.linksInPage(driver.findElements(By.tagName("a")));
    }
    public void filldatawithvaliddata(){
       name.findElement(By.xpath("//div")).sendKeys("sreenu");

    }
}
