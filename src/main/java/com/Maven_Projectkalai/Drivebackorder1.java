package com.Maven_Projectkalai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drivebackorder1 {
public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	public Drivebackorder1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getdresses() {
		return dresses;
	}
	
	@FindBy(xpath="(//a[@class='product-name'])[3]")
	private WebElement purchaseorder;
	
	public WebElement getpurchaseorder() {
		return purchaseorder;
	}
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirts;
	
	public WebElement gettshirts() {
		return tshirts;
	}
	
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement tshirtsorder;
	
	public WebElement gettshirtsorder() {
		return tshirtsorder;
	}
	
	
@FindBy(id="quantity_wanted")
private WebElement quantity;

public WebElement getQuantity() {
	return quantity;
}


}
