package com.example.msp.domain.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.msp.database.entity.Users;
import com.example.msp.database.mapper.UsersMapper;

@Repository
public class UserUpdateConfirmDaoImpl implements UserUpdateConfirmDao {
	
	@Autowired
	private UsersMapper userMapper;

	@Override
	public int updateUser(Users user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

}
