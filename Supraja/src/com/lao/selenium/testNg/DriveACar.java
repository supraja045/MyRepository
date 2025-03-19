package com.lao.selenium.testNg;

import org.testng.annotations.Test;

public class DriveACar {
	
	@Test(priority=0)
	public void startACar()
	{
		System.out.println("Starting a car");
	}
	
	
	@Test(priority=-1)
	public void putFirstGear()
	{
		System.out.println("Driving a car with First Gear");
	}
	
	@Test(priority=0)
	public void putSecondGear()
	{
		System.out.println("Driving a car with Second Gear");
	}
	
	
	@Test(priority=1)
	public void putThirdGear()
	{
		System.out.println("Driving a car with Third Gear");
	}
	
	@Test(priority=2)
	public void putFourthGear()
	{
		System.out.println("Driving a car with Fourth Gear");
	}
	

}
