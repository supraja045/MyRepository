package com.lao.string_concepts;


public class StringBuilderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Create a StringBuilder instance
		        StringBuilder stringBuilder = new StringBuilder("supraja");

		        // Append strings to the StringBuilder
		        stringBuilder.append("My");
		        stringBuilder.append(" ");
		        stringBuilder.append("Name");
		        stringBuilder.append(" ");
		        stringBuilder.append("is");
		        stringBuilder.append(" ");
		        stringBuilder.append("Supraja");
		        stringBuilder.append(stringBuilder, 0, 0);

		        // Insert a string at a specific position
		        stringBuilder.insert(5, "awesome ");

		        // Replace a substring with another string
		        stringBuilder.replace(6, 11, "Java");

		        // Convert the StringBuilder to a string
		        String finalString = stringBuilder.toString();

		        // Output the final string
		        System.out.println(finalString);
		        
		        System.out.println(stringBuilder);
		        System.out.println(stringBuilder.equals("supraaJavae jaMy Name is Supraja"));
		     
		        
		    }
		

	}


