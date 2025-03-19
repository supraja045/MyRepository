package com.lao.selenium.testNg;

import org.testng.annotations.Test;

public class HandleDependencies {


	@Test(enabled=true)
	public void HighSchool()
	{
		System.out.println("High school");
	}

	@Test(dependsOnMethods = "HighSchool")
	public void HigherSecondary()
	{
		System.out.println("Higher secondary school");
	}


	@Test(dependsOnMethods = "HigherSecondary")
	public void College()
	{
		System.out.println("College");
	}
}
