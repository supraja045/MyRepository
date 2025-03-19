
package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\eclipse\\java-2023-09\\eclipse\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\eclipse\\java-2023-09\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.leafground.com/alert.xhtml");
	}
}