package com.lao.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	@SuppressWarnings("unchecked")
	public void arrayListMethod()
	{
		List<String> arrayList= new ArrayList<String>();
		arrayList.add("Supraja");
		arrayList.add("");
		arrayList.add("Krishna");
		arrayList.add("Govind");
		arrayList.add("Govind");
		System.out.println( "Prinitng the arraylist " +arrayList);
		System.out.println("Retrieving 1st position's value  "+arrayList.get(1));
		System.out.println("Shows index of the value 'Govind' in the first occurance " + arrayList.indexOf("Govind"));
		System.out.println("Shows index of the value 'Govind' in the last occurance " + arrayList.lastIndexOf("Govind"));
		System.out.println("Index of value 'Go' in the arrayList " + arrayList.indexOf("Go"));
		
		List<String> anotherList = new ArrayList<String>();
		//Copy one list's elements to anotherlist
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		
		//To clear all the elements in a list
		anotherList.clear();
		System.out.println("anotherList is empty " + anotherList);
		
		//To check if the array list is empty or not
		System.out.println("another list is empty if it shows true as an output  " + anotherList.isEmpty());
		
		// to remove a particular element in a list
		arrayList.remove("Govind");
		arrayList.remove(3);
		System.out.println(arrayList);
		
		//we can add null in arrayList
		arrayList.add(null);
		System.out.println(arrayList);
		
		//replace a value in an arrayList
		arrayList.set(0, "Supuni");
		System.out.println("After replacing a value in 0th position  " + arrayList);
		
		//Iterating a value in arrayLists using for each
		for (String string : arrayList) 
		{
			System.out.println(string);
		}
		System.out.println("----------------------------------------------");
		//iterating a value in a array list using normal for loop
		for(int i =0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("----------------------------------------------");
		
		
		
		
		//List Iterator forward operation
		System.out.println("----------------List Iterator forward example---------------"); 
		ListIterator<String> list_iterator = arrayList.listIterator();
		while(list_iterator.hasNext())
		{
			System.out.println(list_iterator.next());
		}
		System.out.println("----------------------------------------------"); 
		
		
		
		//List iterator backward operation
		System.out.println("----------------List Iterator backward example---------------"); 
		while(list_iterator.hasPrevious())
		{
			System.out.println(list_iterator.previous());
		}
		System.out.println("----------------------------------------------"); 
		
		
		
		
		
		//iterator only forward direction
		System.out.println("----------------Iterator example---------------"); 
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("----------------------------------------------"); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample example = new ArrayListExample();
		example.arrayListMethod();
	}

}
