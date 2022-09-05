package com.exception;
class MainSalExp {
  static void validSal(int salary) throws InvalidSalaryException{
	   if(salary <=10000) {
		   
		   throw new InvalidSalaryException("Salary must between 10000 and 20000");
	   }
	   else if(salary >=20000) {
		   
		   throw new InvalidSalaryException("Salary must between 10000 and 20000");
	   }
	   else {
		   System.out.println("Correct salary");
	   }
  }
  public static void main(String args[]) {
	  try {
		  MainSalExp.validSal(25000);
	  }
	  catch(InvalidSalaryException e) {
		  System.out.print(e.getMessage());
	  }
  }
}
