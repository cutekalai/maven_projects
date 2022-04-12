package com.testing.features;

import org.testng.annotations.Test;

public class Invocation_concepts {
	
	@Test
	private void browser_launch() {
	System.out.println("browser_launch");

	}

	@Test(priority = 2)
	private void launch_url() {
	System.out.println("launch_url");

	}
	@Test(priority = -3,invocationCount = 2)
	private void refresh() {
	System.out.println("refresh");

	}
	@Test(priority = -5,invocationCount = 3)
	private void credentials() {
	System.out.println("credentials");

	}
}
