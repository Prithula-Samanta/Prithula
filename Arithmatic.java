package com.loop.java;
import java.util.Scanner;

public class Arithmatic {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter the operators + for addition, - for Subtraction, * for multiplication and / for division ");
		String opr=sc.next();

		
		switch(opr) {
		case "+":
			System.out.println("The addition of two number is " +(a+b));
			break;
		case "-":
			System.out.println("The subtraction of two number is " +(a-b));
			break;
		case "*":
			System.out.println("The multiplication of two number is " +(a*b));
			break;
		case "/":
			System.out.println("The division of two number is " +(a/b));
			break;
		default:
			System.out.println("Invalid input");
		}
	}


}
