package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_concepts {
	@Test(priority = -2)
	private void username() {
	System.out.println("username");

	}
	@Test(priority = -1)
	private void password() {
	System.out.println("password");

	}
@Ignore
	@Test
	private void login() {
	System.out.println("login");

	}
}
