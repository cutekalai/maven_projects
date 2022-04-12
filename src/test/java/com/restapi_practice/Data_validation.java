package com.restapi_practice;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.demopostman.Baseclassdemopostman;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Data_validation extends Baseclassdemopostman {
	@Test
	public void data_validation() throws Throwable {
	
		String base=getdata("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\demo.postman.xlsx", 0, 1,2 );
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users?page=2");
		String string = response.asString();
		System.out.println(string);
		
	/*	Response response1 = request.post("api/users");
		String string1 = response1.asString();
		System.out.println(string1);
		
		Response response2 = request.put("api/users/2");
		String string2 = response2.asString();
		System.out.println(string2);
		
		Response response3 = request.patch("api/users/2");
		String string3 = response3.asString();
		System.out.println(string3);*/
		
	    int statusCode = response.getStatusCode();
		Assert.assertEquals(base, statusCode);
		System.out.println("Data validation");
		
	/*	int statusCode1 = response1.getStatusCode();
		Assert.assertEquals(300, statusCode1);
		System.out.println("Data validation1");

		int statusCode2 = response2.getStatusCode();
		Assert.assertEquals(200, statusCode2);
		System.out.println("Data validation2");
		
		int statusCode3 = response3.getStatusCode();
		Assert.assertEquals(200, statusCode3);
		System.out.println("Data validation3");*/
	}

}
