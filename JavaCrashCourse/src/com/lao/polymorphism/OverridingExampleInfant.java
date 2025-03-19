package com.lao.polymorphism;

public class OverridingExampleInfant extends OverridingExampleHuman
{
	void eating()
	{
		System.out.println("Infants take either take mother's milk or formula milk ");
	}
	
	
	public static void main(String[] args) {
		OverridingExampleHuman eatingHabit = new OverridingExampleInfant();
		System.out.println("legs "+ eatingHabit.legs);
		eatingHabit.thinking();
		eatingHabit.eating();
	}
}
