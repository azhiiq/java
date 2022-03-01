package com.TestngFeatures;

import org.testng.annotations.Test;

public class Grouping_Concept {
	@Test(groups= "Module1")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(groups= "Module1")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(groups= "Module1")
	public void Test3() {
		System.out.println("Test3");
	}
	@Test(groups= "Module1")
	public void Test4() {
		System.out.println("Test4");
	}
	@Test(groups= "Module2")
	public void Test5() {
		System.out.println("Test5");
	}
	@Test(groups= "Module2")
	public void Test6() {
		System.out.println("Test6");
	}
	@Test(groups= "Module2")
	public void Test7() {
		System.out.println("Test7");
	}
}
