package com.testing.features;

import org.testng.annotations.Test;

public class Timeout_concepts {

	@Test(timeOut=6000)
	private void browser_execution() throws Throwable {
		Thread.sleep(2000);
		System.out.println("browser_launch");
		
		Thread.sleep(1000);
		System.out.println("url");
		
		Thread.sleep(1000);
		System.out.println("credentials");
		
		Thread.sleep(1000);
		System.out.println("next page");
	}
}
