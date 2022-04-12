package com.Maven_Project;

import org.openqa.selenium.WebDriver;

public class Page_object_manager {
	public WebDriver driver;
	
	private Home_page home;
	
	private Login_page login;
	
	private Orderclass order;
	
	private Drivebackorder drive;
	
	private Selectclass s;
	
	public Page_object_manager(WebDriver driver2) {
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
	public Orderclass get_instance_order() {
		if(order==null) {
			order=new Orderclass(driver);
		}
		return order;
	}
	
	public Drivebackorder get_instance_drive() {
		if(drive==null) {
			drive=new Drivebackorder(driver);
		}
		return drive;
	}
	public Selectclass get_instance_s() {
		if(s==null) {
			s=new Selectclass(driver);
		}
		return s;
	}
	
	
}

