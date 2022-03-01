package com.TestngFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	@Test(dataProvider = "inputdata")
	public void credentials(String username, String password) {
		
		System.out.println("Username :" + username);
		System.out.println("password :" + password);
		
		
		
	}
	@DataProvider
	public Object[][] inputdata(){
		return new Object[][] {
			{"ashi","123"},
			{"mohammed","456"},
			{"ashiq","789"}
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
