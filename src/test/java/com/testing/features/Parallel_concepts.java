package com.testing.features;

import org.testng.annotations.Test;

public class Parallel_concepts {
	@Test
	private void username() {
	System.out.println("username");
	}

	@Test
	private void password() {
	System.out.println("password");
	}

	@Test
	private void repassword() {
	System.out.println("repassword");
	}
	
	@Test
	private void signin() {
	System.out.println("signin");
	}
	
	@Test
	private void signout() {
	System.out.println("signout");
	}
}
