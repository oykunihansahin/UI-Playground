package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("Controlling on the Home Page")
    public void controllingOnTheHomePage() {

        homePage.checkTitle();

    }

    @When("click {string} title")
    public void clickTitle(String arg0) {

        homePage.clickTitle(arg0);

    }
}
