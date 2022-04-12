package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertsame_concepts {
	
	@Test
	private void username() {
		String expected_username="kalai";
		String actual_username="kalai";
		
		Assert.assertSame(actual_username, expected_username);
		System.out.println("Assert validation");
	}


}
