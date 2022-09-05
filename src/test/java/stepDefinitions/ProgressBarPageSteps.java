package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProgressBarPage;
import pages.SampleAppPage;
import util.DriverFactory;

public class ProgressBarPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ProgressBarPage progressBarPage = new ProgressBarPage(driver);




    @When("click start button")
    public void clickStartButton() {

        progressBarPage.clickStartButton();

    }


    @When("click stop button when progress bar reaches the value")
    public void clickStopButtonWhenProgressBarReachesTheValue() {

        progressBarPage.observeValue();

    }


    @Then("should see the result")
    public void shouldSeeTheResult() {

        progressBarPage.seeTheResult();

    }


}
