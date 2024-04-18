package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import utilities.ActionsUtility;
import utilities.ImagesCollection;
import utilities.LinksUtility;

import java.util.List;

public class Homepage {
    RemoteWebDriver driver;
    Actions actions;
  FluentWait<RemoteWebDriver> wait;

    @FindBy(xpath = "//li[@id='menu-item-2013']/a[1]")
    private WebElement brandelement;
    @FindBy(xpath = "((//ul//li)//a)[5]")
    private WebElement brandname;
    @FindBy(xpath = "(//ul//li//a)[6]")
    private  WebElement ProductsElement;
    @FindBy(xpath = "((//ul//li)//a)[4]")
    private WebElement brandname1;
    @FindBy(xpath = "((//ul//li)//a)[3]")
    private WebElement brandname2;
    @FindBy(xpath = "(//ul//li//a)[7]")
    private WebElement productname;
    @FindBy(xpath = "(//ul//li//a)[8]")
    private WebElement productname1;
    @FindBy(xpath = "(//ul//li//a)[9]")
    private WebElement productname2;
    @FindBy(xpath = "(//ul//li//a)[10]")
    private WebElement contactusbutton;
    public Homepage(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void moveAndClickElement() throws InterruptedException {
      actions=new Actions(driver);
      actions.moveToElement(brandelement).click(brandname).build().perform();

    }
    public void moveAndClickElement1() throws InterruptedException {
        actions=new Actions(driver);
        actions.moveToElement(brandelement).click(brandname1).build().perform();

    }
    public void moveAndClickElement2() throws InterruptedException {
        actions=new Actions(driver);
        actions.moveToElement(brandelement).click(brandname2).build().perform();

    }
    public void moveToProductsClickOnProduct() throws InterruptedException {
        actions=new Actions(driver);
        actions.moveToElement(ProductsElement).click(productname).build().perform();
    }
    public void moveToProductsClickOnProduct1() throws InterruptedException {
        actions=new Actions(driver);
        actions.moveToElement(ProductsElement).click(productname1).build().perform();
    }
    public void moveToProductsClickOnProduct2() throws InterruptedException {
        actions=new Actions(driver);
        actions.moveToElement(ProductsElement).click(productname2).build().perform();
    }
    public void clickonContactUs() throws InterruptedException {
      Thread.sleep(2000);
      contactusbutton.click();
    }


}

