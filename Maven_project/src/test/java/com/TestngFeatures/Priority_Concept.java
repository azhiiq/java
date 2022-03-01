package com.TestngFeatures;

import org.testng.annotations.Test;

public class Priority_Concept {
	
     @Test(priority= -1)
	 public void women () {
			System.out.println("women");
	 }
     @Test(priority=0, invocationCount =3)
      public void men () {
		System.out.println("men");
	}
	@Test
	public void kids() {
		System.out.println("kids");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
