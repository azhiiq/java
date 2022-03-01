package com.TestngFeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	
	
	@Test
	public void demo_password() {
		String exp_FN = "Mart";
		String exp_LN="Teena";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(exp_FN, exp_LN);
		System.out.println("verification");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
