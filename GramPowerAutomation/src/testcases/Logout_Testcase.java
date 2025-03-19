package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObjects.Login_Page_Objects;
import pageObjects.Logout_Page_Objects;

public class Logout_Testcase extends CommonFunctions
{
	@Test
	public void Logout() throws InterruptedException
	{
		PageFactory.initElements(driver, Logout_Page_Objects.class);
		Logout_Page_Objects.automationuser.click();
		Thread.sleep(5000);
		Logout_Page_Objects.logOut.click();
		Thread.sleep(5000);
	}
}
