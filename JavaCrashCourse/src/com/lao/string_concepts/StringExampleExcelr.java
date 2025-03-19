package com.lao.string_concepts;

public class StringExampleExcelr 
{

	public static void main(String[] args) {
		
		//By using a String Literal
		String str1 ="Supraja";
		str1= str1.concat("Jayaram");
	
//		System.out.println("String  " +str1);
//		Integer number = new Integer(123); 
//		System.out.println("Before conversion: " +
//		number.getClass().getName());
//		System.out.println("After conversion: " +
//		String.valueOf(number).getClass().getName());
		
		int n =10;
	
		System.out.println(String.valueOf(n).getClass().getName());
		
//		String str = "1243";
//		int num = 0 ;
//		System.out.println(Integer.valueOf(num).getClass().getName());
		
		String name = "Supraja";


		String formattedString = String.format("My name is %s", name);
		System.out.println(formattedString);
		
	}
}
