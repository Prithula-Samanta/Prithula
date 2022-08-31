package com.oops.java;
class Ford extends Car2{
		
		int year;
		int manufacturerDiscount;
		
		Ford(int year,int manufacturerDiscount,int speed,double regularPrice,String color){
			super(speed,regularPrice,color);
			this.year=year;
			this.manufacturerDiscount=manufacturerDiscount;
		}
		public double getSalePrice() {
			return super.getSalePrice()-this.manufacturerDiscount;
		}
	}

