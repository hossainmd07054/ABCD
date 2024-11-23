package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Util.testBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features_zg" }, plugin = { "json:target/cucumber.json" }, glue = {
		"StepDeffination" }, tags = "@Test")
public class testRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchAppURL() {
		testBase Open = new testBase();
		Open.initialize();
	}

	@AfterTest
	public void CloseAppURL() {
		testBase.driver.quit();

	}
}