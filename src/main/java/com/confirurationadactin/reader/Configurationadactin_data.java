package com.confirurationadactin.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurationadactin_data {

	public static 	Properties p;
	public Configurationadactin_data() throws IOException {
		File f=new File
				("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\testdataadactin\\properties\\Configurationadactin.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		 p.load(fis);
		 
	}
	 public String get_configadactin_url() {
		 String url = p.getProperty("url");
		 return url;
	 }
	 public String get_configadactin_mailid() {
		 String mailid = p.getProperty("username");
		 return mailid;
	 }
	 public String get_configadactin_password() {
		 String password = p.getProperty("password");
		 return password;
	 }
	 public String get_configadactin_address() {
		 String address = p.getProperty("address");
		 return address;
	 }
	 public String get_configadactin_cvv() {
		 String cvv = p.getProperty("cvv");
		 return cvv;
	 }


}


