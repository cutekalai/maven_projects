package com.Maven_Project;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automationwithpom extends Baseclassmo {
	public static WebDriver driver = browser_configuration("chrome");

	public static Home_page home = new Home_page(driver);
	public static Login_page login = new Login_page(driver);
	public static Orderclass order = new Orderclass(driver);
	public static Drivebackorder drive = new Drivebackorder(driver);
	public static Selectclass s = new Selectclass(driver);

	public static void main(String[] args) {

		getUrl("http://automationpractice.com/index.php");
		
		clickonElement(home.getSignin());

		inputvalueelement(login.getemail(),"k.kalaiselvi.sep4@mail.com");

		inputvalueelement(login.getPassword(),"123456");

		clickonElement(login.getsubmit());

		clickonElement(order.getWomen());

		clickonElement(order.getList());

		clickonElement(order.getFadedshorts());

		clickonElement(order.getAddtocart());

		clickonElement(order.getContinueshop());

		driver.navigate().back();

		clickonElement(drive.getSummerdress());

		s.getQuantity().clear();
		inputvalueelement(s.getQuantity(), "3");

		dropdown("byvalue", s.getSize(), "3");

		clickonElement(s.getColor());

		clickonElement(s.getAddtocart());

		clickonElement(s.getContinueshop());

		clickonElement(s.getAllcart());

		clickonElement(s.getP1check());

		clickonElement(s.getP2check());

		clickonElement(s.getTermsofservice());

		clickonElement(s.getP3check());

		clickonElement(s.getPaybybank());

		clickonElement(s.getConfirmorder());
		clickonElement(s.getClickele());

		clickonElement(s.getSignout());

	}

}

