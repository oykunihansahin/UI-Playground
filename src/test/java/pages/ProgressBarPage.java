package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProgressBarPage {

    By title = By.cssSelector(".container h3");
    By startButton = By.id("startButton");
    By stopButton = By.id("stopButton");
    By progressBar = By.id("progressBar");
    By result = By.id("result");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public ProgressBarPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }
    public void checkSamplePage(String key2){

        helper.checkElementWithText(title,key2);

    }
    public void clickStartButton(){

        helper.click(startButton);

    }
    public void observeValue(){
        int i=0;
        while(i<100) {
            String k = driver.findElement(progressBar).getAttribute("aria-valuenow");
              int a = Integer.parseInt(k);
                 if (a > 74) {
                     helper.click(stopButton);
                     break;
                    }

                }

    }

    public void seeTheResult(){

       String res= helper.getText(result);
       System.out.println(res);


    }
}
