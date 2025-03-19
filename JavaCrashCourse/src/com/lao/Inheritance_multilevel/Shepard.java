package com.lao.Inheritance_multilevel;

public class Shepard extends Dog {
	
	
	void militaryDogs()
	{
		System.out.println("Shepards are used in military because of its intelligence!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shepard myShepard= new Shepard();
		myShepard.eating();
		myShepard.barking();
		myShepard.militaryDogs();
	}

}
