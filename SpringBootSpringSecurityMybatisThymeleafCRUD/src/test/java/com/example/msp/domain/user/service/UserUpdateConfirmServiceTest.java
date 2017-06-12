package com.example.msp.domain.user.service;

import static com.example.msp.TestServiceUtil.newUsersDto;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.domain.user.dto.UsersDto;

public class UserUpdateConfirmServiceTest extends TestAbstract {

	@Autowired
	UserUpdateConfirmService userUpdateService;

	@Test
	public void shouldUpdate() throws Exception {
		UsersDto userDto = newUsersDto();
		userDto.setId(1);
		boolean flag = userUpdateService.updateUser(userDto);
		assertThat(flag, is(true));
	}
}
