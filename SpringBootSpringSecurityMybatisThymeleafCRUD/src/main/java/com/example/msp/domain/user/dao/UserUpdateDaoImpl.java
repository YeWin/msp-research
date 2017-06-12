package com.example.msp.domain.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.msp.database.entity.Users;
import com.example.msp.database.mapper.UsersMapper;

@Repository
public class UserUpdateDaoImpl implements UserUpdateDao {
	
	@Autowired
	UsersMapper userMapper;

	@Override
	public Users getUserById(Integer id) {

		return userMapper.selectByPrimaryKey(id);
	}

}
