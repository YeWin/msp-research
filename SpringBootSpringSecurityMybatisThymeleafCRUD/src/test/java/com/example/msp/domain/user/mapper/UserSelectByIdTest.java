package com.example.msp.domain.user.mapper;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.database.entity.Users;
import com.example.msp.database.mapper.UsersMapper;

public class UserSelectByIdTest extends TestAbstract {

	@Autowired
	private UsersMapper userMapper;

	@Test
	public void shouldReturnUserById() {
		
		Users user = this.userMapper.selectByPrimaryKey(1);
		assertThat(user, notNullValue());		
	}

}
