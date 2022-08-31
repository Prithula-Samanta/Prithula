package com.oops.java;
import java.util.Scanner;
public class MainAccount {
public static void main(String args[]) {
	SavingsAccount obj = new SavingsAccount(10.0,50000.0,12345,"Prithula","WB");
	Scanner sc = new Scanner(System.in);

	obj.display();
	System.out.println("Enter the amount which you want to withdrawl ");
	double amt=sc.nextDouble();
	obj.withdrawl(amt);
	System.out.println("After withdrawl  : ");
	obj.display();
	System.out.println("The calcuate amount is " +obj.calculateAmmount());


	System.out.println("Enter the amount which you want to deposit ");
	double amt2=sc.nextDouble();
	obj.deposit(amt2);
	System.out.println("After  deposit : ");
	obj.display();
	System.out.println("The calcuate amount is " +obj.calculateAmmount());
	
    }
}