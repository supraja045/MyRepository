package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page_Objects
{
			
	@FindBy(xpath="//*[@id=\"myNavbar\"]//a/label")
	static public WebElement automationuser;
	
	@FindBy(xpath="(//ul[@role=\"menu\"]//a)[4]")
	static public WebElement logOut;
			
}
