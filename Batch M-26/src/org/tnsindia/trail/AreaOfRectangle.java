package org.tnsindia.trail;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner rect=new Scanner(System.in);
		
		System.out.println("Enter the  length:");
		double length= rect.nextDouble();
		
		  
		System.out.println("Enter the width:");
		double width= rect.nextDouble();
		
		double area=length*width;
		System.out.println("Area of the rectangle is = "+ area);
		
	
 
	}

}
