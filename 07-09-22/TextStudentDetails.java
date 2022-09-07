package com.java.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextStudentDetails {
	StudentDetails obj1=new StudentDetails();
	StdBusinessLogic obj2 = new StdBusinessLogic();
	@Test
	public void testStudent() {
		obj1.setName("Abhisek Maity");
		obj1.setMarks1(90);
		obj1.setMarks2(90);
		obj1.setMarks3(90);
		
		double percent=obj2.calculatePercentage(obj1);
		assertEquals(90,percent);

		
	}
	
	
	

}
