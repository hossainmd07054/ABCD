package StepDeffination;
import PageAction.homePageAction;
import Util.testBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageStepDef extends testBase {
	homePageAction homepageaction = new homePageAction();

	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		launch(URL);
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		homepageaction.ClickonLoginButton();
	    
	}
	@Then("^Enter username and Pass$")
	public void enter_username_and_Pass() throws Throwable {
	}  
}
