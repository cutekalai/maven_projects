package com.Maven_Project1;

import org.openqa.selenium.WebDriver;

public class Adactinwithpomanager {
	public WebDriver driver;

	private Adactinhomepage ahp;

	private Adactinnextpage nextpage;
	private Adactinnextpage2 nextpage2;

	public Adactinwithpomanager(WebDriver driver2) {
	this.driver=driver2;
	}
	

	public Adactinhomepage get_instance_ahp() {

		if (ahp == null) {
			ahp = new Adactinhomepage(driver);
		}
		return ahp;
	}

	public Adactinnextpage get_instance_nextpage() {

		if (nextpage == null) {
			nextpage = new Adactinnextpage(driver);
		}
		return nextpage;

	}

	public Adactinnextpage2 get_instance_nextpage2() {

		if (nextpage2 == null) {
			nextpage2 = new Adactinnextpage2(driver);
		}
		return nextpage2;

	}

}


