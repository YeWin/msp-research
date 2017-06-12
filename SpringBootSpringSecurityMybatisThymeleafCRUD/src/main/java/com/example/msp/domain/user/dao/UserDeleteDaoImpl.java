package com.example.msp.domain.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.msp.database.mapper.UsersMapper;

@Repository
public class UserDeleteDaoImpl implements UserDeleteDao {
	
	@Autowired
	UsersMapper userMapper;

	@Override
	public int userDelete(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
