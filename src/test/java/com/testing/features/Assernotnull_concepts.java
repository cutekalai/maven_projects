package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assernotnull_concepts {
	@Test
	private void username() {
		String expected_username="kalai";
	
		
		Assert.assertNotNull(expected_username);
		System.out.println("Assert validation");
		
		Assert.assertTrue(true);
	}

}
