package com.testing.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_concepts {

	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("smith")String username,String password) {
		System.out.println("username"+username);
		System.out.println("password"+password);

	}
}
