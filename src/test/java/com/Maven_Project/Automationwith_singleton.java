
package com.Maven_Project;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.confiruration.reader.File_reader_manager;

public class Automationwith_singleton extends Baseclassmo {
	public static WebDriver driver = browser_configuration("chrome");

	public static Page_object_manager pom = new Page_object_manager(driver);
	
	public static Logger log = Logger.getLogger(Automationwithpom_pomanager.class);
	
	public static void main(String[] args) throws Throwable {
		String url = File_reader_manager.get_instance_FRM().get_instance_CD().get_config_url();

		getUrl(url);
		
		PropertyConfigurator.configure("log4j.properties");
		
        clickonElement(pom.get_instance_home().getSignin());
        log.info("signin page successfull");
        
        String mailid = File_reader_manager.get_instance_FRM().get_instance_CD().get_config_mailid();
		inputvalueelement(pom.get_instance_login().getemail(),mailid);
				

		String password = File_reader_manager.get_instance_FRM().get_instance_CD().get_config_password();
		inputvalueelement(pom.get_instance_login().getPassword(),password);
				

		clickonElement(pom.get_instance_login().getsubmit());

		log.info("success login");
		clickonElement(pom.get_instance_order().getWomen());

		clickonElement(pom.get_instance_order().getList());

		clickonElement(pom.get_instance_order().getFadedshorts());

		clickonElement(pom.get_instance_order().getAddtocart());

		clickonElement(pom.get_instance_order().getContinueshop());
		log.info("success add tocart");

		driver.navigate().back();

		clickonElement(pom.get_instance_drive().getSummerdress());

		pom.get_instance_s().getQuantity().clear();
		inputvalueelement(pom.get_instance_s().getQuantity(), "3");

		dropdown("byvalue", pom.get_instance_s().getSize(), "3");

		clickonElement(pom.get_instance_s().getColor());

		clickonElement(pom.get_instance_s().getAddtocart());

		clickonElement(pom.get_instance_s().getContinueshop());

		clickonElement(pom.get_instance_s().getAllcart());

		clickonElement(pom.get_instance_s().getP1check());

		clickonElement(pom.get_instance_s().getP2check());

		clickonElement(pom.get_instance_s().getTermsofservice());

		clickonElement(pom.get_instance_s().getP3check());

		clickonElement(pom.get_instance_s().getPaybybank());

		clickonElement(pom.get_instance_s().getConfirmorder());
		clickonElement(pom.get_instance_s().getClickele());

		clickonElement(pom.get_instance_s().getSignout());

	}

}


	


