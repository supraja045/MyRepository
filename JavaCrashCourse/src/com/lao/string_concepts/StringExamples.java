package com.lao.string_concepts;

public class StringExamples {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//This example is to define how String is immutable object
//		String string1 = "Supraja";
//		String string2 = "Supraja";
//
//		
//		int hc1 = System.identityHashCode(string1);
//		int hc2 = System.identityHashCode(string2);
//		
//		System.out.println("Memory reference of string1 via str literal : " + hc1);
//		System.out.println("Memory reference of string2 via str literal: " + hc2);
//		
//		String s1= new String("Supraja");
//		String s2= new String("Supraja");
//		s1=s1.concat("Prasad");
//		System.out.println(s1);
//		
//		int hashCode1 = System.identityHashCode(s1);
//		int hashCode2 = System.identityHashCode(s2);
//
//		System.out.println("--------------------------------------------------------------");
//		
//		System.out.println("Memory reference of s1 via new keyword: " + hashCode1);
//		System.out.println("Memory reference of s2 via new keyword: " + hashCode2);
//		
//		
//	
//		
//		/*
//		 * System.out.println(sb1.hashCode()); System.out.println(sb2.hashCode());
//		 */
//		//Example for String methods(Interface charSequence's unimplemented methods)
//		
//		
//		
//		  String myName="Supraja"; //returns character value at a particular index
//		  System.out.println(myName.charAt(0));
//		  
//		  //returns string length System.out.println(myName.length());
//		  
//		  //returns true if the object is exactly matching with the given string
//		  System.out.println(myName.equals("Supraja"));
//		  
//		  //returns true if the object is matching with the given string without case sensitivity 
//		  System.out.println(myName.equalsIgnoreCase("SupRaja"));
//		  
//		  //Checks if the string is empty or not System.out.println(myName.isEmpty());
//		  
//		  //returns true if the object contains the given letter with case sensitivity
//		  System.out.println(myName.contains("s"));
//		  
//		  //take a particular portion of a string
//		  System.out.println(myName.substring(1)); //Method overloading example
//		  
//		  //take a particular portion of a string begin and end index
//		 /* System.out.println(myName.substring(1,3)); //Method overloading example //
//		  Here op will be "up" -> beginning index will be included, end index excluded*/
//		  
//		  //appends a string to the given string
//		  System.out.println(myName.concat(" Muthusundaram"));
//		  
//		  //replaces existing charcter with given character
//		  System.out.println(myName.replace("S", "M"));
//		  System.out.println(myName.replace("Sup", "Muthu"));
//		  
//		  //find the position of char in string
//		  System.out.println(myName.indexOf('u'));
//		  
//		  //find the position of char in string from the index position
//		  myName="Supraja"; System.out.println(myName.indexOf('a', 5)); //get the index
//		/*  of char 'a' occurring after 5th position
//		  System.out.println(myName.indexOf("a", 5)); //get the index of string "a"
//		  occurring after 5th position System.out.println(myName.indexOf("raja", 0));*/
//		  //get the index of string "raja" occurring after 0th position
//		  
//		  //trim will remove the white spaces after and before a string
//		  myName=" Supraja "; System.out.println(myName.trim());
//		  
//		  //Convert the given datatype into string
//		  
//		  Integer number = new Integer(123); 
//		  System.out.println("Before conversion: " +
//		  number.getClass().getName());
//		  System.out.println("After conversion: " +
//		  String.valueOf(number).getClass().getName());
//		  
//		  //Uppercase to lowercase conversion String uCase= "SUNDARARAMAN";
//		 // System.out.println(uCase.toLowerCase());
//		  
//		  //Lowercase to Uppercase conversion String lCase= "sundararaman";
//		 // System.out.println(lCase.toUpperCase());
//		  
//		  //Returns a joined String with Given Delimiter
//		  System.out.println(String.join("-", "Supraja","Jayaram"));
//		  System.out.println(String.join("/", "30","05","1990"));
//		  
//		  //Split String splitThisString ="Am,I a Good Teacher?"; String[] splitWords =
//		// // splitThisString.split(" "); for (String string : splitWords) {
//		 //.out.println(string); }
//		  
//		  String str ="ABC"; String str2="XYz"; //String op = "";
//		  //System.out.println(str+str2);
		  
		  
		  String str1= "pranav";
		  String str2 =str1.concat("patil");
		  System.out.println(str1);
		  System.out.println(str1);
		  
		  
		 
	}

}


