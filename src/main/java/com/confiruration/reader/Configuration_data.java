package com.confiruration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_data {
	public static 	Properties p;
	public Configuration_data() throws IOException {
		File f=new File
				("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\testdata\\properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		 p.load(fis);
		 
	}
	 public String get_config_url() {
		 String url = p.getProperty("url");
		 return url;
	 }
	 public String get_config_mailid() {
		 String mailid = p.getProperty("mailid");
		 return mailid;
	 }
	 public String get_config_password() {
		 String password = p.getProperty("password");
		 return password;
	 }


}
