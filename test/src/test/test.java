package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		//To maximize the window
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Need to load the url
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		driver.findElement(By.xpath("//*[@class='btn btn-primary'")).click();
		driver.findElement(By.xpath("//*[//*[@id='journeyClass']")).click();
		Select select = new Select(driver.findElement(By.xpath("//*[//*[@id='journeyClass']")));
		List<WebElement> myList = select.getOptions();
		for(WebElement we:myList) {
			System.out.println(we.getText());
		}
		driver.close();
		driver.quit();
		
	}
}
