package com.TestngFeatures;

import org.testng.annotations.Test;

public class Dependency_Concept {
	@Test
	public void principal() {
		System.out.println("principal");
	}
	@Test(dependsOnMethods ="principal")
	public void teachers() {
		System.out.println("teachers");
	}
	
	
	
	
	
	
	
	
	
	
	

}
