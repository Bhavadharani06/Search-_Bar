package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\featureFile\\AddCart.feature"},
glue = "stepDefinition", 
dryRun = false)
public class RunnerIO extends AbstractTestNGCucumberTests {

}
