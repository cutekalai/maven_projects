package com.Maven_Projectkalai;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Automationrunner_testNG extends Baseclasskalai {
public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_object_manager1 pom = new Page_object_manager1(driver);
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkreporter;
	
	@BeforeClass
	private void report_generation() {
		sparkreporter=new ExtentSparkReporter("C:\\Users\\Vignesh\\eclipse-workspace\\Maven_Project\\Reports_automation\\reportautotestng.html");

		reports=new ExtentReports();
		
		reports.attachReporter(sparkreporter);
	}
	
	@AfterTest
	private void flush() {
		reports.flush();

	}

		@BeforeMethod
		private void launchurl() {
		
		getUrl("http://automationpractice.com/index.php");
		
		System.out.println("launch url");
		}
		
		@BeforeMethod
			private void login() {
			clickonElement(pom.get_instance_home().getSignin());
			
			inputvalueelement(pom.get_instance_login().getemail(),"k.kalaiselvi.sep4@mail.com");
					

			inputvalueelement(pom.get_instance_login().getPassword(),"123456");
					

			clickonElement(pom.get_instance_login().getsubmit());
			System.out.println("signin process success");
				
			}
		
		@Test
		private void womenpurchase() {
			clickonElement(pom.get_instance_order().getWomen());
			
			clickonElement(pom.get_instance_order().getList());
			
			clickonElement(pom.get_instance_order().getfadeddress());
			
			pom.get_instance_s().getQuantity().clear();
			inputvalueelement(pom.get_instance_s().getQuantity(), "3");

			dropdown("byvalue", pom.get_instance_s().getSize(), "3");
			
			clickonElement(pom.get_instance_order().getaddcart());
			System.out.println("women purchase successful");
			clickonElement(pom.get_instance_order().getsignout());
			System.out.println("successful logout");

		}
		
	  @Test(priority = 1)
		private void dresspurchase() {
			clickonElement(pom.get_instance_drive().getdresses());
			
			clickonElement(pom.get_instance_order().getList());
			
			clickonElement(pom.get_instance_drive().getpurchaseorder());
			
			clickonElement(pom.get_instance_order().getaddcart());
			
			System.out.println("dress purchase successful");
			clickonElement(pom.get_instance_order().getsignout());
			
			System.out.println("successful logout2");
		}
		
        @Test(priority = 2)
		private void tshirtspurchase() {
			clickonElement(pom.get_instance_drive().gettshirts());
			
			clickonElement(pom.get_instance_order().getList());
			
			clickonElement(pom.get_instance_drive().gettshirtsorder());
			
			clickonElement(pom.get_instance_order().getaddcart());
			
			System.out.println("successful add cart");
			clickonElement(pom.get_instance_s().getproccedcheck());
			
			
			clickonElement(pom.get_instance_s().getproccedcheck2());
			
			
			
			clickonElement(pom.get_instance_s().getproccedcheck3());
			
		
			clickonElement(pom.get_instance_s().gettermsofconditions());
			
			
			clickonElement(pom.get_instance_s().getproccedcheck4());
			
			
			clickonElement(pom.get_instance_s().getpaybycheck());
			
			clickonElement(pom.get_instance_s().getconfirm());
			
			clickonElement(pom.get_instance_order().getsignout());

			System.out.println("successful signout");
		}
		
	}



