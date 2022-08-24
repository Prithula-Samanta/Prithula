/*Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.

Expected Output:

Input a positive integer:  25
Is 25 sum of two square numbers?*/


package com.loop.java;
import java.util.Scanner;
public class SqrOfInteger {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number ");

		int n=sc.nextInt();
		int i,j;
		int flage=0;
		for(i=1;i*i<=n;i++) {
			for(j=1;j*j<=n;j++) {
				if(i*i + j*j == n) {
					flage=1;
					break;
				}
			}
		}
		if(flage==1) {
			System.out.println("Yes this is sum of squre of two number");
		}
		else {
			System.out.println("No this is not sum of squre of two number");

		}
		
	}
}
