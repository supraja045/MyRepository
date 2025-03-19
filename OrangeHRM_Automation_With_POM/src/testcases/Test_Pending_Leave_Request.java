/**
 * 
 */
package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commomActions.CommonFunctions;
import pageObjects.Dashboard_Page_Objects;


/**
 * @author ADMIN
 *
 */
public class Test_Pending_Leave_Request extends CommonFunctions 
{

	@Test
	public void verifyPendingLeaveRequests() throws InterruptedException
	{
		Dashboard_Page_Objects.dashboard.click();
		String actualMessage = Dashboard_Page_Objects.LeaveMessage.getText();
		
		Assert.assertEquals(actualMessage, "No Employees are on Leave Today");
		
	}
	
	
}
