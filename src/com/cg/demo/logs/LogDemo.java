package com.cg.demo.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

	public static void main(String[] args) {

		Logger log = LoggerFactory.getLogger(Object.class);
		log.info("Aaa");

	}
}
