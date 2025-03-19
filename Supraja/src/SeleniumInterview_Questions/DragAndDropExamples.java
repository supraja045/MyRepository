package SeleniumInterview_Questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.id("form:drop"));
		WebElement to = driver.findElement(By.id("form:conpnl"));
		
		Actions mouseActions = new Actions(driver);
		
		//mouseActions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		
		mouseActions.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
