package com.lao.constructors;

public class ConstructorOverloadingExample {
	
	String multipleShapes;
	 ConstructorOverloadingExample() 
	 {
		 //Going to Draw Different shapes
		 System.out.println("You gave me empty Paper and there is no drawing in this");
		 
	 }
	 
	 ConstructorOverloadingExample(String shape) 
	 {
		 //Going to Draw Different shapes 
		 multipleShapes=shape;
		 System.out.println("We draw "+ shape);
	 }
	 
	 ConstructorOverloadingExample(String color,String shape) 
	 {
		 //Going to Draw Different shapes 
		 System.out.println("We draw "+ shape + " in " +color +" color");
	 }
	 
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			ConstructorOverloadingExample Drawing1 = new ConstructorOverloadingExample();
			ConstructorOverloadingExample Drawing2 = new ConstructorOverloadingExample("Retangle");
			ConstructorOverloadingExample Drawing3 = new ConstructorOverloadingExample("Blue","Square");
	}
	
}