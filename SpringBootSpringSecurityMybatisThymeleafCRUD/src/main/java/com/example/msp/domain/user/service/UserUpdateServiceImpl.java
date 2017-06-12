package com.example.msp.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msp.database.entity.Users;
import com.example.msp.domain.user.dao.UserUpdateDao;
import com.example.msp.domain.user.dto.UsersDto;

@Service
public class UserUpdateServiceImpl implements UserUpdateService {
	
	@Autowired
	UserUpdateDao userUpdateDao;

	@Override
	public UsersDto getUserById(Integer id) throws Exception {

		Users user = userUpdateDao.getUserById(id);
		
		return setEntityModelToDtoModel(user);
	}
	
	public UsersDto setEntityModelToDtoModel(Users user) {
		UsersDto usersDto = new UsersDto();
		
		usersDto.setId(user.getId());
		usersDto.setAge(user.getAge());
		usersDto.setContent(user.getContent());
		usersDto.setEmail(user.getEmail());
		usersDto.setGender(user.getGender());
		usersDto.setUserName(user.getUserName());
		
		return usersDto;
	}

}
