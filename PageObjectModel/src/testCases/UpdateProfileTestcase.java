package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfileTestcase 
{
	
	public void UpdateProfile() throws InterruptedException
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
		
		UpdateProfileObjects.myProfile(driver).click();
		UpdateProfileObjects.emailId(driver).clear();
		UpdateProfileObjects.emailId(driver).sendKeys("supraja018@gmail.com");
		UpdateProfileObjects.city(driver).sendKeys("Hosur1");
		UpdateProfileObjects.updateProfileSubmit(driver).click();
		Thread.sleep(5000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException 
	{
	
		UpdateProfileTestcase UpdateProfileTestcase = new UpdateProfileTestcase();
		UpdateProfileTestcase.UpdateProfile();
		
	}
}
