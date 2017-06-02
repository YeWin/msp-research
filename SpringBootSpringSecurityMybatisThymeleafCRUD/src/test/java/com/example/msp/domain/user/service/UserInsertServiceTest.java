package com.example.msp.domain.user.service;

import static com.example.msp.TestServiceUtil.newUsersDto;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.domain.user.dto.UsersDto;

public class UserInsertServiceTest extends TestAbstract {

	@Autowired
	private UserInsertService userInsertService;

	@Test
	public void shouldInsert() throws Exception {
		UsersDto userDto = newUsersDto();
		boolean flag = userInsertService.insertUser(userDto);
		assertThat(flag, is(true));
	}

	@Test(expected = Exception.class)
	public void databaseError() throws Exception {
		UsersDto userDto = newUsersDto();
		userDto.setId(1);
		userInsertService.insertUser(userDto);		
	}
}
