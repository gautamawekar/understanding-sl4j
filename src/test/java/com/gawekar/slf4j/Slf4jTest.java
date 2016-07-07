package com.gawekar.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
	private static final Logger LOG = LoggerFactory.getLogger(Slf4jTest.class);

	@Test
	public void slf4j() {
		// System.out.println("Hello world");
		LOG.info("Hello world");
	}
}
