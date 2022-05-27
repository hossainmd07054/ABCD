package PageAction;
import PageLocator.homePageLocator;
import Util.testBase;

public class homePageAction extends testBase {
	
	homePageLocator homepagelocator = new homePageLocator();
	public void ClickonLoginButton() throws Exception {
		Thread.sleep(5000);
		homepagelocator.login.click();
	}
	
	

}
