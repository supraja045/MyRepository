package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateProfileObjects 
{

	static public WebElement submit(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]"));
	}
	static public WebElement myProfile(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[3]/ul/li[4]/a"));
		
	}
	
	static public WebElement emailId(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@name=\"email\"]"));
		
	}
	
	static public WebElement city(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@name=\"city\"]"));
		
	}
	static public WebElement updateProfileSubmit(WebDriver driver)
	{
	
		//new Actions(driver).moveToElement(element).click().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Update Profile\"]")));
		return element;
	}
	
}
