package com.java2;

public class Quadratic_eq {
	public static void main(String[] args)
	{
		int a=1,b=5,c=1;
		double d=b*b-4*a*c;
		if(d==0) {
			System.out.println("roots are equal");
		}
		else if(d>0) {
			System.out.println("roots are positive & different");
			}
		else {
			System.out.println("roots are imaginary");
		}
	}

}
