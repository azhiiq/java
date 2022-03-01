package com.TestngFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {
	@BeforeSuite
public void propertySetting() {
		
		System.out.println("property setting");
	}
	@BeforeTest
	public void browswelaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeClass
	public void url() {
		System.out.println("url");
	}
	
    @BeforeMethod
	public void signin() {
		System.out.println("signin");
	}
	@Test
    public void women () {
		System.out.println("women");
	
		
	}
	
	@Test
	public void men() {
		System.out.println("men");
	}
	
	@Test
	public void kids() {
		System.out.println("kids");
	}
	
	@AfterMethod
	public void signout() {
		System.out.println("signout");
	}
	
	@AfterClass
	public void homepage() {
		System.out.println("homepage");
	}
	
	@AfterSuite
	public void deletecookies() {
		System.out.println("deletecookies");
	}
	
	public void quitbrowser() {
		System.out.println("quitbrowser");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
