package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {

    By title = By.id("title");
    By underTitle = By.cssSelector(".col-sm a");
    By fourthline = By.cssSelector(".row:nth-child(4)");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }

    public void checkTitle(){

        helper.checkElementVisible(title);
    }
    public void clickTitle(String key1){

        helper.scrollToElement(driver.findElement(fourthline));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        helper.clickElementWithText(underTitle,key1);
    }



}
