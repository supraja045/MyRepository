package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExamples
{
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1.Find the position of the button
		
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xypoint = getPositionButton.getLocation();
		int xValue = xypoint.getX();
		int yValue= xypoint.getY();
		System.out.println("x "+xValue +"y "+ yValue);
		
		//2. Find the background color using getAttribute method
		WebElement buttonColor = driver.findElement(By.id("color"));
		String color= buttonColor.getAttribute("style");
		System.out.println(color);
		
		//2. Find the background color using getCSSValue method
		WebElement buttonColorUsingCSS = driver.findElement(By.id("color"));
		String colorByCss= buttonColorUsingCSS.getCssValue("background-color");
		System.out.println(colorByCss);
		
		
		//3.Find the size of the button
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height= buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		
		System.out.println("h "+ height +"w "+ width);
		
		//4.Click the go to home button
		WebElement goToHome = driver.findElement(By.id("home"));
		goToHome.click();
		
		
		driver.quit();
		
		
	}

}
