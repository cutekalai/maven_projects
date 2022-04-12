package com.Maven_Project1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinhomepage {
public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	 public Adactinhomepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(name="password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}


}


