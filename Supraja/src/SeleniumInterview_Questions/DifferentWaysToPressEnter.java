package SeleniumInterview_Questions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DifferentWaysToPressEnter

{
	public static void main(String[] args) throws AWTException
	{

		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

		
		// 1.sendkeys and press enter
		driver.findElement(By.name("q")).sendKeys("java"+Keys.ENTER);
		
		
		// 2.sendkeys and press \n
		driver.findElement(By.name("q")).sendKeys("Hello"+"\n");
		
		
		// 3.Using Robot class
		driver.findElement(By.name("q")); 
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);

		//4.Using submit button
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("AI"); 
		searchBox.submit();



	}
}
