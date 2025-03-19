package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenGoogleWithChrome {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q"));
		
		driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		
		driver.findElement(By.className("g"));
		
		driver.findElement(By.xpath("//h3[text()=\"Agni - Wikipedia\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		
		if(title.contains("Agni"))
		{
			System.out.println("Pass");
		}
		driver.quit();
	}
	

}
