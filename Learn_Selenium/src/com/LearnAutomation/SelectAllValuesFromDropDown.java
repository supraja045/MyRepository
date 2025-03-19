package com.LearnAutomation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllValuesFromDropDown {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
		
		Select select = new Select(driver.findElement(by.id("month")));
		List<WebElement> myList = select.getOptions();
		for(WebElement we:myList) {
			System.out.println(we.getText());
			
		}
			
		
		
		
		
	}
}
