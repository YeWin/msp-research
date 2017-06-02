package com.example.msp.domain.user.mapper;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static com.example.msp.TestMapperUtil.newUsers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.msp.database.entity.Users;
import com.example.msp.database.mapper.UsersMapper;

@MybatisTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserInsertMapperTest {
	
	@Autowired
	private UsersMapper userMapper;
	
	@Test
	public void shouldInsert() {
		Users user = newUsers();		
		int count = this.userMapper.insertSelective(user);
		assertThat(count, is(1));
		assertThat(user.getId(), notNullValue());
	}
	
	@Test(expected = Exception.class)
	public void databaseError() {
		Users user = new Users();
		user.setId(1);
		this.userMapper.insertSelective(user);
	}
}
