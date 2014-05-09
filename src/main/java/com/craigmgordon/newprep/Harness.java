package com.craigmgordon.newprep;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.craigmgordon.service.CustomerService;

public class Harness {

	@Autowired
	CustomerService service;

	final static Log log = LogFactory.getLog(Harness.class);

	public void test() {
		log.info(service.findAll().toString());
	}
}
