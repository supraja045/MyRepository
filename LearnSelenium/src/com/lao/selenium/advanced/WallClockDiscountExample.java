package com.lao.selenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WallClockDiscountExample {

	public static void main(String[] args) {
		//Write JavaScript code to apply 15% discount on wall clock product 
		//and show both actual and discounted price on web page on click of a web button.
//		
//	WebDriver driver= new ChromeDriver();
//	driver.findElement(By.xpath(("//*[@id='wallclockProduct']")));
//	driver.findElement(By.xpath(("//*[@id='applyCode15%']"))).click();
//	String beforeDiscount =driver.findElement(By.xpath(("//*[@id='beforeDiscount']"))).getText();
//	String afterDiscount =driver.findElement(By.xpath(("//*[@id='afterDiscount']"))).getText();
//	System.out.println("the price of wall clock product before Discount " +beforeDiscount);
//	System.out.println("the price of wall clock product after Discount "+afterDiscount);
	
	int oldPrice =90;
	//int discount=15;
	int newPrice=0;	
	int Percentage=0;
	
	Percentage= (int) ((0.15)*oldPrice);
	//System.out.println(Percentage);
	newPrice= oldPrice -Percentage;
	System.out.println(" Price of wallClock before discount "+  oldPrice );
	System.out.println(" Price of wallClock after discount "+  newPrice );
	}

}
