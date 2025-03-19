package SeleniumInterview_Questions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		driver.quit();
	}

}
