/*
 * Create a class called Employee that includes three pieces of information as instance variables—a first name
(typeString), a last name (typeString) and a monthly salary (double). Your class should have a constructor that
initializes the three instance variables. If the monthly salary is not positive, set it to 0.0. Write a test
 application named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employe
Employee a 10% raise and display each Employee’s yearly salary again.
 */
package com.oops.java;
public class EmployeeDetails {
	public static void main(String args[]) {
		EmployeeInformation obj1 = new EmployeeInformation("Prithula","Samanta",60000.0);
		EmployeeInformation obj2 = new EmployeeInformation("Dev","Das",40000.0);
		System.out.println(obj1.getfirstName()+ "  " +obj1.getlastName()+ "  " +obj1.getMonthSalary()+ "  " +obj1.getYearlySalary());
		System.out.println(obj2.getfirstName()+ "  " +obj2.getlastName()+ "  " +obj2.getMonthSalary()+ "  " +obj2.getYearlySalary());
		
		System.out.println("After increasing salary(10%) ");
		
//		System.out.println(obj1.getfirstName()+ "  " +obj1.getlastName()+ "  " +obj1.getMonthSalary()*1.1+ "  " +obj1.getYearlySalary());
//		System.out.println(obj2.getfirstName()+ "  " +obj2.getlastName()+ "  " +obj2.getMonthSalary()*1.1+ "  " +obj2.getYearlySalary());
		
		System.out.println( "  " +obj1.getMonthSalary()*1.1);
		System.out.println("  " +obj2.getMonthSalary()*1.1);
		}

}
