package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectsFindByMethod 
{
	@FindBy(xpath="//*[@id='ACCOUNT']")
	static public WebElement account;
	
	@FindBy(xpath="(//*[@class='dropdown-menu show'])/li[1]")
	static public WebElement customerLogin;
	
	@FindBy(xpath="//*[@name='email']")
	static public WebElement username;
	
	@FindBy(how = How.XPATH,using="//*[@name=\'password\']")
	static public WebElement password;
	
	@FindBy(xpath="(//*[@type=\\\"submit\\\"])[1]")
	static public WebElement submit;
}
