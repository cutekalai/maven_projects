package com.Maven_Project1;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Adactinproject   extends Adactinbase {
	public static WebDriver driver = browser_configuration("chrome");

	public static Logger log=Logger.getLogger(Adactinproject.class);
	public static Adactinwithpomanager pom=new Adactinwithpomanager(driver);
	public static void main(String[] args) throws Exception {

		getUrl("https://adactinhotelapp.com/index.php");

		PropertyConfigurator.configure("log4j.properties");
		inputvalueelement(pom.get_instance_ahp().getUsername(),getdata
				("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\Testcases adactin.xlsx", 0, 2, 5));

		inputvalueelement(pom.get_instance_ahp().getPassword(),
				getdata("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\Testcases adactin.xlsx", 0, 3, 5));

		clickonElement(pom.get_instance_ahp().getLogin());
		log.info("successful login");

		dropdown("byindex", pom.get_instance_nextpage().getLocation(), "6");

		Thread.sleep(2000);

		dropdown("bytext", pom.get_instance_nextpage().getHotel(), "Hotel Sunshine");

		dropdown("byvalue", pom.get_instance_nextpage().getRoomtype(), "Super Deluxe");

		dropdown("byindex", pom.get_instance_nextpage().getNoofroom(), "2");

		pom.get_instance_nextpage().getCheckin().clear();
		inputvalueelement(pom.get_instance_nextpage().getCheckin(), "19/02/2022");

		pom.get_instance_nextpage().getCheckout().clear();
		inputvalueelement(pom.get_instance_nextpage().getCheckout(), "21/02/2022");

		dropdown("bytext", pom.get_instance_nextpage().getAdult(), "3 - Three");

		dropdown("byvalue", pom.get_instance_nextpage().getChildroom(), "2");

		clickonElement(pom.get_instance_nextpage().getSubmit());
		
		log.info("successful submit");

		clickonElement(pom.get_instance_nextpage().getSelectbutton());

		clickonElement(pom.get_instance_nextpage().getContinuebutton());

		inputvalueelement(pom.get_instance_nextpage2().getFirstname(), "kalai");

		inputvalueelement(pom.get_instance_nextpage2().getLastname(), "selvi");

		inputvalueelement(pom.get_instance_nextpage2().getAddress(), "virudhunagar");

		inputvalueelement(pom.get_instance_nextpage2().getCcnum(), "7689098760123456");

		dropdown("byvalue", pom.get_instance_nextpage2().getCctype(), "MAST");

		dropdown("bytext", pom.get_instance_nextpage2().getCcmonth(), "September");

		dropdown("byvalue", pom.get_instance_nextpage2().getCcyear(), "2022");

		inputvalueelement(pom.get_instance_nextpage2().getCvv(), "008");

		log.info("successful process");
		fileutils("C:\\\\Users\\\\PS\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\\\automation1.png");
		

		clickonElement(pom.get_instance_nextpage2().getBooking());

	}

}