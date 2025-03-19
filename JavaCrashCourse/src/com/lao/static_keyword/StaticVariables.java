package com.lao.static_keyword;

public class StaticVariables {
	
	//example to show how a static variable perform 

	static int  account_balance =0;
	 String depositedBy ;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables StaticVariables1= new StaticVariables();
		account_balance =1000;
		
		StaticVariables1.depositedBy="Supraja";
		StaticVariables StaticVariables2 = new StaticVariables();
		account_balance=2000;
		StaticVariables2.depositedBy="Muthu";
		System.out.println("account balance " + account_balance);
		System.out.println("deposited by " +StaticVariables1. depositedBy);
		System.out.println("deposited by " +StaticVariables2.depositedBy);
		System.out.println("account balance " + account_balance);
	}

}
