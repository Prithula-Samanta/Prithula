package com.loop.java;
import java.util.Scanner;

public class Qube {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println("The natural numbers are ");

		for(int i=1;i<=n;i++) {
			System.out.println("The qube of " + i +" is " + (i*i*i));
			
			}
	}
}
