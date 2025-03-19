package com.lao.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/Edit.html");

		//driver.findElement(By.linkText("Go to Home Page")).click();

		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("supraja045@gmail.com");

		WebElement appendBox = driver.findElement(By.xpath("//*[@value='Append ']"));
		appendBox.sendKeys("supraja045@gmail.com");

		WebElement getTextBox= driver.findElement(By.xpath("//*[@value='TestLeaf']"));
		String value= getTextBox.getAttribute("value");
		System.out.println(value);

		WebElement clearBox = driver.findElement(By.xpath("//*[@value='Clear me!!']"));
		clearBox.clear();

		WebElement disabledBox= driver.findElement(By.xpath("//*[@disabled='true']"));
		boolean enabled = disabledBox.isEnabled();

		System.out.println(enabled);

		// //-relative xpath /-absolute xpath
		driver.close();

	}

}
