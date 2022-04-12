package com.Maven_Project1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.confirurationadactin.reader.File_readeradactin_manager;

public class AdactinRunnerwithtestNG extends Adactinbase {
	public static WebDriver driver = browser_configuration("chrome");

	public static Logger log=Logger.getLogger(Adactinproject.class);
	public static Adactinwithpomanager pom=new Adactinwithpomanager(driver);
	
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkreporter;
	@BeforeTest 
	private void report_generation() {
		sparkreporter=new ExtentSparkReporter("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\Report_adactintestNG\\reportadactintestng.html");

		reports=new ExtentReports();
		
		reports.attachReporter(sparkreporter);
	}
	
	@AfterTest
	private void flush() {
		reports.flush();

	}
	
	@BeforeClass
	private void launch_url() throws Throwable {
		String url = File_readeradactin_manager.get_instanceadactin_FRM().get_instanceadactin_CD().get_configadactin_url();

		getUrl(url);

	}
	@BeforeMethod
	private void login() throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		String mailid = File_readeradactin_manager.get_instanceadactin_FRM().get_instanceadactin_CD().get_configadactin_mailid();
		inputvalueelement(pom.get_instance_ahp().getUsername(),mailid);
		
		
		String password = File_readeradactin_manager.get_instanceadactin_FRM().get_instanceadactin_CD().get_configadactin_password();
		inputvalueelement(pom.get_instance_ahp().getPassword(),
				password);

		clickonElement(pom.get_instance_ahp().getLogin());
		log.info("successful login");
	}

	@Test
	private void hotel_book() throws Throwable {
		
		dropdown("byindex", pom.get_instance_nextpage().getLocation(), "6");

		Thread.sleep(2000);

		dropdown("bytext", pom.get_instance_nextpage().getHotel(), "Hotel Sunshine");

		dropdown("byvalue", pom.get_instance_nextpage().getRoomtype(), "Super Deluxe");

		dropdown("byindex", pom.get_instance_nextpage().getNoofroom(), "2");

		pom.get_instance_nextpage().getCheckin().clear();
		inputvalueelement(pom.get_instance_nextpage().getCheckin(), "19/04/2022");

		pom.get_instance_nextpage().getCheckout().clear();
		inputvalueelement(pom.get_instance_nextpage().getCheckout(), "21/04/2022");

		dropdown("bytext", pom.get_instance_nextpage().getAdult(), "3 - Three");

		dropdown("byvalue", pom.get_instance_nextpage().getChildroom(), "2");

		clickonElement(pom.get_instance_nextpage().getSubmit());
		
		log.info("successful submit");
	
		
		clickonElement(pom.get_instance_nextpage().getSelectbutton());

		clickonElement(pom.get_instance_nextpage().getContinuebutton());

		inputvalueelement(pom.get_instance_nextpage2().getFirstname(), "kalai");

		inputvalueelement(pom.get_instance_nextpage2().getLastname(), "selvi");
		
		String address = File_readeradactin_manager.get_instanceadactin_FRM().get_instanceadactin_CD().get_configadactin_address();

		inputvalueelement(pom.get_instance_nextpage2().getAddress(),address);

		inputvalueelement(pom.get_instance_nextpage2().getCcnum(), "7689098760123456");

		dropdown("byvalue", pom.get_instance_nextpage2().getCctype(), "MAST");

		dropdown("bytext", pom.get_instance_nextpage2().getCcmonth(), "September");

		dropdown("byvalue", pom.get_instance_nextpage2().getCcyear(), "2022");
		
		String cvv = File_readeradactin_manager.get_instanceadactin_FRM().get_instanceadactin_CD().get_configadactin_cvv();

		inputvalueelement(pom.get_instance_nextpage2().getCvv(), cvv);

		log.info("successful process");
		
		

		clickonElement(pom.get_instance_nextpage2().getBooking());
	}

	} 


