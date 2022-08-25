/*
 Write a program to print the area of a rectangle
  by creating a class named 'Area' having two methods.
   First method named as 'setDim' takes length and breadth
    of rectangle as parameters and the second method named
     as 'getArea' returns the area of the rectangle.
  Length and breadth of rectangle are entered through keyboard.
 */

package com.oops.java;
import java.util.Scanner;
public class AreaRectangle {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Area obj = new Area();
		double a,b;
		System.out.println("Enter the length and breadth ");
		a=sc.nextInt();
		b=sc.nextInt();
		obj.setDim(a,b);
		System.out.println("The area of rectangle is  "+obj.getArea());
	
	}

}