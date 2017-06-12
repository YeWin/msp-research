package com.example.msp.domain.user.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;

public class UserDeleteServiceTest extends TestAbstract{

	@Autowired
	UserDeleteService userDeleteService;

	@Test
	public void shouldDelete() throws Exception {		
		boolean flag = userDeleteService.userDelete(20);
		assertThat(flag, is(true));
	}
}
