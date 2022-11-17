package org.tnsindia.trail;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number =");
		int num1=obj.nextInt();
		
		System.out.println("Enter second number =");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		System.out.println("sum of entered number ="+ sum);
		
		
		

	}

}
