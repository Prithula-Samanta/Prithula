/*
 * . Create a super class called Car. The Car class has the following fields and methods.
◦intspeed;
◦doubleregularPrice;
◦Stringcolor;
◦doublegetSalePrice();

Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
◦intweight;
◦doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.

Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
◦intyear;
◦intmanufacturerDiscount;
◦doublegetSalePrice();//FromthesalepricecomputedfromCarclass,subtractthemanufacturerDiscount.
 */
package com.oops.java;

class Car2{
	int speed;
	double regularPrice;
	String color;
	
	Car2(int speed,double regularPrice,String color){
		
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	
	public double getSalePrice() {
		return regularPrice;
	}
	
}