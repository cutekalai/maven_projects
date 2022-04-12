package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_concepts {

	@Test(dataProvider = "test_data")
	private void adactin_runner(String username,int password) {
		System.out.println("username :"+username);
		System.out.println("password :"+password);
		}
	@DataProvider
	private Object[][] test_data() {
		return new Object[][] {
			{"starc",123},
			{"smith",2345},
			{"watson",345}
		};

	}
	@Test(dataProvider="test_data")
	private void automation_runner(String username,int password) {
		System.out.println("username 1"+username);
		System.out.println("password 1"+password);
	

	}
	
}
