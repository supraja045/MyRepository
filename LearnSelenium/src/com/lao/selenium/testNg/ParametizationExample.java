package com.lao.selenium.testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParametizationExample {
	
	@Test
	@Parameters("Name")
	public void printName(String name)
	{
		System.out.println("Name is "+name);
	}
	@Parameters("myParam")
	public void printName1(String name1)
	{
		System.out.println("Name is "+name1);
	}
}
