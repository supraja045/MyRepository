package org.exr.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Go to Leafground.com website
		// Work on the text box provided in the web site

		WebDriver driver = new ChromeDriver();

		// Open TestLeaf website link page
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01tt0zvm2pzbqqqped9w6h4x5r698394.node0");

		// Type your name
		WebElement emailBox = driver.findElement(By.id("j_idt88:name"));
		emailBox.sendKeys("supraja045@gmail.com");

		// Append a text into the text field
		WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
		appendText.sendKeys(" Bengaluru");

		// Clear the typed text
		WebElement clearText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearText.clear();


		//Retrieve the typed text WebElement retrieveText 
		WebElement retrieveText= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']")); 
		String text=retrieveText.getAttribute("value");
		System.out.println(text);

		//Type email and Tab. Confirm control moved to next element.
		// id="j_idt88:j_idt99"
		WebElement pressTab= driver.findElement(By.xpath("//*[@id='j_idt88:j_idt99']"));
		pressTab.sendKeys("supraja045@gmail.com");
		pressTab.sendKeys(Keys.TAB);
		
		//Just Press Enter and confirm error message
		WebElement pressEnter= driver.findElement(By.xpath("//*[@id='j_idt106:thisform:age']"));
		pressEnter.sendKeys(Keys.ENTER);
		
		WebElement errorMsgElement= driver.findElement(By.xpath("//*[@id='j_idt106:thisform:j_idt110_error-detail']"));
		String errorMessage = errorMsgElement.getText();
		System.out.println(errorMessage);
		
		
		Thread.sleep(10000);
		driver.close();
		
		
	}
}
