package com.example.msp.domain.user.mapper;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.msp.database.mapper.UsersMapper;
import com.example.msp.domain.user.dto.UsersListDto;

@MybatisTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserListMapperTest {

	@Autowired
	private UsersMapper userMapper;
	
	@Test
	public void shouldReturnUsersList() {		
		List<UsersListDto> usersListDto = this.userMapper.selectAll();
		assertThat(usersListDto, notNullValue());
		assertThat(usersListDto.size(), greaterThan(-1));
	}
}
