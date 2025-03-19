package com.lao.constructors;

public class ChildClassSuperThisExample extends ParentClassSuperThisExample{
	String childName="Ramu";
	public ChildClassSuperThisExample() {
		//By default when inheritance is used, parent class will be called without even creating on object for a parent class.
		//Super keyword is used to get parent class variable value.
		//this keyword is used to get child class variable value.
		System.out.println("Child Class Constructor is called");
		System.out.println(super.childName);
		System.out.println(this.childName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassSuperThisExample childClassExample = new ChildClassSuperThisExample();
		
	}

}
