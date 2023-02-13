package com.codingtest.registation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void testConextLoaded() {
		Assert.assertNotNull(context);
	}
	
}
