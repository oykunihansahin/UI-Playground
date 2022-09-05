package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SampleAppPage {
    By pageHeader= By.cssSelector(".container h3");
    By defaultWarningMessage = By.cssSelector(".text-info");
    By emptyWarningMessage = By.cssSelector(".text-danger");
    By button = By.cssSelector(".btn.btn-primary");
    By usernameInputField = By.name("UserName");
    By passwordInputField = By.name("Password");
    By correctWarningMessage = By.id("loginstatus");
    By text = By.cssSelector(".container p");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions action;
    public SampleAppPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }
    public void checkSamplePage(String key2){

        helper.checkElementWithText(pageHeader,key2);

    }
    public void controlDefaultMessage(String key3){

        helper.checkElementWithText(defaultWarningMessage,key3);

    }
    public void clickButton(){

        helper.click(button);

    }
    public void controlEmptyMesagge(String key4){

        helper.checkElementWithText(emptyWarningMessage,key4);

    }
    public void typeUsername(String key5){

        helper.sendKey(usernameInputField,key5);

    }
    public void typePassword(String key6){

        helper.sendKey(passwordInputField,key6);

    }
    public void welcomeMessage(String key7,String key8){

        helper.checkElementWithText(correctWarningMessage,key7);
        helper.checkElementWithText(correctWarningMessage,key8);

    }
    public void checkText(){

        helper.checkElementWithText(text,"Fill in and submit the form. For successfull login use any non-empty user name and `pwd` as password.");

    }
    public void checkInputFields(){

        helper.checkElementVisible(usernameInputField);
        helper.checkElementVisible(passwordInputField);
    }

}

