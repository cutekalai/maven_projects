package com.Maven_Projectkalai;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.Drivebackorder;
import com.Maven_Project.Home_page;
import com.Maven_Project.Login_page;
import com.Maven_Project.Orderclass;
import com.Maven_Project.Page_object_manager;
import com.Maven_Project.Selectclass;

public class Automationrunnerkalai extends Baseclasskalai{
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_object_manager1 pom = new Page_object_manager1(driver);

	public static void main(String[] args) {
		
		getUrl("http://automationpractice.com/index.php");
		
		
		clickonElement(pom.get_instance_home().getSignin());
		
		inputvalueelement(pom.get_instance_login().getemail(),"k.kalaiselvi.sep4@mail.com");
				

		inputvalueelement(pom.get_instance_login().getPassword(),"123456");
				

		clickonElement(pom.get_instance_login().getsubmit());
		
		clickonElement(pom.get_instance_order().getWomen());
		
		clickonElement(pom.get_instance_order().getList());
		
		clickonElement(pom.get_instance_order().getfadeddress());
		
		pom.get_instance_s().getQuantity().clear();
		inputvalueelement(pom.get_instance_s().getQuantity(), "3");

		dropdown("byvalue", pom.get_instance_s().getSize(), "3");
		
		clickonElement(pom.get_instance_order().getaddcart());
		
		
		clickonElement(pom.get_instance_order().getsignout());
		
        clickonElement(pom.get_instance_home().getSignin());
		
		inputvalueelement(pom.get_instance_login().getemail(),"k.kalaiselvi.sep4@mail.com");
				

		inputvalueelement(pom.get_instance_login().getPassword(),"123456");
				

		clickonElement(pom.get_instance_login().getsubmit());
		
		
		clickonElement(pom.get_instance_drive().getdresses());
		
		clickonElement(pom.get_instance_order().getList());
		
		clickonElement(pom.get_instance_drive().getpurchaseorder());
		
		clickonElement(pom.get_instance_order().getaddcart());
		clickonElement(pom.get_instance_order().getsignout());
		
		clickonElement(pom.get_instance_home().getSignin());
		
		inputvalueelement(pom.get_instance_login().getemail(),"k.kalaiselvi.sep4@mail.com");
				

		inputvalueelement(pom.get_instance_login().getPassword(),"123456");
				

		clickonElement(pom.get_instance_login().getsubmit());
		
		clickonElement(pom.get_instance_drive().gettshirts());
	
		clickonElement(pom.get_instance_order().getList());
		
		clickonElement(pom.get_instance_drive().gettshirtsorder());
		
		clickonElement(pom.get_instance_order().getaddcart());
		
		
		clickonElement(pom.get_instance_s().getproccedcheck());
		
		
		clickonElement(pom.get_instance_s().getproccedcheck2());
		
		
		
		clickonElement(pom.get_instance_s().getproccedcheck3());
		
	
		clickonElement(pom.get_instance_s().gettermsofconditions());
		
		
		clickonElement(pom.get_instance_s().getproccedcheck4());
		
		
		clickonElement(pom.get_instance_s().getpaybycheck());
		
		clickonElement(pom.get_instance_s().getconfirm());
		
		clickonElement(pom.get_instance_order().getsignout());
		
		
		
		
		
		
		
		
	}

}
