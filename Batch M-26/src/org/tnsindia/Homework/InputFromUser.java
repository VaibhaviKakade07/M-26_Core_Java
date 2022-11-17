package org.tnsindia.Homework;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number=");
		int num1 = obj.nextInt();
		
		System.out.println("Enter last number=");
		int num2 = obj.nextInt();
		
		int sum= num1+num2;
		System.out.println("Sum of two numbers is :"+sum);
	}
				

	
}
