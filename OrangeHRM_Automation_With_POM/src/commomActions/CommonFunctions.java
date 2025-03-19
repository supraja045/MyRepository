package commomActions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pageObjects.Login_Page_Objects;

public class CommonFunctions
{
	public static Properties properties = null;
	public static WebDriver driver= null;

	
	
	public Properties loadPropertyFile() throws IOException
	{
		FileInputStream fileIpstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileIpstream);
		return properties;
	}
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		loadPropertyFile();
		String url= properties.getProperty("url");
		String browser=properties.getProperty("browser");
		String driverLocation = properties.getProperty("driverLocation");

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver= new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDown()
	{
		//driver.quit();
	}
	
	@BeforeTest
	public void Login() throws InterruptedException
	{
		
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.username.sendKeys(properties.getProperty("usernameValue"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("passwordValue"));
		Login_Page_Objects.submitButton.click();
		Thread.sleep(1000);
		
	}
}
