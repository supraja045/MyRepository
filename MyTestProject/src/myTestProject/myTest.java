package myTestProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class myTest {



	public static Properties properties = null;
	public static WebDriver driver= null;

	
	
	public Properties loadPropertyFile() throws IOException
	{
		FileInputStream fileIpstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileIpstream);
		return properties;
	}
	
}