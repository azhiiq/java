package com.TestngFeatures;

import org.testng.annotations.Test;

public class Expected_Exceptions_Concept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo () {
		
	int a= 10;
	
	System.out.println(a/0);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
