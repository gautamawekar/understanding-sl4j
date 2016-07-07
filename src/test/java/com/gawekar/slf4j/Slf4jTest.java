package com.gawekar.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
	private static final Logger LOG = LoggerFactory.getLogger(Slf4jTest.class);

	@Test
	public void slf4j() {
		LOG.info("\n\n>>>>>>>>>>>>>>>LOG ENABLED>>>>>>>>>>>>>>>");
		LOG.info(">>>>>>>>>>>>>>>LOG Hello world 1>>>>>>>>>>>>>>>");
		LOG.info(">>>>>>>>>>>>>>>LOG Hello world 2>>>>>>>>>>>>>>>");
		LOG.info(">>>>>>>>>>>>>>>LOG Hello world 3>>>>>>>>>>>>>>>");
		LOG.info(">>>>>>>>>>>>>>>LOG Hello world 4>>>>>>>>>>>>>>>\n\n");
	}
}
