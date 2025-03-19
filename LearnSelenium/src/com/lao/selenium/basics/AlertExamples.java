package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\eclipse\\java-2023-09\\eclipse\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\eclipse\\java-2023-09\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		WebElement alertBoxButton= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		alertBoxButton.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		WebElement confirmBoxButton= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		confirmBoxButton.click();	
		Thread.sleep(3000);
		alert.dismiss();
		
		
		WebElement promptBoxButton= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		promptBoxButton.click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("Hello");
		promptAlert.accept();

		
		WebElement breaksBoxButton= driver.findElement(By.xpath("//*[@id='contentblock']//button[text()='Line Breaks?']"));
		breaksBoxButton.click();
		Thread.sleep(3000);
		Alert breaksAlert = driver.switchTo().alert();
		String breaksAlertText=breaksAlert.getText();
		System.out.println(breaksAlertText);
		breaksAlert.accept();

		driver.quit();

	
	}
	
	

}
