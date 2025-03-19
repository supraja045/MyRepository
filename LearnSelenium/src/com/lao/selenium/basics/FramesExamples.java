package com.lao.selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples 
{


	public static void main(String[] args) 
	{


//		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		driver.get("http://www.leafground.com/pages/frame.html");
//
//		driver.manage().window().maximize();
//
//
//		driver.switchTo().frame(0);
//
//		WebElement buttonClick1= driver.findElement(By.id("Click"));
//
//		buttonClick1.click();
//
//
//		driver.switchTo().defaultContent();
//
//		driver.switchTo().frame(1);
//		
//		driver.switchTo().frame("frame2");
//		WebElement buttonClick2= driver.findElement(By.id("Click1"));
//
//		buttonClick2.click();
//		
//		driver.switchTo().defaultContent();
//		
//		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
//		System.out.println(totalFrames.size());
//		
//		driver.quit();
		double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        for (int x=0; x < values.length; x++) 
        {
            if (Math.round(values[x] + .5) == Math.ceil(values[x])) 
            {
                ++cnt;
                System.out.println( Math.round(values[x] + .5));
                System.out.println( Math.ceil(values[x]));
                
                //System.out.println( values[x]);
            }
        }
        System.out.println("same results " + cnt + " time(s)");
	}
}


