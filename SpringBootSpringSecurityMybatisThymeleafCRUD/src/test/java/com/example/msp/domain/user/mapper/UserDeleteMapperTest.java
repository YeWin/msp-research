package com.example.msp.domain.user.mapper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.msp.TestAbstract;
import com.example.msp.database.mapper.UsersMapper;

public class UserDeleteMapperTest extends TestAbstract {

	@Autowired
	private UsersMapper userMapper;
	
	@Test
	public void shouldDelete() {		
		int count = this.userMapper.deleteByPrimaryKey(20);
		assertThat(count, is(1));		
	}
}
