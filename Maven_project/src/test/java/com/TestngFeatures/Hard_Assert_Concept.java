package com.TestngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {
	
	@Test
	public void demo_Username() {
		String exp_Username="Teena";
		String act_Username ="Teena";
		
		Assert.assertEquals(exp_Username, act_Username);
		
		System.out.println("Validation");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
