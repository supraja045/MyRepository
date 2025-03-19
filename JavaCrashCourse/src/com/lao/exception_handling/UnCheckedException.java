package com.lao.exception_handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnCheckedException {

	
	
	void ArithmeticExceptionExample() throws FileNotFoundException
	{
		FileReader fr;
		
			fr = new FileReader("D:\\testout.txt");
		   
        BufferedReader br=new BufferedReader(fr);    
		
		try
		{
			int a =10;
			int b =0;
			System.out.println(a/b);
		}	
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Unchecked arithmetic exception occurs");
			
		}
			
	}
	
	void my() throws FileNotFoundException
	{
		ArithmeticExceptionExample();
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
		UnCheckedException myUnchk = new UnCheckedException();
		myUnchk.ArithmeticExceptionExample();
	}
}
