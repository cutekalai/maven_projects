package com.Maven_Projectkalai;

import org.openqa.selenium.WebDriver;



public class Page_object_manager1 {
public WebDriver driver;
	
	private Home_page home;
	
	private Login_page login;
	
	private Orderclass1 order;
	
	private Drivebackorder1 drive;
	
	private Selectclass1 s;
	
	public Page_object_manager1(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public Home_page get_instance_home() {
		if(home==null) {
			home=new Home_page(driver);
		}
		return home;
	}
	
	public Login_page get_instance_login() {
		if(login==null) {
			login=new Login_page(driver);
		}
		return login;
	}
	public Orderclass1 get_instance_order() {
		if(order==null) {
			order=new Orderclass1(driver);
		}
		return order;
	}
	
	public Drivebackorder1 get_instance_drive() {
		if(drive==null) {
			drive=new Drivebackorder1(driver);
		}
		return drive;
	}
	public Selectclass1 get_instance_s() {
		if(s==null) {
			s=new Selectclass1(driver);
		}
		return s;
	}
	

}
