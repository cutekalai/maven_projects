package com.Maven_Projectkalai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderclass1 {

public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Women'])[1]")
	private WebElement women;

	public Orderclass1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen() {
		return women;
	}
	@FindBy(xpath="//a[@title='List']")
	private WebElement list;

	public WebElement getList() {
		return list;
	}
	@FindBy(xpath="(//a[@class='product-name'])[1]")
	private WebElement fadeddress;

	public WebElement getfadeddress() {
		return fadeddress;
	}
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addcart;

	public WebElement getaddcart() {
		return addcart;
	}
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;

	public WebElement getsignout() {
		return signout;
	}
	
	
	


}
