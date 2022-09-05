package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.SampleAppPage;
import util.DriverFactory;

public class SampleAppPageSteps {


    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    SampleAppPage sampleAppPage = new SampleAppPage(driver);


    @Then("should see {string} Page")
    public void shouldSeePage(String arg1) {

        sampleAppPage.checkSamplePage(arg1);
    }


    @Given("Controlling on the {string} Page")
    public void controllingOnThePage(String arg0) {

        sampleAppPage.checkSamplePage(arg0);

    }
    @When("control the text under the Sample App title")
    public void controlTheTextUnderTheSampleAppTitle() {

        sampleAppPage.checkText();

    }

    @When("control username and password input fields visible")
    public void controlUsernameAndPasswordInputFieldsVisible() {

        sampleAppPage.checkInputFields();

    }
    @When("control {string} message")
    public void controlMessage(String arg2) {

        sampleAppPage.controlDefaultMessage(arg2);
    }

    @When("click login button")
    public void clickLoginButton() {

        sampleAppPage.clickButton();
        
    }

    @Then("should see {string} message")
    public void shouldSeeMessage(String arg3) {

        sampleAppPage.controlEmptyMesagge(arg3);
    }


    @When("typing {string} username")
    public void typingUsername(String arg4) {

        sampleAppPage.typeUsername(arg4);
    }

    @When("typing {string} password")
    public void typingPassword(String arg5) {

        sampleAppPage.typePassword(arg5);
    }

    @Then("should see {string} {string} message")
    public void shouldSeeMessage(String arg6, String arg7) {

        sampleAppPage.welcomeMessage(arg6,arg7);
    }


}
