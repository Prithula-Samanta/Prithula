package com.oops.java;
import java.util.Scanner;
public class EmployeeTax {
public static void main(String args[]) {
	Employee27 obj = new Employee27("kidps3231q","Prithula",400000);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter pan no (String) ");
	String a=sc.next();
	
	System.out.println("Please enter Name (String) ");
    String b=sc.next();
	
	System.out.println("Please enter Income yearly  ");
	double c=sc.nextDouble();
	
	obj.setPanNo(a);
	obj.setName(b);
	obj.setIncome(c);
	System.out.println("PanCardNo : " +obj.getPanNo()+"\n PersonName : "+obj.getName()+"\n Income : "+obj.getIncome());
	obj.cal();
	obj.dis();
		
}

}