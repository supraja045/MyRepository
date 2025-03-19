package SeleniumInterview_Questions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(options);
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\\\supra\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();		
		
		
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		
		WebDriver driver2 = new EdgeDriver();	
		Dimension dim = new Dimension(1386, 826);
		driver2.manage().window().setSize(dim);
		
		
		driver.quit();
		driver1.quit();
		driver2.quit();

	}
}


