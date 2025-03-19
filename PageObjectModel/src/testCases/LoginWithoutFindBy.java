package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;


public class LoginWithoutFindBy 
{
	public static WebElement username;
	public static WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	public static WebElement typeSubmit;
	
	@Test
	public void login() {

	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	PageFactory.initElements(driver, LoginWithoutFindBy.class);
	username.sendKeys("Admin");
	password.sendKeys("admin123");
	typeSubmit.click();
	}
}
