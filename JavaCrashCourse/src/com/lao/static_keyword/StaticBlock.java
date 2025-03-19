package com.lao.static_keyword;

public class StaticBlock {
	
	int n=10;
	static 
	{
		System.out.println("Inside Static Method 1");
	}
	static
	{
		System.out.println("Inside Static Method 2");

	}
	
	void mymethod()
	{
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main Method");
		
		
	}

}
