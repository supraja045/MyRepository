package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Dashboard_Page_Objects 
{

	@FindBy(xpath="(//a/span)[8]")
	static public WebElement dashboard;
	
	@FindBy(xpath ="//*[@class=\"orangehrm-dashboard-widget-body-nocontent\"]//p")
	static public WebElement LeaveMessage;
	
}
