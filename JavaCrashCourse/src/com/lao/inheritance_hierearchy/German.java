package com.lao.inheritance_hierearchy;

public class German extends Human
{
	int money =500;

	void daylightsavings()
	{
		System.out.println("daylightsavings is common in Germany!!");
	}

	public static void main(String[] args) 
	{
		German myGerman = new German();
		System.out.println("Eyes  " +myGerman.eyes);
		System.out.println("Hands  " +myGerman.hands);
		System.out.println("Legs  " +myGerman.legs);
		System.out.println("Nose  " +myGerman.nose);
		myGerman.eating();
		myGerman.thinking();
		myGerman.daylightsavings();
	}

}
