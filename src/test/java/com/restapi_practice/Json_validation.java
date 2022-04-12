package com.restapi_practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class Json_validation {
	@Test
	public void validation() throws IOException, ParseException {
		File f=new File("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\payload.json");
		FileReader reader=new FileReader(f);
		JSONParser parser =new JSONParser();
		Object obj = parser.parse(reader);
		JSONObject jsonob=(JSONObject)obj;
		Object object = jsonob.get("team");
		String value = object.toString();
		System.out.println("team :"+value);
		
	}
	

}
