package com.lao.string_concepts;

public class StringBufferExamples {

	public static void main(String[] args) {
//		System.out.println("String is Immutable");
//		String name= "Arya";
//		System.out.println("Appending a name to original: "+ name.concat("Prasath").concat("oooo"));
//		System.out.println("Original name : "+name);
//		System.out.println("-------------------------------");
//		System.out.println("String Buffer is mutable");
//		StringBuffer name1 = new StringBuffer("Arya");
//		System.out.println("Appending a name to original: "+ name1.append("Prasath"));
//		System.out.println("Original name : "+name1);
//		
//		
//		//String Buffer methods
//		//Reverse - We can't reverse a string directly
//		System.out.println("Reveresed name: " +name1.reverse());
//		
//		//Replace
//		StringBuffer myName = new StringBuffer("Supraja");
//		System.out.println(myName.replace(0, 3, "Riya"));
//		
//		//Delete
//		StringBuffer myName1 = new StringBuffer("RiyaSupraja");
//		System.out.println(myName1.delete(0, 4));
//		
//		//Insert
//		StringBuffer myName2 = new StringBuffer("Supraja");
//		System.out.println(myName2.insert(6, "Hello"));
//		
//		//capacity
//		System.out.println(name1.capacity()); // default capacity = 16
//		//like String, we have charAt,Substring ,length methods as well.
		
	// String is immutable
	//String Buffer is mutable
	
		String myName = "Supraja";
		myName= myName.concat(" Jayaram");
		System.out.println("String is immutable so the concatenation is not shown before assiging  " +myName);
		myName.charAt(0);
		myName.length();
		
		
		StringBuffer sb1= new StringBuffer("Supraja");
		sb1.append(" Jayaram");
		System.out.println("StringBuffer is mutable so the concatenation is shown even before assiging  " +sb1);
		
		
//		sb1.reverse();
//		System.out.println("Reverse function of a string buffer " +sb1);
//		
//		//Replace
//		sb1.replace(7,15," Muthu");
//		System.out.println("Replace function of a string buffer " +sb1);
//		
//		//Delete operation
//		System.out.println("Delete function of a string buffer "+ sb1.delete(7, 15));
//		
//		
//		//Insert 
//		System.out.println(sb1.insert(7, "Jayaram"));
		
		//capacity
//		System.out.println(sb1.capacity());
//		sb1.charAt(0);
//		
		//Returns the length of a string
		System.out.println(sb1.length());
		
		
		System.out.println(sb1.indexOf("J"));
		//indexof - first occurance of the specified string / char
		
		
		//substring methods will include starting index and it will exclude ending index
		System.out.println(sb1.substring(7,10));

		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		sb1.setCharAt(8, 'j');
		System.out.println(sb1);
	}
}
