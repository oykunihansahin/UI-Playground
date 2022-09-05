package testRunners;

import util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"},
        tags = "@AllCode",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                "json:Reports/CucumberReport/Report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();

}
