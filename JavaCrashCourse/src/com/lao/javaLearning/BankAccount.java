package com.lao.javaLearning;

public class BankAccount {
	//Long - Wrapper Class where as long - Primitive Data Type.
	//Wrapper Class means we are wrapping up the primitive data type into a class so as to create an object for it.
	//For Int Wrapper class - we can create an object but for int we can not create an object. 
	Long accountNumber=123456789l;
	String holderName="Supraja";
	Integer accountBalance=350;

	//Function is mentioned here
	protected void getBalance()
	{
		int localVariable=10;
		System.out.println("The Account Balace is " + accountBalance);
		System.out.println(localVariable);
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an object for a class
		BankAccount bankAccount = new BankAccount();
		//Calling a method by using object
		bankAccount.getBalance();
		
	}

}


