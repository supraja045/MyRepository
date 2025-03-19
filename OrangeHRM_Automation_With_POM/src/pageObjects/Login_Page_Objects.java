package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects
{
	@FindBy(xpath="//*[@name='username']")
	static public WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	static public WebElement password;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	static public WebElement submitButton;

}
