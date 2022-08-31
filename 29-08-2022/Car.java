package com.oops.java;
public class Car extends Vehicle {
	  private String manufacturerName;
	  Car(String manufacturerName){
		  super(4566,75,"White","WagonR");
		  this.manufacturerName=manufacturerName;
	  }
	  public void showData() {
//		  super.showData();
		  System.out.println("The Manufacture name is " +this.manufacturerName);
		  
		  System.out.println("The Reg Number is " + this.regnNumber);

		  System.out.println("The speed of the car is " +this.speed);

		  System.out.println("The color is " +this.color);

		  System.out.println("The owner name is " +this.ownerName);
		  
	  }
	  
	}