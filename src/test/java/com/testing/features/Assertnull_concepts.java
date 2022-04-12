package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertnull_concepts {
	@Test
	private void username() {
		String expected_username="kalai";
	
		
		Assert.assertNull(expected_username);
		System.out.println("Assert validation");
	}


}
