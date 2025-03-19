package com.lao.inheritance;

public class BMW extends Cars
{
	public static void main(String[] args) 
	{
		BMW bmw = new BMW();
		System.out.println("My Wheel Nos "+ bmw.wheels);
		bmw.driving();
		bmw.fuel();
	}

}
