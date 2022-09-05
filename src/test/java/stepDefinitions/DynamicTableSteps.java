package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DynamicTablePage;
import util.DriverFactory;

public class DynamicTableSteps {
    WebDriver driver = DriverFactory.getDriver();
    DynamicTablePage dynamicTablePage = new DynamicTablePage(driver);



    @When("get {string} {string} value")
    public void getValue(String arg0, String arg1) {

        dynamicTablePage.getTheValues(arg0,arg1);

    }



    @Then("compare with value on the yellow label {string} {string}")
    public void compareWithValueOnTheYellowLabel(String a, String b) {
        dynamicTablePage.comparingValues(a,b);
    }
}
