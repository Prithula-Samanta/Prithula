package com.loop.java;
import java.util.Scanner;
public class Reverse{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=sum*10 + rem;
			num=num/10;
		}
		System.out.println("The revrse of no is " +sum);
	}


}
