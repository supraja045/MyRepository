package com.lao.conditional_statements;

public class LetsHaveACoffee {


	boolean isCupEmpty = true;
	public static void main(String[] args) {
		
		
		LetsHaveACoffee coffee = new LetsHaveACoffee();
		if(coffee.isCupEmpty)
		{
			System.out.println("Coffee mug is empty , Please fill the coffee cup");
		}
		else
		{
			System.out.println("Coffee is already available, Enjoy it!!");
		}
	}

}
