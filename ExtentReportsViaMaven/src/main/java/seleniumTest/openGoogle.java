package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openGoogle {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\eclipse\\java-2023-09\\eclipse\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		driver.quit();
	}
}