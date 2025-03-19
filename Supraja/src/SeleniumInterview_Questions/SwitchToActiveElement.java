package SeleniumInterview_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement {
	static WebElement q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();	
		driver.get("https://www.google.com");
		
		
		//driver.switchTo().activeElement().sendKeys("java"+"\n");
		
		PageFactory.initElements(driver, SwitchToActiveElement.class);
		q.sendKeys("java"+"\n");
		
	}

}
