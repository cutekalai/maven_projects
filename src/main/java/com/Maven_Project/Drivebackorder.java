package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drivebackorder  {
	public WebDriver driver;
	
	@FindBy(xpath="(//*[@title='Printed Dress'])[6]//following::a[@title='Printed Summer Dress'][4]")
	private WebElement summerdress;
	
	public Drivebackorder(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummerdress() {
		return summerdress;
	}
	
@FindBy(id="quantity_wanted")
private WebElement quantity;

public WebElement getQuantity() {
	return quantity;
}


}


