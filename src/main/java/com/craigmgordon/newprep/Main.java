package com.craigmgordon.newprep;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	final static Log log = LogFactory.getLog(Main.class);

	public static void main(String[] args) {
		log.info("Initialising Spring Context");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/application.xml");
		log.info("Spring Context Initialised");

		Harness harness = (Harness) context.getBean("harness");
		// Init no longer needed as data is not cleared on each restart
		// harness.init();

	}
}
