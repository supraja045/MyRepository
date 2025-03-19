package com.lao.selenium.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAdvanced_Examples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement whereToGo= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));

		String href= whereToGo.getAttribute("href");

		System.out.println("The page is navigating to "+href);

		WebElement homePage= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homePage.click();

		driver.navigate().back();

		WebElement homePage1= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homePage1.click();
		
		driver.navigate().back();
		System.out.println("Th no of links are " + driver.findElements(By.tagName("a")).size());

		/* org.openqa.selenium.StaleElementReferenceException:
		 *  means
		 *  after refreshing or going to other page and coming back,
		 *  if we try to click the same element , it will throw this.
		 *  since the page has been reloaded, we find the element again
		 *  and then we need to click. 
		 */

		driver.quit();
	}

}
