package com.lao.selenium.interviewQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement {
	static WebElement q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//driver.switchTo().activeElement().sendKeys("java"+"\n");
		
		PageFactory.initElements(driver, SwitchToActiveElement.class);
		q.sendKeys("java"+"\n");
		
	}

}
