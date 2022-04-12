package com.Maven_Project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectclass {
	public WebDriver driver;

	@FindBy(id = "quantity_wanted")
	private WebElement quantity;

	public Selectclass(WebDriver driver2) {
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

	@FindBy(id = "color_16")
	private WebElement color;

	public WebElement getColor() {
		return color;
	}

	@FindBy(xpath = "//*[text()='Add to cart']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}

	@FindBy(xpath = "//*[@title='Continue shopping']")
	private WebElement continueshop;

	public WebElement getContinueshop() {
		return continueshop;
	}

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	private WebElement allcart;

	public WebElement getAllcart() {
		return allcart;
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement p1check;

	public WebElement getP1check() {
		return p1check;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement p2check;

	public WebElement getP2check() {
		return p2check;
	}

	@FindBy(id = "cgv")
	private WebElement termsofservice;

	

	public WebElement getTermsofservice() {
		return termsofservice;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement p3check;

	public WebElement getP3check() {
		return p3check;
	}
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement paybybank;
	
	public WebElement getPaybybank() {
		return paybybank;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirmorder;

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement clickele;

	public WebElement getClickele() {
		return clickele;
	}

	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement signout;

	public WebElement getSignout() {
		return signout;
	}

}

