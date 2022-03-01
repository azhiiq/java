package com.TestngFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	public void Green() {
		System.out.println("Green");
	}
	@Test(enabled= false)
	public void Black() {
		System.out.println("Black");
	}
	@Test
	public void Blue() {
		System.out.println("Blue");
	}
	@Test
	@Ignore
	public void Yellow() {
		System.out.println("Yellow");
	}
	@Test
	public void Orange() {
		System.out.println("Orange");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
