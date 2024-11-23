package StepDeffination;

import PageAction.homePageAction;
import Util.testBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class homePageStepDef extends testBase {
	homePageAction homepageaction = new homePageAction();

	@Given("Open Application {string}")
	public void open_application(String URL) {
		launch(URL);
	}

	@Then("Click on Login button")
	public void click_on_login_button() throws Throwable {
		homepageaction.ClickonLoginButton();
	}

	@Then("Enter username and Pass")
	public void enter_username_and_pass() {

	}
}
