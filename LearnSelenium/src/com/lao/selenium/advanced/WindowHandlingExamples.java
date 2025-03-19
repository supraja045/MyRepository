package com.lao.selenium.advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlingExamples 
{


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://www.leafground.com/pages/Window.html");


		WebElement goToHomePage = driver.findElement(By.id("home"));
		goToHomePage.click();


		String oldWindow=  driver.getWindowHandle();


		Set<String>getAllWindows= driver.getWindowHandles();
		Thread.sleep(5000);
		for (String windows : getAllWindows) {

			driver.switchTo().window(windows);
		}

		WebElement clickEditButton = driver.findElement(By.xpath("//*[@alt='Edit / Text Fields']"));
		clickEditButton.click();

		driver.close();
		driver.switchTo().window(oldWindow);
		
		Thread.sleep(5000);

		WebElement openMultipleWindows = driver.findElement(By.xpath("//*[@id=\"contentblock\"]//button[text()= 'Open Multiple Windows']"));
		openMultipleWindows.click();
		
		Thread.sleep(5000);

		int noOfWindowsOpened = driver.getWindowHandles().size();

		System.out.println("Number of windows opened " + noOfWindowsOpened);

		Set<String>getAll= driver.getWindowHandles();

		for (String windows : getAll) {

			if(!windows.equals(oldWindow))
			{
				driver.switchTo().window(windows).close();
			}
		}

		driver.quit();
	}
}
