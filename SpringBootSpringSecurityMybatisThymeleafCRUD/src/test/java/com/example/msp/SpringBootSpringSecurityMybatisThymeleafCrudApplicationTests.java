package com.example.msp;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class SpringBootSpringSecurityMybatisThymeleafCrudApplicationTests
		extends TestAbstract {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void contextLoads() {
		assertThat(applicationContext, notNullValue());
		assertThat(dataSource, notNullValue());
	}

}
