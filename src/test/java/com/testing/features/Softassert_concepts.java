package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_concepts {

	@Test
	private void username() {
		String expected_username="kalai";
		String actual_username="cute";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual_username, expected_username);
		System.out.println("Assert verification");
	}

}
