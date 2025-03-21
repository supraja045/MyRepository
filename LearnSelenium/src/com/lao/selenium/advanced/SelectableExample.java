package com.lao.selenium.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectableList = driver.findElements(By.xpath("//*[@id='selectable']/li"));

		Actions mouseActions= new Actions(driver);


		/*
		 * mouseActions.clickAndHold(selectableList.get(0));
		 * mouseActions.clickAndHold(selectableList.get(1));
		 * mouseActions.clickAndHold(selectableList.get(2));
		 * mouseActions.clickAndHold(selectableList.get(3));
		 * mouseActions.build().perform();
		 */

		mouseActions.keyDown(Keys.CONTROL).click(selectableList.get(0)).click(selectableList.get(1))
		.click(selectableList.get(2)).build().perform();
		
		driver.quit();


	}

}
