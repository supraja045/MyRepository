package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://www.leafground.com/pages/radio.html");
			
		WebElement radioButton= driver.findElement(By.xpath("//*[@id='contentblock']//label[2]/input"));
		boolean status = radioButton.isSelected();
		System.out.println(status);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[2]/div/div/label[2]")).click();
	}

}
