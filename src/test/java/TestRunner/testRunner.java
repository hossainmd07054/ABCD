package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Util.testBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features_zg" }, plugin = { "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, glue = { "StepDeffination" }, tags = { "@Test" })
public class testRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchAppURL() {
		testBase Open = new testBase();
		Open.initialize();
	}

	@AfterTest
	public void CloseAppURL() {
		testBase Closed = new testBase();
		Closed.driver.quit();

	}
}