package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"classpath:features/TestB.feature"},
		glue={"stepDefinitions"},
		dryRun=false,
		plugin = {"junit:Reports/TestB.html"})


public class Runner_TestB {

}
