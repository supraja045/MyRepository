package com.lao.selenium.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuiteExample {
	//open chrome and go to
	// 1.google.com 2.bing.com 3/yahoo.com
	WebDriver driver;
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();		
	}	
	@Test(priority=0)
	public void openGoogle()
	{
		long startTime = System.currentTimeMillis();
		driver.get("https://www.google.co.in");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(startTime-endTime);
	}	
	@Test(priority=1)
	public void openBing()
	{
		long startTime = System.currentTimeMillis();
		driver.get("https://www.bing.co.in");
		long endTime = System.currentTimeMillis();
		System.out.println(startTime-endTime);
	}
	@Test(priority=2)
	public void openYahoo()
	{
		long startTime = System.currentTimeMillis();
		driver.get("https://www.yahoo.co.in");		
		long endTime = System.currentTimeMillis();
		System.out.println(startTime-endTime);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
}
