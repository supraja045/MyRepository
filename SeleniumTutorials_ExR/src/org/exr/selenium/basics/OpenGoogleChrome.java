
package org.exr.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogleChrome {

	public static void main(String[] args) throws InterruptedException
	{
		//Aim
		//1.Open Chrome Browser
		//2.See Google search page

		//System.setProperty("browser name", "location of chrome driver")
		System.setProperty("webdriver.chrome.driver","C:\\Users\\supra\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open Google
		driver.get("https://www.google.com");

		//Maximize the window
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Hello"+Keys.ENTER);
		 
		Thread.sleep(10000);
		//Closing the browser 
		driver.close();

	}



}



/*
 * //Enter a search term using ID
 * 	 driver.findElement(By.id("APjFqb")).sendKeys("Hello"+Keys.ENTER);
  
 * //Enter a search term using class name
     driver.findElement(By.className("gLFyf")).sendKeys("Hello"+Keys.ENTER);
        
 * //Enter a search term using name
	driver.findElement(By.name("q")).sendKeys("Hello"+Keys.ENTER);
*/


