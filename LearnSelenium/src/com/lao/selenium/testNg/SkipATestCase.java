package com.lao.selenium.testNg;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	
	@Test(priority=0)
	public void startACar()
	{
		System.out.println("Starting a car");
	}
	
	
	@Test(priority=1)
	public void putFirstGear()
	{
		System.out.println("Driving a car with First Gear");
	}
	
	@Test(priority=2)
	public void putSecondGear()
	{
		System.out.println("Driving a car with Second Gear");
	}
	
	
	@Test(priority=3)
	public void putThirdGear()
	{
		System.out.println("Driving a car with Third Gear");
	}
	
	@Test(priority=4)
	public void putFourthGear()
	{
		System.out.println("Driving a car with Fourth Gear");
	}
	
	
	@Test(priority=5,enabled = false)
	public void turnMusicOn()
	{
		System.out.println("Turn music ON ");
	}
}
