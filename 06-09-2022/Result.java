package com.OOPs.java;

 class Result extends Students implements Exam {
	 double per;
	 Result(){
		 super("Abhisek",121,90,90);
		 }
  public void Percent_cal() {
	  this.per=per;
	  per=(marks1+marks2)/2;
  }
  public void display() {
	  System.out.println("The student percentage marks is "+this.per);
   }
 }
  