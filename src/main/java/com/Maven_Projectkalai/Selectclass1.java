package com.Maven_Projectkalai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectclass1 {
	public WebDriver driver;

	@FindBy(id = "quantity_wanted")
	private WebElement quantity;

	public Selectclass1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getQuantity() {
		return quantity;
	}

	@FindBy(id = "group_1")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proccedcheck;

	public WebElement getproccedcheck() {
		return proccedcheck;
	}

	@FindBy(xpath = "//*[text()='Proceed to checkout']")
	private WebElement proccedcheck2;

	public WebElement getproccedcheck2() {
		return proccedcheck2;
	}


	@FindBy(id="cgv")
	private WebElement termsofconditions;
	public WebElement gettermsofconditions() {
		return termsofconditions;
	}
	
	@FindBy(xpath="//*[text()='Proceed to checkout']")
	private WebElement proccedcheck3;

	public WebElement getproccedcheck3() {
		return proccedcheck3;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proccedcheck4;

	public WebElement getproccedcheck4() {
		return proccedcheck4;
	}

	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement paybycheck;

	public WebElement getpaybycheck() {
		return paybycheck;
	}
	@FindBy(xpath = "//*[text()='I confirm my order']")
	private WebElement confirm;

	public WebElement getconfirm() {
		return confirm;
	}
}
