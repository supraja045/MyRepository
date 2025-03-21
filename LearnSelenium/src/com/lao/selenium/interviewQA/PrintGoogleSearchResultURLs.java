package com.lao.selenium.interviewQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGoogleSearchResultURLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("12 angry men"+Keys.ENTER);
		List<WebElement> linkList= driver.findElements(By.xpath("//*[@id='search']//a/h3/following::cite"));

		for (WebElement webElement : linkList) 
		{
			System.out.println(webElement.getText());
		}
		driver.quit();
	}

}
