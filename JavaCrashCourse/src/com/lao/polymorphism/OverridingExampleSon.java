package com.lao.polymorphism;

public class OverridingExampleSon extends OverridingExampleParents {

	@Override
	public void marriage()
	{
		System.out.println("I want my marriage to be dreamy wedding at Goa,not in my home");
	}
	
	public static void nativeMethod()
	{
		System.out.println("I am changing my country so changed native place also!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExampleParents Parent = new OverridingExampleSon(); // ParentclassName parentclassObj = new ChildClassName();
		Parent.properties();
		Parent.marriage();
		OverridingExampleParents.nativeMethod();
	}

}
