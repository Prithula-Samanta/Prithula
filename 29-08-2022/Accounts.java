/*
 * 2.Create an abstract class Accounts with the following details:
Data Members:
(a) Balance (b) accountNumber (c) accountHoldersName (d) address
Methods:
(a) withdrawl()- abstract
(b) deposit()- abstract
(c) display() to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details:
Data Members:
(a) rateOfInterest
Methods:
(a) calculateAount()
 */
package com.oops.java;
abstract class Accounts {
	double balance;
	private int accountNumber;
	protected String accountHoldersName;
	protected String address;
	Accounts(double balance,int accountNumber,String accountHoldersName,String address){
		this.balance=balance;
		this.accountNumber=accountNumber;
		this.accountHoldersName=accountHoldersName;
		this.address=address;	
	}
	public abstract void withdrawl();
	public abstract void deposit();
	
 public void display() {
	 
	 System.out.println("The account balance is " +this.balance);
 }

}
