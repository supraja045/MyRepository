package com.lao.selenium.interviewQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintGoogleSearchTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Dimension dim = new Dimension(1386, 826);
		driver.manage().window().setSize(dim);
		
		
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> list= driver.findElements(By.xpath("(//*[@role=\"listbox\"]/li)"));
		
		for (WebElement webElement : list) {
			String text= webElement.getText();
			System.out.println(text);
			
		}
		
	}

}
