package com.Maven_Project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  Orderclass {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public Orderclass(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
	
	@FindBy(id="list")
	private WebElement list;

	public WebElement getList() {
		return list;
	}
	@FindBy(xpath="(//a[@title='Blouse'])[2]//preceding::a[@title='Faded Short Sleeve T-shirts'][1]")
	private WebElement fadedshorts;

	public WebElement getFadedshorts() {
		return fadedshorts;
	}

	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
@FindBy(xpath="//*[@title='Continue shopping']")
private WebElement continueshop;

public WebElement getContinueshop() {
	return continueshop;
}


	
	
	
}

