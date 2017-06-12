package com.example.msp.domain.user.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.domain.user.dto.UsersDto;

public class UserUpdateServiceTest extends TestAbstract {

	@Autowired
	private UserUpdateService userUpdateService;

	@Test
	public void shouldReturnUserById() throws Exception {		
		UsersDto userDto = this.userUpdateService.getUserById(1);
		assertThat(userDto, notNullValue());		
	}

}
