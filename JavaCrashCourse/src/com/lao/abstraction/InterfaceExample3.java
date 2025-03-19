package com.lao.abstraction;

import java.util.Collection;

public interface InterfaceExample3 extends InterfaceExample1, InterfaceExample2 //Example of Multiple Inheritance
{
 

	//variables are public static final by default.
	String network = "5g"; // this italics shows that the variable is public static final by default.
	//Here all the methods are public and abstrct by default.
	void musicSystem();
	void color();
	void screenResolution();
}
