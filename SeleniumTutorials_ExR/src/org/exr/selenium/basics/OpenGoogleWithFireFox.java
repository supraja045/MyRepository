package org.exr.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aim
		//1.Open Chrome Browser
		//2.See Google search page
		
		//Setting properties of system
		System.setProperty("webdriver.gecko.driver","C:\\Users\\supra\\OneDrive\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opening Google with Firefox browser
		driver.get("https://www.google.com");
		
		//Maximize window
		driver.manage().window().maximize();
		
		driver.close();
	}

}
