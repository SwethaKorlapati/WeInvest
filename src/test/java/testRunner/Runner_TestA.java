package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features/TestA.feature"},
		glue = {"stepDefinitions"},
		dryRun = false,
		monochrome = true,
		plugin = {"junit:Reports/TestA.html"})




public class Runner_TestA {

	
	
	
	
	
}
