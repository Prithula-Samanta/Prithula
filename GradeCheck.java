package com.java2;

public class GradeCheck {
public static void main(String args[])
{
	int n=90;
	if(n>=90 && n<=100)
	  {System.out.println(n+ " is A+");}
	else if(n>=80 && n<90)
	  {System.out.println(n+ " is A");}	
	else if(n>=70 && n<80)
	  {System.out.println(n+ " is B+");}
	else if(n>=60 && n<70)
	  {System.out.println(n+ " is B");}
	else if(n>=50 && n<60)
	  {System.out.println(n+ " is C");}
	else if(n>=40 && n<50)
	  {System.out.println(n+ " is D");}
	else if(n>=30 && n<40)
	  {System.out.println(n+ " is E");}
	else
	  {System.out.println("=Fail");}
}
}
