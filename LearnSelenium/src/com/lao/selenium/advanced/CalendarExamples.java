package com.lao.selenium.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		
		
		  WebElement calendar = driver.findElement(By.id("datepicker"));
		  
		  calendar.click();
		  //calendar.sendKeys("10/05/2021" + Keys.ENTER);
		 
		
		
		// 
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@title='Next']"));
		nextButton.click();
		
		// 
		
		WebElement dateButton = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateButton.click();

	}

}
