package org.exr.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Aim
		//Go to Leafground.com website
		//Click on the links provided in the web site
	
		
		//System.setProperty("browser name", "location of chrome driver")
		System.setProperty("webdriver.chrome.driver","C:\\Users\\supra\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open TestLeaf website link page
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01an8qnso3y8ueecx9mk8qkhdd683522.node0");
        driver.findElement(By.linkText("Go to Dashboard")).click();
        
        driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node01an8qnso3y8ueecx9mk8qkhdd683522.node0");
        driver.findElement(By.partialLinkText("Dashboard")).click();
        
        Thread.sleep(5000);
        driver.close();
	}

}
