package com.lao.Inheritance_multilevel;

import com.lao.inheritance_hierearchy.Indian;

public class Dog extends Animal
{
	
	
	private char[] money;


	void barking()
	{
		System.out.println("All Dogs bark!!");
	}
	
	void sniffing()
	{
		System.out.println("Dog is sniffing");
	}
	
	
	public static void main(String[] args) {
		Dog myDog= new Dog();
		//System.out.println(myDog.legs);
		//myDog.eating();
		myDog.barking();
		System.out.println(myDog.money);
	}
}
