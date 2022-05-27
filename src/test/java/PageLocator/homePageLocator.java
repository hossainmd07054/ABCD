package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Util.testBase;

public class homePageLocator extends testBase{
	
public homePageLocator() {PageFactory.initElements(driver, this);}

@FindBy(how=How.LINK_TEXT, using="Sign in")
public WebElement login;




}
