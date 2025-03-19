package com.lao.selenium.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name = "Agni";
	@Test
	public void checkName()
	{
		Assert.assertEquals(name,"Agni");
	}
	
	
	String college = "SAEC";
	@Test
	public void checkCollege()
	{
		Assert.assertNotSame(college,"Agni");
	}
}
