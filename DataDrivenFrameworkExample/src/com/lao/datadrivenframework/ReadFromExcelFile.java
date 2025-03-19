package com.lao.datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadFromExcelFile 
{
	String[][] data = null;
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws IOException
	{
		data = readFromExcelFIle();
		return data;
	}
	
	
	public String[][] readFromExcelFIle() throws BiffException, IOException
	{
		String filePath = "D:\\Softwares\\SampleWorkBook.xls";
		FileInputStream fs = new FileInputStream(filePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh= wb.getSheet(0);
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		
		String [][] testData = new String[totalNoOfRows -1][totalNoOfCols];
		for (int i = 1; i < totalNoOfRows; i++)
		{
			for (int j = 0; j < totalNoOfCols; j++) 
			{
				testData[i-1][j]=sh.getCell(j, i).getContents();
				System.out.println(sh.getCell(j, i).getContents());
			}
		}
		
		return testData;
	}
	
	@Test(dataProvider="loginData")
	public void loginMethod(String uname,String pword)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.xpath("//*[@type='submit']"));
		driver.quit();
		
	}

}
