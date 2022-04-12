package com.Maven_Project1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinnextpage {
public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	public Adactinnextpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(id="room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
@FindBy(name="room_nos")
private WebElement noofroom;

public WebElement getNoofroom() {
	return noofroom;
}
@FindBy(name="datepick_in")
private WebElement checkin;

public WebElement getCheckin() {
	return checkin;
}
@FindBy(name="datepick_out")
private WebElement checkout;

public WebElement getCheckout() {
	return checkout;
}
@FindBy(id="adult_room")
private WebElement adult;

public WebElement getAdult() {
	return adult;
}
@FindBy(id="child_room")
private WebElement childroom;

public WebElement getChildroom() {
	return childroom;
}
@FindBy(id="Submit")
private WebElement submit;

public WebElement getSubmit() {
	return submit;
}
@FindBy(id="radiobutton_0")
private WebElement selectbutton;

public WebElement getSelectbutton() {
	return selectbutton;
}

@FindBy(id="continue")
private WebElement continuebutton;

public WebElement getContinuebutton() {
	return continuebutton;
}





}

