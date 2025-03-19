package com.lao.static_keyword;

public class StaticMethods {
	
	//Static method can be called without creating an object.
	public static void staticMethod()
	{
		System.out.println("Inside static method");
	}
	
	public void nonStaticMethod()
	{
		staticMethod();
		System.out.println("Inside non static method");
	}
	
	public static void main(String[] args)
	{
		staticMethod();
		StaticMethods StaticMethodsObjet = new StaticMethods();
		StaticMethodsObjet.nonStaticMethod(); //Here it will thorw an error if 
		//we do not call a non static method w.o creating an object
	}
}
