package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.LoginPageObjectsFindByMethod;

public class LoginTestcaseUsingPageFactory
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net");
		PageFactory.initElements(driver, LoginPageObjectsFindByMethod.class);
		
		LoginPageObjectsFindByMethod.account.click();
		LoginPageObjectsFindByMethod.customerLogin.click();
		LoginPageObjectsFindByMethod.username.sendKeys("supraja045@gmail.com");
		LoginPageObjectsFindByMethod.password.sendKeys("!kanna123");
		LoginPageObjectsFindByMethod.submit.click();
		driver.quit();

	}
}
	
