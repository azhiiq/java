package com.TestngFeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	
	
	@Test
	@Parameters({"Username","password"})
	public void credentials(@Optional("Mohammed")String Username, String password) {
		System.out.println("Username is :"+ Username);
		System.out.println("Username is :"+ password);
		
		
	}
	@Test
	@Parameters({"a","b"})
	public void add(int a, int b) {
		System.out.println("add");
		System.out.println("a:"+ a);
		System.out.println("b:"+b);
	}
	
		
	}

	
	
	
	
	
	
	
	
	
	
	


