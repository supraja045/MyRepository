package com.lao.selenium.interviewQA;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);		
		
		WebDriver driver1 = new ChromeDriver();		
		driver1.get("https://www.google.com/");
		driver1.manage().window().maximize();
		
		
		Dimension dim = new Dimension(1386, 826);
		driver1.manage().window().setSize(dim);

	}
}


