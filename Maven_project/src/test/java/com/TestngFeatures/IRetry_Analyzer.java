package com.TestngFeatures;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Analyzer {
	
	
	
	public class Rerun implements IRetryAnalyzer{
		
		
		int start=0, end=3;
		
		@Override
		public boolean retry(ITestResult result) {
			if(start<end) {
				start++;
				return true;
			}
			
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
