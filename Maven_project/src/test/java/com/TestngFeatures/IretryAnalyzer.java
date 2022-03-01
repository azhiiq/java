package com.TestngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;



public class IretryAnalyzer {
	
	@Test
	public void login() {
		String exp= "Ashiq";
		String act= "Ashiq";
		
		Assert.assertEquals(exp, act);
	}
	@Test
	
	public void login2() {
		String exp = "Mohammed";
		String acr= "mohammed";
		
		Assert.assertEquals(exp, acr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
