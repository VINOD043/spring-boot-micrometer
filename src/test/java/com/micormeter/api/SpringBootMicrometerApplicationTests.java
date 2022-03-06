package com.micormeter.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMicrometerApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootMicrometerApplicationTests.class);
	
	@Test
	public  contextLoads() {
		logger.info("Test case executing");
		assertThat(true).isEqualTo(true);
		logger.info("Test case executed");
	}

}
