package com.Maven_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_configure {

	static Logger log = Logger.getLogger(Property_configure.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
	}
}
