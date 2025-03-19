package com.lao.constructors;

public class ParameterizedConstructor {
	
	String studentName;
	int serialNo;
	
	 ParameterizedConstructor(int sNo,String Name) {
		// TODO Auto-generated constructor stub
		studentName=Name;
		serialNo=sNo;
			}
	
	public void sayAboutStudent()
	{
		System.out.println(" Example - Parameterized Constructor Serial No is "+ serialNo +" Name is "+ studentName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor exampleParameterizedConstructor1= new ParameterizedConstructor(1, "Supraja");
		exampleParameterizedConstructor1.sayAboutStudent();
		ParameterizedConstructor exampleParameterizedConstructor2 = new ParameterizedConstructor(2, "Muthu");
		exampleParameterizedConstructor2.sayAboutStudent();
		ParameterizedConstructor exampleParameterizedConstructor3 = new ParameterizedConstructor(3, "Asha");
		exampleParameterizedConstructor3.sayAboutStudent();
	 }

}
