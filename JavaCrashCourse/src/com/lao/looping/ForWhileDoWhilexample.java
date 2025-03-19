package com.lao.looping;

import java.util.Scanner;

public class ForWhileDoWhilexample {

	public static void main(String[] args) 
	{
		//looping concepts
		//for loop
		//for(initialization; condition; increment/decrement)
		//{}
		//in this example , we are going to write an imposition on computer science 
//	
//		for (int times=1; times<=25;times++)
//		{
//			System.out.println("Hello how are you, I am inside for loop");
//		}
//	
//		//Entry controlled loop
//	int times=1;	
//	while(times<=25)
//	{
//		System.out.println(times + " Imposition for me :( ");
//		times= times+1;	
//	}
	
	
//	//Exit controlled loop
//	int times1 =1;
//	do
//	{
//		System.out.println(times1 + " Imposition for me :( ");
//		times1++;
//	} while(times1<=25);
//	
//	for (int i = 0; i <25 ; i++)
//	{
//		
//	}
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a +ve number: ");
        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Invalid input. Please enter a +ve number.");
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
        }      
        System.out.println("You entered: " + number);

      
	
}
}