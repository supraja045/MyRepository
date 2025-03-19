package com.lao.selenium.advanced;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadExcel = driver.findElement(By.linkText("Download Excel"));
		Thread.sleep(5000);
		downloadExcel.click();
		Thread.sleep(5000);
		
		File fileLocation = new File("C:\\Users\\ADMIN\\Downloads");
		
		File[] fileList = fileLocation.listFiles();
		
		for (File file : fileList) 
		{
			if (file.getName().equals("testleaf.xlsx"))
					{
				System.out.println("File is present inside downloads folder");
				break;
				
			}
		}
		driver.quit();
	}

}
