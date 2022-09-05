package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class DynamicTablePage {
    By colomn = By.cssSelector("[role=\"columnheader\"]");
    By row = By.cssSelector("[role=\"rowgroup\"] div span[role=\"cell\"]:first-child");
    By label = By.cssSelector(".bg-warning");


    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public DynamicTablePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }


    public String getTheValues(String key0, String key1) {

        int degisken1 = helper.checkElementWithTextandGetRow(row, key0);
        int degisken2 = helper.checkElementWithTextandGetColumn(colomn, key1);
        By asd = By.cssSelector("div[role=\"rowgroup\"] div[role=\"row\"]:nth-child(" + degisken1 + ") span[role=\"cell\"]:nth-child(" + degisken2 + ")");
        String value = helper.getText(asd);
        System.out.println("Chrome CPU:"+" "+value);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public void comparingValues(String key0, String key1) {

        String labelText = helper.getText(label);
        String value = getTheValues(key0, key1);
        if(labelText.equals("Chrome CPU:"+" "+value)){
            System.out.println("The values are same");
        }

    }



}