
package com.lao.selenium.testNg;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DependeciesManagement {

	//problem 1 : You have to admit a student to Engineering
	//problem 2 : You have to admit a student to Higher Secondary
	
	
	@Test
	public void highSchool(){
		System.out.println("At High School");
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondarySchool(){
		System.out.println("At Higher Sec School");
	}
	
	@Test(dependsOnMethods = "higherSecondarySchool")
	public void college(){
		System.out.println("At College");
	}
}
