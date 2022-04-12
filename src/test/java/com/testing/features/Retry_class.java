package com.testing.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_class implements IRetryAnalyzer {

	int start=1;
	int end=4;
	public boolean retry(ITestResult result) {
		if (start<=end) {
			start++;
			return  true;
			
		}
		
		return false;
	}

	
}
