package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	static public WebElement account(WebDriver driver)
	{
		return driver.findElement(By.xpath(	"//*[@id='ACCOUNT']"));
		
	}
	static public WebElement customerLogin(WebDriver driver)
	{
		return driver.findElement(By.xpath(	"(//*[@class=\"dropdown-menu show\"])/li[1]"));
		
	}
	
	static public WebElement username(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@name=\'email\']"));
		
	}
	static public WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@name=\'password\']"));
	}
	static public WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]"));
	}
}
