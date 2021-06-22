package com.cg.demo.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		LOG.info("Aaa");

	}

}
