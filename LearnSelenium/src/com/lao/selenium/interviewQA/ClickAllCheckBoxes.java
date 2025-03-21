package com.lao.selenium.interviewQA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		driver.get("http://www.leafground.com/pages/checkbox.html");		
		List<WebElement> checkBoxList=	driver.findElements(By.xpath("//*[@id=\"contentblock\"]//input"));	
		for (WebElement webElement : checkBoxList) {
			webElement.click();
		}
	}
}
