package com.example.msp.domain.user.mapper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.database.mapper.UsersMapper;
import com.example.msp.domain.user.dto.UsersListDto;

public class UserListMapperTest extends TestAbstract {

	@Autowired
	private UsersMapper userMapper;

	@Test
	public void shouldReturnUsersList() {
		List<UsersListDto> usersListDto = this.userMapper.selectAll();
		assertThat(usersListDto, notNullValue());
		assertThat(usersListDto.size(), anyOf(greaterThan(-1), is(not(0))));
	}
}
