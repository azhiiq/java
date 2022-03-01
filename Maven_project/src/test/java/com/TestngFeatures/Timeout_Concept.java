package com.TestngFeatures;

import org.testng.annotations.Test;

public class Timeout_Concept {
       @Test(timeOut = 7000)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Browser launch");
		Thread.sleep(3000);
		System.out.println("url launch");
		Thread.sleep(1000);
		System.out.println("login");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
