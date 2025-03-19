package SeleniumInterview_Questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ClickAllCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		driver.get("https://www.leafground.com/checkbox.xhtml");	
		driver.manage().window().maximize();
		List<WebElement> checkBoxList =	driver.findElements(By.xpath("//*[@id=\"j_idt87:basic\"]//div[@class=\"ui-chkbox ui-widget\"]"));	
		for (WebElement webElement : checkBoxList) {
			webElement.click();
		}
		driver.quit();
	}
}
