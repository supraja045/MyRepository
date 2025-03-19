package com.lao.encapsulation;

public class EncapsulationExample {
	    private String name;
	    private int age;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        
	            this.age = age;
	        
	    }
	    
	    public static void main(String[] args) {
	    	EncapsulationExample myObj = new EncapsulationExample();
	        myObj.setName("Supraja"); // Set the value of the name variable to "John"
	        myObj.setAge(-1);
	        myObj.setName("11"); // Set the value of the name variable to "John"
	        myObj.setAge(-10);
	        System.out.println(myObj.getName());
	        System.out.println(myObj.getAge());
	        System.out.println(myObj.getName());
	        System.out.println(myObj.getAge());
	      }
	}


