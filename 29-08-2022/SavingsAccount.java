package com.oops.java;
abstract class SavingsAccount extends Accounts{
double rateOfInterest;
SavingsAccount(double rateOfInterest,double balance,int accountNumber,String accountHoldersName,String address){
		super(balance,accountNumber,accountHoldersName,address);
		this.rateOfInterest=rateOfInterest;
	}
	public void withdrawl(double amt) {
	 this.balance=this.balance-amt;
	}
	public void deposit(double amt) {
		this.balance=this.balance+amt;
	}
	public double calculateAmmount() {
		return this.balance*(1+1*this.rateOfInterest);
		
		
	}
	
}