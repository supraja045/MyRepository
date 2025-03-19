package com.lao.constructors;

public class DefaultConstructor {

		//Example for Default constructors
		
		//Do you see any constructors here? Nope! but the compiler has created a constructed for one.

		//Note: if you declared with Integer/Long/Double (Wrapper classes ) the default value will be null
		//Basically, if you declare anything with a class, it will return default value null.
			
		String studentName; //Default value for String - null
		int rollNo;//Default value for int - 0;
		char s='m';
		
		//Constructor Definition: Constructor is a block of code that initializes the newly created object using the keyword "new".
		public static void main(String[] args) {
			 
			//Example of Default constructor given below.
			DefaultConstructor defaultConstructor = new DefaultConstructor();
			
			System.out.println(defaultConstructor.studentName);
			System.out.println(defaultConstructor.rollNo);
			System.out.println(defaultConstructor.s);
			
			//Properties of a constructor
			//1.Constructor name == class name
			//2.Must not have explicit return type
			//3.It can't be abstract, static ,final and synchronized.
			
			
		}
	}


