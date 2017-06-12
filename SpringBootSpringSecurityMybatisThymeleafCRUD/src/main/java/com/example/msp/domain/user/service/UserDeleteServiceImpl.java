package com.example.msp.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msp.domain.user.dao.UserDeleteDao;

@Service
public class UserDeleteServiceImpl implements UserDeleteService {
	
	@Autowired
	UserDeleteDao userDeleteDao;

	@Override
	public boolean userDelete(Integer userId) throws Exception {

		userDeleteDao.userDelete(userId);

		return true;
	}

}
