package com.example.msp.domain.user.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.msp.database.mapper.UsersMapper;
import com.example.msp.domain.user.dto.UsersListDto;

@Repository
public class UserListDaoImpl implements UserListDao {

	@Autowired
	private UsersMapper userMapper;

	@Override
	public List<UsersListDto> getUserList() {		
		return userMapper.selectAll();
	}
}
