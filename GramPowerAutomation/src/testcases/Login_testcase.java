package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.*;
import commonActions.CommonFunctions;
import pageObjects.Login_Page_Objects;

public class Login_testcase extends CommonFunctions
{

	@Test
	public void Login() throws InterruptedException
	{

		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.username.sendKeys(properties.getProperty("usernameValue"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("passwordValue"));
		Login_Page_Objects.submitButton.click();
		Thread.sleep(5000);
		
		
		WebElement alertBoxButton= driver.findElement(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]"));
		//Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alertBoxButton.click();
		/*
		 * WebElement confirmBoxButton=
		 * driver.findElement(By.xpath("//*[@id='onesignal-slidedown-cancel-button']"));
		 * confirmBoxButton.click(); Thread.sleep(3000);
		 */

	}
}

