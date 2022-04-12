package com.testing.features;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_demo {
	
	@Test
	private void children() {
	System.out.println("children");
	}

	@BeforeSuite
	private void setproperty() {
		System.out.println("setproperty");

	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");

	}
	@BeforeTest
	private void browser_launch() {
		System.out.println("browser_launch");

	}
	@AfterClass
	private void verify_homepage() {
	System.out.println("verify home page");

	}
	
	@BeforeClass
	private void geturl() {
		System.out.println("url");
	}
	@BeforeMethod
	private void signin() {
		System.out.println("sign in");

	}
	@Test
	private void women() {
	System.out.println("women");

	}
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("delete all cookies");

	}
	@Test
	private void mens() {
	System.out.println("mens");

	}
	
}
