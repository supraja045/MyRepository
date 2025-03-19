package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class LoginTestCase 
{

	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		LoginPageObjects.account(driver).click();
		LoginPageObjects.customerLogin(driver).click();

		Thread.sleep(5000);
		LoginPageObjects.username(driver).sendKeys("supraja045@gmail.com");
		LoginPageObjects.password(driver).sendKeys("!kanna123");
		LoginPageObjects.submit(driver).click();	
		Thread.sleep(5000);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		LoginTestCase loginTcObject = new LoginTestCase();
		loginTcObject.login();
	}
}
