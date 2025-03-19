package com.lao.polymorphism;

public class PolymorphismTradionalExample 
{

	public void addition(int x, int y)
	{
		int z= x+y;
		System.out.println("int x + int y =  "+ z);
	}
	public void addition(float x, float y)
	{
		float z= x+y;
		System.out.println("float x + float  y =  "+ z);
	}	
	public void addition(int x, float y)
	{
		float z= x+y;
		System.out.println("int x + float  y =  "+ z);
	}
	public static void main(String[] args) 
	{
		PolymorphismTradionalExample TradionalExample = new PolymorphismTradionalExample();
		TradionalExample.addition(1, 2);
		TradionalExample.addition(1.2f, 1.5f);
		TradionalExample.addition(1, 6.7f);
	}

}
