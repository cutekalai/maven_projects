package com.Maven_Project1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinnextpage2 {
	public WebDriver driver;
	@FindBy(name="first_name")
	private WebElement firstname;
	
	public  Adactinnextpage2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}
@FindBy(name="last_name")
private WebElement lastname;

public WebElement getLastname() {
	return lastname;
}
@FindBy(name="address")
private WebElement address;

public WebElement getAddress() {
	return address;
}
@FindBy(name="cc_num")
private WebElement ccnum;

public WebElement getCcnum() {
	return ccnum;
}
@FindBy(id="cc_type")
private WebElement cctype;

public WebElement getCctype() {
	return cctype;
}
@FindBy(id="cc_exp_month")
private WebElement ccmonth;

public WebElement getCcmonth() {
	return ccmonth;
}
@FindBy(id="cc_exp_year")
private WebElement ccyear;

public WebElement getCcyear() {
	return ccyear;
}
@FindBy(name="cc_cvv")
private WebElement cvv;

public WebElement getCvv() {
	return cvv;
}
@FindBy(id="book_now")
private WebElement booking;

public WebElement getBooking() {
	return booking;
}



}


