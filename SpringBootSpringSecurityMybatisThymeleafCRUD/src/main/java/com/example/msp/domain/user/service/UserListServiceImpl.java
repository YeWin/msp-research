package com.example.msp.domain.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msp.domain.user.dao.UserListDao;
import com.example.msp.domain.user.dto.UsersListDto;

@Service
public class UserListServiceImpl implements UserListService {
	
	@Autowired
	private UserListDao userListDao;

	@Override
	public List<UsersListDto> getUsersList() throws Exception {
		return userListDao.getUserList();
	}	
}
