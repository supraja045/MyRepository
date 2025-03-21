package com.lao.selenium.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement firstImage = driver.findElement(By.xpath("//*[@id='contentblock']//div[1]/img"));

		WebElement secondImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//
		if(secondImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(secondImage + " is broken");
		}


		firstImage.click();


		driver.quit();

	}

}
