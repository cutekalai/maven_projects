package com.testing.features;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_concepts {
	
	@Test
	private void username() {
		String expected_username="kalai";
		String actual_username="ss";
		Assert.assertEquals(actual_username, expected_username);
		

	}
	
	@Test
	private void password() {
		String expected_password="karthi";
		String actual_password="karthi";
		Assert.assertEquals(actual_password, expected_password);
		

	}


}
