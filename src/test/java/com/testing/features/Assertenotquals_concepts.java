package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertenotquals_concepts {

	@Test
	private void username() {
		String expected_username="kalai";
		String actual_username="cute";
		
		Assert.assertNotEquals(actual_username, expected_username);
		System.out.println("Assert validation");
	}

}
