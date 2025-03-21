package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		boolean status = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]")).isSelected();
		System.out.println(status);
		
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]")).click();
	}
}
