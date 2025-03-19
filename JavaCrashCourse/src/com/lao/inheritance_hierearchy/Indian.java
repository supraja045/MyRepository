package com.lao.inheritance_hierearchy;

public class Indian extends Human
{
	protected int money =5000;
	
	void UnityInDiversity()
	{
		System.out.println("Unity In Diversity is a special characteristics to my fellow Indians!!");
	}

	public static void main(String[] args) {
		Indian myIndianFellow = new Indian();
		System.out.println("Eyes  " +myIndianFellow.eyes);
		System.out.println("Hands  " +myIndianFellow.hands);
		System.out.println("Legs  " +myIndianFellow.legs);
		System.out.println("Nose  " +myIndianFellow.nose);
		myIndianFellow.eating();
		myIndianFellow.thinking();
		myIndianFellow.UnityInDiversity();
	}
}
