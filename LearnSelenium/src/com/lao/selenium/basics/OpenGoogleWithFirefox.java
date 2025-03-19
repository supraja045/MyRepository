package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogleWithFirefox {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q"));
		
		driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		
		driver.findElement(By.className("g"));
		
		driver.findElement(By.xpath("//h3[text()=\"Agni - Wikipedia\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
	}
	

}
