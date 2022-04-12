package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_concepts {
	
	@Test
	private void mobile() {
		System.out.println("mobile");

	}

	@Test(dependsOnMethods = "mobile")
	private void offer() {
		System.out.println("offer");

	}

	@Test
	private void watch() {
		System.out.println("watch");

	}

}
