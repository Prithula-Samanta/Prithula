/*
 Write a program to print the area and perimeter of a
  triangle having sides of 3, 4 and 5 unitsby creating
   a class named 'Triangle' without any parameter in its constructor.
 */
package com.oops.java;
import java.util.Scanner;
class Area {
	double length;
	double bredth;
  public void setDim(double length,double bredth) {
	  this.length=length;
	  this.bredth=bredth;
  }
  public double getArea() {
	  return this.length*this.bredth;
  }
}
